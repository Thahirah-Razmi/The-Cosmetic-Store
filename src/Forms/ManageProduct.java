package Forms;

import Class.Product;
import javax.swing.JOptionPane;
import Connections.ConnectionProvider;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.*;
import javax.swing.JTable;

public class ManageProduct extends javax.swing.JFrame {

    private int productPk = 0;
    private int totalQuantity = 0;
    private Product selectedProduct;

    /**
     * Creates new form ManageProduct
     */
    public ManageProduct() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void getAllCategory() {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from category");
            comboBoxCategory.removeAllItems();
            while (rs.next()) {
                comboBoxCategory.addItem(rs.getString("category_pk") + "-" + rs.getString("name"));
                //1-Hair Care
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !txtName.getText().equals("") && !txtPrice.getText().equals("") && !txtDescription.getText().equals("")) {
            return false;
        } else if (formType.equals("new") && !txtName.getText().equals("") && !txtPrice.getText().equals("") && !txtDescription.getText().equals("") && !txtQuantity.getText().equals("")) {
            return false;
        } else {
            return true;
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

        labelManageProduct = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        labelName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labelQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        labelPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        labelDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        labelCategory = new javax.swing.JLabel();
        comboBoxCategory = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelManageProduct.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        labelManageProduct.setForeground(new java.awt.Color(0, 0, 0));
        labelManageProduct.setText("Manage Product");
        getContentPane().add(labelManageProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 18, 351, -1));

        productTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        productTable.setForeground(new java.awt.Color(0, 0, 0));
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Quantity", "Price", "Description", "Category ID", "Category Name"
            }
        ));
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 103, 477, 509));

        labelName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 0, 0));
        labelName.setText("Name");
        getContentPane().add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 103, 325, -1));

        txtName.setBackground(java.awt.Color.white);
        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 138, 325, -1));

        labelQuantity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelQuantity.setForeground(new java.awt.Color(0, 0, 0));
        labelQuantity.setText("Quantity");
        getContentPane().add(labelQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 183, 325, -1));

        txtQuantity.setBackground(java.awt.Color.white);
        txtQuantity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 218, 325, -1));

        labelPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelPrice.setForeground(new java.awt.Color(0, 0, 0));
        labelPrice.setText("Price");
        getContentPane().add(labelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 263, 325, -1));

        txtPrice.setBackground(java.awt.Color.white);
        txtPrice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 298, 325, -1));

        labelDescription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelDescription.setForeground(new java.awt.Color(0, 0, 0));
        labelDescription.setText("Description");
        getContentPane().add(labelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 343, 325, -1));

        txtDescription.setBackground(java.awt.Color.white);
        txtDescription.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 378, 325, -1));

        labelCategory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelCategory.setForeground(new java.awt.Color(0, 0, 0));
        labelCategory.setText("Category");
        getContentPane().add(labelCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 423, 325, -1));

        comboBoxCategory.setBackground(java.awt.Color.white);
        comboBoxCategory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        comboBoxCategory.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboBoxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 458, 325, -1));

        btnSave.setBackground(new java.awt.Color(255, 102, 102));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 503, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 503, -1, -1));

        btnReset.setBackground(new java.awt.Color(255, 102, 102));
        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 0));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 503, -1, -1));

        btnClose.setBackground(new java.awt.Color(255, 102, 102));
        btnClose.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 0));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 503, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagaes/Home Page Background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        getAllCategory();
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from product inner join category on product.category_fk = category.category_pk");
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("product_pk"), rs.getString("name"), rs.getString("quantity"), rs.getString("price"), rs.getString("description"), rs.getString("category_fk"), rs.getString(8)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    public JTable getProductTable() {
        return productTable;
    }

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ManageProduct().setVisible(true);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String quantityText = txtQuantity.getText();
        String priceText = txtPrice.getText();
        String description = txtDescription.getText();
        String category = (String) comboBoxCategory.getSelectedItem();
        int categoryFk = Integer.parseInt(category.split("-")[0]);

        if (name.isEmpty() || quantityText.isEmpty() || priceText.isEmpty() || description.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
            return; // Exit the method early
        }

        int quantity = Integer.parseInt(quantityText);
        double price = Double.parseDouble(priceText);

        Product newProduct = new Product(0, name, quantity, price, description, categoryFk);

        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into product (name,quantity,price,description,category_fk) values(?,?,?,?,?)");
            ps.setString(1, newProduct.getName());
            ps.setInt(2, newProduct.getQuantity());
            ps.setDouble(3, newProduct.getPrice());
            ps.setString(4, newProduct.getDescription());
            ps.setInt(5, newProduct.getCategoryFk());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product Added Successfully");
            setVisible(false);
            new ManageProduct().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        int index = productTable.getSelectedRow();
        TableModel model = productTable.getModel();
        int id = Integer.parseInt(model.getValueAt(index, 0).toString());
        String name = model.getValueAt(index, 1).toString();
        int quantity = Integer.parseInt(model.getValueAt(index, 2).toString());
        double price = Double.parseDouble(model.getValueAt(index, 3).toString());
        String description = model.getValueAt(index, 4).toString();
        int categoryFk = Integer.parseInt(model.getValueAt(index, 5).toString());

        selectedProduct = new Product(id, name, quantity, price, description, categoryFk);

        txtName.setText(name);
        txtQuantity.setText(String.valueOf(quantity));
        txtPrice.setText(String.valueOf(price));
        txtDescription.setText(description);

        // Select the category in the combo box
        comboBoxCategory.setSelectedItem(categoryFk + "-" + getCategoryName(categoryFk));

        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

    }//GEN-LAST:event_productTableMouseClicked

    // Helper method to get category name based on category_fk
    private String getCategoryName(int categoryFk) {
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("select name from category where category_pk = ?");
            ps.setInt(1, categoryFk);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("name");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        double price = Double.parseDouble(txtPrice.getText());
        String description = txtDescription.getText();
        String category = (String) comboBoxCategory.getSelectedItem();
        int categoryFk = Integer.parseInt(category.split("-")[0]);

        selectedProduct.setName(name);
        selectedProduct.setQuantity(quantity);
        selectedProduct.setPrice(price);
        selectedProduct.setDescription(description);
        selectedProduct.setCategoryFk(categoryFk);

        if (validateFields("edit")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update product set name=?,quantity=?,price=?,description=?,category_fk=? where product_pk=?");
                ps.setString(1, selectedProduct.getName());
                ps.setInt(2, selectedProduct.getQuantity());
                ps.setDouble(3, selectedProduct.getPrice());
                ps.setString(4, selectedProduct.getDescription());
                ps.setInt(5, selectedProduct.getCategoryFk());
                ps.setInt(6, selectedProduct.getProductPk());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Updated Successfully");
                setVisible(false);
                new ManageProduct().setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelManageProduct;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelQuantity;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
