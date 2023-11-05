package models;

import java.util.Arrays;
import java.util.Objects;

public class Estacionamento {
    String nome;
    Cliente[] id;
    Vaga[] vagas;
    int quantFileiras;
    int vagasPorFileira;


    public Estacionamento(String nome, int fileiras, int vagasPorFileira) {
        this.nome = nome;
        this.quantFileiras = fileiras;
        this.vagasPorFileira = vagasPorFileira;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente[] getId() {
        return id;
    }

    public void setId(Cliente[] id) {
        this.id = id;
    }

    public Vaga[] getVagas() {
        return vagas;
    }

    public void setVagas(Vaga[] vagas) {
        this.vagas = vagas;
    }

    public int getQuantFileiras() {
        return quantFileiras;
    }

    public void setQuantFileiras(int quantFileiras) {
        this.quantFileiras = quantFileiras;
    }

    public int getVagasPorFileira() {
        return vagasPorFileira;
    }

    public void setVagasPorFileira(int vagasPorFileira) {
        this.vagasPorFileira = vagasPorFileira;
    }


    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estacionamento other = (Estacionamento) obj;
        return Objects.equals(nome, other.nome);
    }


    @Override
    public String toString() {
        return "Estacionamento [nome=" + nome + ", id=" + Arrays.toString(id) + ", vagas=" + Arrays.toString(vagas)
                + ", quantFileiras=" + quantFileiras + ", vagasPorFileira=" + vagasPorFileira + "]";
    }


    public void addveiculo(Veiculo veiculo, String IdCh) {

    }

    public void addClente(Cliente clente) {

    }

    public void gerarVagas() {

    }

    public void estacionar(String placa) {

    }

    public double sair(String placa) {
        throw new UnsupportedOperationException("Esta funcionalidade ainda não foi implementada.");
    }

    public double totalárrecadado() {
        throw new UnsupportedOperationException("Esta funcionalidade ainda não foi implementada.");
    }

    public double arrecadacaoNoMes(int mes) {
        throw new UnsupportedOperationException("Esta funcionalidade ainda não foi implementada.");
    }

    public double valorMedioPortUso() {
        throw new UnsupportedOperationException("Esta funcionalidade ainda não foi implementada.");
    }

    public String topSClentes(int mes) {
        throw new UnsupportedOperationException("Esta funcionalidade ainda não foi implementada.");
    }





}
