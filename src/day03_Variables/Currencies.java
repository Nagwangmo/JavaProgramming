package day03_Variables;

public class Currencies {
    public static void main(String[] args) {
        // convert $1000 to different currency
        double dollar = 1000;
        double euro = dollar * 9.53;
        double lira = dollar * 0.86;
        double jpy = dollar * 114.14;
        double rs = dollar * 112;


        System.out.println("rs = $" + rs);
        System.out.println("jpy = $" + jpy);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);


    }
}
