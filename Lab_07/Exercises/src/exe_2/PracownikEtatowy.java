package exe_2;

public class PracownikEtatowy extends Pracownik{
    public PracownikEtatowy(String pesel, double wynagrodzenie){
        this.pesel = pesel;
        this.wynBrutto = wynagrodzenie;
        position = "Full-time Employe";
    }

    public double obliczWynNetto(){
        return this.wynBrutto * 0.7034;
    }
}