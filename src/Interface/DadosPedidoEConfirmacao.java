/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import dao.CarrinhoDAO;
import dao.Conexao;
import dao.PedidosDAO;
import model.Cliente;
import model.Produto;

/**
 *
 * @author leope
 */
public class DadosPedidoEConfirmacao extends javax.swing.JFrame {
    private Cliente cliente;
    private double valorSemFrete;
    private double frete;
    private ArrayList<Produto> carrinho;
    private ArrayList<Integer> quantidades;

    /**
     * Creates new form DadosPedidoEConfirmacao
     */
    public DadosPedidoEConfirmacao(Cliente cliente, ArrayList<Produto> carrinho,ArrayList<Integer> quantidades, double valorSemFrete, double frete) {
        initComponents();
        this.cliente = cliente;
        this.valorSemFrete = valorSemFrete;
        this.frete = frete;
        this.carrinho = carrinho;
        this.quantidades = quantidades;

        enderecoCliente.setText(cliente.getEndereco());
        nomeCliente.setText(cliente.getNome());
        emailCliente.setText(cliente.getEmail());
        valorCarrinho.setText(Double.toString(valorSemFrete));
        valorFreteCarrinho.setText(Double.toString(frete));
        valorComFreteCarrinho.setText(Double.toString(valorSemFrete+frete));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enderecoCliente = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JLabel();
        emailCliente = new javax.swing.JLabel();
        valorCarrinho = new javax.swing.JLabel();
        valorFreteCarrinho = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valorComFreteCarrinho = new javax.swing.JLabel();
        confirmarPedido = new javax.swing.JButton();
        cancelarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Confirmação de Pedido");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("endereço:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("nome:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("email:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("valor:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("frete:");

        enderecoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enderecoCliente.setText("default");

        nomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeCliente.setText("default");

        emailCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailCliente.setText("default");

        valorCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valorCarrinho.setText("default");

        valorFreteCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valorFreteCarrinho.setText("default");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("valor com frete:");

        valorComFreteCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valorComFreteCarrinho.setText("default");

        confirmarPedido.setText("Confrimar Pedido");
        confirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    confirmarPedidoActionPerformed(evt);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        cancelarPedido.setText("Cancelar");
        cancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorFreteCarrinho))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorCarrinho))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(enderecoCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valorComFreteCarrinho))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enderecoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailCliente))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(valorCarrinho))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valorFreteCarrinho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(valorComFreteCarrinho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarPedido)
                    .addComponent(cancelarPedido))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_confirmarPedidoActionPerformed
        Connection conexao = new Conexao().getConnection();
        PedidosDAO pedidosDAO = new PedidosDAO(conexao);
        CarrinhoDAO carrinhoDAO = new CarrinhoDAO(conexao);
        

        for (int i = 0; i < carrinho.size(); i++) {
            pedidosDAO.insertPedido(cliente, carrinho.get(i), quantidades.get(i), "PENDENTE");
            carrinhoDAO.deleteProdutoCarrinhe(cliente,carrinho.get(i));
        }

        JOptionPane.showMessageDialog(null, "Pedido feito. \n Status: PENDENTE");
        this.dispose();
        
        
    }//GEN-LAST:event_confirmarPedidoActionPerformed

    private void cancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarPedidoActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarPedidoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DadosPedidoEConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosPedidoEConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosPedidoEConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosPedidoEConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosPedidoEConfirmacao(null, null,null, ABORT, ABORT).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarPedido;
    private javax.swing.JButton confirmarPedido;
    private javax.swing.JLabel emailCliente;
    private javax.swing.JLabel enderecoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel nomeCliente;
    private javax.swing.JLabel valorCarrinho;
    private javax.swing.JLabel valorComFreteCarrinho;
    private javax.swing.JLabel valorFreteCarrinho;
    // End of variables declaration//GEN-END:variables
}
