package examen;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UI extends javax.swing.JFrame {

    public UI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mensajeTxt = new javax.swing.JTextField();
        tamPrimoTxt = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        cifrarBtn = new javax.swing.JButton();
        seleccionarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rutaTxt = new javax.swing.JTextField();
        descifrarBtn = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Examen");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cifrar");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Descifrar");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mensaje");

        mensajeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajeTxtActionPerformed(evt);
            }
        });

        tamPrimoTxt.setModel(new javax.swing.SpinnerNumberModel(100, 100, 200, 1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tamaño del primo");

        cifrarBtn.setText("Cifrar");
        cifrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarBtnActionPerformed(evt);
            }
        });

        seleccionarBtn.setText("Seleccionar");
        seleccionarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarBtnActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Archivo");

        rutaTxt.setEditable(false);
        rutaTxt.setFocusable(false);
        rutaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaTxtActionPerformed(evt);
            }
        });

        descifrarBtn.setText("Descifrar");
        descifrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mensajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tamPrimoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cifrarBtn)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seleccionarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(descifrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(mensajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tamPrimoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cifrarBtn))
                                .addGap(0, 9, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(rutaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(descifrarBtn)
                                    .addComponent(seleccionarBtn))
                                .addGap(15, 15, 15)))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mensajeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajeTxtActionPerformed

//Se ejecuta al presioanr el boton de cifrar
    private void cifrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarBtnActionPerformed
        //Crear objetos
        Archivo archivo = new Archivo();
        Datos datos = new Datos();
        Cifrado cifrador = new Cifrado();
        //Obtener los valores que introduce el usuario
        datos.setMensaje(mensajeTxt.getText());
        datos.setTamPrimo((int) tamPrimoTxt.getValue());
        String mensaje = datos.getMensaje();
        int tamPrimo = datos.getTamPrimo();
        //Validar el mensaje
        if (cifrador.validarMensaje(mensaje)) {
            //Si el mensaje es valido
            datos.setP(cifrador.generarP(tamPrimo));
            datos.setQ(cifrador.generarQ(tamPrimo, datos.getP()));
            datos.setN(cifrador.generarN(datos.getP(), datos.getQ()));
            datos.setTotient(cifrador.generarPhi(datos.getP(), datos.getQ()));
            datos.setE(cifrador.generarE(tamPrimo, datos.getTotient()));
            datos.setD(cifrador.generarD(datos.getE(), datos.getTotient()));
            datos.setEncriptado(cifrador.encriptar(datos.getMensaje(), datos.getE(), datos.getN()));
            System.out.println("Mensaje Encriptado: " + Arrays.toString(datos.getEncriptado()));
            System.out.println("Mensaje Desencriptado: " + cifrador.desencriptar(datos.getEncriptado(), datos.getD(), datos.getN()));
            try {
                archivo.EscribirArchivoCifrado(datos.getE(), datos.getTotient(), datos.getN(), datos.getEncriptado());
                JOptionPane.showMessageDialog(null, "Archivo cifrado generado exitosamente");
            } catch (IOException ex) {
                System.out.println("No se pudo escribir el archivo");
                JOptionPane.showMessageDialog(null, "Error al generar el archivo cifrado");
            }
        } else {
            //Si el mensaje es invalido
            JOptionPane.showMessageDialog(null, "Por favor introduzca un mensaje valido");
        }
    }//GEN-LAST:event_cifrarBtnActionPerformed

    private void rutaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaTxtActionPerformed
    Path ruta;
    private void seleccionarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarBtnActionPerformed
        //Desplegar el selector de archivos
        JFileChooser selector = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("txt", "txt");
        selector.setFileFilter(filtro);
        int returnVal = selector.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("ARCHIVO SELECCIONADO: " + selector.getSelectedFile().getPath());
            ruta = Paths.get(selector.getSelectedFile().getPath());
            rutaTxt.setText(selector.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_seleccionarBtnActionPerformed

    private void descifrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrarBtnActionPerformed
        if (rutaTxt.getText().isEmpty() || rutaTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo");
        } else {
            try {
                //Crear objetos
                Archivo archivo = new Archivo();
                Datos datos = new Datos();
                Cifrado cifrador = new Cifrado();
                //Obtener e,phi y n
                archivo.LeerArchivo(datos, ruta);
                //Calcular D
                datos.setD(cifrador.generarD(datos.getE(), datos.getTotient()));
                //Descifrar
                datos.setMensaje(cifrador.desencriptar(datos.getEncriptado(), datos.getD(), datos.getN()));
                System.out.println("Mensaje Desencriptado: " + datos.getMensaje());
                //Escribir el archivo
                archivo.EscribirArchivoDescifrado(datos.getMensaje());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hubo un problema con el archivo");

            }
        }
    }//GEN-LAST:event_descifrarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cifrarBtn;
    private javax.swing.JButton descifrarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mensajeTxt;
    private javax.swing.JTextField rutaTxt;
    private javax.swing.JButton seleccionarBtn;
    private javax.swing.JSpinner tamPrimoTxt;
    // End of variables declaration//GEN-END:variables
}
