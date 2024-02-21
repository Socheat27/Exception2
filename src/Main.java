import java.util.Scanner;
public class Main {
    public static int getthrow()
        throws IllegalArgumentException{
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
            if(n==0){
                throw new  IllegalArgumentException("not input Zero");
            }
            else
                return n;
        }
    public static void main(String[] args) {
        try {
            System.out.println(getthrow());
        }
        catch (IllegalArgumentException a){
            System.out.println(a.getMessage());
        }
    }
}