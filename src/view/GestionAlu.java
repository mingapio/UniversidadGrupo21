/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import universidadgrupo21.accesoaDatos.AlumnoData;
import universidadgrupo21.entidades.Alumno;

/**
 *
 * @author NICOLAS
 */
public class GestionAlu extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionAlu
     */
    public GestionAlu() {
        initComponents();
        this.setTitle("Alumnos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbbuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtdoc = new javax.swing.JTextField();
        jtape = new javax.swing.JTextField();
        jtnomb = new javax.swing.JTextField();
        jrestado = new javax.swing.JRadioButton();
        jdcfecha = new com.toedter.calendar.JDateChooser();
        jbnuevo = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbguardar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 51));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alumnos");

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jLabel6.setText("Fecha de nacimiento:");

        jbnuevo.setText("Nuevo");

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbguardar.setText("Guardar");
        jbguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbguardarActionPerformed(evt);
            }
        });

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jdcfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrestado)
                            .addComponent(jtnomb, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtape, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbnuevo)
                .addGap(18, 18, 18)
                .addComponent(jbeliminar)
                .addGap(18, 18, 18)
                .addComponent(jbguardar)
                .addGap(18, 18, 18)
                .addComponent(jbsalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtnomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jrestado))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(jdcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnuevo)
                    .addComponent(jbeliminar)
                    .addComponent(jbguardar)
                    .addComponent(jbsalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbbuscar)
                .addGap(53, 53, 53))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbbuscar))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbguardarActionPerformed
        try {
            Alumno alu = new Alumno(Integer.parseInt(jtdoc.getText()), jtnomb.getText(), jtape.getText(), jdcfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jrestado.isEnabled());
            AlumnoData aluD = new AlumnoData();

            if (jtnomb.getText().isEmpty() || jtape.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos");
                return;

            } else if (!jtnomb.getText().matches("[a-zA-Z]*") || !jtape.getText().matches("[a-zA-Z]*")) {
                JOptionPane.showMessageDialog(this, "En los campos 'Nombre' y 'Apellido' ingrese solo letras");
                return;
            }
            aluD.guardarAlumno(alu);
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");

        } catch (NumberFormatException nf) {
            if (jtdoc.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Complete todos los campos");
            } else if (!jtdoc.getText().matches("[0-9]*")) {
                JOptionPane.showMessageDialog(this, "Coloque un dni correcto");
            }
        }


    }//GEN-LAST:event_jbguardarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        Alumno alu = null;
        if (alu == null) {
            alu = new Alumno(alu.getIdalumno(), Integer.parseInt(jtdoc.getText()), jtnomb.getText(), jtape.getText(), jdcfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jrestado.isEnabled());
            AlumnoData aluD = new AlumnoData();
            int culo = alu.getIdalumno();
            aluD.eliminarAlumno(culo);
        }
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
//       Alumno alu= new Alumno();
//       AlumnoData aluD = new AlumnoData();
//       alu.setDni(Integer.parseInt(jtdoc.getText()));
//       aluD.buscarAlumnodni(alu.getDni());
//       JOptionPane.showMessageDialog(null,aluD.buscarAlumnodni(alu.getDni()));
//        
//       jtnomb.setText(alu.getNombre());
//       jtape.setText(alu.getApellido());

        try {
            // Obtener el DNI del alumno a buscar desde el campo de texto
            int dni = Integer.parseInt(jtdoc.getText());

            // Crear una instancia de AlumnoData (si aún no la tienes)
            AlumnoData aluD = new AlumnoData();

            // Buscar al alumno por su DNI
            Alumno alu = aluD.buscarAlumnodni(dni);

            if (alu != null) {
                // Mostrar los datos en los componentes GUI
                jtnomb.setText(alu.getNombre());
                jtape.setText(alu.getApellido());
                jdcfecha.setDate(Date.from(alu.getNacimiento().atStartOfDay(ZoneId.systemDefault()).toInstant()));
                jrestado.setSelected(alu.getEstado());
                // Puedes mostrar un mensaje de éxito si lo deseas
                JOptionPane.showMessageDialog(null, "Alumno encontrado.");
            } else {
                // Mostrar un mensaje si el alumno no se encontró
                JOptionPane.showMessageDialog(null, "Alumno no encontrado.");
            }
        } catch (NumberFormatException e) {
            // Manejar una excepción si el campo de texto no contiene un número válido
            JOptionPane.showMessageDialog(null, "Ingresa un DNI válido.");
        }


    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbguardar;
    private javax.swing.JButton jbnuevo;
    private javax.swing.JButton jbsalir;
    private com.toedter.calendar.JDateChooser jdcfecha;
    private javax.swing.JRadioButton jrestado;
    private javax.swing.JTextField jtape;
    private javax.swing.JTextField jtdoc;
    private javax.swing.JTextField jtnomb;
    // End of variables declaration//GEN-END:variables
}
