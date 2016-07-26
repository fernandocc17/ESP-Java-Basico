package Frames;

import Divisas.Dolar;

public class Monedas extends javax.swing.JFrame {

    /** Creates new form Monedas */
    public Monedas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgComVta = new javax.swing.ButtonGroup();
        cbDivisas = new javax.swing.JComboBox();
        lblCompra = new javax.swing.JLabel();
        lblVenta = new javax.swing.JLabel();
        lblTcCompra = new javax.swing.JLabel();
        lblTcVenta = new javax.swing.JLabel();
        lblDivisas = new javax.swing.JLabel();
        LblMonedas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbCompra = new javax.swing.JRadioButton();
        rbVenta = new javax.swing.JRadioButton();
        txtImporte = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnComVta = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblNombreDiv = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setName("Divisas"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowOpen(evt);
            }
        });

        cbDivisas.setToolTipText("Selecciona una Divisa");
        cbDivisas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ClickSeleccionaDivisa(evt);
            }
        });

        lblCompra.setText("Compra");

        lblVenta.setText("Venta");

        lblTcCompra.setText("TcCompra");

        lblTcVenta.setText("TcVenta");

        lblDivisas.setText("Cambio de Divisas");

        LblMonedas.setText("Monedas");

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        bgComVta.add(rbCompra);
        rbCompra.setText("Compra");
        rbCompra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ClickCompra(evt);
            }
        });

        bgComVta.add(rbVenta);
        rbVenta.setText("Venta");
        rbVenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clickVenta(evt);
            }
        });

        jLabel7.setText("Cantidad en: ");

        btnComVta.setText("Button");
        btnComVta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickEnComprar(evt);
            }
        });

        lblResultado.setBackground(new java.awt.Color(255, 0, 0));
        lblResultado.setText("Resultado");

        lblNombreDiv.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreDiv, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtImporte, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbCompra)
                                    .addComponent(rbVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(btnComVta)))
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(rbCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbVenta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnComVta)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblResultado)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblMonedas)
                            .addComponent(cbDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCompra)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTcCompra))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(lblTcVenta))))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblDivisas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCompra)
                            .addComponent(lblTcCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTcVenta)
                            .addComponent(lblVenta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowOpen
    cbDivisas.addItem("Dolar");
    cbDivisas.addItem("Dolar Canadiense");
    cbDivisas.addItem("Euro");
    cbDivisas.addItem("Bolivar");
    cbDivisas.addItem("Yen");
    cbDivisas.addItem("Sol");
    cbDivisas.addItem("Lira");

    btnComVta.setText("Calcular");
    rbCompra.setSelected(true);
    }//GEN-LAST:event_WindowOpen

    @SuppressWarnings("static-access")
    private void ClickCompra(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ClickCompra
    Dolar dolares=new Dolar();

   if (rbCompra.isSelected())
       btnComVta.setText("Compra");
   else
       btnComVta.setText("Venta");

   switch(cbDivisas.getSelectedIndex()){
        case 0: lblNombreDiv.setText(dolares.plural);
                //lblNombreDiv.setText("Dolares");   //dolares.plural();
                lblNombreDiv.setText("Dolares");
                lblTcCompra.setText("10"); // dolares.tcCompra();
                lblTcVenta.setText("11.2"); //dolares.tcVenta();} 
        break;
        case 1: lblNombreDiv.setText("Dolares Canadienses");   
                lblTcCompra.setText("8.5"); 
                lblTcVenta.setText("7.8");
        break;
        case 2: lblNombreDiv.setText("Euros");  
                lblTcCompra.setText("18.2");
                lblTcVenta.setText("17.9");
        break;
        case 3: lblNombreDiv.setText("Bolivares");  
                lblTcCompra.setText("3.3"); 
                lblTcVenta.setText("2.8");
        break;
        case 4: lblNombreDiv.setText("Yenes");
                lblTcCompra.setText("8.5");
                lblTcVenta.setText("7.8");
        break;
        case 5: lblNombreDiv.setText("Soles");
                lblTcCompra.setText("1.5");
                lblTcVenta.setText("1.28");
       break;
        case 6: lblNombreDiv.setText("Liras");
                lblTcCompra.setText("2.5");
                lblTcVenta.setText("2.2");
   }



  
    }//GEN-LAST:event_ClickCompra

    private void clickVenta(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clickVenta
   if (rbVenta.isSelected())
   {
       btnComVta.setText("Venta");
       lblNombreDiv.setText("Pesos MXN");
   }
       else
       {
       btnComVta.setText("Compra");
       lblNombreDiv.setText((String) cbDivisas.getSelectedItem());
       }
    }//GEN-LAST:event_clickVenta

    private void ClickEnComprar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickEnComprar
        double x= Double.parseDouble(txtImporte.getText());
        double y= Double.parseDouble(lblTcVenta.getText());
        double z= Double.parseDouble(lblTcCompra.getText());
        double rescompra= x / z;
        double resventa = x * y;
        String totcomp= Double.toString(rescompra);
        String totvta= Double.toString(resventa);

    if (btnComVta.getText()=="Compra")
       lblResultado.setText(totcomp);
    else
        lblResultado.setText(totvta);
       
    }//GEN-LAST:event_ClickEnComprar

    private void ClickSeleccionaDivisa(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ClickSeleccionaDivisa
    if (cbDivisas.getSelectedItem()=="Dolares")
        lblTcCompra.setText("");

    switch(cbDivisas.getSelectedIndex()){
        case 0: 
                //lblNombreDiv.setText("Dolares");   //dolares.plural();
                lblNombreDiv.setText("Dolares");
                lblTcCompra.setText("10"); // dolares.tcCompra();
                lblTcVenta.setText("11.2"); //dolares.tcVenta();}
        break;
        case 1: lblNombreDiv.setText("Dolares Canadienses");
                lblTcCompra.setText("8.5");
                lblTcVenta.setText("7.8");
        break;
        case 2: lblNombreDiv.setText("Euros");
                lblTcCompra.setText("18.2");
                lblTcVenta.setText("17.9");
        break;
        case 3: lblNombreDiv.setText("Bolivares");
                lblTcCompra.setText("3.3");
                lblTcVenta.setText("2.8");
        break;
        case 4: lblNombreDiv.setText("Yenes");
                lblTcCompra.setText("8.5");
                lblTcVenta.setText("7.8");
        break;
        case 5: lblNombreDiv.setText("Soles");
                lblTcCompra.setText("1.5");
                lblTcVenta.setText("1.28");
       break;
        case 6: lblNombreDiv.setText("Liras");
                lblTcCompra.setText("2.5");
                lblTcVenta.setText("2.2");
   }


    }//GEN-LAST:event_ClickSeleccionaDivisa

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblMonedas;
    private javax.swing.ButtonGroup bgComVta;
    private javax.swing.JButton btnComVta;
    private javax.swing.JComboBox cbDivisas;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCompra;
    private javax.swing.JLabel lblDivisas;
    private javax.swing.JLabel lblNombreDiv;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTcCompra;
    private javax.swing.JLabel lblTcVenta;
    private javax.swing.JLabel lblVenta;
    private javax.swing.JRadioButton rbCompra;
    private javax.swing.JRadioButton rbVenta;
    private javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables

}
