/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author ris
 */
public class addpro extends javax.swing.JFrame {

    /**
     * Creates new form addpro
     */
    public addpro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addpanel = new javax.swing.JPanel();
        proname = new javax.swing.JLabel();
        qtyi = new javax.swing.JTextField();
        proqty = new javax.swing.JLabel();
        proamt = new javax.swing.JLabel();
        amti = new javax.swing.JTextField();
        addb = new javax.swing.JButton();
        clearb = new javax.swing.JButton();
        namei = new javax.swing.JTextField();
        headadd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addpanel.setBackground(new java.awt.Color(153, 153, 0));

        proname.setBackground(new java.awt.Color(51, 153, 255));
        proname.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        proname.setForeground(new java.awt.Color(0, 0, 0));
        proname.setText("Product Name                                   :");

        qtyi.setBackground(new java.awt.Color(255, 255, 255));
        qtyi.setForeground(new java.awt.Color(0, 0, 0));
        qtyi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyiActionPerformed(evt);
            }
        });

        proqty.setBackground(new java.awt.Color(51, 153, 255));
        proqty.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        proqty.setForeground(new java.awt.Color(0, 0, 0));
        proqty.setText("Number of Products                         :");

        proamt.setBackground(new java.awt.Color(51, 153, 255));
        proamt.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        proamt.setForeground(new java.awt.Color(0, 0, 0));
        proamt.setText("Amount                                               :");

        amti.setBackground(new java.awt.Color(255, 255, 255));
        amti.setForeground(new java.awt.Color(0, 0, 0));
        amti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtiActionPerformed(evt);
            }
        });

        addb.setBackground(new java.awt.Color(51, 153, 255));
        addb.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        addb.setForeground(new java.awt.Color(255, 255, 255));
        addb.setText("Add");
        addb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbActionPerformed(evt);
            }
        });

        clearb.setBackground(new java.awt.Color(51, 153, 255));
        clearb.setFont(new java.awt.Font("Vani", 1, 14)); // NOI18N
        clearb.setForeground(new java.awt.Color(255, 255, 255));
        clearb.setText("Clear");
        clearb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbActionPerformed(evt);
            }
        });

        namei.setBackground(new java.awt.Color(255, 255, 255));
        namei.setForeground(new java.awt.Color(0, 0, 0));
        namei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameiActionPerformed(evt);
            }
        });

        headadd.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        headadd.setForeground(new java.awt.Color(0, 0, 0));
        headadd.setText("ADD Products");

        javax.swing.GroupLayout addpanelLayout = new javax.swing.GroupLayout(addpanel);
        addpanel.setLayout(addpanelLayout);
        addpanelLayout.setHorizontalGroup(
            addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addpanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(proamt, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(proqty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proname))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addpanelLayout.createSequentialGroup()
                        .addGroup(addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namei, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyi, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addpanelLayout.createSequentialGroup()
                        .addComponent(amti, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headadd)
                .addGap(309, 309, 309))
            .addGroup(addpanelLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(addb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearb, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353))
        );
        addpanelLayout.setVerticalGroup(
            addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addpanelLayout.createSequentialGroup()
                .addGroup(addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(addpanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(proname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addpanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(headadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namei, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proqty, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proamt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amti, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(addpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearb, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 780, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qtyiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyiActionPerformed

    private void amtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtiActionPerformed

    private void addbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbActionPerformed
        // Add Button

        try {
            if (namei.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter item!", "Oops Wait...!", JOptionPane.ERROR_MESSAGE);
            } else {
                BufferedReader rdfile = new BufferedReader(new FileReader("items.txt"));

                String[] itemline = new String[100];
                String prod = "";
                int qty = 0;
                double price = 0.0;
                boolean found = false;

                int x = 0;
                while ((itemline[x] = rdfile.readLine()) != null) {
                    x++;
                }
                rdfile.close();

                if (!(x >= 100)) {
                    prod = namei.getText();

                    for (int j = 0; itemline[j] != null; j++) {      //check whether item is in the list already
                        String[] temp = itemline[j].split("\t");

                        if (prod.equals(temp[0])) {
                            found = true;
                        }
                    }

                    if (found) {
                        JOptionPane.showMessageDialog(null, "Item already exist!\nSuggestion: Update Item", "", JOptionPane.WARNING_MESSAGE);
                    } else {
                        qty = Integer.parseInt(qtyi.getText());
                        price = Double.parseDouble(amti.getText());

                        itemline[x] = prod + "\t" + qty + "\t" + price;

                        PrintWriter wrfile = new PrintWriter(new FileWriter("items.txt"));

                        for (int j = 0; itemline[j] != null; j++) {
                            wrfile.println(itemline[j]);
                        }

                        wrfile.close();

                        JOptionPane.showMessageDialog(null, "Succesfully Added!", " Ok!  :-)", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Inventory Full!", "Warning!", JOptionPane.WARNING_MESSAGE);
                }
            }

            namei.setText("");
            qtyi.setText("");
            amti.setText("");

        } catch (IOException e) {
        }
    }//GEN-LAST:event_addbActionPerformed

    private void clearbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbActionPerformed
        //Clear Button(Add/Delete)

        namei.setText("");
        qtyi.setText("");
        amti.setText("");
    }//GEN-LAST:event_clearbActionPerformed

    private void nameiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addpro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addb;
    private javax.swing.JPanel addpanel;
    private javax.swing.JTextField amti;
    private javax.swing.JButton clearb;
    private javax.swing.JLabel headadd;
    private javax.swing.JTextField namei;
    private javax.swing.JLabel proamt;
    private javax.swing.JLabel proname;
    private javax.swing.JLabel proqty;
    private javax.swing.JTextField qtyi;
    // End of variables declaration//GEN-END:variables
}
