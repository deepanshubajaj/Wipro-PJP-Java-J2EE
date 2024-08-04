package InheritanceAssignment2;

public class TestEmployee {
        public static void main(String[] args) {
                Employee e = new Employee("XYZ",30000,2021,"xyz@123");
                System.out.println(e.Details());
                Employee E = new Employee("NTR",20812.2540,2000,"abcd1234");
                System.out.println(E.Details());
        }
}