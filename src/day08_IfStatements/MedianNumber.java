package day08_IfStatements;

import javax.lang.model.SourceVersion;

public class MedianNumber {
    /*2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number */
        public static void main(String[] args) {
            int a = 10, b =15, c = 20;

            boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
            boolean bIsMedian = (b>a && b<c) || (b<a && b>c);
            boolean cIsMedian = (c>a && c<b) || (c<a && c>b);

            if (aIsMedian) {
                System.out.println(a + " is Median Number");
            }
            if (bIsMedian) {
                System.out.println(b + " is Median Number");
            }
            if (cIsMedian) {
                System.out.println(c + " is Median Number");

            }
        }
}
