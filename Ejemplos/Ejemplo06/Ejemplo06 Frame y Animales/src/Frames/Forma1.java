package Frames;

import animales.Lombriz;
import animales.Perro;
import javax.swing.JOptionPane;


public class Forma1 extends javax.swing.JFrame {

 
    public Forma1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ANIMALES = new java.awt.Label();
        txtNombre = new java.awt.TextField();
        btnMostrar = new java.awt.Button();
        btnChucho = new java.awt.Button();
        btnBoca = new java.awt.Button();
        btnExtemidades = new java.awt.Button();
        btnOjos = new java.awt.Button();
        btnMorir = new java.awt.Button();
        btnColumna = new java.awt.Button();
        btnLombriz = new java.awt.Button();
        choice1 = new java.awt.Choice();
        checkbox1 = new java.awt.Checkbox();
        list1 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        ANIMALES.setText("Forma01  ANIMALES");

        btnMostrar.setLabel("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnChucho.setLabel("Crear Perro");
        btnChucho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnElChuhco(evt);
            }
        });

        btnBoca.setLabel("Tiene boca");
        btnBoca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnTieneBoca(evt);
            }
        });

        btnExtemidades.setLabel("Extremidades");
        btnExtemidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnExtremidades(evt);
            }
        });

        btnOjos.setLabel("Ojos");
        btnOjos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnOjos(evt);
            }
        });

        btnMorir.setLabel("Morir");
        btnMorir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnMorir(evt);
            }
        });

        btnColumna.setLabel("Columna");
        btnColumna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnColumna(evt);
            }
        });

        btnLombriz.setLabel("Lombriz");
        btnLombriz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnCrearLombriz(evt);
            }
        });

        checkbox1.setLabel("Hola desde CheckBox");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ANIMALES, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnChucho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBoca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExtemidades, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnColumna, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOjos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMorir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLombriz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ANIMALES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnChucho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(btnColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOjos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMorir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLombriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExtemidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
    String caja;
        caja= txtNombre.getText();
        caja.toUpperCase();
        JOptionPane.showMessageDialog(rootPane, caja.toUpperCase());

   
      
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void ClickEnElChuhco(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnElChuhco
       Perro Chucho= new Perro();       //Chucho es el nombre del objeto 

       Chucho.nombre="Chucho";          //Asignando nombre a animal
       Chucho.taxonomia="Perro";        //Asignando la taxonomia
       Chucho.emitirSonido();           //Invocando la clase
       
    }//GEN-LAST:event_ClickEnElChuhco

    private void ClickEnTieneBoca(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnTieneBoca
     Perro Chucho= new Perro();

     Chucho.boca="Tengo boca" ;
     Chucho.boca();
     Chucho.comer();
     
    }//GEN-LAST:event_ClickEnTieneBoca

    private void ClickEnExtremidades(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnExtremidades
    Perro Chucho=new Perro();
    
    Chucho.extremidades=4;
    Chucho.extremidades();
    }//GEN-LAST:event_ClickEnExtremidades

    private void ClickEnOjos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnOjos
     Perro Chucho=new Perro();
     
     Chucho.ojos=2;
     Chucho.ojos();
    }//GEN-LAST:event_ClickEnOjos

    private void ClickEnMorir(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnMorir
    Perro Chucho=new Perro();
    
    Chucho.morir();
    }//GEN-LAST:event_ClickEnMorir

    private void ClickEnColumna(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnColumna
    Perro Chucho=new Perro();
    
    Chucho.columna();
    }//GEN-LAST:event_ClickEnColumna

    private void ClickEnCrearLombriz(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnCrearLombriz
        Lombriz Juana= new Lombriz();
        Juana.arrastrar();
    }//GEN-LAST:event_ClickEnCrearLombriz

    /**
  
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forma1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label ANIMALES;
    private java.awt.Button btnBoca;
    private java.awt.Button btnChucho;
    private java.awt.Button btnColumna;
    private java.awt.Button btnExtemidades;
    private java.awt.Button btnLombriz;
    private java.awt.Button btnMorir;
    private java.awt.Button btnMostrar;
    private java.awt.Button btnOjos;
    private java.awt.Checkbox checkbox1;
    private java.awt.Choice choice1;
    private java.awt.List list1;
    private java.awt.TextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
