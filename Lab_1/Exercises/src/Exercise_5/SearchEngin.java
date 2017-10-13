package Exercise_5;

public class SearchEngin {
    public static void printNumbers(Integer number){
        if(number <= 1) System.out.print("Na takich danych to się nie pobawimy...");
        else {
            int[] tab = new int[number];
            for (int i = 0; i < number; ++i) tab[i] = i;
            for(int i = 0; i < number; ++i) {
                if(tab[i] > 1){
                    System.out.print(tab[i] + ", ");
                    Integer tmp = 2;
                    while(tmp*tab[i] < number){
                        tab[tmp*i] = 0;
                        ++tmp;
                    }
                }
            }
        }
    }
}
