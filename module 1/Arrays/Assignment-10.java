public class Sample {
    public static void main(String args[]) {
        int a=args.length;
        int i;
        int arr[][] = new int[3][3];
        if(a<9)
                System.out.println("Please enter 9 integer numbers");
        if(a==9){
                int k=0;
                for(i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                                    arr[i][j]=Integer.parseInt(args[k]);
                                    k++;
                        }
                }
                System.out.println("The given array is:");
                for(i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                                    System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                }

                int m=arr[0][0];
                for(i=0;i<3;i++){
                        for(int j=0;j<3;j++){
                                    if(m<arr[i][j]){
                                                m=arr[i][j];
                                    }
                        }
                }
                System.out.println("The biggest number in the given array is "+m);
        }   
    }
}
