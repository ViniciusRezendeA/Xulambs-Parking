import models.Vaga;
import org.junit.Before;
import org.junit.Test;
import repositories.VagaRepository;
import services.VagaService;
import java.util.ArrayList;

import static org.junit.Assert.*;
public class VagaServiceTest {

    private VagaService vagaService;
    private VagaRepository mockVagaRepository;

    @Before
    public void setUp() {
        mockVagaRepository = new VagaRepository(new ArrayList<>());
        vagaService = new VagaService(mockVagaRepository);
    }

    @Test
    public void testRegisterVagasUnderMaxCapacity() {
        vagaService.registerVagas(10);  // Register 10 parking spaces

        assertEquals(10, mockVagaRepository.findAllElements().size());

        // Check the first parking space
        Vaga vagaA0 = (Vaga)  mockVagaRepository.findAllElements().get(0);

        char index = vagaA0.getId().toCharArray()[1];
        char letter = vagaA0.getId().toCharArray()[0];
        assertEquals('A', letter);
        assertEquals('0', index);

        // Check the last parking space
        Vaga vagaA9 = (Vaga) mockVagaRepository.findAllElements().get(9);
        index = vagaA9.getId().toCharArray()[1];
        letter = vagaA9.getId().toCharArray()[0];
        assertEquals('A', letter);
        assertEquals('9', index);
    }


}