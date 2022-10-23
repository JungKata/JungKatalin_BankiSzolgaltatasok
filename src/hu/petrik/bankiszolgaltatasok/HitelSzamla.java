package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla {

    private int hitelKeretOsszeg;


    public HitelSzamla(Tulajdonos tulajdonos, int aktEgyenleg, int hitelKeretOsszeg) {
        super(tulajdonos, aktEgyenleg);
        this.hitelKeretOsszeg = hitelKeretOsszeg;
    }

    public int getHitelKeretOsszeg() {
        return hitelKeretOsszeg;
    }

    @Override
    public boolean kiveszOsszeg(int osszeg) {
       if (this.getAktEgyenleg() + this.hitelKeretOsszeg >= osszeg){
           aktEgyenleg = this.getAktEgyenleg() - osszeg;
           return true;
       }else {
           return false;
       }
    }
}
