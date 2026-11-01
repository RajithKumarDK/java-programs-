import java.util.*;
public class Largest {
    public static void main(String[] args){
Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
       
        
        int largest;
        
        if(num1>num2){
            largest=num1;
        }
        else{
            largest=num2;
        }
        System.out.println("The largest number is: " + largest);

    }
}
