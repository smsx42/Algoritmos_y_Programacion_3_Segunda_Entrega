package view.ClimasView;

import Climas.Clima;
import view.PokemonesView.PokemonView;

public class ClimaTorementaArenaView extends ClimaView{

    public ClimaTorementaArenaView(Clima clima){
        super(clima);
    }

    @Override
    public void mostrar(PokemonView pokemonView) {
        System.out.println(this.clima.getNombre() + ": Suma 10% al poder total del tipo Tierra y Roca, y resta 3% de la vida al resto de los tipos.");
        mostrarAplicarEfecto(pokemonView);
        if(pokemonView.getTipoPokemon().verSiEsAbrasivo(this.clima.getNombre())){
            System.out.println("LA VIDA DEL POKEMON SE REDUCE UN 3%.");
        }
    }
}
