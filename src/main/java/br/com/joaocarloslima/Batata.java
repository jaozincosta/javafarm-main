package br.com.joaocarloslima;

public class Batata extends Planta {

    public Batata(int tempoDeCrescimento) {
        super(tempoDeCrescimento);
    }

    @Override
    public String getImagem() {
        return "images/batata" + tamanho + ".png";
    }
}
