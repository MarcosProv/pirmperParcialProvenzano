//Provenzano Marcos
//Div 122
package Model;

import java.time.LocalDate;

public abstract class Servicio {

    protected String codServicio;
    protected double porcentajDeDescuento;
    protected boolean enPromocion;

    public Servicio(String codServicio, double porcentajDeDescuento) {
        this.codServicio = crearCodigo(codServicio);
        this.porcentajDeDescuento = porcentajDeDescuento;
    }

    private String crearCodigo(String codigo) {
        String retorno;
        try {
            if (codigo.length() != 6 || codigo == null) {
                throw new IllegalArgumentException("Cantidad de caracteres invalida");
            } else {
                retorno = codigo;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            retorno = codigo;
        }
        return retorno;
    }

    abstract double calcularPrecioFinal();

    public boolean compararCodigo(String codigo) {
        boolean retorno = false;
        if (codigo.equals(codServicio)) {
            retorno = true;
        }
        return retorno;
    }

    public boolean preguntarPromocion() {
        return enPromocion;
    }

}
