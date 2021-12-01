public class Aplicacao {
    public static void main(String[] args) {
        Relogio r1 = new Relogio();

        r1.acertarRelogio(3,30,50);

        System.out.println("Posição da hora: "+ r1.ponteiroHora.posicao);
        System.out.println("Posição da minuto: "+ r1.ponteiroMinuto.posicao);
        System.out.println("Posição da segundo: "+ r1.ponteiroSegundo.posicao);

        int hora = r1.lerHora();
        int min = r1.lerMin();
        int seg = r1.lerSeg();

        System.out.println("Hora: "+ hora+"h");
        System.out.println("Minuto: "+ min+"m");
        System.out.println("Segundo: "+ seg+"s");

        Relogio r2 = new Relogio();

        r2.acertarRelogio(22,0,0);

        System.out.println("Hora do segundo relógio: "+ r2.lerHora()+"h");

    }
}
