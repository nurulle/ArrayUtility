package array;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import  javax.swing.table.DefaultTableModel;

public class LatihanArray extends javax.swing.JFrame {
    DefaultTableModel model;
    int index_baris;

    public LatihanArray() {
        initComponents();
        Object[] kolom = {"No","Tanggal","Nama Lengkap","Jenis Kelamin","Kantor/Instansi","Tujuan"};
        model = new  DefaultTableModel(kolom, 0){
            public boolean isCellEdittable(int row, int column){
                return false;
            }
        };
        jTable1.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextNmaL = new javax.swing.JTextField();
        jRadioButtonL = new javax.swing.JRadioButton();
        jRadioButtonP = new javax.swing.JRadioButton();
        jTextKantor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreatujuanBertamu = new javax.swing.JTextArea();
        jButtonSimpan = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nama Lengkap");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Jenis Kelamin");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Kantor/Institusi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tujuan Bertamu");

        jTextNmaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNmaLActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonL);
        jRadioButtonL.setText("Laki-Laki");

        buttonGroup1.add(jRadioButtonP);
        jRadioButtonP.setText("Perempuan");
        jRadioButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPActionPerformed(evt);
            }
        });

        jTextKantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextKantorActionPerformed(evt);
            }
        });

        jTextAreatujuanBertamu.setColumns(20);
        jTextAreatujuanBertamu.setRows(5);
        jScrollPane1.setViewportView(jTextAreatujuanBertamu);

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonUbah.setText("Ubah");
        jButtonUbah.setEnabled(false);
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.setEnabled(false);
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextKantor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jRadioButtonL)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonP))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonHapus)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonUbah))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(jTextNmaL))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextNmaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRadioButtonL)
                    .addComponent(jRadioButtonP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextKantor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSimpan)
                    .addComponent(jButtonHapus)
                    .addComponent(jButtonUbah))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNmaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNmaLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNmaLActionPerformed

    private void jRadioButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPActionPerformed

    private void jTextKantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextKantorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextKantorActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        int No = jTable1.getRowCount()==0 ? 1: jTable1.getRowCount()+1;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy H:m:s");
        String tanggal = sdf.format(new Date());
        String nama = jTextNmaL.getText();
        String jk = jRadioButtonL.isSelected()? "Laki-Laki" : "Perempuan";
        String kantor = jTextKantor.getText();
        String tujuan = jTextAreatujuanBertamu.getText();
        
        
        if(nama.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nama Harus diisi");
            jTextNmaL.requestFocus();
        }else if(kantor.isEmpty()){
            JOptionPane.showMessageDialog(this, "kantor Harus diisi");
            jTextKantor.requestFocus();
        }else if (tujuan.isEmpty()){
            JOptionPane.showMessageDialog(this, "Tujuan Harus diisi");
            jTextAreatujuanBertamu.requestFocus();
        }else{
            
            Object[] data = {No, tanggal, nama, jk, kantor, tujuan};
            model.addRow(data);
            refresh();
            
        }
        
       
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int r = jTable1.getSelectedRow();
        if (r != -1){
            int no = Integer.parseInt(jTable1.getValueAt(r, 0).toString());
            String tanggal = jTable1.getValueAt(r, 1).toString();
            String nama = jTable1.getValueAt(r, 2).toString();
            String jk = jTable1.getValueAt(r, 3).toString();
            String kantor = jTable1.getValueAt(r, 4).toString();
            String tujuan = jTable1.getValueAt(r, 5).toString();
            
            jTextNmaL.setText(nama);
            if (jk.equals("Laki-Laki")) {
                jRadioButtonL.setSelected(true);
                
            }else {
                jRadioButtonP.setSelected(true);
                
            }
            jTextKantor.setText(kantor);
            jTextAreatujuanBertamu.setText(tujuan);
            
            jButtonSimpan.setEnabled(false);
            jButtonHapus.setEnabled(true);
            jButtonUbah.setEnabled(true);
            
            index_baris = r;
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        int pilihan = JOptionPane.showConfirmDialog(this, ""
            +"Apakah anda yakin ingin menghapus data ini?", "komfirmasi",
            JOptionPane.YES_NO_CANCEL_OPTION);
        if (pilihan ==0) {
            model.removeRow(index_baris);
            refresh();
        }
        
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        int No = jTable1.getRowCount()==0 ? 1: jTable1.getRowCount()+1;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy H:m:s");
        String tanggal = sdf.format(new Date());
        String nama = jTextNmaL.getText();
        String jk = jRadioButtonL.isSelected()? "Laki-Laki" : "Perempuan";
        String kantor = jTextKantor.getText();
        String tujuan = jTextAreatujuanBertamu.getText();
        
        
        if(nama.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nama Harus diisi");
            jTextNmaL.requestFocus();
        }else if(kantor.isEmpty()){
            JOptionPane.showMessageDialog(this, "kantor Harus diisi");
            jTextKantor.requestFocus();
        }else if (tujuan.isEmpty()){
            JOptionPane.showMessageDialog(this, "Tujuan Harus diisi");
            jTextAreatujuanBertamu.requestFocus();
        }else{
            jTable1.setValueAt(nama, index_baris, 2);
            jTable1.setValueAt(jk, index_baris, 3);
            jTable1.setValueAt(kantor, index_baris, 4);
            jTable1.setValueAt(tujuan, index_baris, 5);
            
            refresh();
            
        }
    }//GEN-LAST:event_jButtonUbahActionPerformed

    private  void  refresh(){
        jTextNmaL.setText("");
        jRadioButtonL.setSelected(true);
        jTextKantor.setText("");
        jTextAreatujuanBertamu.setText("");
        jButtonSimpan.setEnabled(true);
        jButtonUbah.setEnabled(false);
        jButtonHapus.setEnabled(false);
        jTable1.clearSelection();
    }
 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new LatihanArray().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButtonL;
    private javax.swing.JRadioButton jRadioButtonP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreatujuanBertamu;
    private javax.swing.JTextField jTextKantor;
    private javax.swing.JTextField jTextNmaL;
    // End of variables declaration//GEN-END:variables
}
