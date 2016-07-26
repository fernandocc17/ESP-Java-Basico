
package Frames;

import Beans.Estudiante;
import Beans.Trabajo;
import Beans.Nini;
import Beans.Otro;
import javax.swing.JOptionPane;

public class Frame01 extends javax.swing.JFrame {


    public Frame01() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        lblNombre = new java.awt.Label();
        txtNombre = new java.awt.TextField();
        checkbMasculino = new java.awt.Checkbox();
        checkbFemenino = new java.awt.Checkbox();
        lblSexo = new java.awt.Label();
        cbTipo = new java.awt.Choice();
        lblTipo = new java.awt.Label();
        lblOtro = new java.awt.Label();
        txtOtro = new java.awt.TextField();
        lblEdad = new java.awt.Label();
        txtEdad = new java.awt.TextField();
        btnCPersona = new java.awt.Button();
        lblPuesto = new java.awt.Label();
        txtPuesto = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                MainWCrearTipo(evt);
            }
        });

        lblNombre.setText("Nombre");

        checkbMasculino.setLabel("Masculino");
        checkbMasculino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickMasculino(evt);
            }
        });

        checkbFemenino.setLabel("Femenino");
        checkbFemenino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnFemenino(evt);
            }
        });

        lblSexo.setText("Sexo");

        cbTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickCbPersona(evt);
            }
        });
        cbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chSeleccionaPersona(evt);
            }
        });

        lblTipo.setText("Tipo de Persona");

        lblOtro.setText("Otro");

        lblEdad.setText("Edad");

        btnCPersona.setLabel("Crear Persona");
        btnCPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickCrearPersona(evt);
            }
        });

        lblPuesto.setText("Grado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPuesto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblOtro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkbFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(btnCPersona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClickCbPersona(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickCbPersona

    }//GEN-LAST:event_ClickCbPersona

    private void ClickCrearPersona(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickCrearPersona
    Estudiante Captura= new Estudiante();

        Captura.nombre = txtNombre.getText();
        Captura.ocupacion=txtOtro.getText();
        Captura.edad= txtEdad.getText();
        Captura.grado=txtPuesto.getText();
    if (checkbMasculino.getState()==true)
        Captura.sexo=checkbMasculino.getLabel();
    else
        Captura.sexo=checkbFemenino.getLabel();
       
    Trabajo work=new Trabajo();
        work.nombre = txtNombre.getText();
        work.ocupacion=txtOtro.getText();
        work.edad= txtEdad.getText();
        work.grado=txtPuesto.getText();
    if (checkbMasculino.getState()==true)
        work.sexo=checkbMasculino.getLabel();
    else
        work.sexo=checkbFemenino.getLabel();

    Nini ni=new Nini();
         ni.nombre = txtNombre.getText();
         ni.ocupacion=txtOtro.getText();
         ni.edad= txtEdad.getText();
         ni.grado=txtPuesto.getText();
    if (checkbMasculino.getState()==true)
         ni.sexo=checkbMasculino.getLabel();
    else
         ni.sexo=checkbFemenino.getLabel();

    Otro opc=new Otro();
         opc.nombre = txtNombre.getText();
         opc.ocupacion=txtOtro.getText();
         opc.edad= txtEdad.getText();
         opc.grado=txtPuesto.getText();
    if (checkbMasculino.getState()==true)
         opc.sexo=checkbMasculino.getLabel();
    else
         opc.sexo=checkbFemenino.getLabel();

    switch(cbTipo.getSelectedIndex()){
        case 0:Captura.mostrarNombre();
        break;
        case 1:  ni.hacerNada();
        break;
        case 2: work.estoyTrabajando();
        break;
        case 3:
    }


      //Captura.mostrarNombre();
    }//GEN-LAST:event_ClickCrearPersona

    private void ClickMasculino(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickMasculino
    if (checkbMasculino.getState()==true)
            checkbFemenino.setState(false);
    else
        checkbFemenino.setState(true);
    }//GEN-LAST:event_ClickMasculino

    private void ClickEnFemenino(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnFemenino
     if ( checkbFemenino.getState()==true)
           checkbMasculino.setState(false);
    else
        checkbMasculino.setState(true);
    }//GEN-LAST:event_ClickEnFemenino

    private void MainWCrearTipo(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_MainWCrearTipo
        cbTipo.add("Estudiante");
        cbTipo.add("Nini");
        cbTipo.add("Trabajador");
        cbTipo.add("Otro");
   
        
    }//GEN-LAST:event_MainWCrearTipo

    private void chSeleccionaPersona(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chSeleccionaPersona

        switch (cbTipo.getSelectedIndex()){
            case 0:
                lblPuesto.setVisible(true);
                txtPuesto.setVisible(true);
                lblPuesto.setText("Grado");
            break;
            case 1:
                lblPuesto.setVisible(false);
                txtPuesto.setVisible(false);
              //  lblOtro.setVisible(false);
              //  txtOtro.setVisible(false);
              
            break;
            case 2:
                lblPuesto.setVisible(true);
                txtPuesto.setVisible(true);
                lblPuesto.setText("Puesto");
            break;
            case 3:
                lblPuesto.setVisible(true);
                txtPuesto.setVisible(true);
                lblPuesto.setText("Indique");
            break;
        }
        
        /*if (cbTipo.getSelectedItem() == "Trabajador")  //mostrando lbl Puesto con Trabajador
 {
        lblPuesto.setVisible(true);
        txtPuesto.setVisible(true);
        lblPuesto.setText("Puesto");
 }
 else
 
        lblPuesto.setVisible(false); //mostrando txt Puesto con Trabajador
        txtPuesto.setVisible(false);
 
 if (cbTipo.getSelectedItem() == "Estudiante")
 {
        lblPuesto.setVisible(true);
        lblPuesto.setText("Grado");
        txtPuesto.setVisible(true);
 }
  else
        lblPuesto.setVisible(false);
        txtPuesto.setVisible(false);*/


    }//GEN-LAST:event_chSeleccionaPersona
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private java.awt.Button btnCPersona;
    private java.awt.Choice cbTipo;
    private java.awt.Checkbox checkbFemenino;
    private java.awt.Checkbox checkbMasculino;
    private java.awt.Label lblEdad;
    private java.awt.Label lblNombre;
    private java.awt.Label lblOtro;
    private java.awt.Label lblPuesto;
    private java.awt.Label lblSexo;
    private java.awt.Label lblTipo;
    private java.awt.TextField txtEdad;
    private java.awt.TextField txtNombre;
    private java.awt.TextField txtOtro;
    private java.awt.TextField txtPuesto;
    // End of variables declaration//GEN-END:variables

}
