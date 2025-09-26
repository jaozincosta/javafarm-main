package br.com.joaocarloslima;

public abstract class Planta {
    protected int tamanho;
    protected int tempoDeVida;
    protected int tempoDeCrescimento;

    public Planta(int tempoDeCrescimento) {
        this.tamanho = 1; 
        this.tempoDeVida = 0;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }

    public void crescer() {
        tempoDeVida++;
        if (tamanho < 4 && tempoDeVida % tempoDeCrescimento == 0) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public abstract String getImagem(); 
}
