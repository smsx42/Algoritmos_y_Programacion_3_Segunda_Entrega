package view.PokemonesView;

import Pokemones.Habilidad;
import Pokemones.Pokemon;
import Tipo.Tipo;

import java.util.HashMap;
import java.util.Map;

import static org.fiuba.algoritmos3.Constantes.ANSI_GRISCLARO;
import static org.fiuba.algoritmos3.Constantes.ANSI_RESET;

public class PokemonView {

    private Pokemon pokemon;
    private CualidadesView cualidadesView;

    private CualidadesFactory cualidadesFactory;

    private Map<String, HabilidadView> habilidadesView;

    private HabilidadFactory habilidadFactory;


    public PokemonView(Pokemon pokemon){

        this.pokemon = pokemon;
        this.cualidadesFactory = new CualidadesFactory();
        this.cualidadesView = cualidadesFactory.createCualidadesView(pokemon.getCualidades());
        this.habilidadesView = new HashMap<String, HabilidadView>();
        this.habilidadFactory = new HabilidadFactory();
        pokemon.getMisHabilidades().forEach((k, v) -> habilidadesView.put(k, this.habilidadFactory.createHabilidadView(v)));
    }

    public void mostrar(){
        System.out.println(" Nombre: " + ANSI_GRISCLARO + this.pokemon.getNombre() + ANSI_RESET);
        this.cualidadesView.mostrar();
        System.out.println(" Historia: " + this.pokemon.getHistoria());
        System.out.println("\n");
    }

    public Tipo getTipoPokemon(){
        return this.pokemon.getTipo();
    }

    public String getNombre(){
        return this.pokemon.getNombre();
    }

    public void mostrarHabilidades() {
        this.habilidadesView.forEach((k, v) -> v.mostrar());
    }

    private void mostrarUsoDeHabilidad(String nombrePokemon, String nombreHabilidad){
        System.out.println(ANSI_GRISCLARO + "¡"+ nombrePokemon + " uso " + nombreHabilidad + "!" + ANSI_RESET +"\n");
    }

    public void mostrarCasoSePuedeAtacar(Pokemon pokemon, Pokemon pokemonEnemigo, Habilidad habilidad){

        HabilidadView habilidadViewAux = this.habilidadFactory.createHabilidadView(habilidad);

        if (this.cualidadesView.atacarConEstadosActuales()){
            this.mostrarUsoDeHabilidad(pokemon.getNombre(), habilidad.getNombre());
            habilidadViewAux.mostrarUsarHabilidad(pokemonEnemigo.getCualidades(), pokemon.getCualidades());
        }
    }

    public void mostrarEfectoPasivo(){
        this.cualidadesView.getEstadosActualesView().forEach(estadoView -> estadoView.mostrarEfectoPasivoDeEstado());
    }
}