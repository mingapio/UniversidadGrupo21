/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.table.DefaultTableModel;
import universidadgrupo21.accesoaDatos.AlumnoData;
import universidadgrupo21.accesoaDatos.InscripcionData;
import universidadgrupo21.accesoaDatos.MateriaData;
import universidadgrupo21.entidades.Alumno;
import universidadgrupo21.entidades.Inscripcion;
import universidadgrupo21.entidades.Materia;

/**
 *
 * @author Lucas
 */
public class ConsulAluXMat extends javax.swing.JInternalFrame {

    DefaultTableModel corcha = new DefaultTableModel();

    public boolean isCellEditable(int f, int c) {
        return false;

    }

    public ConsulAluXMat() {
        initComponents();
        organizar();
        cargarcombo();
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
        jlSeleccion = new javax.swing.JLabel();
        jcMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Lista de alumnos por materia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE ALUMNOS POR MATERIA");

        jlSeleccion.setText("Seleccionar una materia:");

        jcMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcMateriasItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSeleccion)
                                .addGap(89, 89, 89)
                                .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSeleccion)
                    .addComponent(jcMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jbSalir)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcMateriasItemStateChanged
        Materia seleccionada = (Materia) jcMaterias.getSelectedItem();
        AlumnoData ad = new AlumnoData();
        InscripcionData id = new InscripcionData();
        
        
        if (evt.getStateChange()==java.awt.event.ItemEvent.DESELECTED){
            removedor();
        for (Alumno alu : id.obtenerAlumnosXMateria(seleccionada.getIdMateria())){
          
                corcha.addRow(new Object[]{
                    alu.getIdalumno(),
                    alu.getDni(),
                    alu.getApellido(),
                    alu.getNombre(),
                    
                });
            
        }
        }
        
    }//GEN-LAST:event_jcMateriasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Materia> jcMaterias;
    private javax.swing.JLabel jlSeleccion;
    // End of variables declaration//GEN-END:variables

    public void organizar() {
        corcha.addColumn("ID");
        corcha.addColumn("DNI");
        corcha.addColumn("APELLIDO");
        corcha.addColumn("NOMBRE");
        jTable1.setModel(corcha);
    }

    private void cargarcombo() {

        MateriaData aldope = new MateriaData();
        for (int i = 0; i < aldope.listadorex().size(); i++) {
            jcMaterias.addItem(aldope.listadorex().get(i));
        }

    }

    private void removedor() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            corcha.removeRow(f);

        }

    }
    
    

}
