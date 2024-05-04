package etapa_05;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int quantRounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2, int rounds) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 && rounds > 2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
            this.quantRounds = rounds;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }


    }

    public void mostrarLuta() {
        if (this.aprovada) {
            System.out.println("LUTA APROVADA");
            System.out.println("Quantidade de Rounds: " + this.quantRounds);
            System.out.println("DESAFIANTE");
            this.desafiante.apresentarLutador();
            System.out.println("DESAFIADO");
            this.desafiado.apresentarLutador();
        } else {
            System.out.println("A luta NÃO foi aprovada !");
        }
    }
}
