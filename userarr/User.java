import java.util.Scanner;
class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size:-");
        int size = sc.nextInt();
        System.out.println("enter a num:-");
        int num = sc.nextInt();
        int table[]=new int[size];
        for(int i=0;i<=size-1;i++)
        {
            table[i]=num*(i+1);
        }
        for (int z : table)
        {
            System.out.println(z);
        }

    }
}