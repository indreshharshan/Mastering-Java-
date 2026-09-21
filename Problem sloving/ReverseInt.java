
import java.util.Scanner;

class ReverseInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(), c = 0, rem = 0, temp = n;
        boolean flag = true;
       while(n!=0){
        rem=n%10;
        c=c*10+rem;
        n=n/10;
       }
        System.out.println(c==temp? "Plandrome": "Not Plandrome");
        

    }
}
