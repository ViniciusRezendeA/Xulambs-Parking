import controllers.VagaController;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VagaControllerTest {

    private VagaController vagaController;


    @Before
    public void setUp() {
        // Create a new VagaController instance (if your GUI framework supports it)
        vagaController = new VagaController();
    }

    @Test
    public void testShowAllVagas() {
        // Simulate clicking the "Mostrar todas" button
        vagaController.setShowFilter(true);
        vagaController.getView().getBtnGetVagas().doClick();

        // Assert that the button text has changed
        assertEquals("Mostrar vagas disponiveis", vagaController.getView().getBtnGetVagas().getText());

    }

    @Test
    public void testShowAvailableVagas() {
        // Simulate clicking the "Mostrar vagas disponiveis" button
        vagaController.setShowFilter(false);
        vagaController.getView().getBtnGetVagas().doClick();

        // Assert that the button text has changed
        assertEquals("Mostrar todas", vagaController.getView().getBtnGetVagas().getText());

    }

    // Additional methods for GUI testing as needed
    // You'll need to implement methods to interact with the GUI and assert conditions
}