public enum Dia {
    LUN(true),
    MAR(true),
    MIE(true),
    JUE(true),
    VIE(true),
    SAB(false),
    DOM(false);

    public final boolean esHabil;

    Dia(boolean esHabil) {
        this.esHabil = esHabil;
    }
}
