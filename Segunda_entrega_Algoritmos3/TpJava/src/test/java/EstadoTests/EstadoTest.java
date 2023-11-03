package EstadoTests;

import Estados.Estado;
import Estados.EstadoConfuso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {

    @Test
    public void testDebeSerEliminado() {
        //Arrange
        EstadoConfuso estado = new EstadoConfuso();
        //Act
        //Assert
        assertFalse(estado.debeSerEliminado());
    }
}