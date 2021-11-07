import java.util.Scanner;//using Scanner class from util package
public class Odd_Even {//change The class name according to the file name
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//creating an object of Scanner class
        System.out.println("Enter the number to be checked Number:-");
        int i=sc.nextInt();//user input
            if (i%2==0)//check condition
                System.out.println("Yes, an even number");

            else
                System.out.println("Yes,a odd number");
   }
}
