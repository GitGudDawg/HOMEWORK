package day16;
import java.util.Locale;
import java.util.Scanner;

public class Day16 {

    //for number 3
    public static int powof2(int number2pow){
        int res = (int)Math.pow(2, number2pow);
        return res;
    }

    //for number 4
    public static String hoursAndMinutes(int minutes){

        int hours = minutes / 60;

        int minutesLeft = minutes - hours * 60;

        if (hours >= 24){
            hours = hours % 24;
        }

        String str = hours + " " + minutesLeft;

        return str;
    }

    //for number 5
    public static boolean primeOrNot(int prime){
        int sqrt = (int) Math.sqrt(prime);

        for (int i = 2; i <= sqrt; i++){
            if (prime % i == 0){
                return false;
            }
        }
        return true;
    }

    //for number 6

    public static void palindrome(int fourdigit1, int fourdigit2){
        for (int i = fourdigit1; i <= fourdigit2; i++){
            int s = 0;
            int f = i;
            for (int j = 4; j >= 0; j--){
                s = s * 10 + f % 10;
                f /= 10;
            }
            if (s == i){
                System.out.print(s + " ");
            }
        }
    }

    //for number 7

    public static String threeDigit(String threedigit){
        String f = threedigit.toLowerCase();

        String s = "";
        s += f.charAt(0);
        s.toUpperCase();
        s += f.substring(1, 3);

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*//number 3
        System.out.println("Enter number 1 <= N <= 15 : ");
        int number2pow = sc.nextInt();



        int pow = powof2(number2pow);

        System.out.println("2 ^ " + number2pow + " = " + pow);
        //end of number 3*/

        /*//end of number 4

        System.out.println("Enter count of minutes: ");

        int minutes = sc.nextInt();

        String hoursAndMinutes = hoursAndMinutes(minutes);

        System.out.println(hoursAndMinutes);

        //end of number 4*/

        /*//number 5
        System.out.println("Enter number to find out of it is prime or not: ");

        int prime = sc.nextInt();

        boolean primeBool = primeOrNot(prime);

        System.out.println(primeBool);
        //end of number 5*/

        /*//number 6
        System.out.println("Enter first four digit number: ");

        int fourdigit1 = sc.nextInt();

        System.out.println("Enter second four digit number: ");

        int fourdigit2 = sc.nextInt();

        palindrome(fourdigit1, fourdigit2);
        //end of number 6*/


        System.out.println("Enter a three letter word: ");

        String threedigit = sc.next();

        String s = threeDigit(threedigit);

        System.out.println(s);
    }
}
