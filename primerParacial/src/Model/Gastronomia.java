
package Model;

public class Gastronomia extends Servicio {
    private String gastronomia;
    private double precio;
    private int diaSemDesc;

    public Gastronomia(String gastronomia, double precio, int diaSemDesc, String codServicio, double porcentajDeDescuento) {
        super(codServicio, porcentajDeDescuento);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }
    
    //falta funcionalidad por el dia de la semana
    double calcularPrecioFinal() {
        double precioFinal = precio;
        if (enPromocion) {
            precioFinal = precio - ((this.porcentajDeDescuento / 2) * precio / 100);

        }
        return precioFinal;
    }
}
