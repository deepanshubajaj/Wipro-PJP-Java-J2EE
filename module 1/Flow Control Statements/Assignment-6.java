public class Sample {
    public static void main(String args[]) {
        String s = args[0];
        int i = Integer.parseInt(args[1]);
        if(s.equalsIgnoreCase("female"))
        {
                if(i>=1 && i<=58)
                        System.out.println("8.2%");
                else if(i>=59 && i<=100)
                        System.out.println("9.2%");
        }
        else
        {
                if(i>=1 && i<=58)
                        System.out.println("8.4%");
                else if(i>=59 && i<=100)
                        System.out.println("10.5%");
        }
    }
}