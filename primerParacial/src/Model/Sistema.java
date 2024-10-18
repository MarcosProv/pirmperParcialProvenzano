package Model;

import java.util.ArrayList;

public class Sistema {

    private ArrayList<Servicio> listServicios;

    public Sistema() {
        listServicios = new ArrayList<>();
    }
    
    public Servicio traerServicio(String codServicio){
        Servicio retorno = null;
        for(Servicio servicio: listServicios){
            if(servicio.compararCodigo(codServicio)){
                retorno = servicio;
                break;
            }   
        }
        return retorno;
    }
    
    public ArrayList<Servicio> traerServicio(boolean enPromocion){
        ArrayList<Servicio> listaRetorno = new ArrayList<>();
        for (Servicio servicio : listServicios) {
            if (servicio.preguntarPromocion()) {
                listaRetorno.add(servicio);
            }
        }
        return listaRetorno;
    }
}
    
    
