package etapa_04;

public class Principal {
    public static void main(String[] args) {

      Lutador[] lutadores = new Lutador[4];


      lutadores[0] = new Lutador("Maurício Shogun", "Brasileiro", 1.85, 1985, 79.0, 15, 30, 5);
      lutadores[1] = new Lutador("Lyoto Machida", "Brasileiro", 1.87, 1989, 81.0, 5, 29, 1);
      lutadores[2] = new Lutador("Rodrigo Minotauro", "Brasileiro", 1.79, 1979, 106.0,  9, 31, 2);
      lutadores[3] = new Lutador("Anderson Silva", "Brasileiro", 1.91, 1983, 70.0, 3, 31, 1);


      for (Lutador lutador : lutadores) {
        lutador.apresentarLutador();
      }

      lutadores[0].ganharLuta();
      lutadores[0].ganharLuta();
      lutadores[0].empatarLuta();

      lutadores[1].empatarLuta();
        lutadores[1].perderLuta();

      lutadores[2].perderLuta();
      lutadores[2].empatarLuta();
      lutadores[2].perderLuta();

      lutadores[3].empatarLuta();

      for (Lutador lutador : lutadores) {
        lutador.apresentarLutador();
      }



    }


}
