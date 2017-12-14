import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        System.out.print("Enter one integer: ");
        num=sc.nextInt();

        System.out.println("Square of "+ num + " is: "+ Math.pow(num, 2));

        int x, y, z;
        System.out.println("Enter two integers: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum = "+z);


        double[] vals = new double[5];
        System.out.println("Please enter five integers: ");

        for (int i = 0; i < 5; i++)
            vals[i] = in.nextDouble();

        System.out.printf("The average is: %.2f", average(vals));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array)
            sum += val;
        return sum / array.length;
    }


}


