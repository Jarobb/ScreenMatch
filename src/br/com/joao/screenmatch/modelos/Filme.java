package br.com.joao.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoplano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isIncluidoNoplano() {
        return incluidoNoplano;
    }

    public int getAnoDelancamento() {
        return anoDelancamento;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setIncluidoNoplano(boolean incluidoNoplano) {
        this.incluidoNoplano = incluidoNoplano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamento: " + anoDelancamento);
        System.out.println("Duração do filme: "+ duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes /totalDeAvaliacoes;
    }

}
