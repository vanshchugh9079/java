import java.util.Scanner;
class Paildrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,reverse;
        System.out.println("Enter a number");
        x = sc.nextInt();
            reverse = 0;
            int temp=x;
            while(temp>0)
            {
                reverse = reverse*10 + temp%10;
                temp= temp/10;
            }
            if(x==reverse)
            {
                System.out.println(x+" is a paildrome");
                System.out.println(reverse);
            }
            else
            {
                System.out.println(reverse);
                System.out.println(x+" is not a paildrome");
                 x = sc.nextInt();
            }
    }
}