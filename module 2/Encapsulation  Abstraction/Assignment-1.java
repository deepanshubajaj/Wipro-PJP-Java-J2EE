import java.util.*;
class Author {
    String name,email;
    char gender;
    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
}

class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(String bname, Author auth){
        name=bname;
        author=auth;
    }
    void setPrice(double pr){
        price=pr;
    }
    void setqtyInStock(int n){
        qtyInStock=n;
    }
    double getPrice(){
        return price;
    }
    int getqtyInStock(){
        return qtyInStock;
    }
    String getName(){
        return name;
    }
    Author getAuthor(){
        return author;
    }
}
public class Main{
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        String name,id,bname;
        char gen;
        double price;
        int n;
        System.out.println("Enter Author Name, email, gender: ");
        name=scan.nextLine();
        id=scan.nextLine();
        gen=scan.next().charAt(0);
        System.out.println("Enter Book Name, Stock, Price: ");
        bname=scan.nextLine();
        scan.nextLine();
        n=scan.nextInt();
        price=scan.nextDouble();
        Author a=new Author(name,id,gen);
        Book b=new Book(bname,a);
        b.setPrice(price);
        b.setqtyInStock(n);
        System.out.println("The name of the Book: "+b.getName());
        System.out.println("Books in stock: "+b.getqtyInStock());
        System.out.println("Books Price: "+b.getPrice());
        Author a1=b.getAuthor();
        System.out.println("Author Name: "+a1.name);
        System.out.println("Author Email: "+a1.email);
        System.out.println("Author Gender: "+a1.gender);
    }
}