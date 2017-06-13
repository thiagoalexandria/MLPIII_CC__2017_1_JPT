/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCase;

import junit.framework.TestCase;

import persistencia.SalvaBanco;

/**
 *
 * @author ph125
 */
public class SalvaBancoTest extends TestCase {
    SalvaBanco sb;
    protected void setUp() throws Exception {
     sb = new SalvaBanco();   
        
        
    }
    
    public void testCreate(){
        sb.listar();
        assertNotNull(sb);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
