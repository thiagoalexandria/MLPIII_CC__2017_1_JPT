/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ph125
 */
public class RegistroPedidosm {
    int  id;
    String  marmoto, modelomoto, codmoto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarmoto() {
        return marmoto;
    }

    public void setMarmoto(String marmoto) {
        this.marmoto = marmoto;
    }

    public String getModelomoto() {
        return modelomoto;
    }

    public void setModelomoto(String modelomoto) {
        this.modelomoto = modelomoto;
    }

    public String getCodmoto() {
        return codmoto;
    }

    public void setCodmoto(String codmoto) {
        this.codmoto = codmoto;
    }
}
