package day05_con;

public class fullName2 {
    public static void main(String[] args) {
        String firstName = "Aron";
        String lastName = "Daniel";
        String jobTitle = "SDET";
        String company = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is " + jobTitle + ", works at " + company + ", and " + fullName + " salary is " + salary);

    }
}
