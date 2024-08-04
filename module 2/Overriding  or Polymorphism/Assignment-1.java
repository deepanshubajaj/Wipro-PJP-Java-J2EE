class Fruit{
        String taste;
        double size;
        public void eat(){
                System.out.println("The name of the fruit is mango and taste is"+taste);
        }
}
class Apple extends Fruit{
        public void eat(){
                System.out.println("The name of the fruit is Apple and taste is"+taste);
        }
}
class Orange extends Fruit{
        public void eat()
        {
                System.out.println("The name of the fruit is Orange and taste is"+taste);
        }
}
public class Main {
        public static void main(String[] args) {
                Apple a = new Apple();
                a.taste = " Apple_sweet";
                Orange o = new Orange();
                o.taste = " Sweet-tart";
                a.eat();
                o.eat();
        }
}
