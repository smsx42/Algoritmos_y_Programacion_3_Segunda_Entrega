package Estados;
import static org.fiuba.algoritmos3.Constantes.*;

public class EstadoInhabilitado extends Estado{

    public EstadoInhabilitado(){
        this.nombre = ESTADO_INHABILITADO;
        this.color = ANSI_FONDO_ROJO + ANSI_FONDO_NEGRO;
    }
    @Override
    public boolean puedeAtacar(){
        return false;
    }
    @Override
    public void aplicarEfectoPasivoDeEstado(){
        System.out.println("El pokemon actual esta inhabilitado.");
    }
}
