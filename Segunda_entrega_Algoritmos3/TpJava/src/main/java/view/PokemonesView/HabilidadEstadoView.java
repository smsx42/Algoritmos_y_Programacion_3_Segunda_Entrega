package view.PokemonesView;
import Pokemones.Cualidades;
import Pokemones.HabilidadEstado;

import static org.fiuba.algoritmos3.Constantes.*;

public class   HabilidadEstadoView extends HabilidadView{

    private HabilidadEstado habilidadEstado;

    public HabilidadEstadoView(HabilidadEstado habilidadEstado){
        super(habilidadEstado);
        this.habilidadEstado = habilidadEstado;
    }

    public void mostrar(){
        System.out.println("Nombre: " + ANSI_GRISCLARO + habilidadEstado.getNombre() + ANSI_RESET);
        System.out.println("Estado: " + habilidadEstado.getUnEstado().getNombreConColor());
        System.out.println("Cantidad de usos: " + ANSI_GRISCLARO +habilidadEstado.getCantidadDeUsos() + ANSI_RESET);
        System.out.println("\n");
    }

    public void mostrarUsarHabilidad(Cualidades cualiadesPokemonActual, Cualidades cualidadesPokemonEnemigo){

        System.out.println(ANSI_GRISCLARO + "La habilidad " + this.habilidadEstado.getNombre() + " aplica el estado " +  habilidadEstado.getUnEstado().getNombreConColor() + ANSI_RESET);

    }
}
