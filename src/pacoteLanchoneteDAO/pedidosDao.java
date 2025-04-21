
package pacoteLanchoneteDAO;

import conexao.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pacoteLanchonete.cardapio;
import pacoteLanchonete.cliente;
import pacoteLanchonete.pedidos;

public class pedidosDao {
   private conectar conexao;
   private Connection conn;
   private PreparedStatement st;
   private ResultSet rs;
   
    public pedidosDao(){
        this.conexao= new conectar();
        this.conn= this.conexao.getConectar();}
    
    public void cadastrarCliente(cliente c){
        String sql="insert into cliente(nome,telefone,endereco) values"+ "(?,?,?)";
        
        try{
            PreparedStatement st= this.conn. prepareStatement(sql);
            
            st.setString(1,c.getNome());
            st.setString(2,c.getTelefone());
            st.setString(3, c.getEndereco());
            st.execute();}
        
        catch(Exception e){
            System.out.println("erro ao cadastrar os dados do cliente: "+e.getMessage());}}
    
    public void cadastrarPedido(pedidos p){
        String sql="insert into pedido (quantidade,observacao,valor_total,formaPagamento) values"+ "(?,?,?,?)";
        
        try{
            PreparedStatement st= this.conn.prepareStatement(sql);
            
            st.setInt(1, p.getQuantidade());
            st.setString(2,p.getObservacoes() );
            st.setDouble(3,p.getValorTotal());
            st.setString(4,p.getFormaPagamento());
            st.execute();}
    
        catch(Exception e){
            System.out.println("erro ao casdatrar o pedido: "+e.getMessage());}}
    
    
    public void cadastrarPedidoEsp(pedidos p){
        String sql="insert into entregaesp (nome_recado,end_recado,lanche_esp,recado) values"+ "(?,?,?,?)";
        
        try{
            PreparedStatement st= this.conn.prepareStatement(sql);
            
            st.setString(1, p.getNome_recado());
            st.setString(2, p.getEnd_recado());
            st.setString(3,p.getLancheEsp());
            st.setString(4, p.getRecado());
            st.execute();}
            
        catch(Exception e){
            System.out.println("erro ao casdatrar os dados da pessoa especial: "+e.getMessage());}}
    
         public List<cardapio> getCardapio(){
             String sql= "select*from cardapio";
             
             try{
                 PreparedStatement st= this.conn.prepareStatement(sql);
                 
                 ResultSet rs= st.executeQuery();
                 
                 List<cardapio> lista= new ArrayList<>();
                 
                 while(rs.next()){
                     cardapio c= new cardapio();
                     
                     c.setLanche(rs.getString("lanches"));
                     c.setDescricaoL(rs.getString("descricaoL"));
                     c.setPreçoL(rs.getDouble("preçosL"));
                     c.setBebidas(rs.getString("bebidas"));
                     c.setDecricaoB(rs.getString("descricaoB"));
                     c.setPreçoB(rs.getDouble("preçosB"));
                     
                     lista.add(c);}
                        return lista;}
             
             catch(Exception e){
                 System.out.println("erro ao exibir o cardapio: "+e.getMessage());}
                  return null;}

         public List<cliente> getExibirC(){
             String sql= "select*from cliente";
             
             try{
                 PreparedStatement st= this.conn.prepareStatement(sql);
                 
                 ResultSet rs= st.executeQuery();
                 
                 List<cliente> lista= new ArrayList<>();
                 
                 while(rs.next()){
                     cliente c= new cliente();
                     
                     c.setId(rs.getInt("id"));
                     c.setNome(rs.getString("nome"));
                     c.setTelefone(rs.getString("telefone"));
                     c.setEndereco(rs.getString("endereco"));
                     lista.add(c);}
                        return lista;}
             
             catch(Exception e){
                 System.out.println("erro ao exibir o cardapio: "+e.getMessage());}
                  return null;}
         
         public List<pedidos> getExibirP(){
             String sql= "select*from pedido";
             
             try{
                 PreparedStatement st= this.conn.prepareStatement(sql);
                 
                 ResultSet rs= st.executeQuery();
                 
                 List<pedidos> listaP= new ArrayList<>();
                 
                 while(rs.next()){
                     pedidos p= new pedidos();
                     
                     p.setQuantidade(rs.getInt("quantidade"));
                     p.setObservacoes(rs.getString("observacao"));
                     p.setValorTotal(rs.getDouble("valor_total"));
                     p.setFormaPagamento(rs.getString("formaPagamento"));
                     
                     listaP.add(p);}
                        return listaP;}
             
             catch(Exception e){
                 System.out.println("erro ao exibir o cardapio: "+e.getMessage());}
                  return null;}
         
        public List<pedidos> getExibirEsp(){
             String sql= "select*from entregaesp";
             
             try{
                 PreparedStatement st= this.conn.prepareStatement(sql);
                 
                 ResultSet rs= st.executeQuery();
                 
                 List<pedidos> listaEP= new ArrayList<>();
                 
                 while(rs.next()){
                     pedidos p= new pedidos();
                     
                     p.setNome_recado(rs.getString("nome_recado"));
                     p.setEnd_recado(rs.getString("end_recado"));
                     p.setLancheEsp(rs.getString("lanche_esp"));
                     p.setRecado(rs.getString("recado"));
                     
                     listaEP.add(p);}
                        return listaEP;}
             
             catch(Exception e){
                 System.out.println("erro ao exibir o cardapio: "+e.getMessage());}
                  return null;}
         }
