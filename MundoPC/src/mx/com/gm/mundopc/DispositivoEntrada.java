/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.mundopc;

/**
 *
 * @author lepo9
 */
public class DispositivoEntrada {

    private String tipopEntrada;
    private String marca;
    
    public DispositivoEntrada(String tipoEntrada, String marca){
    
        this.tipopEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipopEntrada() {
        return this.tipopEntrada;
    }

    public void setTipopEntrada(String tipopEntrada) {
        this.tipopEntrada = tipopEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada{");
        sb.append("tipopEntrada=").append(tipopEntrada);
        sb.append(", marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }
    
    
}
