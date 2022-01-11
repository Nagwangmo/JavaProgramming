package day07_Operators;

public class LogicalOperator {
    // & and |
    // & : both of the value had to br true in order to get true outcome. even if 1 is false
    // it will come out false.
    // | : even if one of the value is true the outcome will come true.
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println(a&b);//false because of one them is false
        System.out.println(b&a);// false because one of them is still false
        System.out.println(b&b);// false because both are false.
        System.out.println(a&a);// ture because both if them are true
        System.out.println(a|b);// true because one of the is true
        System.out.println(b|b);// false because no true value found. both are false
    }
}
