package presentacion;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.xml.sax.Attributes;

public class VentanaPrincipal extends javax.swing.JFrame {

  private final Modelo modelito;
  private ControlPrincipal controlito1;

  public VentanaPrincipal(Modelo m) {
    modelito = m;
    initComponents();
    capturareventos();
  }

  public Modelo getModelito() {
    return modelito;
  }

  public JButton getBtnseleccion() {
    return btnseleccion;
  }

  public JComboBox getCbxoperaciones() {
    return cbxoperaciones;
  }

  public JPanel getjPanel1() {
    return jPanel1;
  }

  public JPanel getjPanel2() {
    return jPanel2;
  }

  public JTextField getTxta1_1() {
    return txta1_1;
  }

  public JTextField getTxta1_5() {
    return txta1_5;
  }

  public JTextField getTxta2_5() {
    return txta2_5;
  }

  public JTextField getTxta3_5() {
    return txta3_5;
  }

  public JTextField getTxta4_5() {
    return txta4_5;
  }

  public JTextField getTxta5_1() {
    return txta5_1;
  }

  public JTextField getTxta5_2() {
    return txta5_2;
  }

  public JTextField getTxta5_3() {
    return txta5_3;
  }

  public JTextField getTxta5_4() {
    return txta5_4;
  }

  public JTextField getTxta5_5() {
    return txta5_5;
  }

  public JTextField getTxtb1_5() {
    return txtb1_5;
  }

  public JTextField getTxtb2_5() {
    return txtb2_5;
  }

  public JTextField getTxtb3_5() {
    return txtb3_5;
  }

  public JTextField getTxtb4_5() {
    return txtb4_5;
  }

  public JTextField getTxtb5_1() {
    return txtb5_1;
  }

  public JTextField getTxtb5_2() {
    return txtb5_2;
  }

  public JTextField getTxtb5_3() {
    return txtb5_3;
  }

  public JTextField getTxtb5_4() {
    return txtb5_4;
  }

  public JTextField getTxtb5_5() {
    return txtb5_5;
  }

  public JTextField getTxta1_2() {
    return txta1_2;
  }

  public JTextField getTxta1_3() {
    return txta1_3;
  }

  public JTextField getTxta1_4() {
    return txta1_4;
  }

  public JTextField getTxta2_1() {
    return txta2_1;
  }

  public JTextField getTxta2_2() {
    return txta2_2;
  }

  public JTextField getTxta2_3() {
    return txta2_3;
  }

  public JTextField getTxta2_4() {
    return txta2_4;
  }

  public JTextField getTxta3_1() {
    return txta3_1;
  }

  public JTextField getTxta3_2() {
    return txta3_2;
  }

  public JTextField getTxta3_3() {
    return txta3_3;
  }

  public JTextField getTxta3_4() {
    return txta3_4;
  }

  public JTextField getTxta4_1() {
    return txta4_1;
  }

  public JTextField getTxta4_2() {
    return txta4_2;
  }

  public JTextField getTxta4_3() {
    return txta4_3;
  }

  public JTextField getTxta4_4() {
    return txta4_4;
  }

  public JTextField getTxtb1_1() {
    return txtb1_1;
  }

  public JTextField getTxtb1_2() {
    return txtb1_2;
  }

  public JTextField getTxtb1_3() {
    return txtb1_3;
  }

  public JTextField getTxtb1_4() {
    return txtb1_4;
  }

  public JTextField getTxtb2_1() {
    return txtb2_1;
  }

  public JTextField getTxtb2_2() {
    return txtb2_2;
  }

  public JTextField getTxtb2_3() {
    return txtb2_3;
  }

  public JTextField getTxtb2_4() {
    return txtb2_4;
  }

  public JTextField getTxtb3_1() {
    return txtb3_1;
  }

  public JTextField getTxtb3_2() {
    return txtb3_2;
  }

  public JTextField getTxtb3_3() {
    return txtb3_3;
  }

  public JTextField getTxtb3_4() {
    return txtb3_4;
  }

  public JTextField getTxtb4_1() {
    return txtb4_1;
  }

  public JTextField getTxtb4_2() {
    return txtb4_2;
  }

  public JTextField getTxtb4_3() {
    return txtb4_3;
  }

  public JTextField getTxtb4_4() {
    return txtb4_4;
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jMenuItem2 = new javax.swing.JMenuItem();
    jPanel1 = new javax.swing.JPanel();
    txta1_2 = new javax.swing.JTextField();
    txta1_3 = new javax.swing.JTextField();
    txta1_4 = new javax.swing.JTextField();
    txta2_1 = new javax.swing.JTextField();
    txta2_2 = new javax.swing.JTextField();
    txta2_3 = new javax.swing.JTextField();
    txta2_4 = new javax.swing.JTextField();
    txta3_1 = new javax.swing.JTextField();
    txta3_2 = new javax.swing.JTextField();
    txta3_3 = new javax.swing.JTextField();
    txta3_4 = new javax.swing.JTextField();
    txta4_1 = new javax.swing.JTextField();
    txta4_2 = new javax.swing.JTextField();
    txta4_4 = new javax.swing.JTextField();
    txta4_3 = new javax.swing.JTextField();
    txta1_1 = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    txta1_5 = new javax.swing.JTextField();
    txta5_1 = new javax.swing.JTextField();
    txta5_2 = new javax.swing.JTextField();
    txta5_3 = new javax.swing.JTextField();
    txta5_4 = new javax.swing.JTextField();
    txta2_5 = new javax.swing.JTextField();
    txta3_5 = new javax.swing.JTextField();
    txta4_5 = new javax.swing.JTextField();
    txta5_5 = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    txtb1_1 = new javax.swing.JTextField();
    txtb1_2 = new javax.swing.JTextField();
    txtb1_3 = new javax.swing.JTextField();
    txtb1_4 = new javax.swing.JTextField();
    txtb2_1 = new javax.swing.JTextField();
    txtb2_2 = new javax.swing.JTextField();
    txtb2_3 = new javax.swing.JTextField();
    txtb3_2 = new javax.swing.JTextField();
    txtb3_3 = new javax.swing.JTextField();
    txtb3_1 = new javax.swing.JTextField();
    txtb2_4 = new javax.swing.JTextField();
    txtb3_4 = new javax.swing.JTextField();
    txtb4_2 = new javax.swing.JTextField();
    txtb4_4 = new javax.swing.JTextField();
    txtb4_3 = new javax.swing.JTextField();
    txtb4_1 = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    txtb1_5 = new javax.swing.JTextField();
    txtb2_5 = new javax.swing.JTextField();
    txtb3_5 = new javax.swing.JTextField();
    txtb4_5 = new javax.swing.JTextField();
    txtb5_1 = new javax.swing.JTextField();
    txtb5_2 = new javax.swing.JTextField();
    txtb5_3 = new javax.swing.JTextField();
    txtb5_4 = new javax.swing.JTextField();
    txtb5_5 = new javax.swing.JTextField();
    btnseleccion = new javax.swing.JButton();
    cbxoperaciones = new javax.swing.JComboBox();
    jMenuBar1 = new javax.swing.JMenuBar();
    mnOpciones = new javax.swing.JMenu();
    mniEstablecer = new javax.swing.JMenuItem();
    mniIdentidadA = new javax.swing.JMenuItem();
    mniIdentidadB = new javax.swing.JMenuItem();
    mniDespejarA = new javax.swing.JMenuItem();
    mniDespejarB = new javax.swing.JMenuItem();
    mniSalir = new javax.swing.JMenuItem();

    jMenuItem2.setText("jMenuItem2");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Matrices Solve");
    setBackground(new java.awt.Color(153, 153, 255));
    setMaximumSize(new java.awt.Dimension(30, 1300));

    jPanel1.setMinimumSize(new java.awt.Dimension(50, 50));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    jPanel1.add(
      txta1_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 26, 32, -1)
    );
    jPanel1.add(
      txta1_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 26, 32, -1)
    );
    jPanel1.add(
      txta1_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 26, 32, -1)
    );
    jPanel1.add(
      txta2_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 32, -1)
    );
    jPanel1.add(
      txta2_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 52, 32, -1)
    );
    jPanel1.add(
      txta2_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 52, 32, -1)
    );
    jPanel1.add(
      txta2_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 52, 32, -1)
    );
    jPanel1.add(
      txta3_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 32, -1)
    );
    jPanel1.add(
      txta3_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 78, 32, -1)
    );
    jPanel1.add(
      txta3_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 78, 32, -1)
    );
    jPanel1.add(
      txta3_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 78, 32, -1)
    );

    txta4_1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          txta4_1ActionPerformed(evt);
        }
      }
    );
    jPanel1.add(
      txta4_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 32, -1)
    );
    jPanel1.add(
      txta4_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 104, 32, -1)
    );
    jPanel1.add(
      txta4_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 104, 32, -1)
    );
    jPanel1.add(
      txta4_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 104, 32, -1)
    );
    jPanel1.add(
      txta1_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, 32, -1)
    );

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel1.setText("MATRIZ A");
    jPanel1.add(
      jLabel1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1)
    );
    jPanel1.add(
      txta1_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 26, 32, -1)
    );
    jPanel1.add(
      txta5_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 32, -1)
    );
    jPanel1.add(
      txta5_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 130, 32, -1)
    );
    jPanel1.add(
      txta5_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 130, 32, -1)
    );
    jPanel1.add(
      txta5_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 130, 32, -1)
    );
    jPanel1.add(
      txta2_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 52, 32, -1)
    );
    jPanel1.add(
      txta3_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 78, 32, -1)
    );
    jPanel1.add(
      txta4_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 104, 32, -1)
    );
    jPanel1.add(
      txta5_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 130, 32, -1)
    );

    jPanel2.setPreferredSize(new java.awt.Dimension(50, 50));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    jPanel2.add(
      txtb1_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 32, -1)
    );
    jPanel2.add(
      txtb1_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 25, 32, -1)
    );
    jPanel2.add(
      txtb1_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 25, 32, -1)
    );
    jPanel2.add(
      txtb1_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 25, 32, -1)
    );

    txtb2_1.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          txtb2_1ActionPerformed(evt);
        }
      }
    );
    jPanel2.add(
      txtb2_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 32, -1)
    );
    jPanel2.add(
      txtb2_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 51, 32, -1)
    );
    jPanel2.add(
      txtb2_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 51, 32, -1)
    );
    jPanel2.add(
      txtb3_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 77, 32, -1)
    );
    jPanel2.add(
      txtb3_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 77, 32, -1)
    );
    jPanel2.add(
      txtb3_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 32, -1)
    );
    jPanel2.add(
      txtb2_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 51, 32, -1)
    );
    jPanel2.add(
      txtb3_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 77, 32, -1)
    );
    jPanel2.add(
      txtb4_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 103, 32, -1)
    );
    jPanel2.add(
      txtb4_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 103, 32, -1)
    );
    jPanel2.add(
      txtb4_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 103, 32, -1)
    );
    jPanel2.add(
      txtb4_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 32, -1)
    );

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel2.setText("MATRIZ B");
    jPanel2.add(
      jLabel2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1)
    );
    jPanel2.add(
      txtb1_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 25, 32, -1)
    );
    jPanel2.add(
      txtb2_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 51, 32, -1)
    );
    jPanel2.add(
      txtb3_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 77, 32, -1)
    );
    jPanel2.add(
      txtb4_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 103, 32, -1)
    );
    jPanel2.add(
      txtb5_1,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 32, -1)
    );
    jPanel2.add(
      txtb5_2,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 130, 32, -1)
    );
    jPanel2.add(
      txtb5_3,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 130, 32, -1)
    );
    jPanel2.add(
      txtb5_4,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 130, 32, -1)
    );
    jPanel2.add(
      txtb5_5,
      new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 130, 32, -1)
    );

    btnseleccion.setText("Seleccionar");
    btnseleccion.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          btnseleccionActionPerformed(evt);
        }
      }
    );

    cbxoperaciones.setModel(
      new javax.swing.DefaultComboBoxModel(
        new String[] {
          "Reducir A",
          "Reducir B",
          "Inversa A",
          "Inversa B",
          "Transpuesta A",
          "Transpuesta B",
          "Determinante A",
          "Determinante B",
          "A+B",
          "A - B",
          "A*B",
        }
      )
    );

    mnOpciones.setText("Opciones");

    mniEstablecer.setText("Establecer Dimenciones");
    mniEstablecer.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          mniEstablecerActionPerformed(evt);
        }
      }
    );
    mnOpciones.add(mniEstablecer);

    mniIdentidadA.setText("Establecer Matriz Indentidad en A");
    mniIdentidadA.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          mniIdentidadAActionPerformed(evt);
        }
      }
    );
    mnOpciones.add(mniIdentidadA);

    mniIdentidadB.setText("Establecer Matriz Indentidad en B");
    mniIdentidadB.addActionListener(
      new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
          mniIdentidadBActionPerformed(evt);
        }
      }
    );
    mnOpciones.add(mniIdentidadB);

    mniDespejarA.setText("Despejar Matriz A");
    mnOpciones.add(mniDespejarA);

    mniDespejarB.setText("Despejar Matriz B");
    mnOpciones.add(mniDespejarB);

    mniSalir.setText("Salir");
    mnOpciones.add(mniSalir);

    jMenuBar1.add(mnOpciones);

    setJMenuBar(jMenuBar1);

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
            .addComponent(
              jPanel1,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addGap(18, 18, Short.MAX_VALUE)
            .addComponent(
              jPanel2,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              184,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addContainerGap()
        )
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(95, 95, 95)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnseleccion)
                .addComponent(
                  cbxoperaciones,
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
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(
                  jPanel1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
                .addComponent(
                  jPanel2,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  160,
                  Short.MAX_VALUE
                )
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(
              cbxoperaciones,
              javax.swing.GroupLayout.PREFERRED_SIZE,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              javax.swing.GroupLayout.PREFERRED_SIZE
            )
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnseleccion)
            .addGap(16, 16, 16)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void mniIdentidadBActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_mniIdentidadBActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_mniIdentidadBActionPerformed

  private void mniIdentidadAActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_mniIdentidadAActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_mniIdentidadAActionPerformed

  private void mniEstablecerActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_mniEstablecerActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_mniEstablecerActionPerformed

  private void txtb2_1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_txtb2_1ActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_txtb2_1ActionPerformed

  private void btnseleccionActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_btnseleccionActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_btnseleccionActionPerformed

  private void txta4_1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_txta4_1ActionPerformed
    // TODO add your handling code here:
  } //GEN-LAST:event_txta4_1ActionPerformed

  public ControlPrincipal getControlito1() {
    if (controlito1 == null) {
      controlito1 = new ControlPrincipal(this);
    }
    return controlito1;
  }

  public JMenu getMnOpciones() {
    return mnOpciones;
  }

  public JMenuItem getMniDespejarA() {
    return mniDespejarA;
  }

  public JMenuItem getMniDespejarB() {
    return mniDespejarB;
  }

  public JMenuItem getMniEstablecer() {
    return mniEstablecer;
  }

  public JMenuItem getMniIdentidadA() {
    return mniIdentidadA;
  }

  public JMenuItem getMniIdentidadB() {
    return mniIdentidadB;
  }

  public JMenuItem getMniSalir() {
    return mniSalir;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnseleccion;
  private javax.swing.JComboBox cbxoperaciones;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JMenu mnOpciones;
  private javax.swing.JMenuItem mniDespejarA;
  private javax.swing.JMenuItem mniDespejarB;
  private javax.swing.JMenuItem mniEstablecer;
  private javax.swing.JMenuItem mniIdentidadA;
  private javax.swing.JMenuItem mniIdentidadB;
  private javax.swing.JMenuItem mniSalir;
  private javax.swing.JTextField txta1_1;
  private javax.swing.JTextField txta1_2;
  private javax.swing.JTextField txta1_3;
  private javax.swing.JTextField txta1_4;
  private javax.swing.JTextField txta1_5;
  private javax.swing.JTextField txta2_1;
  private javax.swing.JTextField txta2_2;
  private javax.swing.JTextField txta2_3;
  private javax.swing.JTextField txta2_4;
  private javax.swing.JTextField txta2_5;
  private javax.swing.JTextField txta3_1;
  private javax.swing.JTextField txta3_2;
  private javax.swing.JTextField txta3_3;
  private javax.swing.JTextField txta3_4;
  private javax.swing.JTextField txta3_5;
  private javax.swing.JTextField txta4_1;
  private javax.swing.JTextField txta4_2;
  private javax.swing.JTextField txta4_3;
  private javax.swing.JTextField txta4_4;
  private javax.swing.JTextField txta4_5;
  private javax.swing.JTextField txta5_1;
  private javax.swing.JTextField txta5_2;
  private javax.swing.JTextField txta5_3;
  private javax.swing.JTextField txta5_4;
  private javax.swing.JTextField txta5_5;
  private javax.swing.JTextField txtb1_1;
  private javax.swing.JTextField txtb1_2;
  private javax.swing.JTextField txtb1_3;
  private javax.swing.JTextField txtb1_4;
  private javax.swing.JTextField txtb1_5;
  private javax.swing.JTextField txtb2_1;
  private javax.swing.JTextField txtb2_2;
  private javax.swing.JTextField txtb2_3;
  private javax.swing.JTextField txtb2_4;
  private javax.swing.JTextField txtb2_5;
  private javax.swing.JTextField txtb3_1;
  private javax.swing.JTextField txtb3_2;
  private javax.swing.JTextField txtb3_3;
  private javax.swing.JTextField txtb3_4;
  private javax.swing.JTextField txtb3_5;
  private javax.swing.JTextField txtb4_1;
  private javax.swing.JTextField txtb4_2;
  private javax.swing.JTextField txtb4_3;
  private javax.swing.JTextField txtb4_4;
  private javax.swing.JTextField txtb4_5;
  private javax.swing.JTextField txtb5_1;
  private javax.swing.JTextField txtb5_2;
  private javax.swing.JTextField txtb5_3;
  private javax.swing.JTextField txtb5_4;
  private javax.swing.JTextField txtb5_5;

  // End of variables declaration//GEN-END:variables

  private void capturareventos() {
    mniIdentidadB.addActionListener(getControlito1());
    mniEstablecer.addActionListener(getControlito1());
    mniDespejarA.addActionListener(getControlito1());
    mniDespejarB.addActionListener(getControlito1());
    mniIdentidadA.addActionListener(getControlito1());
    mniIdentidadB.addActionListener(getControlito1());
    mniSalir.addActionListener(getControlito1());
    btnseleccion.addActionListener(getControlito1());
  }
}
