import java.util.Scanner;//importing Scanner class from util method

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Object creation
        System.out.println("Enter The number You want to reverse :-");
        int x=sc.nextInt();//input from user
        int sum = 0,z;
        while (x>0){
            z=x%10;
            sum=sum*10+z;
            x=x/10;
        }
        System.out.println(sum);
    }
}
