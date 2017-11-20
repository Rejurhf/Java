package exe_2;

public class ListaPracownikow {
    public static void main(String[] argv){
        Kadry kadra = new Kadry();
        Student s1 = new Student("12345678901", 1500);
        Student s2 = new Student("23456789012", 2000);
        Student s3 = new Student("34567890123", 2500);
        Student s4 = new Student("45678901234", 3000);
        PracownikEtatowy p1 = new PracownikEtatowy(
                "56789012345", 1600);
        PracownikEtatowy p2 = new PracownikEtatowy(
                "67890123456", 2100);

        kadra.dodajPracownika(s1);
        kadra.dodajPracownika(s2);
        kadra.dodajPracownika(s3);
        kadra.dodajPracownika(s4);
        kadra.dodajPracownika(p1);
        kadra.dodajPracownika(p2);

        System.out.println(kadra.getWynNetto(s4));
        System.out.println(kadra.getWynNetto(p1));

        kadra.usunPracownika(s4);

        System.out.println(kadra.searchByPESEL("12345678901").getWynBrutto());

        System.out.println(kadra.getWynBrutto(s3));
        kadra.setWynBrutto(s3, 1000);
        System.out.println(kadra.getWynBrutto(s3));

        System.out.println("Nieposortowana lista pracowników:");
        kadra.wyswietlKadre();

        System.out.println("Posortowana lista pracowników:");
        kadra.sortKadre();
        kadra.wyswietlKadre();
    }
}
