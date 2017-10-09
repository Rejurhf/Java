package Exercise_5;

public class LiczbyPierwsze {
    public static void main(String[] argv) {
        Integer number = JIn.getNumber();
        System.out.print("Liczby pierwsze mniejsze od " + number + " to: ");
        SearchEngin.printNumbers(number);
    }
}
