/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Formulario.java
 *
 * Created on 15-mar-2012, 22:16:41
 */

package Frames;

/**
 *
 * @author humberto
 */
public class Formulario extends javax.swing.JFrame {

    /** Creates new form Formulario */
    public Formulario() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgSexo = new javax.swing.ButtonGroup();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblHobbies = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        chboxEsquiar = new javax.swing.JCheckBox();
        chboxNadar = new javax.swing.JCheckBox();
        chboxLeer = new javax.swing.JCheckBox();
        chboxJugar = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cboxEdad = new javax.swing.JComboBox();
        txtNombre = new javax.swing.JTextField();
        lblFormulario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre");

        lblEdad.setText("Edad");

        lblSexo.setText("Sexo");

        lblHobbies.setText("Hobbies o Pasatiempos");

        chboxEsquiar.setText("Esquiar");

        chboxNadar.setText("Nadar");

        chboxLeer.setText("Leer");

        chboxJugar.setText("Jugar");

        rgSexo.add(jRadioButton1);
        jRadioButton1.setText("Masculino");

        rgSexo.add(jRadioButton2);
        jRadioButton2.setText("Femenino");

        cboxEdad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15-17", "18-21", "22-25", "25-35", "35-45", "45-50", "mas..." }));

        txtNombre.setToolTipText("Escriba su Nombre");

        lblFormulario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblFormulario.setText("Registro de Formulario");
        lblFormulario.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSexo)
                                .addGap(48, 48, 48)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addComponent(lblHobbies)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEdad)
                                    .addComponent(lblNombre))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(cboxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chboxEsquiar)
                        .addGap(35, 35, 35)
                        .addComponent(chboxNadar)
                        .addGap(37, 37, 37)
                        .addComponent(chboxLeer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(chboxJugar)
                        .addGap(57, 57, 57))))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lblFormulario)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormulario)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdad)
                    .addComponent(cboxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addComponent(lblHobbies)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chboxEsquiar)
                    .addComponent(chboxJugar)
                    .addComponent(chboxNadar)
                    .addComponent(chboxLeer))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboxEdad;
    private javax.swing.JCheckBox chboxEsquiar;
    private javax.swing.JCheckBox chboxJugar;
    private javax.swing.JCheckBox chboxLeer;
    private javax.swing.JCheckBox chboxNadar;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblFormulario;
    private javax.swing.JLabel lblHobbies;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.ButtonGroup rgSexo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
