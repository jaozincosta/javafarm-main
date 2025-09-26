package br.com.joaocarloslima;

public class Cenoura extends Planta {

    public Cenoura(int tempoDeCrescimento) {
        super(tempoDeCrescimento);
    }

    @Override
    public String getImagem() {
        return "images/cenoura" + tamanho + ".png";
    }
}
