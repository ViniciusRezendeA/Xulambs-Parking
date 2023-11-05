package models;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private String placa;
    private List<UsoDeVaga> usos;

    public Veiculo(String placa) {
        this.placa = placa;
        this.usos = new ArrayList<>();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<UsoDeVaga> getUsos() {
        return usos;
    }

    public void estacionar(Vaga vaga) {
        UsoDeVaga uso = new UsoDeVaga(vaga);
        usos.add(uso);
    }

    public double sair() {
        double totalArrecadado = 0.0;
        for (UsoDeVaga uso : usos) {
            totalArrecadado += uso.valorPago();
        }
        return totalArrecadado;
    }

    public double totalArrecadado() {
        return sair();
    }

    public double arrecadadoNoMes(int mes) {
        double totalArrecadadoNoMes = 0.0;
        for (UsoDeVaga uso : usos) {
            if (uso.getSaida().getMonth().getValue() == mes) {
                totalArrecadadoNoMes += uso.valorPago();
            }
        }
        return totalArrecadadoNoMes;
    }

    public int totalDeUsos() {
        return usos.size();
    }



}
