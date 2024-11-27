class Jogador extends Pessoa {
    private int pontos;

    public Jogador(String nome, int idade, int pontos) {
        super(nome, idade);
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + pontos + " pontos";
    }
}
