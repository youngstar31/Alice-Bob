import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void aliceBob() {
        String greeting = "Please type in valid name";
        System.out.println(greeting);

        boolean indicator = false;

        Scanner usernameScan = new Scanner(System.in);
        String validName1 = "Alice";
        String validName2 = "Bob";

        while (indicator == false) {
            String input1 = usernameScan.nextLine();

            if (input1.equals(validName1) || (input1.equals(validName2))) {
                System.out.println("Welcome " + input1 + "!!");

                indicator = true;


            }

            else {
                System.out.println("Invalid Name, Please try again.");


            }

        }
    }



    public static void main(String[] args ){
        aliceBob();


    }
}
