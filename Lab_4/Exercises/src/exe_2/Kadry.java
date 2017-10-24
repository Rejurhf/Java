package exe_2;

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
        double tmpWyn;
        int tmpIter = 0;
        int tmpIndex;
        Pracownik tmpPracownik;
        while(tmpIter < kadra.size()){
            tmpWyn = kadra.get(tmpIter).getWynBrutto();
            for (int i = tmpIter; i < kadra.size(); i++) {

            }
            ++tmpIter;
        }
    }
}
