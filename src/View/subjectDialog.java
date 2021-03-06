/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.AttendFile;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author kohta
 */
public class subjectDialog extends javax.swing.JDialog {

    private MainFrame frame;
    private String subject;
    private Boolean bool;
    /**
     * Creates new form subjectDialog
     */
    public subjectDialog(java.awt.Frame parent, boolean modal,String sbj, MainFrame frame) {
        super(parent, modal);
        subject = sbj;
        this.frame = frame;
        initComponents();
    }

    public boolean PinCode(String subject, int pin){
        if(subject.equals("opt")){  //光工学
            return (pin == 1234);
        }
        if(subject.equals("elec")){  //電気回路
            return (pin == 1234);
        }
        if(subject.equals("eng")){  //英語
            return (pin == 1234);
        }
        if(subject.equals("st1")){  //研究１
            return (pin == 1234);
        }
        if(subject.equals("aph")){  //応用物理
            return (pin == 1234);
        }
        if(subject.equals("sft")){  //ソフトウェア工学
            return (pin == 1234);
        }
        if(subject.equals("oqe")){  //光量子エレクトロニクス
            return (pin == 1234);
        }
        if(subject.equals("ite")){  //情報伝送
            return (pin == 1234);
        }
        if(subject.equals("ach")){  //自動制御
            return (pin == 1234);
        }
        if(subject.equals("ger")){  //ドイツ語
            return (pin == 1234);
        }
        if(subject.equals("com")){  //コンパイラ
            return (pin == 1234);
        }
        if(subject.equals("dig")){  //ディジタル回路
            return (pin == 1234);
        }
        if(subject.equals("eme")){  //電子計測
            return (pin == 1234);
        }
        if(subject.equals("exp1")){  //実験１
            return (pin == 1234);
        }
        if(subject.equals("exp2")){  //実験２
            return (pin == 1234);
        }
        if(subject.equals("ein")){  //電気材料
            return (pin == 1234);
        }
        if(subject.equals("st2")){  //研究２
            return (pin == 1234);
        }
        if(subject.equals("enr")){  //エネルギー変換工学
            return (pin == 1234);
        }
        if(subject.equals("pla")){  //プラズマ工学
            return (pin == 1234);
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("\"学生\"用");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("教授用");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //PINコード入力などなど遷移文挿入お願いします。(教授用)
        String pincode = JOptionPane.showInputDialog(this, "PINコードを入力してください");
        if(pincode == null) return;
        if(PinCode(subject, Integer.parseInt(pincode))){
            this.frame.createAttendance(subject, this);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //学生確認用？です。遷移文挿入お願いします。(学生用)
        String number = JOptionPane.showInputDialog(this, "学籍番号を入力してください");
        if(number == null) return;
        if(Integer.parseInt(number) > 0 && Integer.parseInt(number) < 44) 
            this.frame.createStatus(subject, Integer.parseInt(number), this);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
