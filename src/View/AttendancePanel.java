/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AttendFile;
import Controller.Attendance;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author HIRO
 */
public class AttendancePanel extends javax.swing.JPanel {
    int time = 0;
    int subject = 0;//科目ごとに数字を0~18で変更してください
    int Attend_data[][] = new int[2][44];
    boolean D;
    AttendFile file;

    ArrayList<Integer> state = new ArrayList<>(); //1コマ毎の出席状況
    ArrayList<Integer> count = new ArrayList<>(); //クリック回数
    ArrayList<String> timetable = new ArrayList<>(); //時間割(表示用に一応)
    ArrayList<ArrayList<ArrayList<Integer>>> total_data = new ArrayList<>(); //受け渡し用のデータ
    /*
    名列,各科番号,状態
    ０   ０      0:出席数
    ∫   ∫      1:遅刻数
    43   19      2:欠課数
    */

    MainFrame frame;
    /**
     * Creates new form AttendancePanel
     */
    public AttendancePanel(MainFrame frame, String sub) {
        initComponents();
        this.setSize(1280, 720);
        this.frame = frame;
        
        this.file = new AttendFile(sub);
        
        for (int i = 0; i < 44; i++) {
            
            Attend_data[0][i]=0;
            Attend_data[1][i]=0;
            
            state.add(0);
            count.add(0);
            
            ArrayList<ArrayList<Integer>> subjects = new ArrayList<>();
            for(int j = 0; j < 19; j++){
                ArrayList<Integer> data = new ArrayList<>();
                for(int k = 0; k < 3; k++){
                    data.add(0);
                }
                subjects.add(data);
            }
            total_data.add(subjects);
        }
        
        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton6.setBackground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);
        jButton10.setBackground(Color.WHITE);
        jButton11.setBackground(Color.WHITE);
        jButton12.setBackground(Color.WHITE);
        jButton13.setBackground(Color.WHITE);
        jButton14.setBackground(Color.WHITE);
        jButton15.setBackground(Color.WHITE);
        jButton16.setBackground(Color.WHITE);
        jButton17.setBackground(Color.WHITE);
        jButton18.setBackground(Color.WHITE);
        jButton19.setBackground(Color.WHITE);
        jButton20.setBackground(Color.WHITE);
        jButton21.setBackground(Color.WHITE);
        jButton22.setBackground(Color.WHITE);
        jButton23.setBackground(Color.WHITE);
        jButton24.setBackground(Color.WHITE);
        jButton25.setBackground(Color.WHITE);
        jButton26.setBackground(Color.WHITE);
        jButton27.setBackground(Color.WHITE);
        jButton28.setBackground(Color.WHITE);
        jButton29.setBackground(Color.WHITE);
        jButton30.setBackground(Color.WHITE);
        jButton31.setBackground(Color.WHITE);
        jButton32.setBackground(Color.WHITE);
        jButton33.setBackground(Color.WHITE);
        jButton34.setBackground(Color.WHITE);
        jButton35.setBackground(Color.WHITE);
        jButton36.setBackground(Color.WHITE);
        jButton37.setBackground(Color.WHITE);
        jButton38.setBackground(Color.WHITE);
        jButton39.setBackground(Color.WHITE);
        jButton40.setBackground(Color.WHITE);
        jButton41.setBackground(Color.WHITE);
        jButton42.setBackground(Color.WHITE);
        jButton43.setBackground(Color.WHITE);
        jButton44.setBackground(Color.WHITE);
        timetable.add("光工学");
        timetable.add("電気回路Ⅱ");
        timetable.add("英語A");
        timetable.add("卒業研究Ⅰ");
        timetable.add("応用物理Ⅱ");
        timetable.add("ソフトウェア工学");
        timetable.add("光・量子エレクトロニクス");
        timetable.add("情報伝送工学");
        timetable.add("自動制御");
        timetable.add("ドイツ語");
        timetable.add("コンパイラ");
        timetable.add("デジタル回路Ⅱ");
        timetable.add("電子計測");
        timetable.add("電気電子工学実験Ⅰ");
        timetable.add("電気電子工学実験Ⅱ");
        timetable.add("電気材料Ⅱ");
        timetable.add("卒業研究Ⅱ");
        timetable.add("エネルギー変換工学");
        timetable.add("プラズマ工学");
        
        switch (sub) {
        case "opt":
            subject = 0;
            break;
        case "elec":
            subject = 1;
            break;
        case "eng":
            subject = 2;
            break;
        case "st1":
            subject = 3;
            break;
        case "aph":
            subject = 4;
            break;
        case "sft":
            subject = 5;
            break;
        case "oqe":
            subject = 6;
            break;
        case "ite":
            subject = 7;
            break;
        case "ach":
            subject = 8;
            break;
        case "ger":
            subject = 9;
            break;
        case "com":
            subject = 10;
            break;
        case "dig":
            subject = 11;
            break;
        case "eme":
            subject = 12;
            break;
        case "exp1":
            subject = 13;
            break;
        case "exp2":
            subject = 14;
            break;
        case "ein":
            subject = 15;
            break;
        case "st2":
            subject = 16;
            break;
        case "enr":
            subject = 17;
            break;
        case "pla":
            subject = 18;
            break;
        }
        
        jLabel1.setText("現在の科目は"+timetable.get(subject)+"です。");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("2014E01");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2014E02");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("2014E03");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("2014E04");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("2014E05");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("2014E06");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("2014E07");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("2014E08");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("2014E09");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("2014E10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("2014E11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("2014E12");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("2014E13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("2014E14");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("2014E15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("2014E16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("2014E17");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("2014E18");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("2014E19");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("2014E20");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("2014E21");
        jButton21.setToolTipText("");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("2014E22");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("2014E23");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("2014E24");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText("2014E25");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("2014E26");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText("2014E27");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("2014E28");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("2014E29");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("2014E30");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("2014E31");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("2014E32");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText("2014E33");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("2014E34");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("2014E35");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("2014E36");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("2014E37");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setText("2014E38");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setText("2014E39");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setText("2014E40");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setText("2014E41");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("2014E42");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setText("2014E43");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setText("2014E44");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setText("終了");
        jButton45.setActionCommand("finish");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("ＭＳ ゴシック", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton37)
                                        .addComponent(jButton38))
                                    .addGap(61, 61, 61)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton29)
                                                .addComponent(jButton30))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton23)
                                                .addComponent(jButton22))
                                            .addGap(304, 304, 304))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton39)
                                            .addGap(61, 61, 61)
                                            .addComponent(jButton31))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton40)
                                            .addGap(61, 61, 61)
                                            .addComponent(jButton32))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton43)
                                                .addComponent(jButton42)
                                                .addComponent(jButton41))
                                            .addGap(61, 61, 61)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton33, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton34, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton35, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton36, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton24, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton27, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton28, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(304, 304, 304)))
                            .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton25)
                            .addComponent(jButton26))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton16)
                            .addComponent(jButton17)
                            .addComponent(jButton18)
                            .addComponent(jButton15)
                            .addComponent(jButton19)
                            .addComponent(jButton20)
                            .addComponent(jButton21)
                            .addComponent(jButton44))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton14)
                                    .addComponent(jButton9)
                                    .addComponent(jButton8)
                                    .addComponent(jButton10)
                                    .addComponent(jButton12)
                                    .addComponent(jButton11)
                                    .addComponent(jButton13))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jButton3)
                                    .addComponent(jButton4))))))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(181, 181, 181)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int number = 4;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton5.setBackground(Color.WHITE);
            break;
        case 1:
            jButton5.setBackground(Color.RED);
            break;
        case 2:
            jButton5.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int number = 0;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton1.setBackground(Color.WHITE);
            break;
        case 1:
            jButton1.setBackground(Color.RED);
            break;
        case 2:
            jButton1.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int number = 1;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton2.setBackground(Color.WHITE);
            break;
        case 1:
            jButton2.setBackground(Color.RED);
            break;
        case 2:
            jButton2.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int number = 2;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton3.setBackground(Color.WHITE);
            break;
        case 1:
            jButton3.setBackground(Color.RED);
            break;
        case 2:
            jButton3.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int number = 3;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton4.setBackground(Color.WHITE);
            break;
        case 1:
            jButton4.setBackground(Color.RED);
            break;
        case 2:
            jButton4.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int number = 5;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton6.setBackground(Color.WHITE);
            break;
        case 1:
            jButton6.setBackground(Color.RED);
            break;
        case 2:
            jButton6.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int number = 6;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton7.setBackground(Color.WHITE);
            break;
        case 1:
            jButton7.setBackground(Color.RED);
            break;
        case 2:
            jButton7.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int number = 7;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton8.setBackground(Color.WHITE);
            break;
        case 1:
            jButton8.setBackground(Color.RED);
            break;
        case 2:
            jButton8.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int number = 8;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton9.setBackground(Color.WHITE);
            break;
        case 1:
            jButton9.setBackground(Color.RED);
            break;
        case 2:
            jButton9.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        int number = 9;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton10.setBackground(Color.WHITE);
            break;
        case 1:
            jButton10.setBackground(Color.RED);
            break;
        case 2:
            jButton10.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int number = 10;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton11.setBackground(Color.WHITE);
            break;
        case 1:
            jButton11.setBackground(Color.RED);
            break;
        case 2:
            jButton11.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int number = 11;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton12.setBackground(Color.WHITE);
            break;
        case 1:
            jButton12.setBackground(Color.RED);
            break;
        case 2:
            jButton12.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        int number = 12;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton13.setBackground(Color.WHITE);
            break;
        case 1:
            jButton13.setBackground(Color.RED);
            break;
        case 2:
            jButton13.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        int number = 13;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton14.setBackground(Color.WHITE);
            break;
        case 1:
            jButton14.setBackground(Color.RED);
            break;
        case 2:
            jButton14.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int number = 14;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton15.setBackground(Color.WHITE);
            break;
        case 1:
            jButton15.setBackground(Color.RED);
            break;
        case 2:
            jButton15.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        int number = 15;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton16.setBackground(Color.WHITE);
            break;
        case 1:
            jButton16.setBackground(Color.RED);
            break;
        case 2:
            jButton16.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        int number = 16;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton17.setBackground(Color.WHITE);
            break;
        case 1:
            jButton17.setBackground(Color.RED);
            break;
        case 2:
            jButton17.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        int number = 17;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton18.setBackground(Color.WHITE);
            break;
        case 1:
            jButton18.setBackground(Color.RED);
            break;
        case 2:
            jButton18.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        int number = 18;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton19.setBackground(Color.WHITE);
            break;
        case 1:
            jButton19.setBackground(Color.RED);
            break;
        case 2:
            jButton19.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        int number = 19;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton20.setBackground(Color.WHITE);
            break;
        case 1:
            jButton20.setBackground(Color.RED);
            break;
        case 2:
            jButton20.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        int number = 20;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton21.setBackground(Color.WHITE);
            break;
        case 1:
            jButton21.setBackground(Color.RED);
            break;
        case 2:
            jButton21.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        int number = 43;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton44.setBackground(Color.WHITE);
            break;
        case 1:
            jButton44.setBackground(Color.RED);
            break;
        case 2:
            jButton44.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        int number = 21;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton22.setBackground(Color.WHITE);
            break;
        case 1:
            jButton22.setBackground(Color.RED);
            break;
        case 2:
            jButton22.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        int number = 22;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton23.setBackground(Color.WHITE);
            break;
        case 1:
            jButton23.setBackground(Color.RED);
            break;
        case 2:
            jButton23.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        int number = 23;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton24.setBackground(Color.WHITE);
            break;
        case 1:
            jButton24.setBackground(Color.RED);
            break;
        case 2:
            jButton24.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        int number = 24;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton25.setBackground(Color.WHITE);
            break;
        case 1:
            jButton25.setBackground(Color.RED);
            break;
        case 2:
            jButton25.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        int number = 25;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton26.setBackground(Color.WHITE);
            break;
        case 1:
            jButton26.setBackground(Color.RED);
            break;
        case 2:
            jButton26.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        int number = 26;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton27.setBackground(Color.WHITE);
            break;
        case 1:
            jButton27.setBackground(Color.RED);
            break;
        case 2:
            jButton27.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        int number = 27;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton28.setBackground(Color.WHITE);
            break;
        case 1:
            jButton28.setBackground(Color.RED);
            break;
        case 2:
            jButton28.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        int number = 28;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton29.setBackground(Color.WHITE);
            break;
        case 1:
            jButton29.setBackground(Color.RED);
            break;
        case 2:
            jButton29.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        int number = 29;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton30.setBackground(Color.WHITE);
            break;
        case 1:
            jButton30.setBackground(Color.RED);
            break;
        case 2:
            jButton30.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        int number = 30;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton31.setBackground(Color.WHITE);
            break;
        case 1:
            jButton31.setBackground(Color.RED);
            break;
        case 2:
            jButton31.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        int number = 31;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton32.setBackground(Color.WHITE);
            break;
        case 1:
            jButton32.setBackground(Color.RED);
            break;
        case 2:
            jButton32.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        int number = 32;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton33.setBackground(Color.WHITE);
            break;
        case 1:
            jButton33.setBackground(Color.RED);
            break;
        case 2:
            jButton33.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        int number = 33;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton34.setBackground(Color.WHITE);
            break;
        case 1:
            jButton34.setBackground(Color.RED);
            break;
        case 2:
            jButton34.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        int number = 34;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton35.setBackground(Color.WHITE);
            break;
        case 1:
            jButton35.setBackground(Color.RED);
            break;
        case 2:
            jButton35.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        int number = 35;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton36.setBackground(Color.WHITE);
            break;
        case 1:
            jButton36.setBackground(Color.RED);
            break;
        case 2:
            jButton36.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        int number = 36;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton37.setBackground(Color.WHITE);
            break;
        case 1:
            jButton37.setBackground(Color.RED);
            break;
        case 2:
            jButton37.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        int number = 37;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton38.setBackground(Color.WHITE);
            break;
        case 1:
            jButton38.setBackground(Color.RED);
            break;
        case 2:
            jButton38.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        int number = 38;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton39.setBackground(Color.WHITE);
            break;
        case 1:
            jButton39.setBackground(Color.RED);
            break;
        case 2:
            jButton39.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        int number = 39;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton40.setBackground(Color.WHITE);
            break;
        case 1:
            jButton40.setBackground(Color.RED);
            break;
        case 2:
            jButton40.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        int number = 40;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton41.setBackground(Color.WHITE);
            break;
        case 1:
            jButton41.setBackground(Color.RED);
            break;
        case 2:
            jButton41.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        int number = 41;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton42.setBackground(Color.WHITE);
            break;
        case 1:
            jButton42.setBackground(Color.RED);
            break;
        case 2:
            jButton42.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        int number = 42;
        count.set(number,count.get(number)+1);
        int color = Attendance.Click_Attendance(state,number,count);
        
        switch (color) {
        case 0:
            jButton43.setBackground(Color.WHITE);
            break;
        case 1:
            jButton43.setBackground(Color.RED);
            break;
        case 2:
            jButton43.setBackground(Color.BLUE);
            break;
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        //終了ボタン…コマの切り替え、二回目で授業終了
        
        
        for (int i = 0; i < 44; i++) {
            int point =state.get(i);
            
            if(point == 2){
                Attend_data[time][i] = point+1;
            }else{
                Attend_data[time][i] = point;
            }
            
            state.set(i, 0);
            count.set(i, 0);
        }
        
        
        time++;
        
        if(time == 2){
            D = file.saveData(Attend_data);
            time = 0;
            frame.returnTimeTable();
            //授業終了別画面切り替え
        }
        
        
        jButton1.setBackground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton3.setBackground(Color.WHITE);
        jButton4.setBackground(Color.WHITE);
        jButton5.setBackground(Color.WHITE);
        jButton6.setBackground(Color.WHITE);
        jButton7.setBackground(Color.WHITE);
        jButton8.setBackground(Color.WHITE);
        jButton9.setBackground(Color.WHITE);
        jButton10.setBackground(Color.WHITE);
        jButton11.setBackground(Color.WHITE);
        jButton12.setBackground(Color.WHITE);
        jButton13.setBackground(Color.WHITE);
        jButton14.setBackground(Color.WHITE);
        jButton15.setBackground(Color.WHITE);
        jButton16.setBackground(Color.WHITE);
        jButton17.setBackground(Color.WHITE);
        jButton18.setBackground(Color.WHITE);
        jButton19.setBackground(Color.WHITE);
        jButton20.setBackground(Color.WHITE);
        jButton21.setBackground(Color.WHITE);
        jButton22.setBackground(Color.WHITE);
        jButton23.setBackground(Color.WHITE);
        jButton24.setBackground(Color.WHITE);
        jButton25.setBackground(Color.WHITE);
        jButton26.setBackground(Color.WHITE);
        jButton27.setBackground(Color.WHITE);
        jButton28.setBackground(Color.WHITE);
        jButton29.setBackground(Color.WHITE);
        jButton30.setBackground(Color.WHITE);
        jButton31.setBackground(Color.WHITE);
        jButton32.setBackground(Color.WHITE);
        jButton33.setBackground(Color.WHITE);
        jButton34.setBackground(Color.WHITE);
        jButton35.setBackground(Color.WHITE);
        jButton36.setBackground(Color.WHITE);
        jButton37.setBackground(Color.WHITE);
        jButton38.setBackground(Color.WHITE);
        jButton39.setBackground(Color.WHITE);
        jButton40.setBackground(Color.WHITE);
        jButton41.setBackground(Color.WHITE);
        jButton42.setBackground(Color.WHITE);
        jButton43.setBackground(Color.WHITE);
        jButton44.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_jButton45ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
