/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.mundopc;

/**
 *
 * @author lepo9
 */
public class Teclado extends DispositivoEntrada {

    private final int idTeclado;//Pertenece solo a objetos de tipo raton
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {

        super(tipoEntrada, marca);

        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTecladp=").append(idTeclado);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
