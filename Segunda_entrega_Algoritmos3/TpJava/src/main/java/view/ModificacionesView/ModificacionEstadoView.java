package view.ModificacionesView;

import Modificaciones.Modificacion;
import Pokemones.Cualidades;

import static org.fiuba.algoritmos3.Constantes.ANSI_RESET;
import static org.fiuba.algoritmos3.Constantes.ANSI_ROJO;

public class ModificacionEstadoView extends ModificacionView{

    public ModificacionEstadoView(Modificacion unaModificacion){
        super(unaModificacion);
    }

    public void mostrar(Cualidades unaCualidad){

        if(!unaCualidad.estaConsciente()) {
            System.out.println(" ");
            System.out.println(ANSI_ROJO + "No se puede aplicar este item a un Pokemon Inhabilitado o Normal." + ANSI_RESET);
        }
    }

}
