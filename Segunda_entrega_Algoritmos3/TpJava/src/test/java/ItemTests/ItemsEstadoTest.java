package ItemTests;

import Item.Revivir;
import Modificaciones.ModificacionEstado;
import Modificaciones.ModificacionEstadoInhabilitado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemsEstadoTest {

    @Test
    public void testEsUnItemDeSoloCampoDeBatalla() {
        //Arrange
        ModificacionEstadoInhabilitado modificacion = new ModificacionEstadoInhabilitado();
        Revivir revivir = new Revivir("Revivir", 1, modificacion);
        //Act
        //Assert
        assertTrue(revivir.esUnItemDeSoloCampoDeBatalla());
    }
}