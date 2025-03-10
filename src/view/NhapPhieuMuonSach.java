/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.PhieuMuonSachDAO;
import dao.SachDAO;
import dao.TaiKhoanDAO;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PhieuMuonSach;
import model.TaiKhoan;
import util.NgayThangNam;

/**
 *
 * @author admin
 */
public class NhapPhieuMuonSach extends javax.swing.JFrame {
    TaiKhoan acc;
    /**
     * Creates new form NhapPhieuMuonSach
     */
    public NhapPhieuMuonSach() {
        initComponents();
        setLocationRelativeTo(null);
        Image img = new ImageIcon(this.getClass().getResource("/icon/library3.png")).getImage();
        this.setIconImage(img);
    }
    
    public NhapPhieuMuonSach(TaiKhoan taiKhoan) {
        initComponents();
        setLocationRelativeTo(null);
        Image img = new ImageIcon(this.getClass().getResource("/icon/library3.png")).getImage();
        this.setIconImage(img);
        labelUsername.setText(taiKhoan.getTenDangNhap());
        acc = taiKhoan;
    }
    
    public void clearData() {
        txtMaDG.setText("");
        txtMaSach.setText("");
    }
    
    public void showTable() {
        tableMain.removeAll();
        DefaultTableModel model = new SachDAO().getSachList();
        tableMain.setModel(model);
    }
    
    public void showTablePhu() {
        tablePhu.removeAll();
        DefaultTableModel model = new TaiKhoanDAO().getTK_MaDG_HoTenList();
        tablePhu.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaDG = new javax.swing.JTextField();
        txtNgayMuon = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaMuon = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtNgayHenTra = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePhu = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMain = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NHẬP PHIẾU MƯỢN SÁCH");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borrow.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("NHẬP PHIẾU MƯỢN SÁCH");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("THÔNG TIN CHI TIẾT");

        txtMaDG.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMaDG.setPreferredSize(new java.awt.Dimension(73, 29));
        txtMaDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDGActionPerformed(evt);
            }
        });

        txtNgayMuon.setEditable(false);
        txtNgayMuon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNgayMuon.setForeground(new java.awt.Color(255, 0, 51));
        txtNgayMuon.setPreferredSize(new java.awt.Dimension(64, 29));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Ngày mượn:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Mã sách:");

        txtMaSach.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMaSach.setPreferredSize(new java.awt.Dimension(81, 29));

        txtSoLuong.setEditable(false);
        txtSoLuong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSoLuong.setForeground(new java.awt.Color(255, 0, 51));
        txtSoLuong.setText("1");
        txtSoLuong.setPreferredSize(new java.awt.Dimension(64, 29));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Số lượng:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Mã mượn:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Mã ĐG:");

        txtMaMuon.setEditable(false);
        txtMaMuon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtMaMuon.setForeground(new java.awt.Color(255, 0, 51));
        txtMaMuon.setText("Tự động điền");
        txtMaMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMuonActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(153, 255, 204));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnAdd.setText("THÊM");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 255, 204));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout (1).png"))); // NOI18N
        btnExit.setText("THOÁT");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setPreferredSize(new java.awt.Dimension(75, 35));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtNgayHenTra.setEditable(false);
        txtNgayHenTra.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNgayHenTra.setForeground(new java.awt.Color(255, 0, 51));
        txtNgayHenTra.setPreferredSize(new java.awt.Dimension(64, 29));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Ngày hẹn trả:");

        btnReset.setBackground(new java.awt.Color(153, 255, 204));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh-button.png"))); // NOI18N
        btnReset.setText("RESET");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setPreferredSize(new java.awt.Dimension(75, 35));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Xin chào, ");

        labelUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelUsername.setText("N/A");
        labelUsername.setToolTipText("");
        labelUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablePhu.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tablePhu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tài khoản", "Mã ĐG", "Họ tên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePhu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePhuMouseClicked(evt);
            }
        });
        tablePhu.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tablePhuComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(tablePhu);

        tableMain.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tableMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "NXB", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMainMouseClicked(evt);
            }
        });
        tableMain.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableMainComponentShown(evt);
            }
        });
        jScrollPane3.setViewportView(tableMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNgayHenTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMaMuon)
                                        .addComponent(txtMaSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUsername)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(labelUsername)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayHenTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDGActionPerformed

    private void txtMaMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaMuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaMuonActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        PhieuMuonSachDAO phieuMuonDAO = new PhieuMuonSachDAO();
        String maDG = txtMaDG.getText();
        String maSach = txtMaSach.getText();
        String ngayMuon = txtNgayMuon.getText();
        String ngayHenTra = txtNgayHenTra.getText();
        int soLuong = Integer.parseInt(txtSoLuong.getText());
        int tinhTrang = 1;
        if(new PhieuMuonSachDAO().checkDocGiaMuonSach(maDG, maSach)) {
            JOptionPane.showMessageDialog(this, "Bạn đã mượn sách này rồi, vui lòng trả sách trước khi mượn lại !");
        }
        else {
            PhieuMuonSach phieu = new PhieuMuonSach(maDG, maSach, ngayMuon, soLuong, tinhTrang, ngayHenTra);
            if(phieuMuonDAO.addPhieuMuonSach(phieu)) {
                JOptionPane.showMessageDialog(this, "Thêm thành công !");
                clearData();
                showTable();
            }
            else {
                JOptionPane.showMessageDialog(this, "Lỗi, vui lòng thử lại !");
            }
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Borrow b = new Borrow(acc);
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Borrow b = new Borrow(acc);
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        clearData();
    }//GEN-LAST:event_btnResetActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        txtNgayMuon.setText(NgayThangNam.getBorrowDate());
        txtNgayHenTra.setText(NgayThangNam.getReturnDate());
        showTable();
        showTablePhu();
    }//GEN-LAST:event_formComponentShown

    private void tablePhuComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tablePhuComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePhuComponentShown

    private void tableMainComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableMainComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMainComponentShown

    private void tableMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMainMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableMain.getSelectedRow();
        if (selectedRow != -1) {
            txtMaSach.setText(tableMain.getValueAt(selectedRow, 0).toString());
        }
    }//GEN-LAST:event_tableMainMouseClicked

    private void tablePhuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePhuMouseClicked
        // TODO add your handling code here:
        int selectedRow = tablePhu.getSelectedRow();
        if (selectedRow != -1) {
            txtMaDG.setText(tablePhu.getValueAt(selectedRow, 1).toString());
        }
    }//GEN-LAST:event_tablePhuMouseClicked

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
            java.util.logging.Logger.getLogger(NhapPhieuMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhapPhieuMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhapPhieuMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhapPhieuMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapPhieuMuonSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JTable tableMain;
    private javax.swing.JTable tablePhu;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtMaMuon;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNgayHenTra;
    private javax.swing.JTextField txtNgayMuon;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
