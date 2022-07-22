import java.util.*;

public class Sol {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int b = in.nextInt();

        if(n%2!=0||(n%2==0&&n>=6&&n<=20))
        {System.out.println("Weird");}
        else if(n%2==0&&n<=5&&n>=2||n>20){
            System.out.println("Not Weird");
        }

    }
}