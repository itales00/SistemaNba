public abstract class Time {
    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void exibirInformacoes();
}
