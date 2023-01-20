package calculadoraTenis;

import javax.swing.ImageIcon;

public class vista extends javax.swing.JFrame {

    
    
    public vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setIconImage (new ImageIcon(getClass().getResource("/icono/Sin título-1.png")).getImage());
        
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TXTGANADOR = new javax.swing.JLabel();
        TXTTOTALJUEGOS = new javax.swing.JLabel();
        TXTTOTALSETS = new javax.swing.JLabel();
        BTNLIMPIAR = new javax.swing.JButton();
        BTNCALCULAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TXTGANADOSL = new javax.swing.JTextField();
        TXTGANADOSV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TXTPERDIDOSL = new javax.swing.JTextField();
        TXTPERDIDOSV = new javax.swing.JTextField();
        TXTJGANADOSV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TXTJGANADOSL = new javax.swing.JTextField();
        TXTJPERDIDOSL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TXTJPERDIDOSV = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TXTSWL = new javax.swing.JTextField();
        TXTSWV = new javax.swing.JTextField();
        TXTSLV = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TXTSLL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Tenis");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOCAL");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VISITANTE");

        jPanel2.setBackground(new java.awt.Color(238, 255, 219));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("RESULTADOS");

        jLabel4.setText("GANADOR ENCUENTRO:");

        jLabel12.setText("TOTAL JUEGOS:");

        jLabel13.setText("TOTAL SETS:");

        BTNLIMPIAR.setBackground(new java.awt.Color(255, 255, 255));
        BTNLIMPIAR.setText("LIMPIAR");
        BTNLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLIMPIARActionPerformed(evt);
            }
        });

        BTNCALCULAR.setBackground(new java.awt.Color(255, 255, 255));
        BTNCALCULAR.setText("CALCULAR");
        BTNCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCALCULARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BTNCALCULAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNLIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TXTGANADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TXTTOTALSETS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TXTTOTALJUEGOS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TXTGANADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTTOTALJUEGOS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTTOTALSETS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNLIMPIAR)
                    .addComponent(BTNCALCULAR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("GANADOS:");

        jLabel7.setText("PERDIDOS:");

        jLabel8.setText("JUEGOS W:");

        jLabel9.setText("JUEGOS L:");

        jLabel10.setText("SETS W:");

        jLabel11.setText("SETS L:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTPERDIDOSL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField3)
                                        .addComponent(TXTGANADOSL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTSWL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTSLL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTJGANADOSL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTJPERDIDOSL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TXTGANADOSV)
                                    .addComponent(TXTPERDIDOSV, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TXTSWV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTSLV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTJGANADOSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXTJPERDIDOSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTGANADOSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTGANADOSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTPERDIDOSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTPERDIDOSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTSWL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTSWV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTSLL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTSLV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTJGANADOSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTJGANADOSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTJPERDIDOSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTJPERDIDOSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void BTNLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {

        TXTGANADOR.setText("");
        TXTGANADOSL.setText("");
        TXTGANADOSV.setText("");
        TXTJGANADOSL.setText("");
        TXTJGANADOSV.setText("");
        TXTJPERDIDOSL.setText("");
        TXTJPERDIDOSV.setText("");
        TXTPERDIDOSL.setText("");
        TXTPERDIDOSV.setText("");
        TXTSLL.setText("");
        TXTSLV.setText("");
        TXTSWL.setText("");
        TXTSWV.setText("");
        TXTTOTALJUEGOS.setText("");
        TXTTOTALSETS.setText("");
        
        
    }

    private void BTNCALCULARActionPerformed(java.awt.event.ActionEvent evt) {
        double JuegosGLocal, JuegosPlocal, JuegosGvisitante, JuegosPVisitante,
                SetsGLocal, SetsPlocal, SetsGVisitante, SetsPVisitante, PorcentajeSetsvisitante, SetsJugar,
                PorcentajeJuegosLocal, PorcentajeJuegosVisitante, PorcentajeSetsLocal, TotalJuegos, TotalSets, TotalJuegosLocal, TotalJuegosVisitante, TotalSetsLocal, TotalSetsVisitante;

        int GanadosLocal, PerdidosLocal, GanadosVisitante, PerdidosVisitante, TotalPartidos, PorcentajeLocal, PorcentajeVisitante, TotalLocal, ToltalVisitante, MargenvictoriaL, MargenvictoriaV;

        String ganadoslocal, perdidoslocal, ganadosvisitante, perdidosvisitante,
                juegosglocal, juegosplocal, juegosgvisitante, juegospvisitante,
                setsglocal, setsplocal, setsgvisitante, setspvisitante,
                totaljuegos, Setsjugar;

        //partidos ganados por jugador
        ganadoslocal = TXTGANADOSL.getText().trim();
        perdidoslocal = TXTPERDIDOSL.getText().trim();
        ganadosvisitante = TXTGANADOSV.getText().trim();
        perdidosvisitante = TXTPERDIDOSV.getText().trim();
        //juegos ganados por jugador
        juegosglocal = TXTJGANADOSL.getText().trim();
        juegosplocal = TXTJPERDIDOSL.getText().trim();
        juegosgvisitante = TXTJGANADOSV.getText().trim();
        juegospvisitante = TXTJPERDIDOSV.getText().trim();
        //sets ganados local
        setsglocal = TXTSWL.getText().trim();
        setsplocal = TXTSLL.getText().trim();
        setsgvisitante = TXTSWV.getText().trim();
        setspvisitante = TXTSLV.getText().trim();

        GanadosLocal = Integer.parseInt(ganadoslocal);
        PerdidosLocal = Integer.parseInt(perdidoslocal);
        GanadosVisitante = Integer.parseInt(ganadosvisitante);
        PerdidosVisitante = Integer.parseInt(perdidosvisitante);

        JuegosGLocal = Double.parseDouble(juegosglocal);
        JuegosPlocal = Double.parseDouble(juegosplocal);
        JuegosGvisitante = Double.parseDouble(juegosgvisitante);
        JuegosPVisitante = Double.parseDouble(juegospvisitante);

        SetsGLocal = Double.parseDouble(setsglocal);
        SetsPlocal = Double.parseDouble(setsplocal);
        SetsGVisitante = Double.parseDouble(setsgvisitante);
        SetsPVisitante = Integer.parseInt(setspvisitante);

        //operacione
        TotalLocal = GanadosLocal + PerdidosLocal;
        ToltalVisitante = GanadosVisitante + PerdidosVisitante;
        TotalPartidos = TotalLocal + ToltalVisitante;
        System.out.println("TotalPartidos = " + TotalPartidos);

        //margen de victoria
        PorcentajeLocal = GanadosLocal * 100;
        MargenvictoriaL = PorcentajeLocal / TotalLocal;
        System.out.println("MargenvictoriaL = " + MargenvictoriaL);
        PorcentajeVisitante = GanadosVisitante * 100;
        MargenvictoriaV = PorcentajeVisitante / ToltalVisitante;
        System.out.println("MargenvictoriaV  " + MargenvictoriaV);

        //juegos
        TotalJuegosLocal = JuegosGLocal + JuegosPVisitante;
        System.out.println("total local " + TotalJuegosLocal);
        TotalJuegosVisitante = JuegosGvisitante + JuegosPlocal;
        System.out.println("total visitante " + TotalJuegosVisitante);

        PorcentajeJuegosLocal = TotalJuegosLocal / TotalPartidos;
        System.out.println("porcentaje local " + PorcentajeJuegosLocal);
        PorcentajeJuegosVisitante = TotalJuegosVisitante / TotalPartidos;
        System.out.println("porcentaje visitante " + PorcentajeJuegosVisitante);
        TotalJuegos = PorcentajeJuegosLocal + PorcentajeJuegosVisitante;
        System.out.println("Toltal juegos " + TotalJuegos);

        //Sets
        TotalSetsLocal = SetsGLocal + SetsPlocal;
        System.out.println("TotalSetsLocal " + TotalSetsLocal);
        TotalSetsVisitante = SetsGVisitante + SetsPVisitante;
        System.out.println("TotalSetsVisitante " + TotalSetsVisitante);
        PorcentajeSetsLocal = TotalSetsLocal / TotalLocal;
        System.out.println("PorcentajeSetsLocal " + PorcentajeSetsLocal);
        PorcentajeSetsvisitante = TotalSetsVisitante / ToltalVisitante;
        System.out.println("PorcentajeSetsvisitante " + PorcentajeSetsvisitante);
        TotalSets = PorcentajeSetsLocal + PorcentajeSetsvisitante;
        SetsJugar = TotalSets / 2;

        //combierte en texto para mostrar los datos
        ganadoslocal = Integer.toString(GanadosLocal);
        perdidoslocal = Integer.toString(PerdidosLocal);
        ganadosvisitante = Integer.toString(GanadosVisitante);
        perdidosvisitante = Integer.toString(PerdidosVisitante);

        juegosglocal = Double.toString(JuegosGLocal);
        juegosplocal = Double.toString(JuegosPlocal);
        juegosgvisitante = Double.toString(JuegosGvisitante);
        juegospvisitante = Double.toString(JuegosPVisitante);

        setsglocal = Double.toString(SetsGLocal);
        setsplocal = Double.toString(SetsPlocal);
        setsgvisitante = Double.toString(SetsGVisitante);
        setspvisitante = Double.toString(SetsPVisitante);

        totaljuegos = Double.toString(TotalJuegos);
        Setsjugar = Double.toString(SetsJugar);

        if (MargenvictoriaL > MargenvictoriaV) {
            TXTGANADOR.setText("LOCAL");
        } else {
            TXTGANADOR.setText("VISITANTE");
        }

        TXTTOTALJUEGOS.setText(totaljuegos);
        TXTTOTALSETS.setText(Setsjugar);


    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    private javax.swing.JButton BTNCALCULAR;
    private javax.swing.JButton BTNLIMPIAR;
    private javax.swing.JLabel TXTGANADOR;
    private javax.swing.JTextField TXTGANADOSL;
    private javax.swing.JTextField TXTGANADOSV;
    private javax.swing.JTextField TXTJGANADOSL;
    private javax.swing.JTextField TXTJGANADOSV;
    private javax.swing.JTextField TXTJPERDIDOSL;
    private javax.swing.JTextField TXTJPERDIDOSV;
    private javax.swing.JTextField TXTPERDIDOSL;
    private javax.swing.JTextField TXTPERDIDOSV;
    private javax.swing.JTextField TXTSLL;
    private javax.swing.JTextField TXTSLV;
    private javax.swing.JTextField TXTSWL;
    private javax.swing.JTextField TXTSWV;
    private javax.swing.JLabel TXTTOTALJUEGOS;
    private javax.swing.JLabel TXTTOTALSETS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
}
