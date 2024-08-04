package InheritanceAssignment2;

public class Employee extends Person {
        double Salary;
        int Emp_year;
        String Insurance_num;
        Employee(String name,double salary,int year,String Ins_num){
                super(name);
                Salary = salary;
                Emp_year = year;
                Insurance_num = Ins_num;
        }
        public void SetSalary(double salary){
                salary = salary;
        }
        public void SetYear(int year){
                Emp_year = year;
        }
        public void Setnum(String Ins_num){
                Insurance_num = Ins_num;
        }
        public double GetSalary(){
                return Salary;
        }
        public int Getyear(){
                return Emp_year;
        }
        public String Getnum(){
                return Insurance_num;
        }
        public String Details(){
                return super.GetName()+" "+Salary+" "+Emp_year+" "+Insurance_num;
    }
}