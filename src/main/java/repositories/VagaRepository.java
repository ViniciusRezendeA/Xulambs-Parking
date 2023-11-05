package repositories;
import models.Vaga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class VagaRepository extends Repository {
    public VagaRepository(List list) {
        super(list);
    }

    public List<Vaga> getVagasDisponiveis(){
        List<Vaga> availableVagas = new ArrayList<>();
        System.out.println(list.size());
        for (Object vaga : list) {
            Vaga v = (Vaga) vaga;
            if (v.disponivel()) {
                availableVagas.add((Vaga) vaga);
            }
        }
        System.out.println(availableVagas.size());
        return availableVagas;
    }
}
