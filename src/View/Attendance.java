/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Attendance {
    
    public static int Click_Attendance(ArrayList<Integer> state, int number, ArrayList<Integer> count) {
        int Discrimination = (count.get(number)) % 3;
        
        switch (Discrimination) {
        case 0:
            state.set(number, 0);//出席
            count.set(number, 0);
            break;
        case 1:
            state.set(number, 1);//遅刻
            break;
        case 2:
            state.set(number, 2);//欠席
            break;
        }
        
        
        return Discrimination;
    }
    
    public static int Switch_Attendance(ArrayList<ArrayList<ArrayList<Integer>>> total_data, ArrayList<Integer> state, int subject, int time){
        int Discrimination, point;
        
        for(int i = 0; i < 44; i++){
            Discrimination = state.get(i);
            point = total_data.get(i).get(subject).get(Discrimination);
            
            switch (Discrimination) {
            case 0:
                total_data.get(i).get(subject).set(Discrimination, point+1);
                break;
             case 1:
                total_data.get(i).get(subject).set(Discrimination, point+1);
                break;
            case 2:
                total_data.get(i).get(subject).set(Discrimination, point+1);
                break;
            }
        }
        
        return time++;
    }

}
