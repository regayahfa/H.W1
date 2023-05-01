import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Q1
        int a = 125;
        int b = 24;
        int sum = a + b;
        System.out.println(sum);
        int c = a - b;
        System.out.println(c);
        int x = a * b;
        System.out.println(x);
        int z = a / b;
        System.out.println(z);
        int d = a % b;
        System.out.println(d);

        //Q2
        String name = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(name.toLowerCase());

        // Q3
        String str = "Java Bootcamp";
        int indx = str.charAt(1);
        System.out.println((char) indx);

        //Q4
        Scanner in = new Scanner(System.in);
        System.out.print("input number: ");
        int p = in.nextInt();
        if (p % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        //Q5
        Scanner data = new Scanner(System.in);
        System.out.print("Enter userrole  ");
        String role = in.next();
        if (role == "admin") {
            System.out.println("welcome admin ");
        } else if (role == "superuser") {
            System.out.println("welcome superuser");
        } else if (role == "user") {
            System.out.println("welcome user");
        }


        //Q6

        System.out.print("Input the first number : ");
        int e = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number : ");
        int f = in.nextInt();
        System.out.println("The result is: " + sumoftwo(e, y, f));

        // Q7


        System.out.println("Input the 1st number: ");
        int num11 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num22 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num33 = in.nextInt();
        if (num11 > num22) {
            if (num11 > num33)
                System.out.println("The greatest: " + num11);
            if (num22 > num11)
                if (num22 > num33)
                    System.out.println("The greatest: " + num22);

            if (num33 > num11)
                if (num33 > num22)
                    System.out.println("The greatest: " + num33);
        }
        //Q8
        System.out.println("Input the 1st number: ");
        int day = in.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Monday ");
            break;
            case 2:
                System.out.println("Tusday ");
                break;
            case 3:
                System.out.println( "Wednesday");
            break;
            case 4:
                System.out.println("Thursday");
            break;
            case 5:
                System.out.println("Friday");
            break;
            case 6:
                System.out.println("Saturday");
            break;
            case 7:
                System.out.println("Sunday");
            break;
            default:
                System.out.println("Invalid day range");
                break;
        }

    }

    //6
    public  static boolean sumoftwo(int p, int q, int r) {
        return ((p + q) == r || (q + r) == p || (r + p) == q);
    }
}
