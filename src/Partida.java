public abstract class Partida {
    private Time time1;
    private Time time2;
    private boolean emAndamento;

    public Partida(Time time1, Time time2, boolean emAndamento) {
        this.time1 = time1;
        this.time2 = time2;
        this.emAndamento = emAndamento;
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }

    public boolean isEmAndamento() {
        return emAndamento;
    }

    public void iniciarPartida() throws IllegalStateException {
        if (emAndamento) {
            throw new IllegalStateException("A partida já foi iniciada");
        }
        emAndamento = true;
        System.out.println("A partida começou entre " + time1.getNome() + " e " + time2.getNome());
        ;
    }

    public void finalizarPartida() throws IllegalStateException {
        if (emAndamento) {
            throw new IllegalStateException("A partida não foi iniciada");
        }
        emAndamento = false;
        System.out.println("A partida já foi finalizada");
    }
    public abstract void exibirResultado();
}
