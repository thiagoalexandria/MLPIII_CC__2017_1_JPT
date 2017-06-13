/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import modelo.RegistroPedidosm;

/**
 *
 * @author ph125
 */
public class Excessao2 extends Exception {
    
    RegistroPedidosm c = new RegistroPedidosm();
      int c2 =  c.getId();
    
    
    public Excessao2 ( int c2 ){
        super();
        this.c = c;
        
    }
    public String toString(){
        return " nao pode ter dois veiculos com o mesmo codigo ";
    }
    
    
}
