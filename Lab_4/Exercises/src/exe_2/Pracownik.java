package exe_2;

public abstract class Pracownik{
    protected String pesel;
    protected double wynBrutto;

    public abstract double obliczWynNetto();

    public String getPesel(){
        return this.pesel;
    }

    public void setPesel(String pesel){
        this.pesel = pesel;
    }

    public double getWynBrutto(){
        return wynBrutto;
    }

    public void setWynBrutto(double wynagrodzenie){
        this.wynBrutto = wynagrodzenie;
    }
}
