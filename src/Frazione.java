/*
Creare la classe Frazione.
Implementare i metodi semplifica, moltiplica, sottrai e dividi.
Compilare e testare
*/
public class Frazione  {
    private int num;
    private int den;

    public Frazione(int numeratore, int denominatore){
        this.num = numeratore;
        this.den = denominatore;
    }

    private int calcolaMCD(int num, int den){
        while (den != 0) {
            int temp = den;
            den = num % den;
            num = temp;
        }
        return num;
    }

    public void semplifica(){
        int mcd = calcolaMCD(num, den);
        this.num = num / mcd;
        this.den = den / mcd;
    }

    public Frazione moltiplica(Frazione f2){
        int risultatoNumeratore = this.num * f2.num;
        int risultatoDenominatore = this.den * f2.den;
        return new Frazione(risultatoNumeratore, risultatoDenominatore);
    }

    public Frazione dividi(Frazione f2){
        int risultatoNumeratore = this.num * f2.den;
        int risultatoDenominatore = this.den * f2.num;
        return new Frazione(risultatoNumeratore, risultatoDenominatore);
    }
    public Frazione sotrai(Frazione f2){
        int risultatoNumeratore = this.num * f2.den - f2.num * this.den;
        int risultatoDenominatore = this.den * f2.den;
        return new Frazione(risultatoNumeratore, risultatoDenominatore);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }
}