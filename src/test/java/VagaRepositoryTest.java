import models.Vaga;
import org.junit.Before;
import org.junit.Test;
import repositories.VagaRepository;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class VagaRepositoryTest {

    private VagaRepository vagaRepository;
    private List<Vaga> vagaList;

    @Before
    public void setUp() {
        vagaList = new ArrayList<>();
        // Create and add Vaga objects to the list, some available and some occupied
        vagaList.add(new Vaga('A', 1, true));
        vagaList.add(new Vaga('A', 2, false));
        vagaList.add(new Vaga('A', 3, true));
        vagaList.add(new Vaga('B', 1, false));

        vagaRepository = new VagaRepository(vagaList);
    }

    @Test
    public void testGetVagasDisponiveis() {
        List<Vaga> availableVagas = vagaRepository.getVagasDisponiveis();

        assertEquals(2, availableVagas.size());  // Check the number of available parking spaces
        assertTrue(availableVagas.contains(new Vaga('A', 1, true)));  // Check if the available spaces are in the result
        assertTrue(availableVagas.contains(new Vaga('A', 3, true)));
    }
}