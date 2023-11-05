package services;

import models.Vaga;
import repositories.VagaRepository;


public class VagaService {
    private VagaRepository vagaRepository;

    public VagaService(VagaRepository vagaRepository) {
        this.vagaRepository = vagaRepository;
    }

    public void registerVagas(int numberOfVagas) {
        int initialLetter = 65;
        int maxParkingSpaces = 50;

        for (int i = 0; i < numberOfVagas; i++) {

            if (i > maxParkingSpaces) {
                initialLetter = initialLetter + 1;
            }
            if (initialLetter > 89) {
                break;
            }
            if (i > maxParkingSpaces) {
                numberOfVagas = numberOfVagas - i;
                i = 0;
            }

            vagaRepository.addElement(new Vaga((char) initialLetter, i));

        }
    }
}
