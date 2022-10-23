package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla{
    private double kamatmerteke;
    public static double alapKamatErtek = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos, int aktEgyenleg) {
        super(tulajdonos, aktEgyenleg);
        kamatmerteke = alapKamatErtek;
    }

    public double getKamatmerteke() {
        return kamatmerteke;
    }

    public void setKamatmerteke(double kamatmerteke) {
        this.kamatmerteke = kamatmerteke;
    }

    @Override
    public boolean kiveszOsszeg(int osszeg) {
        if (getAktEgyenleg() - osszeg >= 0) {
            this.aktEgyenleg -= osszeg;
            return true;
        }else {
        return false;
        }
    }
}
