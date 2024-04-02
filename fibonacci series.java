import java.util.*;
class series
{
    public static void main(String[] args) {
        int i,a=0,b=1,c;
        Scanner Sc=new Scanner(System.in);
        {
            System.out.print("enter a value of a:");
            a=Sc.nextInt();
            System.out.print("enter a value of b:5");
            b=Sc.nextInt();
            for (i=0;i<=10;i++) {
                c=a+b;
                System.out.print("c:"+c);
                a=b;
                b=c;
            }
        }
    }
}
                
    