package view.EstadosView;

import Estados.EstadoNormal;

public class EstadoNormalView extends EstadoView{

    private EstadoNormal estadoNormal;

    public EstadoNormalView(EstadoNormal estadoNormal){
        super(estadoNormal);
        this.estadoNormal = estadoNormal;
    }

    @Override
    public boolean mostrar() {
        return true;
    }

    public void mostrarEfectoPasivoDeEstado(){
    }
}
