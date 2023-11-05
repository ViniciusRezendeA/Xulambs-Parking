package controllers;

import models.Vaga;
import repositories.VagaRepository;
import services.VagaService;
import views.ViewVagas;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Iterator;

public class VagaController {
    private ViewVagas view;
    private VagaRepository vagaRepository = new VagaRepository(new ArrayList<>());

    private VagaService vagaService = new VagaService(vagaRepository);

    public VagaController() {
        this.view = new ViewVagas();
        carregaTabela(false);
        setupListener();
    }

    public void setupListener() {
        this.view.getBtnGetVagas().addActionListener((e -> {
                this.view.getBtnGetVagas().setText("Mostrar todas");
                carregaTabela(true);
        }));
    }

    private void carregaTabela(Boolean onlyDisponivel) {
        vagaService.registerVagas(50);
        Object colunas[] = {"Vaga", "Disponivel"};
        DefaultTableModel tm = new DefaultTableModel(colunas, 0);
        Iterator<Vaga> it;
        tm.setNumRows(0);
        if (onlyDisponivel) {
            it = vagaRepository.getVagasDisponiveis().iterator();
        } else {
            it = vagaRepository.findAllElements().iterator();
        }
        ;
        while (it.hasNext()) {
            Vaga v = it.next();
            String vaga = v.toString();
            String linha[] = vaga.split("%");
            tm.addRow(new Object[]{linha[0], linha[1]});
        }
        System.out.println(tm.getRowCount());
        view.getTbVagas().setModel(tm);
    }
}
