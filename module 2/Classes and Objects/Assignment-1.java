import java.util.Scanner;
public class Box {
    int width;
    int height;
    int depth;
    Box(int width, int height, int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    int Volume(){
        return width*height*depth;
    }
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int width,height,depth;
        System.out.println("Enter Width of a Box: ");
        width=scan.nextInt();
        System.out.println("Enter Height of a Box: ");
        height=scan.nextInt();
        System.out.println("Enter Depth of a Box: ");
        depth=scan.nextInt();
        Box b=new Box(width,height,depth);
        System.out.println("Volume of the Box: "+b.Volume()+" sq.Units");
    }
}
