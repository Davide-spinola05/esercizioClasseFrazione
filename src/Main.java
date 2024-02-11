public class Main {
    public static void main(String[] args) {
        Frazione frazione = new Frazione(3,4);
        System.out.println("frazione1 :");
        System.out.println(frazione);
        Frazione frazione2 = new Frazione(2, 5);
        System.out.println("frazione2 :");
        System.out.println(frazione2);
        System.out.println("risultato di moltiplica");
        System.out.println(frazione.moltiplica(frazione2));
        System.out.println("risultato di dividi");
        System.out.println(frazione.dividi(frazione2));
        System.out.println("risultato di sottrai");
        System.out.println(frazione.sotrai(frazione2));

    }
}