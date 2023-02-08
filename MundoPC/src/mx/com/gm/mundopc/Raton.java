/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.mundopc;

/**
 *
 * @author lepo9
 */
public class Raton extends DispositivoEntrada {

    private final int idRaton;//Pertenece solo a objetos de tipo raton
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca) {

        super(tipoEntrada, marca);

        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
