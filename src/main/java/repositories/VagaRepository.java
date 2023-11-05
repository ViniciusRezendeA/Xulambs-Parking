package repositories;
import models.Vaga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class VagaRepository extends Repository {
     List<Vaga> list;
    public VagaRepository(List list) {
        super(list);
    }

    public List<Vaga> getVagasDisponiveis(){
        List<Vaga> availableVagas = new ArrayList<>();

        for (Vaga vaga : list) {
            if (vaga.disponivel()) {
                availableVagas.add(vaga);
            }
        }

        return availableVagas;
    }
}
