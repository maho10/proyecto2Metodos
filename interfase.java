
import java.math.BigInteger;
import java.io.*;

public class interfase extends javax.swing.JFrame {

    
    static BigInteger [][][] matrizA = new BigInteger[0][0][2];
    static BigInteger[][][] matrizB = new BigInteger[0][0][2];
    public interfase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InterfazB = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        InterfazA = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        FilasA = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        ColumnasA = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        FilasB = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        ColumnasB = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IngresarA = new javax.swing.JButton();
        IngresarB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Latex = new javax.swing.JLabel();
        EditarA = new javax.swing.JButton();
        EditarA1 = new javax.swing.JButton();
        GJAB = new javax.swing.JButton();
        modular = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        modulo = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        InterfazR = new javax.swing.JTextPane();
        PAULA = new javax.swing.JButton();
        GJBA = new javax.swing.JButton();
        PBUL = new javax.swing.JButton();
        AmenosB = new javax.swing.JButton();
        BmenosA = new javax.swing.JButton();
        AxB = new javax.swing.JButton();
        BxA = new javax.swing.JButton();
        AmasB = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        DetA = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        InversaA = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ortogonalizarA = new javax.swing.JButton();
        TranspuestaA = new javax.swing.JButton();
        Ayuda = new javax.swing.JButton();
        AdjuntaA = new javax.swing.JButton();
        potenciaA = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        exponenteA = new javax.swing.JSpinner();
        jButton14 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        FPAUL = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        exponenteB = new javax.swing.JSpinner();
        jButton15 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        FPBUL = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DetB = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        InversaB = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        ortogonalizarB = new javax.swing.JButton();
        TranspuestaB = new javax.swing.JButton();
        AdjuntaB = new javax.swing.JButton();
        potenciaB = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        HilbertA = new javax.swing.JButton();
        HilbertB = new javax.swing.JButton();
        HA = new javax.swing.JSpinner();
        HB = new javax.swing.JSpinner();
        RemplazarA = new javax.swing.JButton();
        RA = new javax.swing.JLabel();
        RemplazarB = new javax.swing.JButton();
        RB = new javax.swing.JLabel();
        PDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InterfazB.setEditable(false);
        jScrollPane1.setViewportView(InterfazB);

        InterfazA.setEditable(false);
        jScrollPane2.setViewportView(InterfazA);

        jLabel1.setText("Filas: ");

        FilasA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FilasA.setValue(2);

        jLabel2.setText("Columnas:");

        ColumnasA.setValue(2);

        jLabel3.setText("Filas: ");

        FilasB.setValue(2);

        jLabel4.setText("Columnas:");

        ColumnasB.setValue(1);

        jLabel5.setText("Matriz A");

        jLabel6.setText("Matriz B");

        IngresarA.setText("Ingresar");
        IngresarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarAActionPerformed(evt);
            }
        });

        IngresarB.setText("Ingresar");
        IngresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarBActionPerformed(evt);
            }
        });

        jButton1.setText("Latex");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Latex.setText("si");

        EditarA.setText("Editar");
        EditarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarAActionPerformed(evt);
            }
        });

        EditarA1.setText("Editar");
        EditarA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarA1ActionPerformed(evt);
            }
        });

        GJAB.setText("[A|B]");
        GJAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GJABActionPerformed(evt);
            }
        });

        modular.setText("no");
        modular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modularActionPerformed(evt);
            }
        });

        jLabel7.setText("Modulo");

        modulo.setValue(2);

        jScrollPane3.setViewportView(InterfazR);

        PAULA.setText("PA-UL");
        PAULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PAULAActionPerformed(evt);
            }
        });

        GJBA.setText("[B|A]");
        GJBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GJBAActionPerformed(evt);
            }
        });

        PBUL.setText("PB-UL");
        PBUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBULActionPerformed(evt);
            }
        });

        AmenosB.setText("A-B");
        AmenosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmenosBActionPerformed(evt);
            }
        });

        BmenosA.setText("B-A");
        BmenosA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmenosAActionPerformed(evt);
            }
        });

        AxB.setText("A*B");
        AxB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AxBActionPerformed(evt);
            }
        });

        BxA.setText("B*A");
        BxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BxAActionPerformed(evt);
            }
        });

        AmasB.setText("A+B");
        AmasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmasBActionPerformed(evt);
            }
        });

        jLabel8.setText("Gauss-Jordan");

        DetA.setText("Determinante");
        DetA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetAActionPerformed(evt);
            }
        });

        jLabel9.setText("Gauss-Jordan");

        InversaA.setText("Inversa");
        InversaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InversaAActionPerformed(evt);
            }
        });

        jLabel10.setText("Gram-Schmidt");

        ortogonalizarA.setText("Ortogonalizar");
        ortogonalizarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ortogonalizarAActionPerformed(evt);
            }
        });

        TranspuestaA.setText("Transpuesta");
        TranspuestaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranspuestaAActionPerformed(evt);
            }
        });

        Ayuda.setText("Ayuda");
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });

        AdjuntaA.setText("Adjunta");
        AdjuntaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdjuntaAActionPerformed(evt);
            }
        });

        potenciaA.setText("A^n");
        potenciaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaAActionPerformed(evt);
            }
        });

        jLabel11.setText("n:");

        exponenteA.setValue(2);

        jButton14.setText("V.Propios");

        jLabel12.setText("Eigen-Valores");

        FPAUL.setText("PA-UL");
        FPAUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPAULActionPerformed(evt);
            }
        });

        jLabel13.setText("Factorizacion");

        jLabel14.setText("n:");

        exponenteB.setValue(2);

        jButton15.setText("V.Propios");

        jLabel15.setText("Eigen-Valores");

        FPBUL.setText("PA-UL");
        FPBUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPBULActionPerformed(evt);
            }
        });

        jLabel16.setText("Factorizacion");

        jLabel17.setText("Gauss-Jordan");

        DetB.setText("Determinante");
        DetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetBActionPerformed(evt);
            }
        });

        jLabel18.setText("Gauss-Jordan");

        InversaB.setText("Inversa");
        InversaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InversaBActionPerformed(evt);
            }
        });

        jLabel19.setText("Gram-Schmidt");

        ortogonalizarB.setText("Ortogonalizar");
        ortogonalizarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ortogonalizarBActionPerformed(evt);
            }
        });

        TranspuestaB.setText("Transpuesta");
        TranspuestaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TranspuestaBActionPerformed(evt);
            }
        });

        AdjuntaB.setText("Adjunta");
        AdjuntaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdjuntaBActionPerformed(evt);
            }
        });

        potenciaB.setText("A^n");
        potenciaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaBActionPerformed(evt);
            }
        });

        jLabel20.setText("Creado por Alejandro Pallais Garcia");

        HilbertA.setText("Hilbert");
        HilbertA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HilbertAActionPerformed(evt);
            }
        });

        HilbertB.setText("Hilbert");
        HilbertB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HilbertBActionPerformed(evt);
            }
        });

        HA.setValue(2);

        HB.setValue(2);

        RemplazarA.setText("remplpazar");
        RemplazarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemplazarAActionPerformed(evt);
            }
        });

        RA.setText("no");

        RemplazarB.setText("remplpazar");
        RemplazarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemplazarBActionPerformed(evt);
            }
        });

        RB.setText("no");

        PDF.setText("PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(ortogonalizarA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DetA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(InversaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TranspuestaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AdjuntaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(potenciaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(exponenteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton14)
                                    .addComponent(jLabel12)
                                    .addComponent(FPAUL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13)))
                            .addComponent(Ayuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AdjuntaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(potenciaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(exponenteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton15)
                                    .addComponent(jLabel15)
                                    .addComponent(FPBUL, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(DetB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(InversaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TranspuestaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ortogonalizarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel20)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(IngresarA)
                                .addGap(18, 18, 18)
                                .addComponent(EditarA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FilasA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ColumnasA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Latex)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RemplazarA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RemplazarB))
                                    .addComponent(PDF)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(AmenosB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AxB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GJAB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HilbertA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PAULA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(modular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(AmasB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(HA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(HB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BxA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BmenosA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GJBA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HilbertB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PBUL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(IngresarB)
                                    .addGap(18, 18, 18)
                                    .addComponent(EditarA1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FilasB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ColumnasB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(IngresarA)
                            .addComponent(EditarA)
                            .addComponent(jButton1)
                            .addComponent(Latex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FilasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ColumnasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemplazarA)
                            .addComponent(RA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(HilbertA)
                                    .addComponent(HA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AxB)
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AmenosB)
                                        .addComponent(AmasB)
                                        .addComponent(BmenosA)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GJAB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PAULA)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(modular))
                                        .addComponent(modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(IngresarB)
                            .addComponent(EditarA1)
                            .addComponent(PDF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(FilasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(ColumnasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemplazarB)
                            .addComponent(RB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(HilbertB)
                                    .addComponent(HB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BxA)
                                .addGap(35, 35, 35)
                                .addComponent(GJBA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PBUL)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DetA)
                            .addComponent(FPAUL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InversaA)
                            .addComponent(jButton14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(exponenteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ortogonalizarA)
                            .addComponent(potenciaA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TranspuestaA)
                            .addComponent(AdjuntaA))
                        .addGap(11, 11, 11)
                        .addComponent(Ayuda))
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FPBUL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(exponenteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(potenciaB)
                            .addComponent(ortogonalizarB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdjuntaB)
                            .addComponent(TranspuestaB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DetB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InversaB)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>                        

    private void IngresarAActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int m = Integer.parseInt(FilasA.getValue().toString());
        int n = Integer.parseInt(ColumnasA.getValue().toString());
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        matrizA=Funciones.IngresarMatriz(m,n);
        InterfazA.setText(Funciones.imprimir(matrizA,(2*matrizA.length),s));
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String latex=Latex.getText().toString();
        if (latex=="si"){
            Latex.setText("no");
        }else{
            Latex.setText("si");
        }
    }                                        

    private void IngresarBActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int m = Integer.parseInt(FilasB.getValue().toString());
        int n = Integer.parseInt(ColumnasB.getValue().toString());
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        matrizB=Funciones.IngresarMatriz(m,n);
        InterfazB.setText(Funciones.imprimir(matrizB,(2*matrizB.length),s));
    }                                         

    private void EditarAActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        int m = Integer.parseInt(FilasA.getValue().toString());
        int n = Integer.parseInt(ColumnasA.getValue().toString());
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        matrizA=Funciones.EditarMatriz(matrizA);
        InterfazA.setText(Funciones.imprimir(matrizA,(2*matrizA.length),s));
    }                                       

    private void EditarA1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int m = Integer.parseInt(FilasB.getValue().toString());
        int n = Integer.parseInt(ColumnasB.getValue().toString());
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        matrizB=Funciones.EditarMatriz(matrizB);
        InterfazB.setText(Funciones.imprimir(matrizB,(2*matrizB.length),s));
    }                                        

    private void GJABActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        InterfazR.setText(Funciones.GaussJordan(matrizA,matrizB,modular.getText().toString(),Integer.parseInt(modulo.getValue().toString())));
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        if (RA.getText().toString().equals("si")){
            matrizA=Funciones.VectorGauss;
            InterfazA.setText(Funciones.imprimir(matrizA,(matrizA[0].length),s));
        }else{
            if (RB.getText().toString().equals("si")){
                matrizB=Funciones.VectorGauss;
                InterfazB.setText(Funciones.imprimir(matrizB,(matrizB[0].length),s));
            }
        }
    }                                    

    private void GJBAActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        InterfazR.setText(Funciones.GaussJordan(matrizB,matrizA,modular.getText().toString(),Integer.parseInt(modulo.getValue().toString())));
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        if (RA.getText().toString().equals("si")){
            matrizA=Funciones.VectorGauss;
            InterfazA.setText(Funciones.imprimir(matrizA,(matrizA[0].length),s));
        }else{
            if (RB.getText().toString().equals("si")){
                matrizB=Funciones.VectorGauss;
                InterfazB.setText(Funciones.imprimir(matrizB,(matrizB[0].length),s));
            }
        }
    }                                    

    private void modularActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if (modular.getText().toString().equals("no")){
            modular.setText("si");
        }else{
            modular.setText("no");
        }
    }                                       

    private void FPAULActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        InterfazR.setText(Funciones.FPAUL(matrizA));
    }                                     

    private void FPBULActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        InterfazR.setText(Funciones.FPAUL(matrizB));
    }                                     

    private void HilbertAActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        matrizA=Funciones.Hilbert(Integer.parseInt(HA.getValue().toString()));
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        InterfazA.setText(Funciones.imprimir(matrizA,(2*matrizA.length),s));
    }                                        

    private void AxBActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        InterfazR.setText(Funciones.producto(matrizA, matrizB));
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        if (RA.getText().toString().equals("si")){
            matrizA=Funciones.multiplicado;
            InterfazA.setText(Funciones.imprimir(matrizA,(matrizA.length),s));
        }else{
            if (RB.getText().toString().equals("si")){
                matrizB=Funciones.multiplicado;
                InterfazB.setText(Funciones.imprimir(matrizB,(matrizB.length),s));
            }
        }
    }                                   

    private void BxAActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        InterfazR.setText(Funciones.producto(matrizB, matrizA));
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        if (RA.getText().toString().equals("si")){
            matrizA=Funciones.multiplicado;
            InterfazA.setText(Funciones.imprimir(matrizA,(matrizA.length),s));
        }else{
            if (RB.getText().toString().equals("si")){
                matrizB=Funciones.multiplicado;
                InterfazB.setText(Funciones.imprimir(matrizB,(matrizB.length),s));
            }
        }
    }                                   

    private void DetAActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Determinante(matrizA, Latex.getText().toString()));
    }                                    

    private void DetBActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Determinante(matrizB, Latex.getText().toString()));
    }                                    

    private void InversaAActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Inverso(matrizA));
    }                                        

    private void InversaBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Inverso(matrizB));
    }                                        

    private void ortogonalizarAActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Ortogonalizar(matrizA));
    }                                              

    private void ortogonalizarBActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Ortogonalizar(matrizB));
    }                                              

    private void HilbertBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        matrizB=Funciones.Hilbert(Integer.parseInt(HB.getValue().toString()));
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        InterfazB.setText(Funciones.imprimir(matrizB,(2*matrizB.length),s));
    }                                        

    private void TranspuestaAActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        BigInteger [][][] trasn=Funciones.Transpuesta(matrizA);
        InterfazR.setText(Funciones.imprimir(trasn, (trasn.length), s));
        if (RA.getText().toString().equals("si")){
            matrizA=trasn;
            InterfazA.setText(Funciones.imprimir(matrizA,(matrizA[0].length),s));
        }else{
            if (RB.getText().toString().equals("si")){
                matrizB=trasn;
                InterfazB.setText(Funciones.imprimir(matrizB,(matrizB[0].length),s));
            }
        }
    }                                            

    private void TranspuestaBActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String latex=Latex.getText().toString();
        Boolean s=false;
        if (latex=="si"){
            s=true;
        }
        BigInteger [][][] trasn=Funciones.Transpuesta(matrizB);
        InterfazR.setText(Funciones.imprimir(trasn, (trasn.length), s));
        if (RA.getText().toString().equals("si")){
            matrizA=trasn;
            InterfazA.setText(Funciones.imprimir(matrizA,(matrizA[0].length),s));
        }else{
            if (RB.getText().toString().equals("si")){
                matrizB=trasn;
                InterfazB.setText(Funciones.imprimir(matrizB,(matrizB[0].length),s));
            }
        }
    }                                            

    private void AdjuntaAActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Adjunta(matrizA).toString());
    }                                        

    private void AdjuntaBActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Adjunta(matrizB).toString());
    }                                        

    private void potenciaAActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Potencia(matrizA,Integer.parseInt(exponenteA.getValue().toString())));
    }                                         

    private void potenciaBActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Potencia(matrizB,Integer.parseInt(exponenteB.getValue().toString())));
    }                                         

    private void AmenosBActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Suma(matrizA, matrizB, "-"));
    }                                       

    private void AmasBActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Suma(matrizA, matrizB, "+"));
    }                                     

    private void BmenosAActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        InterfazR.setText(Funciones.Suma(matrizB, matrizA, "-"));
    }                                       

    private void PAULAActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        InterfazR.setText(Funciones.PAUL(matrizA, matrizB));
    }                                     

    private void PBULActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        InterfazR.setText(Funciones.PAUL(matrizB, matrizA));
    }                                    

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        try {
            Runtime.getRuntime().exec("manual.bat");
        } catch (IOException e) {
            Funciones.decir("la ayuda no esta disponible");
        }
    }                                     

    private void RemplazarAActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (RA.getText().toString().equals("si")){
            RA.setText("no");
        }else{
            RA.setText("si");
            if(RB.getText().toString().equals("si")){
                RB.setText("no");
            }
        }
    }                                          

    private void RemplazarBActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if (RB.getText().toString().equals("si")){
            RB.setText("no");
        }else{
            RB.setText("si");
            if(RA.getText().toString().equals("si")){
                RA.setText("no");
            }
        }
    }                                          

    static String pasaje="test1.tex";
    
    public static void hola(String a)throws IOException{
        try (FileWriter fr = new FileWriter(pasaje);
                BufferedWriter br = new BufferedWriter(fr)) {
            br.write(a);
        }
    }
    
    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        String done = "\\documentclass{amsart}\n\\usepackage{amssymb}\n"
                + "\\usepackage[left=1cm,right=1cm,top=3cm,bottom=1cm]{geometry}\n\\begin{document}\n"
                + InterfazR.getText() + "\n\\end{document}";
        try {
            hola(done);
        } catch (IOException ex) {
            Funciones.decir("no hay nada que imprimir");
        }
        try {
            Runtime.getRuntime().exec("test1.bat");
        } catch (IOException e) {
            Funciones.decir("no se pudo generar el pdf");
        }
    }                                   

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AdjuntaA;
    private javax.swing.JButton AdjuntaB;
    private javax.swing.JButton AmasB;
    private javax.swing.JButton AmenosB;
    private javax.swing.JButton AxB;
    private javax.swing.JButton Ayuda;
    private javax.swing.JButton BmenosA;
    private javax.swing.JButton BxA;
    private javax.swing.JSpinner ColumnasA;
    private javax.swing.JSpinner ColumnasB;
    private javax.swing.JButton DetA;
    private javax.swing.JButton DetB;
    private javax.swing.JButton EditarA;
    private javax.swing.JButton EditarA1;
    private javax.swing.JButton FPAUL;
    private javax.swing.JButton FPBUL;
    private javax.swing.JSpinner FilasA;
    private javax.swing.JSpinner FilasB;
    private javax.swing.JButton GJAB;
    private javax.swing.JButton GJBA;
    private javax.swing.JSpinner HA;
    private javax.swing.JSpinner HB;
    private javax.swing.JButton HilbertA;
    private javax.swing.JButton HilbertB;
    private javax.swing.JButton IngresarA;
    private javax.swing.JButton IngresarB;
    private javax.swing.JTextPane InterfazA;
    private javax.swing.JTextPane InterfazB;
    private javax.swing.JTextPane InterfazR;
    private javax.swing.JButton InversaA;
    private javax.swing.JButton InversaB;
    private javax.swing.JLabel Latex;
    private javax.swing.JButton PAULA;
    private javax.swing.JButton PBUL;
    private javax.swing.JButton PDF;
    private javax.swing.JLabel RA;
    private javax.swing.JLabel RB;
    private javax.swing.JButton RemplazarA;
    private javax.swing.JButton RemplazarB;
    private javax.swing.JButton TranspuestaA;
    private javax.swing.JButton TranspuestaB;
    private javax.swing.JSpinner exponenteA;
    private javax.swing.JSpinner exponenteB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modular;
    private javax.swing.JSpinner modulo;
    private javax.swing.JButton ortogonalizarA;
    private javax.swing.JButton ortogonalizarB;
    private javax.swing.JButton potenciaA;
    private javax.swing.JButton potenciaB;
    // End of variables declaration                   
}
