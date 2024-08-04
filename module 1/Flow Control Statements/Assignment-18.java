public class Sample {
    public static void main(String args[]) {
        int n=Integer.parseInt(args[0]);
        int n1=n;
        int r=0,num=0;
        while(n!=0)
        {
                r=n%10;
                num=num*10+r;
                n=n/10;
        }
        if(num==n1)
                System.out.println(n1+" is a pallindrome");
        else
                System.out.println(n1+" is not a pallindrome");
    }
}
