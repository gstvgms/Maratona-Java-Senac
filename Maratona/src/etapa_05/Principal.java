package etapa_05;

public class Principal {
    public static void main(String[] args) {

      Lutador[] lutadores = new Lutador[4];


      lutadores[0] = new Lutador("Maurício Shogun", "Brasileiro", 1.85, 1985, 79.0, 15, 30, 5);
      lutadores[1] = new Lutador("Lyoto Machida", "Brasileiro", 1.87, 1989, 81.0, 5, 29, 1);
      lutadores[2] = new Lutador("Rodrigo Minotauro", "Brasileiro", 1.79, 1979, 106.0,  9, 31, 2);
      lutadores[3] = new Lutador("Anderson Silva", "Brasileiro", 1.91, 1983, 70.0, 3, 31, 1);

      Luta luta01 = new Luta();
      luta01.marcarLuta(lutadores[3], lutadores[1], 10);

        luta01.mostrarLuta();

        Luta luta02 = new Luta();
        luta02.marcarLuta(lutadores[0], lutadores[1], 11);

        luta02.mostrarLuta();

Luta luta03 = new Luta();
          luta03.marcarLuta(lutadores[0], lutadores[1], 2);

            luta03.mostrarLuta();

    }


}
