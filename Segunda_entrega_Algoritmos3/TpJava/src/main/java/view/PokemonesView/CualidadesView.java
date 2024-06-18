package view.PokemonesView;

import Estados.Estado;
import Pokemones.Cualidades;
import view.EstadosView.EstadoFacory;
import view.EstadosView.EstadoView;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static org.fiuba.algoritmos3.Constantes.*;

public class CualidadesView {

    private Cualidades cualidades;

    private Set<EstadoView> estadosActualesView;

    private EstadoFacory estadoFacory;

    public CualidadesView(Cualidades cualidades){
        this.cualidades = cualidades;
        this.estadosActualesView = new HashSet<>();
        this.estadoFacory = new EstadoFacory();
        this.cualidades.getEstadosActuales().forEach(estado -> estadosActualesView.add(estadoFacory.createEstadoView(estado)));
    }

    public void mostrar(){
        System.out.println(" Tipo: " + this.cualidades.getTipo().getNombreConColor()); //Eliminar
        System.out.println(
                " Nivel: " + this.cualidades.getNivel() + " --" +
                        " HP: " + ANSI_ROJO + (int)this.cualidades.getVida() + ANSI_RESET + " --" +
                        " Velocidad: " + ANSI_AMARILLO + this.cualidades.getVelocidad() + ANSI_RESET + " --" +
                        " Defensa: " + ANSI_CELESTE + this.cualidades.getDefensa() + ANSI_RESET + " --"  +
                        " Ataque: " + ANSI_MARRON + this.cualidades.getAtaque() + ANSI_RESET);
        System.out.println(" Estado: ");
        this.cualidades.getEstadosActuales().forEach(estado -> {
            if(estado.getNombre() == "Inhabilitado" && this.cualidades.getEstadosActuales().size() == 1){
                System.out.println(" " + estado.getNombreConColor());
            }
            if(estado.getNombre() != "Normal" && this.cualidades.getEstadosActuales().size() > 1){
                System.out.println(" " + estado.getNombreConColor());
            }
            if(estado.getNombre() == "Normal" && this.cualidades.getEstadosActuales().size() == 1){
                System.out.println(" " + estado.getNombreConColor());
            }
        });
    }

    public boolean atacarConEstadosActuales(){
        return this.estadosActualesView.stream().allMatch(EstadoView::mostrar);
    }

    public Set<EstadoView> getEstadosActualesView(){
        return estadosActualesView;
    }

}
