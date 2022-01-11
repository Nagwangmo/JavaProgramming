package day03_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {
        //age: 38 years
        byte age = 38;

        //weight: 160 pounds
        // byte weight = 160: // 160 is out of byte range
        // byte num is -129 is out of range byte range
        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        // short salary= 100000; // 100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers
        // always use _ instead of space. space is not recognised. no comma as well
    }
    long asset = 3_333_333_333L;
    // when using long asset always use upper case L or else it won't run it.

    // Double is always used for decimals instead of Float
    // Always use F after using float and long assest
    // tax: 0.26
    Float tax = 0.26F;
    double PI = 3.14;

    // #
    char ch2 = 35;



     {
    }
}
