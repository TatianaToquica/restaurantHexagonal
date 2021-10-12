package co.unicauca.microkernel.client.presentation;

import co.unicauca.microkernel.client.access.Factory;
import co.unicauca.microkernel.client.access.IClienteAccess;
import co.unicauca.microkernel.client.domain.ClienteService;
import co.unicauca.microkernel.common.entities.Component;

import co.unicauca.microkernel.common.infra.Utilities;
import static java.awt.Image.SCALE_SMOOTH;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.JFileChooser.APPROVE_OPTION;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class GUIAgregarComponentes extends javax.swing.JFrame {

    private IClienteAccess service;
    private ClienteService serviceRest;
    private Component componente;
    private String loginName;

    /**
     * Creates new form GUIMenuClient
     */
    public GUIAgregarComponentes(String login) {
        service = Factory.getInstance().getClienteService();
        serviceRest = new ClienteService(service);
        this.componente = new Component();
        initComponents();
        loginName = login;
        this.loadDataTable();
    }

    /**
     * Carga las comidas en el jTable
     */
    private void loadDataTable() {

        try {
            List<Component> components = serviceRest.findAllComponentes(loginName);
            DefaultTableModel modelTable = (DefaultTableModel) tblData.getModel();
            clearData(modelTable);
            for (Component component : components) {
                Object[] fila = new Object[5];
                fila[0] = component.getCompId();
                System.out.println("compon " + component.getCompId());
                fila[1] = component.getCompName();
                fila[2] = component.getCompType();
                fila[3] = component.getCompPrice();
                fila[4] = component.getCompImage();
                modelTable.addRow(fila);
            }
        } catch (Exception ex) {
            Logger.getLogger(GUIAgregarComponentes.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel2 = new javax.swing.JLabel();
        lbl_IdComp = new javax.swing.JLabel();
        lbl_TipoComp = new javax.swing.JLabel();
        lbl_NomComp = new javax.swing.JLabel();
        txt_nomComp = new javax.swing.JTextField();
        lbl_PrecioComp = new javax.swing.JLabel();
        txt_PriceComp = new javax.swing.JTextField();
        cbx_tipoComp = new javax.swing.JComboBox<>();
        txt_IdComp = new javax.swing.JTextField();
        btn_AgregarComp = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_CargarImagenComp = new javax.swing.JButton();
        lbl_ImageComp = new javax.swing.JLabel();
        txt_Ruta = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        Btn_UpdateComponente = new javax.swing.JButton();
        Btn_DeleteComponente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Componente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 30));

        lbl_IdComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_IdComp.setText("ID:");
        getContentPane().add(lbl_IdComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 20, 40));

        lbl_TipoComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_TipoComp.setText("Tipo:");
        getContentPane().add(lbl_TipoComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        lbl_NomComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_NomComp.setText("Nombre:");
        getContentPane().add(lbl_NomComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 50, 40));
        getContentPane().add(txt_nomComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 100, -1));

        lbl_PrecioComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_PrecioComp.setText("Precio:");
        getContentPane().add(lbl_PrecioComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));
        getContentPane().add(txt_PriceComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 60, 20));

        cbx_tipoComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Principio", "Proteina", "Bebida" }));
        getContentPane().add(cbx_tipoComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));
        getContentPane().add(txt_IdComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 100, -1));

        btn_AgregarComp.setBackground(new java.awt.Color(0, 0, 255));
        btn_AgregarComp.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btn_AgregarComp.setForeground(new java.awt.Color(255, 255, 255));
        btn_AgregarComp.setText("Agregar");
        btn_AgregarComp.setBorder(null);
        btn_AgregarComp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AgregarComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarCompActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AgregarComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 80, 30));

        btn_salir.setBackground(new java.awt.Color(0, 0, 255));
        btn_salir.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("<----");
        btn_salir.setToolTipText("retroceder al menú administrador");
        btn_salir.setBorder(null);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 60, 30));

        btn_CargarImagenComp.setBackground(new java.awt.Color(0, 0, 255));
        btn_CargarImagenComp.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btn_CargarImagenComp.setForeground(new java.awt.Color(255, 255, 255));
        btn_CargarImagenComp.setText("Elegir Imagen");
        btn_CargarImagenComp.setBorder(null);
        btn_CargarImagenComp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CargarImagenComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarImagenCompActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CargarImagenComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 30));

        lbl_ImageComp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbl_ImageComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 150));
        getContentPane().add(txt_Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, -1));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 70));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tipo", "Precio", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 550, 310));

        Btn_UpdateComponente.setBackground(new java.awt.Color(0, 0, 255));
        Btn_UpdateComponente.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Btn_UpdateComponente.setForeground(new java.awt.Color(255, 255, 255));
        Btn_UpdateComponente.setText("Modificar");
        Btn_UpdateComponente.setBorder(null);
        Btn_UpdateComponente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_UpdateComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 90, 30));

        Btn_DeleteComponente.setBackground(new java.awt.Color(0, 0, 255));
        Btn_DeleteComponente.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Btn_DeleteComponente.setForeground(new java.awt.Color(255, 255, 255));
        Btn_DeleteComponente.setText("Eliminar");
        Btn_DeleteComponente.setBorder(null);
        Btn_DeleteComponente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_DeleteComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 90, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarCompActionPerformed
        boolean validarCampos = true;
        //si se escoge una foto se toma la direccion del archivo y se pasa a byte usando el metodo convertirFoto
        if (!(this.txt_Ruta.getText().isBlank()) && !(this.txt_IdComp.getText().isBlank())
                && !(this.txt_nomComp.getText().isBlank()) && !(this.txt_PriceComp.getText().isBlank())) {
            componente.setCompId(Integer.parseInt(txt_IdComp.getText()));
            componente.setCompName(txt_nomComp.getText());
            componente.setCompType(cbx_tipoComp.getSelectedItem().toString());
            componente.setCompPrice(Integer.parseInt(txt_PriceComp.getText()));
            componente.setCompImage(Utilities.convertirFoto(this.txt_Ruta.getText()));
        } else {
            validarCampos = false;
        }
        componente.setUserLoginName(loginName);

        String varName;
        String ComponentCreado;
        try {
            varName = serviceRest.findComponente(txt_nomComp.getText());
            if (varName != "Fallo") {
                JOptionPane.showConfirmDialog(rootPane, "ES PROBABLE QUE ESTE COMPONENTE YA ESTE REGISTRADO", "ERROR", JOptionPane.CLOSED_OPTION);
            } else {
                if (validarCampos) {
                    ComponentCreado = serviceRest.createComponente(componente);
                    if (ComponentCreado != "Fallo crear Componente") {//Si no se presento inconveniente en su creación  
                        loadDataTable();
                        JOptionPane.showMessageDialog(null, "COMPONENTE AGREGADO CON EXITO!!!");
                        clearControls();
                        //JOptionPane.showConfirmDialog(rootPane, "COMPONENTE AGREGADO CON EXITO!!!", "OK", JOptionPane.CLOSED_OPTION);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR: Debe llenar todos los campos");
                }                
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(rootPane, "ERROR FATAL, NO SE PUDO CUMPLIR LA PETICION, REVISE LOS DATOS DIGITADOS", "ERROR", JOptionPane.CLOSED_OPTION);
            Logger.getLogger(GUIAgregarComponentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_AgregarCompActionPerformed

    private void btn_CargarImagenCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarImagenCompActionPerformed
        var j = new JFileChooser();
        var fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fil);
        var s = j.showOpenDialog(this);
        if (s == APPROVE_OPTION) {
            var ruta = j.getSelectedFile().getAbsolutePath();
            txt_Ruta.setText(ruta);
            var imagen = new ImageIcon(ruta);
            this.lbl_ImageComp.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(this.lbl_ImageComp.getWidth(), this.lbl_ImageComp.getHeight(), SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Fallo cargar la imagen");
        }
    }//GEN-LAST:event_btn_CargarImagenCompActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        GUIMenuAdministrador guiAdmin = new GUIMenuAdministrador(loginName);
        this.setVisible(false);
        guiAdmin.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed
    /**
     * Limpia las cajas de texto
     */
    public void clearControls() {
        txt_IdComp.setText("");
        txt_nomComp.setText("");
        cbx_tipoComp.setSelectedIndex(0);
        txt_PriceComp.setText("");
        lbl_ImageComp.setText("");
        txt_Ruta.setText("");
    }

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
            java.util.logging.Logger.getLogger(GUIAgregarComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarComponentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new GUIAgregarComponentes(loginName).setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_DeleteComponente;
    private javax.swing.JButton Btn_UpdateComponente;
    private javax.swing.JButton btn_AgregarComp;
    private javax.swing.JButton btn_CargarImagenComp;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cbx_tipoComp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_IdComp;
    private javax.swing.JLabel lbl_ImageComp;
    private javax.swing.JLabel lbl_NomComp;
    private javax.swing.JLabel lbl_PrecioComp;
    private javax.swing.JLabel lbl_TipoComp;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txt_IdComp;
    private javax.swing.JTextField txt_PriceComp;
    private javax.swing.JTextField txt_Ruta;
    private javax.swing.JTextField txt_nomComp;
    // End of variables declaration//GEN-END:variables

    /**
     * Elimina las filas del jTable
     *
     * @param modelTable modelo de datos del jTable
     */
    private void clearData(DefaultTableModel modelTable) {
        while (modelTable.getRowCount() > 0) {
            modelTable.removeRow(0);
        }
    }
}