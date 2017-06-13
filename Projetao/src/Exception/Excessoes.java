/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;
import modelo.ColetandoCliente;
/**
 *
 * @author ph125
 */
public class Excessoes extends Exception {
    ColetandoCliente c = new ColetandoCliente();
    String c1  = c.getCpf();
    
 
    public Excessoes ( String c1){
        super();
        this.c1 = c1;
    }
    
    public String toString(){
        
        return " Não é permitido o mesmo CPF ";
    }
    
    
}

