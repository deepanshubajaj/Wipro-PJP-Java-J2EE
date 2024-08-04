public class Sample {
    public static void main(String args[]) {
        if(args.length==0) {
    			System.out.println("Please enter an integer number");
    	}
    	else {
    			int a = Integer.parseInt(args[0]);
                int flag=0;
                if(a==0||a==1)
                    flag=1;
                
                for(int i=2;i<=a/2;i++){
                    if(a%i==0){
                       flag=2;
                       break;
                    }
                }
                if(flag==0)
                        System.out.println(a+" is a prime number");
                else if(flag==1)
                        System.out.println(a+" is neither prime nor composite");
                else 
                        System.out.println(a+" is not a prime number");
    	}
    }
}
