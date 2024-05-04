package etapa_07;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int quantRounds;
    private boolean aprovada;
    private int rounds[];

    public void marcarLuta(Lutador l1, Lutador l2, int rounds) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 && rounds > 2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
            this.quantRounds = rounds;
            this.rounds = new int[quantRounds];
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

    public Lutador lutar() {

            int roundsVencidosDesafiante = 0;
            int roundsVencidosDesafiado = 0;

            for (int i = 0; i < this.quantRounds; i++) {
                Random random = new Random();
                int golpeDesafiante = random.nextInt(100 + 1);
                int golpeDesafiado = random.nextInt(100 + 1);
                System.out.println("Round " + (i + 1));
                if (golpeDesafiante > golpeDesafiado) {
                    System.out.println("Golpe Desafiante: " + golpeDesafiante + " Golpe Desafiado: " + golpeDesafiado + " -> Desafiante VENCE");
                    roundsVencidosDesafiante++;
                    rounds[i] = 1;
                } else if (golpeDesafiado > golpeDesafiante) {
                    System.out.println("Golpe Desafiante: " + golpeDesafiante + " Golpe Desafiado: " + golpeDesafiado + " -> Desafiado VENCE");
                    roundsVencidosDesafiado++;
                    rounds[i] = 2;
                } else {
                    System.out.println("Golpe Desafiante: " + golpeDesafiante + " Golpe Desafiado: " + golpeDesafiado + " -> EMPATE");
                    roundsVencidosDesafiado++;
                    roundsVencidosDesafiante++;
                    rounds[i] = 0;
                }
            }
            System.out.println("Rounds desafiante: " + roundsVencidosDesafiante + " Rounds desafiado: " + roundsVencidosDesafiado);

            if (roundsVencidosDesafiante > roundsVencidosDesafiado) {
                System.out.println("O vencedor da luta é: ");
                this.desafiante.setVitorias(this.desafiante.getVitorias() + 1);
                this.desafiante.apresentarLutador();
                return this.desafiante;
            } else if (roundsVencidosDesafiado > roundsVencidosDesafiante) {
                System.out.println("O vencedor da luta é: ");
                this.desafiado.setVitorias(this.desafiado.getVitorias() + 1);
                this.desafiado.apresentarLutador();
                return this.desafiado;
            } else {
                System.out.println("A luta terminou empatada !");
            }
            return null;
    }


}
