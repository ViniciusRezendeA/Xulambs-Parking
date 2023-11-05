import models.Vaga;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VagaModelTest {

    private Vaga vaga;

    @Before
    public void setUp() {
        vaga = new Vaga('A', 1);  // Create a parking space with row 'A' and number 1
    }

    @Test
    public void testEstacionar() {
        assertTrue(vaga.disponivel());  // Initially, the parking space should be available

        vaga.estacionar();  // Park in the space
        assertFalse(vaga.disponivel());  // Now, the parking space should be occupied
    }

    @Test
    public void testSair() {
        vaga.estacionar();  // Park in the space
        assertFalse(vaga.disponivel());  // Parking space is occupied

        vaga.sair();  // Exit the space
        assertTrue(vaga.disponivel());  // Now, the parking space should be available again
    }
}

