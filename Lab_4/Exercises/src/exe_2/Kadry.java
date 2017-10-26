package exe_2;

import java.text.Collator;
<<<<<<< HEAD
=======
import java.util.Collections;
>>>>>>> e4d45d94b8de4d8f38cf2ae06b7acb535bb069a9
import java.util.Comparator;
import java.util.LinkedList;

public class Kadry{
    private LinkedList<Pracownik> kadra = new LinkedList<>();

    public void dodajPracownika(Pracownik pracownik){
        kadra.add(pracownik);
    }

    public void usunPracownika(Pracownik pracownik){
        kadra.remove(pracownik);
    }

    public Pracownik searchByPESEL(String pesel){
        for(Pracownik p:kadra){
            if(p.getPesel() == pesel)
                return p;
        }
        return null;
    }

    public double getWynBrutto(Pracownik pracownik){
        return pracownik.getWynBrutto();
    }

    public void setWynBrutto(Pracownik pracownik, double wynagrodzenie){
        pracownik.setWynBrutto(wynagrodzenie);
    }

    public double getWynNetto(Pracownik pracownik){
        return pracownik.obliczWynNetto();
    }

    public void wyswietlKadre(){
        for (Pracownik p:kadra)
            System.out.println("PESEL: " + p.getPesel() + " wynagrodzenie Brutto: " +
                    p.getWynBrutto() + " wynagrodzenie Netto: " + p.obliczWynNetto());
    }

    public void sortKadre(){
<<<<<<< HEAD
        /*
        kadra.sort(new Comparator<Pracownik>() {
            @Override
            public int compare(Pracownik o1, Pracownik o2) {
                return Collator.getInstance().compare(o1.getWynBrutto(), o2.getWynBrutto());
            }
        });*/

=======
        kadra.sort(new Comparator<Pracownik>() {
            @Override
            public int compare(Pracownik o1, Pracownik o2) {
                return Double.compare(o1.getWynBrutto(), o2.getWynBrutto());
            }
        });
>>>>>>> e4d45d94b8de4d8f38cf2ae06b7acb535bb069a9
    }
}
