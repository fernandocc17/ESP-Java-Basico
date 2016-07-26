package Frames;


public class radioYCombo extends javax.swing.JFrame {


    public radioYCombo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgHobbies = new javax.swing.ButtonGroup();
        bgEquipos = new javax.swing.ButtonGroup();
        rbChivas = new javax.swing.JRadioButton();
        cbLeer = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        lblHobbies = new javax.swing.JLabel();
        lblEquipo = new javax.swing.JLabel();
        rbAtlas = new javax.swing.JRadioButton();
        rbLeones = new javax.swing.JRadioButton();
        rbTecos = new javax.swing.JRadioButton();
        cbXBox = new javax.swing.JCheckBox();
        cbTv = new javax.swing.JCheckBox();
        cbDeporte = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgEquipos.add(rbChivas);
        rbChivas.setText("Chivas");

        bgHobbies.add(cbLeer);
        cbLeer.setText("Leer");
        cbLeer.setToolTipText("Este es el Tool Tip de esta madre");

        lblHobbies.setText("Hobbies");

        lblEquipo.setText("Equipo de Guadalajara");

        bgEquipos.add(rbAtlas);
        rbAtlas.setText("Atlas");

        bgEquipos.add(rbLeones);
        rbLeones.setText("Leones Negros");

        bgEquipos.add(rbTecos);
        rbTecos.setText("Tecos");

        bgHobbies.add(cbXBox);
        cbXBox.setText("XBox");
        cbXBox.setToolTipText("Este es el Tool Tip de esta madre");

        bgHobbies.add(cbTv);
        cbTv.setText("Ver TV");
        cbTv.setToolTipText("Este es el Tool Tip de esta madre");

        bgHobbies.add(cbDeporte);
        cbDeporte.setText("Hacer Deporte");
        cbDeporte.setToolTipText("Este es el Tool Tip de esta madre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(rbAtlas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbChivas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEquipo))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbTecos, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(rbLeones, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblHobbies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbLeer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbTv))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbXBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHobbies)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLeer)
                    .addComponent(cbXBox))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTv)
                    .addComponent(cbDeporte))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEquipo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbChivas)
                    .addComponent(rbTecos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAtlas)
                    .addComponent(rbLeones))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new radioYCombo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEquipos;
    private javax.swing.ButtonGroup bgHobbies;
    private javax.swing.JCheckBox cbDeporte;
    private javax.swing.JCheckBox cbLeer;
    private javax.swing.JCheckBox cbTv;
    private javax.swing.JCheckBox cbXBox;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEquipo;
    private javax.swing.JLabel lblHobbies;
    private javax.swing.JRadioButton rbAtlas;
    private javax.swing.JRadioButton rbChivas;
    private javax.swing.JRadioButton rbLeones;
    private javax.swing.JRadioButton rbTecos;
    // End of variables declaration//GEN-END:variables

}
