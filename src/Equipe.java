import java.util.List;

class Equipe {
    private String nome;
    private List<Pessoa> jogadores;  // Alterado para List<Pessoa>

    public Equipe(String nome, List<Pessoa> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public List<Pessoa> getJogadores() {
        return jogadores;
    }

    @Override
    public String toString() {
        return nome + " - Jogadores: " + jogadores;
    }
}
