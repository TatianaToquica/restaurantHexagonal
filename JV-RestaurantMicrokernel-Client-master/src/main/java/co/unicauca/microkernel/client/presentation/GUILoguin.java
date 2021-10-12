package co.unicauca.microkernel.client.presentation;

import co.unicauca.microkernel.client.access.Factory;
import co.unicauca.microkernel.client.access.IClienteAccess;
import co.unicauca.microkernel.client.domain.ClienteService;
import co.unicauca.microkernel.common.entities.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUILoguin extends javax.swing.JFrame {

    private IClienteAccess service;
    private ClienteService serviceRest;
    private User usuario;
    private String tipoUser;

    /**
     * Creates new form GUILoguin
     */
    public GUILoguin() {
        service = Factory.getInstance().getClienteService();
        serviceRest = new ClienteService(service);
        this.usuario = new User();
        initComponents();
        setLocationRelativeTo(null);
       
    }

    public void TipoUsuario(String typeUser) {
        tipoUser = typeUser;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtUserLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        Btn_IniciarSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblRegistroUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        User1 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Btn_Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setFont(new java.awt.Font("Britannic Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIO DE SESIÓN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 300, 34));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel5.setFont(new java.awt.Font("Blackadder ITC", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Restaurantes en línea");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 307, -1));

        txtUserLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUserLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUserLogin.setToolTipText("");
        txtUserLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        txtUserLogin.setCaretColor(new java.awt.Color(0, 0, 204));
        jPanel1.add(txtUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 48));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 180, 50));

        Btn_IniciarSesion.setBackground(new java.awt.Color(0, 0, 255));
        Btn_IniciarSesion.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Btn_IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        Btn_IniciarSesion.setText("Iniciar");
        Btn_IniciarSesion.setToolTipText("Iniciar Sesión");
        Btn_IniciarSesion.setBorder(null);
        Btn_IniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 72, 36));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("No te haz registrado aún? haz click aquí ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 325, -1, 28));

        lblRegistroUsuario.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblRegistroUsuario.setForeground(new java.awt.Color(255, 0, 0));
        lblRegistroUsuario.setText("Registrate!");
        lblRegistroUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroUsuarioMouseClicked(evt);
            }
        });
        jPanel1.add(lblRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        User1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        User1.setText("Usuario:");
        jPanel1.add(User1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        User.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        User.setText("Contraseña:");
        jPanel1.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        Btn_Atras.setBackground(new java.awt.Color(0, 0, 255));
        Btn_Atras.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        Btn_Atras.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Atras.setText("<----");
        Btn_Atras.setToolTipText("retroceder una página");
        Btn_Atras.setBorder(null);
        Btn_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AtrasActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 72, 36));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IniciarSesionActionPerformed
        //Aqui vendria el analizar si el usuario existe en el sistema
        String varLogin;
        String varPassword;
        String varTipo;
        try {

            //validar login
            varLogin = serviceRest.findUser(txtUserLogin.getText());
            if (varLogin != "Fallo") {
                //verificar la contraseña
                varPassword = serviceRest.validateUser(txtUserLogin.getText(), txtPassword.getText());
                if (varPassword != "Fallo") {
                    varTipo = serviceRest.validateTypeUser(txtUserLogin.getText(), tipoUser);
                    //validar el tipo de usuario
                    if (varTipo != "Fallo") {
                        JOptionPane.showMessageDialog(null, "Ha iniciado sesión con Éxito");
                        if (tipoUser == "administrador") {                            
                            this.setVisible(false);
                            GUIMenuAdministrador opcAdmin = new GUIMenuAdministrador(txtUserLogin.getText());
                            opcAdmin.setVisible(true);
                            opcAdmin.pack();
                        }
                        if (tipoUser == "cliente") {                            
                            this.setVisible(false);
                            GUIMenuClient opcClient = new GUIMenuClient();
                            opcClient.setVisible(true);
                            opcClient.pack();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No puede iniciar sesión como " + tipoUser);
                        LimpiarCampos();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    LimpiarCampos();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Login incorrecto");
                LimpiarCampos();
            }

        } catch (Exception ex) {
            Logger.getLogger(GUILoguin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Btn_IniciarSesionActionPerformed

    private void lblRegistroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegistroUsuarioMouseClicked

    private void Btn_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AtrasActionPerformed
        GUISelectorTipoUser guiInicio = new GUISelectorTipoUser();
        this.setVisible(false);
        guiInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_AtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Atras;
    private javax.swing.JButton Btn_IniciarSesion;
    private javax.swing.JLabel User;
    private javax.swing.JLabel User1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblRegistroUsuario;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserLogin;
    // End of variables declaration//GEN-END:variables
    private void LimpiarCampos(){
        txtUserLogin.setText("");
        txtPassword.setText("");
    }
}