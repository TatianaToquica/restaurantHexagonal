/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.client.presentation;

import co.unicauca.microkernel.client.access.Factory;
import co.unicauca.microkernel.client.access.IClienteAccess;
import co.unicauca.microkernel.client.domain.ClienteService;
import co.unicauca.microkernel.common.entities.Component;
import co.unicauca.microkernel.common.entities.DayMenu;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class GUIMenuDia extends javax.swing.JFrame {

    private IClienteAccess service;
    private ClienteService serviceRest;
    private Component componente;
    private DayMenu menu;
    private String loginName;
    private List<Component> components;
    private List<Component> componentsMenu;
    int compId;
    String dia;

    /**
     * Creates new form GUIMenuDia
     */
    public GUIMenuDia(String login) {
        service = Factory.getInstance().getClienteService();
        serviceRest = new ClienteService(service);
        this.componente = new Component();
        this.menu = new DayMenu();
        initComponents();
        loginName = login;
        this.loadDataTable();
        this.loadDataTable1();
    }

    /**
     * Carga todos los componentes del administrador en el jTable
     */
    private void loadDataTable() {

        try {
            components = serviceRest.findAllComponentes(loginName);
            DefaultTableModel modelTable = (DefaultTableModel) tblDataTodosComp.getModel();
            clearData(modelTable);
            for (Component component : components) {
                Object[] fila = new Object[4];
                fila[0] = component.getCompId();
                System.out.println("compon " + component.getCompId());
                fila[1] = component.getCompName();
                fila[2] = component.getCompType();
                fila[3] = component.getCompPrice();
                //fila[4] = component.getCompImage();
                modelTable.addRow(fila);
            }
        } catch (Exception ex) {
            Logger.getLogger(GUIMenuDia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Carga todos los componentes del administrador en el jTable
     */
    private void loadDataTable1() {

        try {
            componentsMenu = serviceRest.findCompDia(dia, loginName);
            DefaultTableModel modelTable = (DefaultTableModel) tblDataCompDia.getModel();
            clearData(modelTable);
            for (Component component : componentsMenu) {
                Object[] fila = new Object[4];
                fila[0] = component.getCompId();                
                fila[1] = component.getCompName();
                fila[2] = component.getCompType();
                fila[3] = component.getCompPrice();
                //fila[4] = component.getCompImage();
                modelTable.addRow(fila);
            }
        } catch (Exception ex) {
            Logger.getLogger(GUIMenuDia.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataTodosComp = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataCompDia = new javax.swing.JTable();
        Btn_DeletCompDia = new javax.swing.JButton();
        btnAgregarCompDia = new javax.swing.JButton();
        cbxDias = new javax.swing.JComboBox<>();
        btn_salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Btn_MostrarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblDataTodosComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tipo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDataTodosComp.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDataTodosComp.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDataTodosCompMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblDataTodosComp);

        tblDataCompDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Tipo", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDataCompDia.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblDataCompDia);

        Btn_DeletCompDia.setBackground(new java.awt.Color(0, 0, 255));
        Btn_DeletCompDia.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Btn_DeletCompDia.setForeground(new java.awt.Color(255, 255, 255));
        Btn_DeletCompDia.setText("Eliminar");
        Btn_DeletCompDia.setBorder(null);
        Btn_DeletCompDia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAgregarCompDia.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregarCompDia.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        btnAgregarCompDia.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCompDia.setText("Ofertar ");
        btnAgregarCompDia.setBorder(null);
        btnAgregarCompDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCompDiaActionPerformed(evt);
            }
        });

        cbxDias.setBackground(new java.awt.Color(0, 0, 255));
        cbxDias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbxDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo" }));
        cbxDias.setBorder(null);

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

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel2.setText("Menu Dia");
        jPanel2.add(jLabel2);

        Btn_MostrarMenu.setBackground(new java.awt.Color(0, 0, 255));
        Btn_MostrarMenu.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Btn_MostrarMenu.setForeground(new java.awt.Color(255, 255, 255));
        Btn_MostrarMenu.setText("Mostrar Menu");
        Btn_MostrarMenu.setBorder(null);
        Btn_MostrarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_MostrarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MostrarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(cbxDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnAgregarCompDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_MostrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Btn_DeletCompDia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_DeletCompDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_MostrarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarCompDia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        GUIMenuAdministrador guiAdmin = new GUIMenuAdministrador(loginName);
        this.setVisible(false);
        guiAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btnAgregarCompDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCompDiaActionPerformed
       
        menu.setDmenCompID(compId);
        menu.setDmenDay(dia);
        menu.setUserLoginName(loginName);
        
        String MenuCreado;
        try {
            MenuCreado = serviceRest.createMenuDia(menu);
            if (MenuCreado != "FALLO") {//Si no se presento inconveniente en su creación  
                loadDataTable1();
                JOptionPane.showMessageDialog(null, "COMPONENTE AGREGADO CON EXITO EN EL MENU!!!");
            } else {
                JOptionPane.showMessageDialog(null, "ES PROBABLE QUE ESTE COMPONENTE YA ESTE REGISTRADO EN EL MENU");
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(rootPane, "ERROR FATAL, NO SE PUDO CUMPLIR LA PETICION, REVISE LOS DATOS DIGITADOS", "ERROR", JOptionPane.CLOSED_OPTION);
            Logger.getLogger(GUIMenuDia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAgregarCompDiaActionPerformed
   
    private void tblDataTodosCompMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataTodosCompMousePressed

        int indexFila = tblDataTodosComp.getSelectedRow();       
        compId = components.get(indexFila).getCompId();
        dia = cbxDias.getSelectedItem().toString();
        //prueba=components.get(indexFila).getCompId()+", "+cbxDias.getSelectedItem().toString();
    }//GEN-LAST:event_tblDataTodosCompMousePressed

    private void Btn_MostrarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MostrarMenuActionPerformed
        dia = cbxDias.getSelectedItem().toString();
        loadDataTable1();
    }//GEN-LAST:event_Btn_MostrarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenuDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuDia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuDia().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_DeletCompDia;
    private javax.swing.JButton Btn_MostrarMenu;
    private javax.swing.JButton btnAgregarCompDia;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cbxDias;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDataCompDia;
    private javax.swing.JTable tblDataTodosComp;
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