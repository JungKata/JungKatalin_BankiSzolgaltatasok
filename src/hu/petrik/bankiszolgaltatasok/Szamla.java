package hu.petrik.bankiszolgaltatasok;

public class Szamla  extends BankiSzolgaltatas{

    private int aktEgyenleg;

    public Szamla(Tulajdonos tulajdonos, int aktEgyenleg) {
        super(tulajdonos);
        this.aktEgyenleg = aktEgyenleg;
    }

    public int getAktEgyenleg() {
        return aktEgyenleg;
    }

    public void befizetendoOsszeg(int osszeg){
        // aktualis egyenleghez hozzáadni a befizetendo osszeget
        this.aktEgyenleg =+ osszeg;
        }
}