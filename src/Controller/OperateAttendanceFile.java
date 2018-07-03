/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HIRO
 */
public class OperateAttendanceFile {
    final String fsp = File.separator;
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    String path = "resource" + fsp  + "attnd" + fsp + "class";
    
    /**
     * ファイル操作を開始
     * @param lessonID 教科番号
     */
    public OperateAttendanceFile(int lessonID){
        this.path += String.valueOf(lessonID) + ".csv";
    }
    
    /**
     * 出欠データをCSVに保存
     * @param attend 出席のデータ -フォーマット :[[前半1, 前半2, ...], [後半1, 後半2, ...]]
     * @return 保存できたらTRUEを返す
     */
    public boolean saveData(int[][] attend){
        FileWriter fwriter = null;
        BufferedWriter bfwriter = null;
        PrintWriter pwriter = null;
        
        String savedata = "";
        Date date = new Date();
        String time = sdf.format(date);
        String[] harf = {"F", "L"};
        
        try{
            File file = new File(this.path);
            
            fwriter = new FileWriter(file, true);
            bfwriter = new BufferedWriter(fwriter);
            pwriter = new PrintWriter(bfwriter);
            
            int count = 0;
            for(int[] row: attend){
                savedata = time + "," + harf[count];
                for(int colum: row){
                    savedata += "," + String.valueOf(colum);
                }
                pwriter.write(savedata);
                count += 1;
            }
            
            pwriter.close();
            return true;
            
        } catch(IOException ex) {
            System.out.println("File Open Error");
            return false;
        }
    }
    
    /**
     * CSVから特定の人のデータを取得
     * @param studentNum 
     * @return 学生データ（エラーの場合null）
     */
    public Student getData(int studentNum){
        FileReader freader = null;
        BufferedReader bfreader = null;
        Student student = null;
        try{
            File namefile = new File("resource" + fsp + "name.csv");
            freader = new FileReader(namefile);
            bfreader = new BufferedReader(freader);
            
            String line;
            int count = 1;
            while((line = bfreader.readLine()) != null){
                if(count == studentNum){
                    student = new Student(line, count);
                    break;
                }
            }
            bfreader.close();
        } catch(IOException ex) {
            System.out.println("read namefile Error");
            return null;
        }
        
        if(student == null) return null;
        
        try{
            File attndfile = new File(this.path);
            freader = new FileReader(attndfile);
            bfreader = new BufferedReader(freader);
            
            String line;
            while((line = bfreader.readLine()) != null){
                String[] data = line.split(",");
                student.setValue(Integer.parseInt(data[student.getStudentNum() + 1]));
            }
            bfreader.close();
        
        } catch(IOException ex) {
            System.out.println("read attndfile Error");
            return null;
        }
        
        return student;
    }
}
