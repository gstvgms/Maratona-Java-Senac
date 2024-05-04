package etapa_01;

public class Principal {
    public static void main(String[] args) {
      Lutador lutador01 = new Lutador("Maurício Shogun", "Brasileiro", 1.85, 1985, 79.0, "Pesado", 15, 30, 5);
      Lutador lutador02 = new Lutador("Lyoto Machida", "Brasileiro", 1.87, 1989, 81.0, "Médio", 5, 29, 1);
      Lutador lutador03 = new Lutador("Rodrigo Minotauro", "Brasileiro", 1.79, 1979, 106.0, "Pesado", 9, 31, 2);
      Lutador lutador04 = new Lutador("Anderson Silva", "Brasileiro", 1.91, 1983, 70.0, "Leve", 3, 31, 1);


      lutador01.apresentarLutador();
      lutador02.apresentarLutador();
      lutador03.apresentarLutador();
      lutador04.apresentarLutador();

    }


}
