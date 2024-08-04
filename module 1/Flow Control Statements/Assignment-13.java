public class Sample {
    public static void main(String args[]) {
        for(int a=10;a<=99;a++){
            int flag=0;
            for(int i=2;i<=a/2;i++){
                    if(a%i==0)
                        flag=1;
            }
            if(flag==0)
                    System.out.println(a+" ");
                        
        }
        
    }
}
