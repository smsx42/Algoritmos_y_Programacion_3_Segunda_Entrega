package Climas;

import Pokemones.Cualidades;

import static org.fiuba.algoritmos3.Constantes.CLIMA_TORMENTA_DE_ARENA;
import static org.fiuba.algoritmos3.Constantes.PORCENTAJE_DANIO_CLIMA_ABRASIVO;

public class ClimaTormentaArena extends Clima{

    public ClimaTormentaArena(){
        this.nombre = CLIMA_TORMENTA_DE_ARENA;
    }

    @Override
    public void aplicarEfectoClima(Cualidades cualidades) {

        cualidades.getTipo().calcularMultiplicadorClima(this.nombre);
        if(cualidades.getTipo().verSiEsAbrasivo(this.nombre)){
            cualidades.recibirDanio(cualidades.getVidaMaxima() * PORCENTAJE_DANIO_CLIMA_ABRASIVO);
        }
    }
}
