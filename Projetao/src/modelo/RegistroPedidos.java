/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import persistencia.SalvaBanco;
/**
 *
 * @author ph125
 */
public class RegistroPedidos {
    int  id;
    String nomeinquilino, marcarro, modelocarro, codcarro;


    public String getCodcarro() {
        return codcarro;
    }

    public void setCodcarro(String codcarro) {
        this.codcarro = codcarro;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNomeinquilino() {
        return nomeinquilino;
    }

    public void setNomeinquilino(String nomeinquilino) {
       
        this.nomeinquilino = nomeinquilino;
    }

    public String getMarcarro() {
        return marcarro;
    }

    public void setMarcarro(String marcarro) {
        this.marcarro = marcarro;
    }

    public String getModelocarro() {
        return modelocarro;
    }

    public void setModelocarro(String modelocarro) {
        this.modelocarro = modelocarro;
    }
    
}
