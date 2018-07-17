package View;
import Controller.AttendFile;
import Controller.Student;
import javax.swing.JOptionPane;

public class StatusPanel extends javax.swing.JPanel {

    MainFrame frame;
    Student student;
    /**
     * Creates new form StatusPanel
     */
    public StatusPanel(MainFrame frame, String subject, int studentID) {
        initComponents();
        this.setSize(1280, 720);
        this.frame = frame;
        AttendFile attendfile = new AttendFile(subject);
        student = attendfile.getData(studentID);
        if(student == null){
            JOptionPane.showMessageDialog(this.frame, "出席データファイルが開けません。", "ファイルオープンエラー", JOptionPane.ERROR_MESSAGE);
            this.frame.returnTimeTable();
            return;
        }
        if(subject.equals("opt")){  //光工学
            this.jLabel9.setText("光工学");
        }
        if(subject.equals("elec")){  //電気回路
            this.jLabel9.setText("電気回路");
        }
        if(subject.equals("eng")){  //英語
            this.jLabel9.setText("英語");
        }
        if(subject.equals("st1")){  //研究１
            this.jLabel9.setText("卒業研究");
        }
        if(subject.equals("aph")){  //応用物理
            this.jLabel9.setText("応用物理");
        }
        if(subject.equals("sft")){  //ソフトウェア工学
            this.jLabel9.setText("ソフトウェア工学");
        }
        if(subject.equals("oqe")){  //光量子エレクトロニクス
            this.jLabel9.setText("光・量子エレクトロニクス");
        }
        if(subject.equals("ite")){  //情報伝送
            this.jLabel9.setText("情報伝送");
        }
        if(subject.equals("ach")){  //自動制御
            this.jLabel9.setText("自動制御");
        }
        if(subject.equals("ger")){  //ドイツ語
            this.jLabel9.setText("ドイツ語");
        }
        if(subject.equals("com")){  //コンパイラ
            this.jLabel9.setText("コンパイラ");
        }
        if(subject.equals("dig")){  //ディジタル回路
            this.jLabel9.setText("ディジタル回路");
        }
        if(subject.equals("eme")){  //電子計測
            this.jLabel9.setText("電子計測");
        }
        if(subject.equals("exp1")){  //実験１
            this.jLabel9.setText("実験");
        }
        if(subject.equals("exp2")){  //実験２
            this.jLabel9.setText("実験");
        }
        if(subject.equals("ein")){  //電気材料
            this.jLabel9.setText("電気材料");
        }
        if(subject.equals("st2")){  //研究２
            this.jLabel9.setText("卒業研究");
        }
        if(subject.equals("enr")){  //エネルギー変換工学
            this.jLabel9.setText("エネルギー変換工学");
        }
        if(subject.equals("pla")){  //プラズマ工学
            this.jLabel9.setText("プラズマ工学");
        }
       this.jLabel10.setText(String.valueOf(studentID));
       this.jLabel6.setText(String.valueOf(student.getAbsence()));
       this.jLabel7.setText(String.valueOf(student.getLate()));
       this.jLabel8.setText(String.valueOf(student.getTotal()));
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        returnTop = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel1.setText("科目名");

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel2.setText("欠席");

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel3.setText("遅刻/早退");

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel4.setText("合計");

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel5.setText("学籍番号");

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel10.setText("jLabel10");

        returnTop.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        returnTop.setText("時間割へ戻る");
        returnTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnTopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1115, 1115, 1115))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel9)
                                .addGap(266, 266, 266)
                                .addComponent(jLabel5))
                            .addComponent(returnTop, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel10)
                        .addGap(1140, 1140, 1140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(returnTop)
                .addGap(163, 163, 163))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void returnTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnTopActionPerformed
        // TODO add your handling code here:
        this.frame.returnTimeTable();
    }//GEN-LAST:event_returnTopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton returnTop;
    // End of variables declaration//GEN-END:variables
}
