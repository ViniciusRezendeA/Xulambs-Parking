package models;

import java.time.Duration;
import java.time.LocalDateTime;

//import models.Vaga;

public class UsoDeVaga {
    double fracao_uso = 0.5;
    double valor_fracao = 4.0;
    double valor_maximo = 50.0;
    Vaga vaga;
    LocalDateTime entrada;
    LocalDateTime saida;
    double valorpago;



    public UsoDeVaga(double fracao_uso, double valor_fracao, double valor_maximo, Vaga vaga, LocalDateTime entrada,
                     LocalDateTime saida, double valorpago) {
        this.fracao_uso = fracao_uso;
        this.valor_fracao = valor_fracao;
        this.valor_maximo = valor_maximo;
        this.vaga = vaga;
        this.entrada = entrada;
        this.saida = saida;
        this.valorpago = valorpago;
    }

    public double sair() {

        return valorpago;
    }

    public double valorPago() {
        Duration diferenca = Duration.between(saida, entrada);
        valorpago = (double)diferenca.toMinutes();
        valorpago = ((int)valorpago/15)*valor_fracao;
        if (valorpago > valor_maximo ) {
            valorpago = valor_maximo;
        }
        return valorpago;
    }

    public double getFracao_uso() {
        return fracao_uso;
    }

    public void setFracao_uso(double fracao_uso) {
        this.fracao_uso = fracao_uso;
    }

    public double getValor_fracao() {
        return valor_fracao;
    }

    public void setValor_fracao(double valor_fracao) {
        this.valor_fracao = valor_fracao;
    }

    public double getValor_maximo() {
        return valor_maximo;
    }

    public void setValor_maximo(double valor_maximo) {
        this.valor_maximo = valor_maximo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public double getValorpago() {
        return valorpago;
    }

    public void setValorpago(double valorpago) {
        this.valorpago = valorpago;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(fracao_uso);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valor_fracao);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(valor_maximo);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((vaga == null) ? 0 : vaga.hashCode());
        result = prime * result + ((entrada == null) ? 0 : entrada.hashCode());
        result = prime * result + ((saida == null) ? 0 : saida.hashCode());
        temp = Double.doubleToLongBits(valorpago);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsoDeVaga other = (UsoDeVaga) obj;
        if (Double.doubleToLongBits(fracao_uso) != Double.doubleToLongBits(other.fracao_uso))
            return false;
        if (Double.doubleToLongBits(valor_fracao) != Double.doubleToLongBits(other.valor_fracao))
            return false;
        if (Double.doubleToLongBits(valor_maximo) != Double.doubleToLongBits(other.valor_maximo))
            return false;
        if (vaga == null) {
            if (other.vaga != null)
                return false;
        } else if (!vaga.equals(other.vaga))
            return false;
        if (entrada == null) {
            if (other.entrada != null)
                return false;
        } else if (!entrada.equals(other.entrada))
            return false;
        if (saida == null) {
            if (other.saida != null)
                return false;
        } else if (!saida.equals(other.saida))
            return false;
        if (Double.doubleToLongBits(valorpago) != Double.doubleToLongBits(other.valorpago))
            return false;
        return true;
    }

}
