package models;

/**
 * Representa um cliente que possui veículos.
 */
public class Cliente {

    /** Identificador único do cliente. */
    private String id;

    /** Nome do cliente. */
    private String nome;

    /** Array de veículos associados ao cliente. */
    private Veiculo[] veiculos;

    /**
     * Constrói um objeto Cliente com o ID e nome especificados.
     * 
     * @param id   o identificador único do cliente.
     * @param nome o nome do cliente.
     */
    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * Retorna o ID do cliente.
     * 
     * @return o identificador único do cliente.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Retorna o nome do cliente.
     * 
     * @return o nome do cliente.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Retorna os veículos associados ao cliente.
     * 
     * @return um array de veículos.
     */
    public Veiculo[] getVeiculos() {
        return this.veiculos;
    }

    /**
     * Adiciona um veículo à lista de veículos do cliente. Se a lista de veículos
     * for nula, ela será inicializada com um único elemento. Se já existirem
     * veículos,
     * a lista será expandida para acomodar o novo veículo.
     * 
     * @param veiculo o veículo a ser adicionado.
     */
    public void addVeiculo(Veiculo veiculo) {
        if (this.veiculos == null) {
            this.veiculos = new Veiculo[1];
            this.veiculos[0] = veiculo;
            return;
        }

        Veiculo[] veiculos = new Veiculo[this.veiculos.length + 1];
        for (int i = 0; i < this.veiculos.length; i++) {
            veiculos[i] = this.veiculos[i];
        }
        veiculos[veiculos.length - 1] = veiculo;
        this.veiculos = veiculos;
    }

    /**
     * Verifica se o cliente possui um veículo com a placa especificada.
     * 
     * @param placa a placa do veículo a ser verificada.
     * @return o veículo com a placa especificada, ou null se não for encontrado.
     */
    public Veiculo possuiVeiculo(String placa) {
        if (this.veiculos == null)
            return null;

        for (int i = 0; i < this.veiculos.length; i++) {
            if (this.veiculos[i].getPlaca().equals(placa)) {
                return this.veiculos[i];
            }
        }
        return null;
    }

    /**
     * Calcula o total de usos de todos os veículos do cliente.
     * 
     * @return o total de usos.
     */
    public int totalDeUsos() {
        int totalDeUsos = 0;

        if (this.veiculos == null)
            return totalDeUsos;

        for (int i = 0; i < this.veiculos.length; i++)
            totalDeUsos += this.veiculos[i].totalDeUsos();

        return totalDeUsos;
    }

    /**
     * Calcula o montante total arrecadado pelo veículo com a placa especificada.
     * 
     * @param placa a placa do veículo.
     * @return o montante arrecadado pelo veículo, ou 0.0 se o veículo não for
     *         encontrado.
     */
    public double arrecadadoPorVeiculo(String placa) {
        Veiculo veiculo = possuiVeiculo(placa);

        if (veiculo == null)
            return 0.0;

        return veiculo.totalArrecadado();
    }

    /**
     * Calcula o montante total arrecadado por todos os veículos do cliente.
     * 
     * @return o montante total arrecadado.
     */
    public double arrecadadoTotal() {
        if (this.veiculos == null)
            return 0.0;

        double arrecadadoTotal = 0.0;

        for (int i = 0; i < this.veiculos.length; i++)
            arrecadadoTotal += this.veiculos[i].totalArrecadado();

        return arrecadadoTotal;
    }

    /**
     * Calcula o montante total arrecadado por todos os veículos do cliente no mês
     * especificado.
     * 
     * @param mes o mês a ser considerado.
     * @return o montante total arrecadado no mês especificado.
     */
    public double arrecadadoNoMes(int mes) {
        if (this.veiculos == null)
            return 0.0;

        double arrecadadoNoMes = 0.0;

        for (int i = 0; i < this.veiculos.length; i++)
            arrecadadoNoMes += this.veiculos[i].arrecadadoNoMes(mes);

        return arrecadadoNoMes;
    }
}
