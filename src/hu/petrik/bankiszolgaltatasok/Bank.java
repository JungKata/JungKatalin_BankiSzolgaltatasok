package hu.petrik.bankiszolgaltatasok;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Szamla> szamlakListaja = new ArrayList<>();

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
        if (hitelKeret > 0) {
            HitelSzamla hitel = new HitelSzamla(tulajdonos, 56, hitelKeret);
            szamlakListaja.add(hitel);
            return hitel;
        }
        else if (hitelKeret == 0) {
            MegtakaritasiSzamla megtakaritas = new MegtakaritasiSzamla(tulajdonos, 56);
            szamlakListaja.add(megtakaritas);
            return megtakaritas;
        }
        else {
            throw new Error("Nem lehet az érték kisebb 0-nál");

        }
}
    public int
}
