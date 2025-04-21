package pacoteViewLanchonete;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import pacoteLanchonete.cliente;
import pacoteLanchonete.pedidos;
import pacoteLanchoneteDAO.pedidosDao;

public class telaPedido extends javax.swing.JFrame {
        pedidos p= new pedidos();
        pedidosDao pDao= new pedidosDao();
        
    public telaPedido() {
        initComponents();
    }
        
       public void atalhoF(){ /*atalho alt+F*/
            btnEspecial.setMnemonic(KeyEvent.VK_F);
            
    }
        public void atalhoE(){ /*atalho alt+E*/
            btnFinalizar.setMnemonic(KeyEvent.VK_E);
            telaEntregaEsp ee= new telaEntregaEsp();
            ee.setVisible(true);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opções = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tela = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        chbXBurguer = new javax.swing.JCheckBox();
        chbXS = new javax.swing.JCheckBox();
        chbHVeg = new javax.swing.JCheckBox();
        chbBF = new javax.swing.JCheckBox();
        chbPQueijo = new javax.swing.JCheckBox();
        chbPCarne = new javax.swing.JCheckBox();
        lblXB = new javax.swing.JLabel();
        lblXS = new javax.swing.JLabel();
        lblHV = new javax.swing.JLabel();
        lblBF = new javax.swing.JLabel();
        lblQ = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        chbRefriG = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        chbRefriC = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        chbSucoL = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        chbSucoM = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        chbSucoLi = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtResPQ = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaEnd = new javax.swing.JTextArea();
        lblPrecoXB = new javax.swing.JLabel();
        txtQuantHV = new javax.swing.JTextField();
        txtQuantXS = new javax.swing.JTextField();
        txtQuantXB = new javax.swing.JTextField();
        txtQuantPQ = new javax.swing.JTextField();
        txtQuantPC = new javax.swing.JTextField();
        txtQuantBF = new javax.swing.JTextField();
        txtQuantG = new javax.swing.JTextField();
        txtQuantC = new javax.swing.JTextField();
        txtQuantLA = new javax.swing.JTextField();
        txtQuantL = new javax.swing.JTextField();
        txtQuantM = new javax.swing.JTextField();
        lblPrecoHV = new javax.swing.JLabel();
        lblPrecoXS = new javax.swing.JLabel();
        lblPrecoC = new javax.swing.JLabel();
        txtResHV = new javax.swing.JTextField();
        txtResXB = new javax.swing.JTextField();
        txtResPC = new javax.swing.JTextField();
        txtResXS = new javax.swing.JTextField();
        txtResBF = new javax.swing.JTextField();
        txtResG = new javax.swing.JTextField();
        txtResC = new javax.swing.JTextField();
        txtResLA = new javax.swing.JTextField();
        txtResMj = new javax.swing.JTextField();
        txtResLi = new javax.swing.JTextField();
        btnCalS = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        btnFinalizar = new javax.swing.JButton();
        btnEspecial = new javax.swing.JButton();
        lblLXB = new javax.swing.JLabel();
        lblLHV = new javax.swing.JLabel();
        lblLXS = new javax.swing.JLabel();
        lblLPQ = new javax.swing.JLabel();
        lblLPC = new javax.swing.JLabel();
        lblLG = new javax.swing.JLabel();
        lblLIM = new javax.swing.JLabel();
        btnCal = new javax.swing.JButton();
        lblLCC = new javax.swing.JLabel();
        lblLMJ = new javax.swing.JLabel();
        lblPrecoLI = new javax.swing.JLabel();
        lblPrecoCC = new javax.swing.JLabel();
        lblPrecoLA = new javax.swing.JLabel();
        lblLCC1 = new javax.swing.JLabel();
        lblPrecoMj = new javax.swing.JLabel();
        lblPrecoQ = new javax.swing.JLabel();
        lblPrecoBF = new javax.swing.JLabel();
        lblPrecoMM = new javax.swing.JLabel();
        lblPrecoG = new javax.swing.JLabel();
        rbtPix = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rbtDinheiro = new javax.swing.JRadioButton();
        rbtOutros = new javax.swing.JRadioButton();
        cbxOutro = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("telaPedido"); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(3000, 3000));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(2600, 1500));

        tela.setBackground(new java.awt.Color(255, 255, 153));
        tela.setMaximumSize(new java.awt.Dimension(1100, 996));
        tela.setPreferredSize(new java.awt.Dimension(1540, 1090));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1583, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setText("NOME:");

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel2.setText("TELEFONE:");

        jLabel3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel3.setText("ENDEREÇO:");

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel4.setText("LANCHES:");

        txtTel.setToolTipText("DIGITE SEU TELEFONE");
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        txtNome.setToolTipText("DIGITE SEU NOME");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel5.setText("BEBIDAS:");

        chbXBurguer.setBackground(new java.awt.Color(255, 255, 153));
        chbXBurguer.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbXBurguer.setText("X-BURGUER");
        chbXBurguer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbXBurguerActionPerformed(evt);
            }
        });

        chbXS.setBackground(new java.awt.Color(255, 255, 153));
        chbXS.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbXS.setText("X-SALADA");
        chbXS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbXSActionPerformed(evt);
            }
        });

        chbHVeg.setBackground(new java.awt.Color(255, 255, 153));
        chbHVeg.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbHVeg.setText("HAMBURGUER VEGANO");
        chbHVeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbHVegActionPerformed(evt);
            }
        });

        chbBF.setBackground(new java.awt.Color(255, 255, 153));
        chbBF.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbBF.setText("BATATAS FRITAS");
        chbBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbBFActionPerformed(evt);
            }
        });

        chbPQueijo.setBackground(new java.awt.Color(255, 255, 153));
        chbPQueijo.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbPQueijo.setText("PASTEL DE QUEIJO");
        chbPQueijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPQueijoActionPerformed(evt);
            }
        });

        chbPCarne.setBackground(new java.awt.Color(255, 255, 153));
        chbPCarne.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbPCarne.setText("PASTEL DE CARNE");
        chbPCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbPCarneActionPerformed(evt);
            }
        });

        lblXB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblXB.setText("QUANTIDADE:");
        lblXB.setEnabled(false);

        lblXS.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblXS.setText("QUANTIDADE:");
        lblXS.setEnabled(false);

        lblHV.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblHV.setText("QUANTIDADE:");
        lblHV.setEnabled(false);

        lblBF.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblBF.setText("QUANTIDADE:");
        lblBF.setEnabled(false);

        lblQ.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblQ.setText("QUANTIDADE:");
        lblQ.setEnabled(false);

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblC.setText("QUANTIDADE:");
        lblC.setEnabled(false);

        chbRefriG.setBackground(new java.awt.Color(255, 255, 153));
        chbRefriG.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbRefriG.setText("REFRIGERANTE GUARANÁ");
        chbRefriG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbRefriGActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("QUANTIDADE:");
        jLabel12.setEnabled(false);

        chbRefriC.setBackground(new java.awt.Color(255, 255, 153));
        chbRefriC.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbRefriC.setText("REFRIGERANTE COCA-COLA");
        chbRefriC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbRefriCActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel13.setText("QUANTIDADE:");
        jLabel13.setEnabled(false);

        chbSucoL.setBackground(new java.awt.Color(255, 255, 153));
        chbSucoL.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbSucoL.setText("SUCO NATURAL DE LARANJA");
        chbSucoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSucoLActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setText("QUANTIDADE:");
        jLabel14.setEnabled(false);

        chbSucoM.setBackground(new java.awt.Color(255, 255, 153));
        chbSucoM.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbSucoM.setText("SUCO DE NATURAL DE MARACUJÁ");
        chbSucoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSucoMActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel16.setText("QUANTIDADE:");
        jLabel16.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel17.setText("QUANTIDADE:");
        jLabel17.setEnabled(false);

        chbSucoLi.setBackground(new java.awt.Color(255, 255, 153));
        chbSucoLi.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        chbSucoLi.setText("SUCO NATURAL DE LIMÃO");
        chbSucoLi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbSucoLiActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel18.setText("OBSERVAÇÕES:");

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        txtObs.setRows(5);
        txtObs.setToolTipText("DIGITE ALGUMA OBSERVAÇÃO QUE QUERIA FAZER");
        txtObs.setWrapStyleWord(true);
        txtObs.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtObs);

        txtResPQ.setEditable(false);

        txtAreaEnd.setColumns(1);
        txtAreaEnd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAreaEnd.setRows(3);
        txtAreaEnd.setTabSize(5);
        txtAreaEnd.setText("BAIRRO:\n\nRUA:\n\nNUMERO:");
        txtAreaEnd.setToolTipText("DIGITE SEU ENDEREÇO");
        txtAreaEnd.setWrapStyleWord(true);
        txtAreaEnd.setPreferredSize(new java.awt.Dimension(10, 10));
        txtAreaEnd.setSelectionEnd(10);
        txtAreaEnd.setSelectionStart(10);
        jScrollPane3.setViewportView(txtAreaEnd);
        txtAreaEnd.getAccessibleContext().setAccessibleParent(txtAreaEnd);

        lblPrecoXB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtQuantHV.setEnabled(false);

        txtQuantXS.setEnabled(false);

        txtQuantXB.setEnabled(false);
        txtQuantXB.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtQuantXBCaretUpdate(evt);
            }
        });

        txtQuantPQ.setEnabled(false);

        txtQuantPC.setEnabled(false);

        txtQuantBF.setEnabled(false);

        txtQuantG.setEnabled(false);

        txtQuantC.setEnabled(false);

        txtQuantLA.setEnabled(false);

        txtQuantL.setEnabled(false);

        txtQuantM.setEnabled(false);

        lblPrecoHV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecoXS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtResHV.setEditable(false);

        txtResXB.setEditable(false);

        txtResPC.setEditable(false);

        txtResXS.setEditable(false);
        txtResXS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResXSActionPerformed(evt);
            }
        });

        txtResBF.setEditable(false);

        txtResG.setEditable(false);

        txtResC.setEditable(false);

        txtResLA.setEditable(false);
        txtResLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResLAActionPerformed(evt);
            }
        });

        txtResMj.setEditable(false);

        txtResLi.setEditable(false);

        btnCalS.setText("CALCULAR SUCO");
        btnCalS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalSActionPerformed(evt);
            }
        });

        btnFinalizar.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnFinalizar.setMnemonic('F');
        btnFinalizar.setText("FINALIZAR PEDIDO");
        btnFinalizar.setToolTipText("CLIQUE PRA FINAIZAR SEU PEDIDO");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnEspecial.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        btnEspecial.setMnemonic('E');
        btnEspecial.setText("FAZER UMA ENTREGA ESPECIAL");
        btnEspecial.setToolTipText("CLIQUE PRA FAZER UMA ENTREGA ESPECIAL");
        btnEspecial.setDisplayedMnemonicIndex(0);
        btnEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecialActionPerformed(evt);
            }
        });

        lblLXB.setForeground(new java.awt.Color(255, 0, 0));

        lblLHV.setForeground(new java.awt.Color(255, 0, 0));

        lblLXS.setForeground(new java.awt.Color(255, 0, 0));

        lblLPQ.setForeground(new java.awt.Color(255, 0, 0));

        lblLPC.setForeground(new java.awt.Color(255, 0, 0));

        lblLG.setForeground(new java.awt.Color(255, 0, 0));

        lblLIM.setForeground(new java.awt.Color(255, 0, 0));

        btnCal.setText("CALCULAR LANCHE");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        lblLCC.setForeground(new java.awt.Color(255, 0, 0));

        lblLMJ.setForeground(new java.awt.Color(255, 0, 0));

        lblPrecoLI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecoCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecoLA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblLCC1.setForeground(new java.awt.Color(255, 0, 0));

        lblPrecoMj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecoQ.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecoBF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecoMM.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblPrecoG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        opções.add(rbtPix);
        rbtPix.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        rbtPix.setText("PIX");

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel6.setText("FORMA DE PAGAMENTO:");

        opções.add(rbtDinheiro);
        rbtDinheiro.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        rbtDinheiro.setText("DINHEIRO");

        opções.add(rbtOutros);
        rbtOutros.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        rbtOutros.setText("OUTROS");
        rbtOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtOutrosActionPerformed(evt);
            }
        });

        cbxOutro.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        cbxOutro.setMaximumRowCount(2);
        cbxOutro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Nubank", "PicPay" }));

        javax.swing.GroupLayout telaLayout = new javax.swing.GroupLayout(tela);
        tela.setLayout(telaLayout);
        telaLayout.setHorizontalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecoHV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(telaLayout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNome))
                                        .addGroup(telaLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(telaLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(telaLayout.createSequentialGroup()
                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addComponent(chbXBurguer)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblPrecoXB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(lblQ)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtQuantPQ, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtResPQ, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addGap(16, 16, 16)
                                                        .addComponent(lblXB)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtQuantXB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtResXB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addComponent(chbPQueijo)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lblPrecoQ, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addComponent(lblLXB, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)))
                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblLPC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addComponent(chbPCarne)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblPrecoC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(26, 26, 26))
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addGap(57, 57, 57)
                                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(telaLayout.createSequentialGroup()
                                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(chbXS)
                                                                    .addComponent(lblXS))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(telaLayout.createSequentialGroup()
                                                                        .addComponent(txtQuantXS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtResXS, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(lblPrecoXS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(telaLayout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addComponent(lblC)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtQuantPC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtResPC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addGap(54, 54, 54)
                                                        .addComponent(lblLXS, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)))
                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(lblLHV, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                                        .addComponent(lblBF)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtQuantBF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtResBF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(28, 28, 28))
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(lblHV)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtQuantHV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtResHV, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(chbHVeg)
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addComponent(chbBF)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblPrecoBF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(36, 36, 36)
                                                .addComponent(btnCal))))
                                    .addGroup(telaLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(chbSucoLi)
                                                            .addGroup(telaLayout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addComponent(jLabel17)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtQuantL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtResLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(telaLayout.createSequentialGroup()
                                                                .addGap(107, 107, 107)
                                                                .addComponent(jLabel16)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtQuantM, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtResMj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(lblPrecoLI, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(7, 7, 7)
                                                                .addComponent(chbSucoM))))
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addComponent(lblLIM, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(82, 82, 82)
                                                        .addComponent(lblLMJ, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblPrecoMj, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telaLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(jLabel12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtQuantG, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtResG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(89, 89, 89))
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(lblLG, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(telaLayout.createSequentialGroup()
                                                                .addComponent(chbRefriG)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(lblPrecoG, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(19, 19, 19)))
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblLCC, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtQuantC, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtResC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(telaLayout.createSequentialGroup()
                                                        .addComponent(chbRefriC)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblPrecoCC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(23, 23, 23)))
                                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblLCC1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(chbSucoL))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPrecoLA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnCalS)))
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtQuantLA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtResLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(telaLayout.createSequentialGroup()
                                                .addGap(225, 225, 225)
                                                .addComponent(lblPrecoMM, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(telaLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(lblLPQ, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(telaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(82, 82, 82))
            .addGroup(telaLayout.createSequentialGroup()
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(rbtDinheiro)
                        .addGap(41, 41, 41)
                        .addComponent(rbtPix)
                        .addGap(39, 39, 39)
                        .addComponent(rbtOutros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnEspecial)
                        .addGap(18, 18, 18)
                        .addComponent(btnFinalizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telaLayout.setVerticalGroup(
            telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telaLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chbXBurguer)
                                    .addComponent(chbXS))
                                .addComponent(lblPrecoXB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecoXS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblXB)
                            .addComponent(txtQuantXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblXS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantXS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResXS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addComponent(chbHVeg)
                        .addGap(9, 9, 9)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHV)
                            .addComponent(txtQuantHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLXB, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLXS, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaLayout.createSequentialGroup()
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbBF)
                                    .addComponent(btnCal)
                                    .addComponent(lblPrecoBF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBF)
                                    .addComponent(txtQuantBF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResBF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(telaLayout.createSequentialGroup()
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chbPCarne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPrecoC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblC)
                                    .addComponent(txtQuantPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(telaLayout.createSequentialGroup()
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chbPQueijo)
                                    .addComponent(lblPrecoQ, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblQ)
                                    .addComponent(txtQuantPQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResPQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblLHV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLPQ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLPC, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(telaLayout.createSequentialGroup()
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(telaLayout.createSequentialGroup()
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chbRefriG)
                                        .addComponent(chbRefriC))
                                    .addComponent(lblPrecoCC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrecoG, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtQuantG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtQuantC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLG, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLCC, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(telaLayout.createSequentialGroup()
                                .addComponent(lblPrecoLA, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnCalS, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrecoMj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(telaLayout.createSequentialGroup()
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbSucoLi)
                                    .addComponent(chbSucoM)
                                    .addComponent(lblPrecoLI, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(txtQuantM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtResMj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(txtQuantL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtResLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(telaLayout.createSequentialGroup()
                        .addComponent(chbSucoL)
                        .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtQuantLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResLA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLCC1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblPrecoMM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLMJ, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLIM, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtDinheiro)
                    .addComponent(rbtPix)
                    .addComponent(cbxOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtOutros))
                .addGap(40, 40, 40)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEspecial)
                    .addComponent(btnFinalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrecoHV, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtTel.getAccessibleContext().setAccessibleParent(txtTel);
        txtNome.getAccessibleContext().setAccessibleParent(txtNome);

        jScrollPane1.setViewportView(tela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecialActionPerformed
       try{ 
           
        String nome= txtNome.getText();
        String end= txtAreaEnd.getText();
        String tel= txtTel.getText();
           
          cliente c= new cliente();

          c.setNome(nome);
          c.setTelefone(tel);
          c.setEndereco(end);
       
        JOptionPane.showMessageDialog(null,"Aww.. "+txtNome.getText()+ " como vc é fofo(a) :D kk "+ "\n confesso, "
            + "estou ansioso pra saber pra quem vc vai fazer uma entrega especial kk (desculpe ser xereta kk)");

        if(btnEspecial.isDefaultButton()){
            atalhoE();} /* ATALHO: Alt+F*/

        else{
            telaEntregaEsp tee= new telaEntregaEsp();/*CLICAR NO BOTÃO*/
            tee.setVisible(true);}
         
       }
       
       catch(Exception e){
           System.out.println("erro: "+e.getMessage());
       }
    }//GEN-LAST:event_btnEspecialActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
       try{
         int quantidade;
         double valor,valorT;
        String q= txtQuantXB.getText();
        String nome= txtNome.getText();
        String end= txtAreaEnd.getText();
        String tel= txtTel.getText();
        String outro= cbxOutro.getSelectedItem().toString();
        String obs= txtObs.getText();
        String pix= rbtPix.getText();  
        String d= rbtDinheiro.getText();
         
         
        if(btnFinalizar.isDefaultButton()){
        atalhoF();} /* ATALHO: Alt+E*/   
       
        p.setObservacoes(obs);
        
        pDao.cadastrarPedido(p);
        
           if(rbtPix.isSelected()){
               p.setFormaPagamento(pix);
               
               pDao.cadastrarPedido(p);
           }
       
       if(rbtDinheiro.isSelected()){
               p.setFormaPagamento(d);
               
               pDao.cadastrarPedido(p);
       }
       
       if(rbtOutros.isSelected()){
           
          p.setOutro(outro);
          
          p.setFormaPagamento(outro);
               
           pDao.cadastrarPedido(p);}
       
       if(chbXBurguer.isSelected()){
                  
                   if(q.isBlank() || q.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantXB.getText()) >4){ 
                       lblLXB.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLXB.setText(" ");
                     
                     String strq= txtQuantXB.getText();
                     
                     quantidade= Integer.parseInt(strq);
                     
                     valor= quantidade * 9.00;
                     
                     valorT= valor;
                     
                     String strV= String.valueOf(valorT);
                     
                     txtResXB.setText("R$: "+strV);
                   
                     p.setValorTotal(Double.parseDouble(txtResXB.getText()));
                     
                      p.setQuantidade(Integer.parseInt(txtQuantXB.getText()));

                        pedidosDao pDao= new pedidosDao();
                        pDao.cadastrarPedido(p);
                     }
              }

       }
       
       catch(Exception e){
           System.out.println("erro: "+e.getMessage());
       }
       
       telaResumo tr= new telaResumo();
                 tr.setVisible(true);

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnCalSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalSActionPerformed
             calcularSuco();
    }//GEN-LAST:event_btnCalSActionPerformed

    private void txtResLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResLAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResLAActionPerformed

    private void txtResXSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResXSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResXSActionPerformed

    private void txtQuantXBCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtQuantXBCaretUpdate

    }//GEN-LAST:event_txtQuantXBCaretUpdate

    private void chbSucoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSucoMActionPerformed
       if(chbSucoM.isSelected()){
            txtQuantM.setEnabled(true);
            lblPrecoMj.setText("R$3.50");}

        else{
            txtQuantM.setEnabled(false);
            lblPrecoMj.setText("");}
    }//GEN-LAST:event_chbSucoMActionPerformed

    private void chbSucoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSucoLActionPerformed
        if(chbSucoL.isSelected()){
            txtQuantLA.setEnabled(true);
            lblPrecoLA.setText("R$ 8.00");}

        else{
            txtQuantLA.setEnabled(false);
            lblPrecoLA.setText("");}
    }//GEN-LAST:event_chbSucoLActionPerformed

    private void chbRefriCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbRefriCActionPerformed
        if(chbRefriC.isSelected()){
            txtQuantC.setEnabled(true);
            lblPrecoCC.setText("R$ 5.00");}

        else{
            txtQuantC.setEnabled(false);
            lblPrecoCC.setText("");}
    }//GEN-LAST:event_chbRefriCActionPerformed

    private void chbRefriGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbRefriGActionPerformed
        if(chbRefriG.isSelected()){
            txtQuantG.setEnabled(true);
            lblPrecoG.setText("R$ 4.00");}

        else{
            txtQuantG.setEnabled(false);
            lblPrecoG.setText("");}
    }//GEN-LAST:event_chbRefriGActionPerformed

    private void chbPCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPCarneActionPerformed
        if(chbPCarne.isSelected()){
            lblC.setEnabled(true);
            txtQuantPC.setEnabled(true);
            lblPrecoC.setText("R$ 5.00");}

        else{
            lblC.setEnabled(false);
            txtQuantPC.setEnabled(false);
            lblPrecoC.setText("");}
    }//GEN-LAST:event_chbPCarneActionPerformed

    private void chbPQueijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbPQueijoActionPerformed
        if(chbPQueijo.isSelected()){
            lblQ.setEnabled(true);
            txtQuantPQ.setEnabled(true);
            lblPrecoQ.setText("R$ 5.00");}

        else{
            lblQ.setEnabled(false);
            txtQuantPQ.setEnabled(false);
            lblPrecoQ.setText("");}
    }//GEN-LAST:event_chbPQueijoActionPerformed

    private void chbBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbBFActionPerformed
        if(chbBF.isSelected()){
            lblBF.setEnabled(true);
            txtQuantBF.setEnabled(true);
            lblPrecoLI.setText("R$ 5.55");}

        else{
            lblBF.setEnabled(false);
            txtQuantBF.setEnabled(false);
            lblPrecoLI.setText("");}
    }//GEN-LAST:event_chbBFActionPerformed

    private void chbHVegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbHVegActionPerformed
        if(chbHVeg.isSelected()){
            lblHV.setEnabled(true);
            txtQuantHV.setEnabled(true);
            lblPrecoHV.setText("R$ 8.00");}

        else{
            lblHV.setEnabled(false);
            txtQuantHV.setEnabled(false);
            lblPrecoHV.setText("");}
    }//GEN-LAST:event_chbHVegActionPerformed

    private void chbXSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbXSActionPerformed
        if(chbXS.isSelected()){
            lblXS.setEnabled(true);
            txtQuantXS.setEnabled(true);
            lblPrecoXS.setText("R$ 7.25");}

        else{
            lblXS.setEnabled(false);
            txtQuantXS.setEnabled(false);
            lblPrecoXS.setText("");}
    }//GEN-LAST:event_chbXSActionPerformed

    private void chbXBurguerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbXBurguerActionPerformed
        if(chbXBurguer.isSelected()){
            lblXB.setEnabled(true);
            txtQuantXB.setEnabled(true);
            lblPrecoXB.setText("R$ 9.00");}

        else{
            lblXB.setEnabled(false);
            txtQuantXB.setEnabled(false);
            lblPrecoXB.setText("");}
    }//GEN-LAST:event_chbXBurguerActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void chbSucoLiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbSucoLiActionPerformed
       if(chbSucoLi.isSelected()){
            txtQuantL.setEnabled(true);
            lblPrecoLI.setText("R$ 3.50");}

        else{
            txtQuantL.setEnabled(false);
            lblPrecoLI.setText("");}    }//GEN-LAST:event_chbSucoLiActionPerformed

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
                    calcular();
    }//GEN-LAST:event_btnCalActionPerformed

    private void rbtOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtOutrosActionPerformed

    }//GEN-LAST:event_rbtOutrosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnCalS;
    private javax.swing.JButton btnEspecial;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<String> cbxOutro;
    private javax.swing.JCheckBox chbBF;
    private javax.swing.JCheckBox chbHVeg;
    private javax.swing.JCheckBox chbPCarne;
    private javax.swing.JCheckBox chbPQueijo;
    private javax.swing.JCheckBox chbRefriC;
    private javax.swing.JCheckBox chbRefriG;
    private javax.swing.JCheckBox chbSucoL;
    private javax.swing.JCheckBox chbSucoLi;
    private javax.swing.JCheckBox chbSucoM;
    private javax.swing.JCheckBox chbXBurguer;
    private javax.swing.JCheckBox chbXS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblBF;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblHV;
    private javax.swing.JLabel lblLCC;
    private javax.swing.JLabel lblLCC1;
    private javax.swing.JLabel lblLG;
    private javax.swing.JLabel lblLHV;
    private javax.swing.JLabel lblLIM;
    private javax.swing.JLabel lblLMJ;
    private javax.swing.JLabel lblLPC;
    private javax.swing.JLabel lblLPQ;
    private javax.swing.JLabel lblLXB;
    private javax.swing.JLabel lblLXS;
    private javax.swing.JLabel lblPrecoBF;
    private javax.swing.JLabel lblPrecoC;
    private javax.swing.JLabel lblPrecoCC;
    private javax.swing.JLabel lblPrecoG;
    private javax.swing.JLabel lblPrecoHV;
    private javax.swing.JLabel lblPrecoLA;
    private javax.swing.JLabel lblPrecoLI;
    private javax.swing.JLabel lblPrecoMM;
    private javax.swing.JLabel lblPrecoMj;
    private javax.swing.JLabel lblPrecoQ;
    private javax.swing.JLabel lblPrecoXB;
    private javax.swing.JLabel lblPrecoXS;
    private javax.swing.JLabel lblQ;
    private javax.swing.JLabel lblXB;
    private javax.swing.JLabel lblXS;
    private javax.swing.ButtonGroup opções;
    private javax.swing.JRadioButton rbtDinheiro;
    private javax.swing.JRadioButton rbtOutros;
    private javax.swing.JRadioButton rbtPix;
    private javax.swing.JPanel tela;
    private javax.swing.JTextArea txtAreaEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtQuantBF;
    private javax.swing.JTextField txtQuantC;
    private javax.swing.JTextField txtQuantG;
    private javax.swing.JTextField txtQuantHV;
    private javax.swing.JTextField txtQuantL;
    private javax.swing.JTextField txtQuantLA;
    private javax.swing.JTextField txtQuantM;
    private javax.swing.JTextField txtQuantPC;
    private javax.swing.JTextField txtQuantPQ;
    private javax.swing.JTextField txtQuantXB;
    private javax.swing.JTextField txtQuantXS;
    private javax.swing.JTextField txtResBF;
    private javax.swing.JTextField txtResC;
    private javax.swing.JTextField txtResG;
    private javax.swing.JTextField txtResHV;
    private javax.swing.JTextField txtResLA;
    private javax.swing.JTextField txtResLi;
    private javax.swing.JTextField txtResMj;
    private javax.swing.JTextField txtResPC;
    private javax.swing.JTextField txtResPQ;
    private javax.swing.JTextField txtResXB;
    private javax.swing.JTextField txtResXS;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

      public void calcular(){
          pedidos p= new pedidos();
          
          int quantidade;
          double valor,valorT;
          String q= txtQuantXB.getText();
          
          try{
              if(chbXBurguer.isSelected()){
                  
                   if(q.isBlank() || q.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantXB.getText()) >4){ 
                       lblLXB.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLXB.setText(" ");
                     
                     String strq= txtQuantXB.getText();
                     
                     quantidade= Integer.parseInt(strq);
                     
                     valor= quantidade * 9.00;
                     
                     valorT= valor;
                     
                     String strV= String.valueOf(valorT);
                     
                     txtResXB.setText("R$: "+strV);
                   
                     p.setValorTotal(Double.parseDouble(txtResXB.getText()));
                     
                        pDao.cadastrarPedido(p);
                     }
                   
              }
              
              // x- salada  //
              
              if(chbXS.isSelected()){
                  String xs= txtQuantXS.getText();
                                
                   if(xs.isBlank() || xs.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantXS.getText()) >4){ 
                       lblLXS.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLXS.setText(" ");
                     
                     String strq= txtQuantXS.getText();
                      
                     quantidade= Integer.parseInt(strq);
                     
                     valor= quantidade * 7.25;
                     
                     valorT= valor;
                     
                     String strXS= String.valueOf(valorT);
                     
                     txtResXS.setText("R$: "+strXS);
                     
                      p.setValorTotal(Double.parseDouble(txtResXS.getText()));
                      
                      JOptionPane.showMessageDialog(null,p.getValorTotal());
                      
                      pDao.cadastrarPedido(p);
                      
                      }}
              
                                  // burguer vegano//          
                      if(chbHVeg.isSelected()){
                  String hv= txtQuantHV.getText();
                                
                   if(hv.isBlank() || hv.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantHV.getText()) >4){ 
                       lblLHV.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLHV.setText(" ");
                     
                     String strq= txtQuantHV.getText();
                      
                     quantidade= Integer.parseInt(strq);
                     
                     valor= quantidade * 8.00;
                     
                     valorT= valor;
                     
                     String strV= String.valueOf(valorT);
                     
                     txtResHV.setText("R$: "+strV);
                   
                      p.setValorTotal(Double.parseDouble(txtResHV.getText()));
                    }}

                      // pastel de queijo
             if(chbPQueijo.isSelected()){
                  String pq= txtQuantPQ.getText();
                                
                   if(pq.isBlank() || pq.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantPQ.getText()) >4){ 
                       lblLPQ.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLPQ.setText(" ");
                     
                     String strq= txtQuantPQ.getText();
                      
                     quantidade= Integer.parseInt(strq);
                     
                     valor= quantidade * 5.00;
                     
                     valorT= valor;
                     
                     String strV= String.valueOf(valorT);
                     
                     txtResPQ.setText("R$: "+strV);
                   
                      p.setValorTotal(Double.parseDouble(txtResPQ.getText()));}}

             // pastel de carne//
          if(chbPCarne.isSelected()){
                  String pc= txtQuantPC.getText();
                                
                   if(pc.isBlank() || pc.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantPC.getText()) >4){ 
                       lblLPC.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLPC.setText(" ");
                     
                     String strq= txtQuantPC.getText();
                      
                     quantidade= Integer.parseInt(strq);
                     
                     valor= quantidade * 5.00;
                     
                     valorT= valor;
                     
                     String strV= String.valueOf(valorT);
                     
                     txtResPC.setText("R$: "+strV);
                   
                      p.setValorTotal(Double.parseDouble(txtResPC.getText()));}}
                   

            // batatas fritas//
          if(chbBF.isSelected()){
                  String xs= txtQuantBF.getText();
                   if(xs.isBlank() || xs.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantBF.getText()) >4){ 
                       lblLG.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLG.setText(" ");
                     
                     String strq= txtQuantBF.getText();
                      
                     quantidade= Integer.parseInt(strq);
                     
                     valor= quantidade * 5.55;
                     
                     valorT= valor;
                     
                     String strV= String.valueOf(valorT);
                     
                     txtResBF.setText("R$: "+strV);
                   
                     p.setValorTotal(Double.parseDouble(txtResBF.getText()));}}}
                  
          catch(Exception e){
              System.out.println("erro: "+e.getMessage());}}

                   //bebidas//
        public void calcularSuco(){
          pedidos p= new pedidos();
          
          int quant;
          double v,vT;
          String rg= txtQuantG.getText();
          
          try{   // refrigerante guaraná// 
              if(chbRefriG.isSelected()){
                  
                   if(rg.isBlank() ||rg.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantG.getText()) >4){ 
                       lblLG.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLG.setText(" ");
                     
                     String strg= txtQuantG.getText();
                      
                     quant= Integer.parseInt(strg);
                     
                     v= quant * 4.00;
                     
                     vT= v;
                     
                     String strR= String.valueOf(vT);
                     
                     txtResG.setText("R$: "+strR);
                   
                     
                      p.setValorTotal(Double.parseDouble(txtResG.getText()));
                   
                      pDao.cadastrarPedido(p);
                   }}
              
              // refrigerante coca-cola  //
              if(chbRefriC.isSelected()){
                  String rc= txtQuantC.getText();
                                
                   if(rc.isBlank() || rc.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantC.getText()) >4){ 
                       lblLCC.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLCC.setText(" ");
                     
                     String strC= txtQuantC.getText();
                      
                     quant= Integer.parseInt(strC);
                     
                     v= quant * 5.00;
                     
                     vT= v;
                     
                     String strc= String.valueOf(vT);
                     
                     txtResC.setText("R$: "+strc);
                     
                      p.setValorTotal(Double.parseDouble(txtResC.getText()));}}
                     
                            // suco de laranja //          
                      if(chbSucoL.isSelected()){
                  String la= txtQuantLA.getText();
                                
                   if(la.isBlank() || la.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantLA.getText()) >4){ 
                       lblLCC1.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLCC1.setText(" ");
                     
                     String strL= txtQuantLA.getText();
                      
                     quant= Integer.parseInt(strL);
                     
                     v= quant * 3.50;
                     
                     vT= v;
                     
                     String strLa= String.valueOf(vT);
                     
                     txtResLA.setText("R$: "+strLa);
                   
                      p.setValorTotal(Double.parseDouble(txtResLA.getText()));}}
                   
                      //suco de limão//
             if(chbSucoLi.isSelected()){
                  String li= txtQuantL.getText();
                                
                   if(li.isBlank() || li.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantL.getText()) >4){ 
                       lblLIM.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLIM.setText(" ");
                     
                     String strLi= txtQuantL.getText();
                      
                     quant= Integer.parseInt(strLi);
                     
                     v= quant * 3.50;
                     
                     vT= v;
                     
                     String strV= String.valueOf(vT);
                     
                     txtResLi.setText("R$: "+strV);
                   
                      p.setValorTotal(Double.parseDouble(txtResLi.getText()));
             
                            pDao.cadastrarPedido(p);
             }
                   
             // suco de maracujá //
          if(chbSucoM.isSelected()){
                  String pc= txtQuantM.getText();
                                
                   if(pc.isBlank() || pc.isEmpty()){
                       JOptionPane.showMessageDialog(null," marca  quantidade de lanches  vc quer ou desmarque esse lanche");}
                   
                   else if(Integer.parseInt(txtQuantM.getText()) >4){ 
                       lblLMJ.setText("VC SÓ PODE PEDIR 4 DESSE LANCHE");}
                   
                   else{
                     lblLMJ.setText(" ");
                     
                     String strM= txtQuantM.getText();
                      
                     quant= Integer.parseInt(strM);
                     
                     v= quant * 3.50;
                     
                     vT= v;
                     
                     String strMa= String.valueOf(vT);
                     
                     txtResMj.setText("R$: "+strMa);
                   
                      p.setValorTotal(Double.parseDouble(txtResMj.getText()));}}
          
                       pDao.cadastrarPedido(p);
          }}
                          
          catch(Exception e){
              System.out.println("erro: "+e.getMessage());}}}
