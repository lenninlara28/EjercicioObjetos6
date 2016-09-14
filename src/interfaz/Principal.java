/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author hp 14
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Cuenta c;
    public Principal() {
        initComponents();
        cmdCrear.setEnabled(true);
        cmdIngresar.setEnabled(false);
        cmdEgreso.setEnabled(false);
        cmdActualizar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdNuevaCuenta.setEnabled(false);
        cmdBorrar.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroDeCuenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSaldoActual = new javax.swing.JTextField();
        cmdCrear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtIngreso = new javax.swing.JTextField();
        cmdIngresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtEgreso = new javax.swing.JTextField();
        cmdEgreso = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cmdActualizar = new javax.swing.JButton();
        txtInteres = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        cmdMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();
        cmdBorrar = new javax.swing.JButton();
        cmdNuevaCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cuenta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Datos De Su Cuenta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("N° De Cuenta : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtNumeroDeCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDeCuentaKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroDeCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("NIT :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        txtNit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNitKeyTyped(evt);
            }
        });
        jPanel2.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Saldo Actual :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        txtSaldoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoActualKeyTyped(evt);
            }
        });
        jPanel2.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 80, -1));

        cmdCrear.setBackground(new java.awt.Color(0, 0, 0));
        cmdCrear.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(255, 255, 255));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 70, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 580, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Saldo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresoKeyTyped(evt);
            }
        });
        jPanel3.add(txtIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, -1));

        cmdIngresar.setBackground(new java.awt.Color(0, 0, 0));
        cmdIngresar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdIngresar.setForeground(new java.awt.Color(255, 255, 255));
        cmdIngresar.setText("OK");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 110));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retirar ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEgreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEgresoKeyTyped(evt);
            }
        });
        jPanel4.add(txtEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        cmdEgreso.setBackground(new java.awt.Color(0, 0, 0));
        cmdEgreso.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdEgreso.setForeground(new java.awt.Color(255, 255, 255));
        cmdEgreso.setText("OK");
        cmdEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEgresoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 240, 100));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Interes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdActualizar.setBackground(new java.awt.Color(0, 0, 0));
        cmdActualizar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdActualizar.setForeground(new java.awt.Color(255, 255, 255));
        cmdActualizar.setText("Actualizar");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 130, -1));

        txtInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresKeyTyped(evt);
            }
        });
        jPanel5.add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 90, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 100));

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, null));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdMostrar.setBackground(new java.awt.Color(0, 0, 0));
        cmdMostrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdMostrar.setForeground(new java.awt.Color(255, 255, 255));
        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel6.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtMostrar.setEditable(false);
        txtMostrar.setColumns(20);
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 250, 100));

        cmdBorrar.setBackground(new java.awt.Color(0, 0, 0));
        cmdBorrar.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(255, 255, 255));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel6.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 300, 160));

        cmdNuevaCuenta.setBackground(new java.awt.Color(0, 0, 0));
        cmdNuevaCuenta.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmdNuevaCuenta.setForeground(new java.awt.Color(255, 255, 255));
        cmdNuevaCuenta.setText("Crear Nueva Cuenta");
        cmdNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevaCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(cmdNuevaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(626, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        long numero_cuenta,id;
        double saldo;
        if (txtNumeroDeCuenta.getText().trim().isEmpty()||txtNit.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Ingrese Datos ","ERROR",JOptionPane.ERROR_MESSAGE);
            txtNumeroDeCuenta.requestFocusInWindow();
        cmdCrear.setEnabled(true);
        cmdIngresar.setEnabled(false);
        cmdEgreso.setEnabled(false);
        cmdActualizar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdNuevaCuenta.setEnabled(false);
        cmdBorrar.setEnabled(false);}
        else{ 
        if (txtSaldoActual.getText().trim().isEmpty()){
        numero_cuenta=Long.parseLong(txtNumeroDeCuenta.getText());
        id=Long.parseLong(txtNit.getText()); 
         c= new Cuenta (numero_cuenta, id);
         JOptionPane.showMessageDialog(this,"Cuenta Creada Exitosamente Con Saldo En 0");
        }else{
        numero_cuenta=Long.parseLong(txtNumeroDeCuenta.getText());
        id=Long.parseLong(txtNit.getText());
        saldo=Double.parseDouble(txtSaldoActual.getText());
        
        c= new Cuenta (numero_cuenta, id, saldo);
        JOptionPane.showMessageDialog(this,"Cuenta Creada Exitosamente");
        }
        cmdCrear.setEnabled(false);
        cmdIngresar.setEnabled(true);
        cmdEgreso.setEnabled(true);
        cmdActualizar.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdNuevaCuenta.setEnabled(true);
        cmdBorrar.setEnabled(true);
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
      double aux;
      if(txtIngreso.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(this,"Cuanto Va A Ingresar Ingresar");
          txtIngreso.requestFocusInWindow();
      }else{
      aux=Integer.parseInt(txtIngreso.getText());
      c.ingresar(aux);
      JOptionPane.showMessageDialog(this,"Ingreso Exitoso");
      }
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        String aux;
        aux=c.mostrar();
        txtMostrar.append(aux);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEgresoActionPerformed
        double aux1,aux2;
        if(txtEgreso.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(this,"Cuanto Va A Retirar");
          txtEgreso.requestFocusInWindow();
      }else{
        aux1=Integer.parseInt(txtEgreso.getText());
        aux2=c.getSaldo_actual();
        if(aux1>aux2){
            JOptionPane.showMessageDialog(this,"No Puede Retirar Esta Cantidad \n"
                    + "**Saldo Insuficiente**","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
        c.retirar(aux1);
        JOptionPane.showMessageDialog(this,"Retiro Exitoso");
        }
        }
    }//GEN-LAST:event_cmdEgresoActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        double aux;
        if(txtInteres.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(this,"Digite El Interes ");
          txtInteres.requestFocusInWindow();
      }else{
        aux=Double.parseDouble(txtInteres.getText());
        c.actualizar(aux);
        JOptionPane.showMessageDialog(this,"Interes Aplicado");
        }
    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtMostrar.setText("");
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevaCuentaActionPerformed
        txtNumeroDeCuenta.setText("");
        txtNit.setText("");
        txtSaldoActual.setText("");
        txtIngreso.setText("");
        txtEgreso.setText("");
        txtInteres.setText("");
        txtMostrar.setText("");
        c=null;
        txtNumeroDeCuenta.requestFocusInWindow();
        cmdCrear.setEnabled(true);
        cmdIngresar.setEnabled(false);
        cmdEgreso.setEnabled(false);
        cmdActualizar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdNuevaCuenta.setEnabled(false);
        cmdBorrar.setEnabled(false);
    }//GEN-LAST:event_cmdNuevaCuentaActionPerformed

    private void txtNumeroDeCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDeCuentaKeyTyped
         char c=evt.getKeyChar(); 
           if(Character.isLetter(c)) { 
               getToolkit().beep(); 
               evt.consume();}
    }//GEN-LAST:event_txtNumeroDeCuentaKeyTyped

    private void txtNitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNitKeyTyped
        char c=evt.getKeyChar(); 
           if(Character.isLetter(c)) { 
               getToolkit().beep(); 
               evt.consume();}
    }//GEN-LAST:event_txtNitKeyTyped

    private void txtSaldoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoActualKeyTyped
        char c=evt.getKeyChar(); 
           if(!Character.isDigit(c)) { 
               getToolkit().beep(); 
               evt.consume();}
    }//GEN-LAST:event_txtSaldoActualKeyTyped

    private void txtIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresoKeyTyped
        char c=evt.getKeyChar(); 
           if(!Character.isDigit(c)) { 
               getToolkit().beep(); 
               evt.consume();}
    }//GEN-LAST:event_txtIngresoKeyTyped

    private void txtEgresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEgresoKeyTyped
       char c=evt.getKeyChar(); 
           if(!Character.isDigit(c)) { 
               getToolkit().beep(); 
               evt.consume();}
    }//GEN-LAST:event_txtEgresoKeyTyped

    private void txtInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresKeyTyped
       char c=evt.getKeyChar();
           if(Character.isLetter(c)){ 
               getToolkit().beep(); 
               evt.consume();}
    }//GEN-LAST:event_txtInteresKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdEgreso;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdNuevaCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEgreso;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextArea txtMostrar;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNumeroDeCuenta;
    private javax.swing.JTextField txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
