/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import fachada.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ColetandoCliente;
import modelo.ColetandoCarro;
import modelo.ColetandoMoto;
import modelo.RegistroPedidos;
import modelo.RegistroPedidosm;

/**
 *
 * @author ph125
 */
public class SalvaBanco {
    
    public void create(ColetandoCliente c){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente(nome,telefone,email,rua,bairro,cidade,numero,uf,cpf)VALUE(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTelefone());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getRua());
            stmt.setString(5, c.getBairro());
            stmt.setString(6, c.getCidade());
            stmt.setString(7, c.getNumero());
            stmt.setString(8, c.getUf());
            stmt.setString(9, c.getCpf());
           
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Cadastro salvo com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
    
    public void create(ColetandoCarro v){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO carro(codigo, marca, modelo, preco)VALUE(?,?,?,?,?)");
            stmt.setInt(1, v.getCodigo());
            stmt.setString(2, v.getMarca());
            stmt.setString(3, v.getModelo());
            //stmt.setString(4, v.getModelo());
            stmt.setDouble(4, v.getPreco());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
        }}
        
    public void create(ColetandoMoto m){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO moto(codigom, marcam, modelom, precom)VALUE(?,?,?,?)");
            stmt.setInt(1, m.getCodigom());
            stmt.setString(2, m.getMarcam());
            stmt.setString(3, m.getModelom());
            //stmt.setString(4, m.getModelom());
            stmt.setDouble(4, m.getPrecom());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
    
    
    public List<ColetandoCarro> listar(){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ColetandoCarro> car = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM carro ");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                
                ColetandoCarro cc = new ColetandoCarro();
                cc.setCodigo(rs.getInt("codigo"));
                cc.setMarca(rs.getString("marca"));
                cc.setModelo(rs.getString("modelo"));
                cc.setPreco(rs.getDouble("preco"));
                car.add(cc);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            ConexaoBanco.closeConnection(con, stmt, rs);
        }
        return car;
    }
        
        public List<RegistroPedidos> listarpc(){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<RegistroPedidos> car = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pedidoc ");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                
                RegistroPedidos cc = new RegistroPedidos();
                cc.setId(rs.getInt("id"));
                cc.setMarcarro(rs.getString("marcacarro"));
                cc.setModelocarro(rs.getString("modelocarro"));
                cc.setCodcarro(rs.getString("codcarro"));
                car.add(cc);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            ConexaoBanco.closeConnection(con, stmt, rs);
        }
        return car;
    }
    
        
        public List<RegistroPedidosm> listarpm(){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<RegistroPedidosm> moto = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM pedidom ");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                
                RegistroPedidosm cc = new RegistroPedidosm();
                cc.setId(rs.getInt("id"));
                cc.setMarmoto(rs.getString("marcamoto"));
                cc.setModelomoto(rs.getString("modelomoto"));
                cc.setCodmoto(rs.getString("codmoto"));
                moto.add(cc);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            ConexaoBanco.closeConnection(con, stmt, rs);
        }
        return moto;
    }
    
    
    
    
    
    
    
    
    
        
         public List<ColetandoMoto> listarm(){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ColetandoMoto> moto = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM moto ");
            rs = stmt.executeQuery(); 
            
            while(rs.next()){
                
                ColetandoMoto cc = new ColetandoMoto();
                cc.setCodigom(rs.getInt("codigom"));
                cc.setMarcam(rs.getString("marcam"));
                cc.setModelom(rs.getString("modelom"));
                cc.setPrecom(rs.getDouble("precom"));
                moto.add(cc);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            
            ConexaoBanco.closeConnection(con, stmt, rs);
        }
        return moto;
    
    }
        
         
         public void create(RegistroPedidos r){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO pedidoc(id,marcacarro,modelocarro,codcarro)VALUE(?,?,?,?)");
            stmt.setInt(1, r.getId());
            //stmt.setString(2, r.getNomeinquilino());
            stmt.setString(2, r.getMarcarro());
            stmt.setString(3, r.getModelocarro());
            stmt.setString(4, r.getCodcarro());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
         
         public void create(RegistroPedidosm m){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO pedidom(id,marcamoto,modelomoto,codmoto)VALUE(?,?,?,?)");
            stmt.setInt(1, m.getId());
            //stmt.setString(2, r.getNomeinquilino());
            stmt.setString(2, m.getMarmoto());
            stmt.setString(3, m.getModelomoto());
            stmt.setString(4, m.getCodmoto());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
         
         
         public void update(RegistroPedidosm r){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("UPDATE pedidom SET marcamoto = ?,modelomoto = ?, codmoto = ? WHERE Id = ?");
            //stmt.setInt(1, r.getId());
            //stmt.setString(2, r.getNomeinquilino());
            stmt.setString(1, r.getMarmoto());
            stmt.setString(2, r.getModelomoto());
            stmt.setString(3, r.getCodmoto());
            stmt.setInt(4, r.getId());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Atualizado com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
         
         
         
         
         public void delete(RegistroPedidosm r){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM pedidom  WHERE Id = ?");
            
            stmt.setInt(1, r.getId());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
         
         
         
         public void deletec(RegistroPedidos r){
        
        Connection con = ConexaoBanco.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("DELETE FROM pedidoc  WHERE Id = ?");
            
            stmt.setInt(1, r.getId());
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Excluido com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao Excluir: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
         
         
         
         
         
    
         /*public void pegarnome(){
             Connection con = ConexaoBanco.getConnection();
             PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO pedidoc(codigo, cpf) SELECT MAX(codigo, cpf) FROM carro, cliente");
            
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Cadastro salvo com sucesso!");
                    
                    } catch (SQLException ex) {
            Logger.getLogger(SalvaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao salvar: "+ex); 
        }finally{
            ConexaoBanco.closeConnection(con, stmt);
         }

         }*/
}
    
    
    

    
    
   

