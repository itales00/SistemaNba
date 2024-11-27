public class PartidaBasquete {
    private Time time1;
    private Time time2;
    private boolean emAndamento;

    public PartidaBasquete(Time time1, Time time2, boolean emAndamento) {
        this.time1 = time1;
        this.time2 = time2;
        this.emAndamento = emAndamento;
    }

    @Override
    public String toString() {
        return "Partida entre: " + time1.getNome() + " e " + time2.getNome() +
                "\nEm andamento: " + (emAndamento ? "Sim" : "Não");
    }
}
