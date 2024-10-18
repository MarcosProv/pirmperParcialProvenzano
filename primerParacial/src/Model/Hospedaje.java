//Provenzano Marcos
//Div 122
package Model;

import java.time.LocalDate;

public class Hospedaje extends Servicio {
    private String hospedaje;
    private double precioPorNoche;

    public Hospedaje(String codServicio, double porcentajDeDescuento, String hospedaje, double precioPorNoche){
        super(codServicio, porcentajDeDescuento);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }
    
    
    double calcularPrecioFinal() {
        double precioFinal = precioPorNoche;
        if (enPromocion) {
            precioFinal = precioPorNoche - ((this.porcentajDeDescuento / 2) * precioPorNoche / 100);

        }
        return precioFinal;
    }

  
    
    
}
