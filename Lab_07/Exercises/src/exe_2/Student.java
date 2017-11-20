package exe_2;

public class Student extends Pracownik {
    public Student(String pesel, double wynagrodzenie){
        this.pesel = pesel;
        this.wynBrutto = wynagrodzenie;
        position = "Student";
    }

    public double obliczWynNetto(){
        return this.wynBrutto * 0.86;
    }
}
