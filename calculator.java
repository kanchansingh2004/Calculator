import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        System.err.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Enter operation");
        String z=sc.next();

        switch (z) {
            case "+":
                System.out.println(x+y);
                break;
            
            case "-":
                System.out.println(x-y);
                break;
            
            case "*":
                System.out.println(x*y);
                break;

            case "/":
                System.out.println(x/y);
                break;
            
            case "%":
                System.out.println(x%y);
                break;

            default:
            System.out.println("INvalid OPerator");
                break;
        }
    }
}
