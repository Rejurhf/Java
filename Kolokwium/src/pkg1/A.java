package pkg1;

public class A {
    private String priv = "A.priv";
    protected String prot = "A.prot";
    public String publ = "A.publ";
    String pack = "A.pack";

    public void print(){
        System.out.println(priv + prot + publ + pack);
    }
}
