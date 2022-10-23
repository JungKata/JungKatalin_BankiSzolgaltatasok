package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private double kamatmerteke;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos, int aktEgyenleg, double kamatmerteke) {
        super(tulajdonos, aktEgyenleg);
        this.kamatmerteke = kamatmerteke;
    }

    public double getKamatmerteke() {
        return kamatmerteke;
    }

    public void setKamatmerteke(double kamatmerteke) {
        this.kamatmerteke = kamatmerteke;
    }
}
