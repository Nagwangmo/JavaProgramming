package day05_con;

public class calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
// 100 + 50 = 150
        System.out.println(firstNumber + " + " + secondNumber + " = " + addition );
        // 100-50 = 50
        System.out.println(firstNumber + " - " + secondNumber + " = "  + subtraction);
// 100*50 = 5000
        System.out.println(firstNumber + " * " + secondNumber + "= " + multiply);
    }
}
// 100+50 = 150
// 100-50 = 50
// 100*50 = 5000