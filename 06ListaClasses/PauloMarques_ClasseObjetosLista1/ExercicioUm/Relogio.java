public class Relogio {
    Ponteiro ponteiroHora = new Ponteiro();

    Ponteiro ponteiroMinuto = new Ponteiro();

    Ponteiro ponteiroSegundo = new Ponteiro();

    void acertarRelogio(int hora, int min, int seg) {

        hora = hora % 12;
        ponteiroHora.posicao = hora;
        ponteiroMinuto.posicao = min / 5;
        ponteiroSegundo.posicao = seg / 5;
    }

    int lerHora() {
        return ponteiroHora.posicao;
    }

    int lerMin() {
        return ponteiroMinuto.posicao * 5;
    }

    int lerSeg() {
        return ponteiroSegundo.posicao * 5;
    }


}
