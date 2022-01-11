package day07_Operators;

public class PreAndPostIncrement {

    public static void main(String[] args) {

        int m = 4;
        int n = 5;

        //n += m; // is also equals to n = n+m
        //n++; // n += 1: // n = n + 1

        // ++n; pre increment
        // n++; post increment
         m = n++;



        System.out.println(m);
        System.out.println(n);



    }


}
