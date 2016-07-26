package Frame;

import java.awt.event.KeyEvent;

public class checkbox extends javax.swing.JFrame {

    public checkbox() {
     initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        txtCampo = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        checkbox1.setLabel("checkbox1");
        checkbox1.setState(true);
        checkbox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cambiaValor(evt);
            }
        });

        txtCampo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter2(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cambiaValor(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cambiaValor
/*    Forma larga de invocar el evento
     if (checkbox1.getState()==true)
             textField1.setVisible(true);
     else
             textField1.setVisible(false);
*/
     txtCampo.setVisible(checkbox1.getState());

    }//GEN-LAST:event_cambiaValor

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
/* Este evento no funciona para presionar tecla
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            txtCampo.setVisible(false);
*/
    }//GEN-LAST:event_Enter

    private void Enter2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter2
         if (evt.getKeyCode() == KeyEvent.VK_ENTER)
             txtCampo.setVisible(false);

    }//GEN-LAST:event_Enter2



    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private java.awt.TextField txtCampo;
    // End of variables declaration//GEN-END:variables

}
