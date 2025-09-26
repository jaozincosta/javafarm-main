package br.com.joaocarloslima;

public class Morango extends Planta {

    public Morango(int tempoDeCrescimento) {
        super(tempoDeCrescimento);
    }

    @Override
    public String getImagem() {
        return "images/morango" + tamanho + ".png";
    }
}