
package pacoteViewLanchonete;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import pacoteLanchonete.pedidos;
import pacoteLanchoneteDAO.pedidosDao;

public class telaEntregaEsp extends javax.swing.JFrame {
            pedidos p= new pedidos();

        telaEntregaEsp() {
        initComponents();
        
    }
         
          public void atalhoF(){
             btnFinalizar.setMnemonic(KeyEvent.VK_F);
            }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRecado = new javax.swing.JTextArea();
        txtAviso = new javax.swing.JLabel();
        txtNomeEsp = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPedido = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEnd = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setText("NOME DA PESSOA QUE VC QUER QUE ENTREGAMOS:");
        jLabel1.setToolTipText("NOME DA PESSOA QUE VC QUER QUE ENTREGAMOS:");

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel2.setText("DIGITE O ENDEREÇO DO(A)  TAL PESSOA:");
        jLabel2.setToolTipText("DIGITE O ENDEREÇO DO(A)  TAL PESSOA:");

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel4.setText("DIGITE O RECADINHO:");
        jLabel4.setToolTipText("DIGITE O RECADINHO");

        txtRecado.setColumns(20);
        txtRecado.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        txtRecado.setRows(5);
        txtRecado.setToolTipText("DIGITE UM RECADINHO QUE VC QUER QUE ESCREVAMOS PRA ELE(A). SEJE AMIGÁVEL AO ESCREVER O RECADO");
        txtRecado.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtRecadoCaretUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(txtRecado);

        txtAviso.setForeground(new java.awt.Color(255, 51, 51));

        txtNomeEsp.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        txtNomeEsp.setToolTipText("DIGITE O NOME DA PESSOA PRA FAZER A ENTREGA");
        txtNomeEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEspActionPerformed(evt);
            }
        });

        btnFinalizar.setBackground(new java.awt.Color(255, 102, 102));
        btnFinalizar.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        btnFinalizar.setMnemonic('F');
        btnFinalizar.setText("FINALIZAR PEDIDO");
        btnFinalizar.setToolTipText("CLIQUE PARA FINALIZAR A ENTREGA");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel5.setText("DIGITE DOS LANCHES PEDIDO É O DA PESSOA:");
        jLabel5.setToolTipText("DIGITE O RECADINHO");

        txtEnd.setColumns(20);
        txtEnd.setRows(5);
        jScrollPane3.setViewportView(txtEnd);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(786, 786, 786)
                        .addComponent(btnFinalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(txtAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1219, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(736, 736, 736))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
      String nome= txtNomeEsp.getText(); 
      String end= txtEnd.getText();
      String r= txtRecado.getText();
      String lanche= txtPedido.getText();
      
      pedidos p= new pedidos();
      
      p.setNome_recado(nome);
      p.setEnd_recado(end);
      p.setLancheEsp(lanche);
      p.setRecado(r);
      
        pedidosDao plDao= new pedidosDao();
        plDao.cadastrarPedidoEsp(p);
        
        JOptionPane.showMessageDialog(null,"Haa! Pode ter certeza de q o(a): " +txtNomeEsp.getText()+ " vai gostar dessa entrega surpresa ;)");
        
        atalhoF();
       
         telaResumo tr= new telaResumo();
         tr.setVisible(true);
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtNomeEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEspActionPerformed
        
    }//GEN-LAST:event_txtNomeEspActionPerformed

    private void txtRecadoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtRecadoCaretUpdate
      String r= txtRecado.getText();
      
        if( r.startsWith("idiota") || r.startsWith("diota")|| r.startsWith("idiotinha")|| r.endsWith("idiota") || r.endsWith("idiontinha") ){ 
      
        txtAviso.setText("POR FAVOR Ñ ESCREVA PALAVRAS RUDES, OU OFENSIVAS OU OBSENAS PRA PESSOA QUE"
                + "VAMOS FAZER A ENTREGA ESPECIAL. CASO Ñ SIGA NOSSAS REGRAS, TEREMOS QUE CANCELAR A ENTREGA ESPECIAL");}
        
        else{
            txtAviso.setText("");}
         
    }//GEN-LAST:event_txtRecadoCaretUpdate

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaEntregaEsp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel txtAviso;
    private javax.swing.JTextArea txtEnd;
    private javax.swing.JTextField txtNomeEsp;
    private javax.swing.JTextField txtPedido;
    private javax.swing.JTextArea txtRecado;
    // End of variables declaration//GEN-END:variables
}
