package etapa_07;

import java.time.LocalDate;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int anoNascimento;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, double altura, int anoNascimento, double peso, int derrotas, int vitorias, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        setCategoria();
        this.derrotas = derrotas;
        this.vitorias = vitorias;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválida";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválida";
        }
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public String toString() {
        return "Lutador{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", anoNascimento=" + anoNascimento +
                ", altura=" + altura +
                ", peso=" + peso +
                ", categoria='" + categoria + '\'' +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                ", empates=" + empates +
                '}';
    }

    public void apresentarLutador() {
        System.out.println("********** Lutador **********");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.calcularIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Número de Lutas: " + this.calcularLutas());
        System.out.println("Vitórias: " + this.getVitorias() + " %" + this.calcularPercentualVitorias());
        System.out.println("Empates: " + this.getEmpates() + " %" + this.calcularPercentualEmpates());
        System.out.println("Derrotas: " + this.getDerrotas() + " %" + this.calcularPercentualDerrotas());
        System.out.println();
    }

    public int calcularLutas() {
        return this.getVitorias() + this.getDerrotas() + this.getEmpates();
    }

    public int calcularIdade()  {
        LocalDate dataLocal = LocalDate.now();
        int anoAtual = dataLocal.getYear();
        return anoAtual - this.anoNascimento;
    }

    public int calcularPercentualVitorias() {
        return (this.getVitorias() * 100) / this.calcularLutas();
    }

    public int calcularPercentualEmpates() {
        return (this.getEmpates() * 100) / this.calcularLutas();
    }

    public int calcularPercentualDerrotas() {
        return (this.getDerrotas() * 100) / this.calcularLutas();
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

}
