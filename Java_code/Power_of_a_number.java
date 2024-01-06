import java.util.*;

public class Power_of_a_number{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int number,exponent;
            System.out.println("Enter exponent");
            exponent = sc.nextInt();
            System.out.println("Enter number");
            number=sc.nextInt();
            int i=1;
            int power=1;
            while(i<=exponent){
                power=power*number;
                i++;
            }
            System.out.println(power);
        }
    }
}