/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author HIRO
 */
public class Student {
    private String name;
    private int studentNum;
    private int absence = 0;
    private int late = 0;
    private int total = 0;
    
    /**
     * 学生のデータ生成
     * @param name 名前
     * @param num 名列番号
     */
    public Student(String name, int num){
        this.name = name;
        this.studentNum = num;
    }
    
    /**
     * データを入力
     * @param absence 欠課数
     * @param late 遅刻数
     */
    public void setData(int absence, int late){
        this.absence = absence;
        this.late = late;
        this.total = this.calcTotal();
    }
    
    /**
     * 名前を取得
     * @return 名前
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * 名列番号を取得
     * @return 名列番号
     */
    public int getStudentNum(){
        return this.studentNum;
    }
    
    /**
     * 欠課数を取得
     * @return 欠課数
     */
    public int getAbsence(){
        return this.absence;
    }
    
    /**
     * 遅刻・早退数の取得
     * @return 遅刻・早退数
     */
    public int getLate(){
        return this.late;
    }
    
    /**
     * 欠課の合計を取得
     * @return 合計値
     */
    public int getTotal(){
        return this.total;
    }
    
    protected void setValue(int type){
        if(type == 1){
            this.late += 1;
        }
        else if(type == 3){
            this.absence += 1;
        }
        
        this.calcTotal();
    }
    
    private int calcTotal(){
        return this.absence + (int)(this.late / 3);
    }
}
