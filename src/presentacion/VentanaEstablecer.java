package presentacion;

import javax.swing.JButton;
import javax.swing.JSpinner;

public class VentanaEstablecer extends javax.swing.JFrame {

  private final Modelo modelito;
  private ControlEstablecer control2;

  public VentanaEstablecer(Modelo m) {
    modelito = m;
    initComponents();
    capturareventos();
  }

  public ControlEstablecer getControl2() {
    if (control2 == null) {
      control2 = new ControlEstablecer(this);
    }
    return control2;
  }

  public Modelo getModelito() {
    return modelito;
  }

  public JButton getBtnaceptar() {
    return btnaceptar;
  }

  public JButton getBtncancelar() {
    return btncancelar;
  }

  public JSpinner getSpinacolumnas() {
    return spinacolumnas;
  }

  public JSpinner getSpinafilas() {
    return spinafilas;
  }

  public JSpinner getSpinbcolumnas() {
    return spinbcolumnas;
  }

  public JSpinner getSpinbfilas() {
    return spinbfilas;
  }

  private void initComponents() {
    btnaceptar = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    lblmatriza = new javax.swing.JLabel();
    lblmafilas = new javax.swing.JLabel();
    lblmacolumnas = new javax.swing.JLabel();
    spinafilas = new javax.swing.JSpinner();
    spinacolumnas = new javax.swing.JSpinner();
    jPanel2 = new javax.swing.JPanel();
    lblmatrizb = new javax.swing.JLabel();
    lblmbfilas = new javax.swing.JLabel();
    lblmbcolumnas = new javax.swing.JLabel();
    spinbfilas = new javax.swing.JSpinner();
    spinbcolumnas = new javax.swing.JSpinner();
    btncancelar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Establecer Dimensiones");
    setBackground(new java.awt.Color(153, 153, 255));
    setForeground(new java.awt.Color(0, 51, 255));

    btnaceptar.setText("Aceptar");

    jPanel1.setBackground(new java.awt.Color(153, 153, 255));
    jPanel1.setForeground(new java.awt.Color(153, 153, 255));

    lblmatriza.setText("MATRIZ A");

    lblmafilas.setText("Filas");

    lblmacolumnas.setText("Columnas");

    spinafilas.setModel(new javax.swing.SpinnerNumberModel(3, 2, 5, 1));

    spinacolumnas.setModel(new javax.swing.SpinnerNumberModel(3, 2, 5, 1));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
      jPanel1
    );
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          jPanel1Layout
            .createSequentialGroup()
            .addContainerGap(37, Short.MAX_VALUE)
            .addComponent(lblmatriza)
            .addGap(43, 43, 43)
        )
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(lblmafilas)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(lblmacolumnas)
                )
                .addGroup(
                  jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                      spinafilas,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      37,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(
                      spinacolumnas,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      38,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addContainerGap()
        )
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel1Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(lblmatriza)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblmafilas)
                .addComponent(lblmacolumnas)
            )
            .addGap(18, 18, 18)
            .addGroup(
              jPanel1Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  spinafilas,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  spinacolumnas,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );

    jPanel2.setBackground(new java.awt.Color(153, 153, 255));
    jPanel2.setForeground(new java.awt.Color(0, 0, 255));

    lblmatrizb.setText("MATRIZ B");

    lblmbfilas.setText("Filas");

    lblmbcolumnas.setText("Columnas");

    spinbfilas.setModel(new javax.swing.SpinnerNumberModel(3, 2, 5, 1));

    spinbcolumnas.setModel(new javax.swing.SpinnerNumberModel(3, 2, 5, 1));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
      jPanel2
    );
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(lblmbfilas)
                    .addPreferredGap(
                      javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      Short.MAX_VALUE
                    )
                    .addComponent(lblmbcolumnas)
                )
                .addGroup(
                  jPanel2Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(
                      spinbfilas,
                      javax.swing.GroupLayout.DEFAULT_SIZE,
                      41,
                      Short.MAX_VALUE
                    )
                    .addGap(27, 27, 27)
                    .addComponent(
                      spinbcolumnas,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      38,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
            )
            .addContainerGap()
        )
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addGap(38, 38, 38)
            .addComponent(lblmatrizb)
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          jPanel2Layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(lblmatrizb)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblmbcolumnas)
                .addComponent(
                  lblmbfilas,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  14,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              jPanel2Layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(
                  spinbfilas,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  spinbcolumnas,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addContainerGap(
              javax.swing.GroupLayout.DEFAULT_SIZE,
              Short.MAX_VALUE
            )
        )
    );

    btncancelar.setText("Cancelar");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(
                  jPanel1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(btncancelar)
            )
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addComponent(btnaceptar)
                    .addGap(0, 0, Short.MAX_VALUE)
                )
                .addComponent(
                  jPanel2,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  Short.MAX_VALUE
                )
            )
            .addContainerGap()
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addContainerGap(29, Short.MAX_VALUE)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  jPanel1,
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  jPanel2,
                  javax.swing.GroupLayout.Alignment.TRAILING,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(18, 18, 18)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnaceptar)
                .addComponent(btncancelar)
            )
            .addGap(22, 22, 22)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnaceptar;
  private javax.swing.JButton btncancelar;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lblmacolumnas;
  private javax.swing.JLabel lblmafilas;
  private javax.swing.JLabel lblmatriza;
  private javax.swing.JLabel lblmatrizb;
  private javax.swing.JLabel lblmbcolumnas;
  private javax.swing.JLabel lblmbfilas;
  private javax.swing.JSpinner spinacolumnas;
  private javax.swing.JSpinner spinafilas;
  private javax.swing.JSpinner spinbcolumnas;
  private javax.swing.JSpinner spinbfilas;

  // End of variables declaration//GEN-END:variables

  private void capturareventos() {
    btnaceptar.addActionListener(getControl2());
    btncancelar.addActionListener(getControl2());
  }
}
