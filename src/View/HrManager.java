/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.HrManagerController;
import Models.Data.Staff;
import Models.HRManagerModel;
import static View.MenuManager.IdFood;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nguye
 */
public class HrManager extends javax.swing.JFrame {
    public static int IdStaff;
    /**
     * Creates new form HrManager
     */
    public HrManager() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HRManagerModel hrManagerModel = new HRManagerModel();
        HrManagerController hrManagerController =  new HrManagerController(hrManagerModel);
        List<Staff> listStaff = hrManagerController.GetAllStaff();
        DefaultTableModel model = (DefaultTableModel)jTbl_Menu.getModel();
        int i = 0;
        for(Staff o : listStaff){
            String status;
            switch (o.getState()) {
                case 0:
                    status = "Đang làm việc";
                    break;
                case 2:
                    status = "Tạm nghỉ";
                    break;
                default:
                    status = "Sa thải";
                    break;
            }
            
            model.addRow(new Object[] {
                o.getiD(),
                o.getFullName(),
                "0" + o.getPhoneNumber(),
                o.getEmail(),
                o.getHireDate(),
                o.getPosition(),
                status
            });
            i++;
            lbl_QuantityFood.setText("Tổng số nhân viên: " + i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn__Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbl_Menu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_QuantityFood = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btn_UpdateStaff = new javax.swing.JButton();
        btn_AddStaff = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn__Exit.setText("Trở về");
        btn__Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn__ExitActionPerformed(evt);
            }
        });

        jTbl_Menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Email", "Ngày vào làm", "Chức vụ", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTbl_Menu);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Quản lý nhân sự");

        lbl_QuantityFood.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_QuantityFood.setText("Tổng số nhân viên");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Danh sách nhân viên");

        txtSearch.setText("Tìm kiếm...");

        btn_UpdateStaff.setText("Sửa thông tin");
        btn_UpdateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateStaffActionPerformed(evt);
            }
        });

        btn_AddStaff.setText("Thêm nhân viên");
        btn_AddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddStaffActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        btn_Search.setText("Tìm kiếm");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jButton1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                        .addComponent(btn_AddStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_UpdateStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn__Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_QuantityFood, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(59, 59, 59)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl_QuantityFood)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btn_AddStaff, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_UpdateStaff)
                            .addComponent(btn__Exit))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Search))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UpdateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateStaffActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTbl_Menu.getSelectedRow();
        if (selectedRow != -1) {
            // Lấy giá trị của ô "Id" từ dòng được chọn
            int id = (int) jTbl_Menu.getValueAt(selectedRow, 0);
            IdStaff = id;
            UpdateStaff updateStaff = new UpdateStaff();
            updateStaff.setVisible(true);
            this.setVisible(false);
        } else {
            // Hiển thị thông báo hoặc xử lý khi không có dòng nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm bạn muốn sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_UpdateStaffActionPerformed

    private void btn__ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn__ExitActionPerformed
        // TODO add your handling code here:
        HomeStaff homeStaff = new HomeStaff();
        homeStaff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn__ExitActionPerformed

    private void btn_AddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddStaffActionPerformed
        // TODO add your handling code here:
        AddStaff addStaff = new AddStaff();
        addStaff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AddStaffActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        if(txtSearch.getText() == null || txtSearch.getText() == "") {
            HRManagerModel hrManagerModel = new HRManagerModel();
            HrManagerController hrManagerController =  new HrManagerController(hrManagerModel);
            List<Staff> listStaff = hrManagerController.GetAllStaff();
            DefaultTableModel model = (DefaultTableModel)jTbl_Menu.getModel();
            int i = 0;
            for(Staff o : listStaff){
                String status;
                switch (o.getState()) {
                    case 0:
                        status = "Đang làm việc";
                        break;
                    case 2:
                        status = "Tạm nghỉ";
                        break;
                    default:
                        status = "Sa thải";
                        break;
                }

                model.addRow(new Object[] {
                    o.getiD(),
                    o.getFullName(),
                    "0" + o.getPhoneNumber(),
                    o.getEmail(),
                    o.getHireDate(),
                    o.getPosition(),
                    status
                });
                i++;
                lbl_QuantityFood.setText("Tổng số nhân viên: " + i);
            }
        }
        else {
            HRManagerModel hrManagerModel = new HRManagerModel();
            HrManagerController hrManagerController =  new HrManagerController(hrManagerModel);
            List<Staff> listStaff = hrManagerController.FindStaffById(txtSearch.getText());
            DefaultTableModel model = (DefaultTableModel)jTbl_Menu.getModel();
            model.setRowCount(0);
            int i = 0;
            for(Staff o : listStaff){
                String status;
                switch (o.getState()) {
                    case 0:
                        status = "Đang làm việc";
                        break;
                    case 2:
                        status = "Tạm nghỉ";
                        break;
                    default:
                        status = "Sa thải";
                        break;
                }

                model.addRow(new Object[] {
                    o.getiD(),
                    o.getFullName(),
                    "0" + o.getPhoneNumber(),
                    o.getEmail(),
                    o.getHireDate(),
                    o.getPosition(),
                    status
                });
                i++;
                lbl_QuantityFood.setText("Tổng số nhân viên: " + i);
            }
        }
    }//GEN-LAST:event_btn_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(HrManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HrManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HrManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HrManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HrManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddStaff;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_UpdateStaff;
    private javax.swing.JButton btn__Exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTbl_Menu;
    private javax.swing.JLabel lbl_QuantityFood;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
