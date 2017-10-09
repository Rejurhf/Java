package Exercise_6;

public class PeselCheck{
    public static boolean check(String pesel){
        if(pesel.length() != 11){
            System.out.println("Niepoprawna ilość cyfr");
            return false;
        }

        Integer tmp = Integer.parseInt(pesel.substring(2,4));
        if(tmp.equals(0) || tmp > 12 && tmp < 21 || tmp > 32){
            System.out.println("Nieprawidłowy miesiąc lub rok urodzenia");
            return false;
        }

        tmp = Integer.parseInt(pesel.substring(4,6));
        if(tmp.equals(0) || tmp > 31){
            System.out.println("Niepoprawna liczba dni miesiąca");
            return false;
        }

        tmp = 0;
        Integer charToIntConv = 48;
        Integer lastNumTab[] = {9, 7, 3, 1, 9, 7, 3, 1, 9, 7};
        for(int i = 0; i < 10; ++i) tmp += lastNumTab[i] * (pesel.charAt(i) - charToIntConv);
        tmp = tmp % 10;
        if(!tmp.equals(Integer.parseInt(pesel.substring(10)))){
            System.out.println("Błędna liczba kontrolna");
            return false;
        }

        return true;
    }
}
