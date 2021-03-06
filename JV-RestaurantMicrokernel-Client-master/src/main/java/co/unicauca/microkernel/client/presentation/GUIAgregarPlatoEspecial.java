
package co.unicauca.microkernel.client.presentation;

import co.unicauca.microkernel.client.access.Factory;
import co.unicauca.microkernel.client.access.IClienteAccess;
import co.unicauca.microkernel.client.domain.ClienteService;
import co.unicauca.microkernel.common.entities.Dish;
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
public class GUIAgregarPlatoEspecial extends javax.swing.JFrame {

    private IClienteAccess service;
    private ClienteService serviceRest;
    private Dish plate;
    private String loginName;

    /**
     * Creates new form GUIMenuClient
     */
    public GUIAgregarPlatoEspecial(String login) {
        service = Factory.getInstance().getClienteService();
        serviceRest = new ClienteService(service);
        this.plate = new Dish();
        initComponents();
        loginName = login;
        this.loadDataTable();
    }

    /**
     * Carga las comidas en el jTable
     */
    private void loadDataTable() {

        try {
            List<Dish> plates = serviceRest.findAllDish(loginName);
            System.out.println(loginName);
            DefaultTableModel modelTable = (DefaultTableModel) tblDataPlato.getModel();
            clearData(modelTable);
            
            for (Dish plato : plates) {
                Object[] fila = new Object[5];
                fila[0] = plato.getDishID();
                System.out.println("plato " + plato.getDishID());
                fila[1] = plato.getDishName();
                fila[2] = plato.getDishDescription();
                fila[3] = plato.getDishPrice();
                fila[4] = plato.getDishImage();
                modelTable.addRow(fila);
            }
        } catch (Exception ex) {
            Logger.getLogger(GUIAgregarPlatoEspecial.class.getName()).log(Level.SEVERE, null, ex);
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

        lbl_AgregarPlatoEspecial = new javax.swing.JLabel();
        lbl_IdComp = new javax.swing.JLabel();
        lbl_TipoComp = new javax.swing.JLabel();
        lbl_NomComp = new javax.swing.JLabel();
        txt_nomPlato = new javax.swing.JTextField();
        lbl_PrecioComp = new javax.swing.JLabel();
        txt_PricePlato = new javax.swing.JTextField();
        txt_IdPlato = new javax.swing.JTextField();
        btn_AgregarPlatoEspecial = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        lbl_ImagePlato = new javax.swing.JLabel();
        btn_CargarImagenPlato = new javax.swing.JButton();
        txt_descripPlato = new javax.swing.JTextField();
        txt_nomComp1 = new javax.swing.JTextField();
        txt_nomComp2 = new javax.swing.JTextField();
        txt_Ruta = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataPlato = new javax.swing.JTable();
        Btn_UpdateDish = new javax.swing.JButton();
        Btn_DeleteDish = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_AgregarPlatoEspecial.setBackground(new java.awt.Color(0, 0, 204));
        lbl_AgregarPlatoEspecial.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        lbl_AgregarPlatoEspecial.setForeground(new java.awt.Color(255, 255, 255));
        lbl_AgregarPlatoEspecial.setText("Agregar Plato Especial");
        getContentPane().add(lbl_AgregarPlatoEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 270, 30));

        lbl_IdComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_IdComp.setText("ID:");
        getContentPane().add(lbl_IdComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 20, 40));

        lbl_TipoComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_TipoComp.setText("Descripci??n:");
        getContentPane().add(lbl_TipoComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 70, -1));

        lbl_NomComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_NomComp.setText("Nombre:");
        getContentPane().add(lbl_NomComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 50, 40));
        getContentPane().add(txt_nomPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 100, -1));

        lbl_PrecioComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_PrecioComp.setText("Precio:");
        getContentPane().add(lbl_PrecioComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));
        getContentPane().add(txt_PricePlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 60, 20));
        getContentPane().add(txt_IdPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 100, -1));

        btn_AgregarPlatoEspecial.setBackground(new java.awt.Color(0, 0, 255));
        btn_AgregarPlatoEspecial.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btn_AgregarPlatoEspecial.setForeground(new java.awt.Color(255, 255, 255));
        btn_AgregarPlatoEspecial.setText("Agregar");
        btn_AgregarPlatoEspecial.setBorder(null);
        btn_AgregarPlatoEspecial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_AgregarPlatoEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarPlatoEspecialActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AgregarPlatoEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 80, 30));

        btn_salir.setBackground(new java.awt.Color(0, 0, 255));
        btn_salir.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("<----");
        btn_salir.setToolTipText("retroceder al menu administrador");
        btn_salir.setBorder(null);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 80, 30));

        lbl_ImagePlato.setBackground(new java.awt.Color(0, 0, 0));
        lbl_ImagePlato.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbl_ImagePlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, 150));

        btn_CargarImagenPlato.setBackground(new java.awt.Color(0, 0, 255));
        btn_CargarImagenPlato.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btn_CargarImagenPlato.setForeground(new java.awt.Color(255, 255, 255));
        btn_CargarImagenPlato.setText("Elegir Imagen");
        btn_CargarImagenPlato.setBorder(null);
        btn_CargarImagenPlato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_CargarImagenPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CargarImagenPlatoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CargarImagenPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 30));
        getContentPane().add(txt_descripPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 120, 70));
        getContentPane().add(txt_nomComp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 100, -1));
        getContentPane().add(txt_nomComp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 100, -1));
        getContentPane().add(txt_Ruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 120, 20));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 70));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        tblDataPlato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Precio", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDataPlato.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblDataPlato);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 520, 310));

        Btn_UpdateDish.setBackground(new java.awt.Color(0, 0, 255));
        Btn_UpdateDish.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Btn_UpdateDish.setForeground(new java.awt.Color(255, 255, 255));
        Btn_UpdateDish.setText("Modificar");
        Btn_UpdateDish.setBorder(null);
        Btn_UpdateDish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_UpdateDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 90, 30));

        Btn_DeleteDish.setBackground(new java.awt.Color(0, 0, 255));
        Btn_DeleteDish.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Btn_DeleteDish.setForeground(new java.awt.Color(255, 255, 255));
        Btn_DeleteDish.setText("Eliminar");
        Btn_DeleteDish.setBorder(null);
        Btn_DeleteDish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Btn_DeleteDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 90, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        GUIMenuAdministrador guiAdmin = new GUIMenuAdministrador(loginName);
        this.setVisible(false);
        guiAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_AgregarPlatoEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarPlatoEspecialActionPerformed
        boolean validarCampos=true;
        //si se escoge una foto se toma la direccion del archivo y se pasa a byte usando el metodo convertirFoto
        if (!(this.txt_Ruta.getText().isBlank()) && !(this.txt_IdPlato.getText().isBlank())
            && !(this.txt_nomPlato.getText().isBlank()) && !(this.txt_descripPlato.getText().isBlank()) && !(this.txt_PricePlato.getText().isBlank())) {
            plate.setDishID(Integer.parseInt(txt_IdPlato.getText()));
            plate.setDishName(txt_nomPlato.getText());
            plate.setDishDescription(txt_descripPlato.getText());
            plate.setDishPrice(Integer.parseInt(txt_PricePlato.getText()));
            plate.setDishImage(Utilities.convertirFoto(this.txt_Ruta.getText()));
        } else {
            validarCampos = false;
        }
        plate.setUserLoginName(loginName);
        
        String varName;
        String PlatoCreado;
        try {
            varName = serviceRest.findDish(txt_nomPlato.getText());
            if (varName != "Fallo") {
                JOptionPane.showConfirmDialog(rootPane, "ES PROBABLE QUE ESTE PLATO YA ESTE REGISTRADO", "ERROR", JOptionPane.CLOSED_OPTION);
            } else {
                if (validarCampos) {
                    PlatoCreado = serviceRest.createDish(plate);
                    if (PlatoCreado != "Fallo crear Plato") {//Si no se presento inconveniente en su creaci??n  
                        loadDataTable();
                        JOptionPane.showMessageDialog(null, "PLATO ESPECIAL AGREGADO CON EXITO!!!");
                        clearControls();
                        //JOptionPane.showConfirmDialog(rootPane, "COMPONENTE AGREGADO CON EXITO!!!", "OK", JOptionPane.CLOSED_OPTION);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "ERROR: Debe llenar todos los campos");
                }                
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(rootPane, "ERROR FATAL, NO SE PUDO CUMPLIR LA PETICION, REVISE LOS DATOS DIGITADOS", "ERROR", JOptionPane.CLOSED_OPTION);
            Logger.getLogger(GUIAgregarPlatoEspecial.class.getName()).log(Level.SEVERE, null, ex);
        }
        /**
        try {
            if (serviceRest.createDish(plate) != txt_nomPlato.getText()) {
                JOptionPane.showConfirmDialog(rootPane, "ES PROBABLE QUE ESTE PLATO YA ESTE REGISTRADO", "ERROR", JOptionPane.CLOSED_OPTION);
            } else {
                loadDataTable();
                JOptionPane.showConfirmDialog(rootPane, "PLATO ESPECIAL AGREGADO CON EXITO!!!", "OK", JOptionPane.CLOSED_OPTION);
                clearControls();
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(rootPane, "ERROR FATAL, NO SE PUDO CUMPLIR LA PETICION, REVISE LOS DATOS DIGITADOS", "ERROR", JOptionPane.CLOSED_OPTION);
            Logger.getLogger(GUIAgregarPlatoEspecial.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_btn_AgregarPlatoEspecialActionPerformed

    private void btn_CargarImagenPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CargarImagenPlatoActionPerformed
        var j = new JFileChooser();
        var fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fil);
        var s = j.showOpenDialog(this);
        if (s == APPROVE_OPTION) {
            var ruta = j.getSelectedFile().getAbsolutePath();
            txt_Ruta.setText(ruta);
            var imagen = new ImageIcon(ruta);
            this.lbl_ImagePlato.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(this.lbl_ImagePlato.getWidth(), this.lbl_ImagePlato.getHeight(), SCALE_SMOOTH)));
        } else {
            JOptionPane.showMessageDialog(null, "Fallo cargar la imagen");
        }
    }//GEN-LAST:event_btn_CargarImagenPlatoActionPerformed
    /**
     * Limpia las cajas de texto
     */
    public void clearControls() {
        txt_IdPlato.setText("");
        txt_nomPlato.setText("");
        txt_descripPlato.setText("");
        txt_PricePlato.setText("");
        lbl_ImagePlato.setText("");
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
            java.util.logging.Logger.getLogger(GUIAgregarPlatoEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarPlatoEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarPlatoEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAgregarPlatoEspecial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAgregarPlatoEspecial().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_DeleteDish;
    private javax.swing.JButton Btn_UpdateDish;
    private javax.swing.JButton btn_AgregarPlatoEspecial;
    private javax.swing.JButton btn_CargarImagenPlato;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_AgregarPlatoEspecial;
    private javax.swing.JLabel lbl_IdComp;
    private javax.swing.JLabel lbl_ImagePlato;
    private javax.swing.JLabel lbl_NomComp;
    private javax.swing.JLabel lbl_PrecioComp;
    private javax.swing.JLabel lbl_TipoComp;
    private javax.swing.JTable tblDataPlato;
    private javax.swing.JTextField txt_IdPlato;
    private javax.swing.JTextField txt_PricePlato;
    private javax.swing.JTextField txt_Ruta;
    private javax.swing.JTextField txt_descripPlato;
    private javax.swing.JTextField txt_nomComp1;
    private javax.swing.JTextField txt_nomComp2;
    private javax.swing.JTextField txt_nomPlato;
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
