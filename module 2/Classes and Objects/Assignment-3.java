import java.util.*;
public class Patient {
    String patientName;
    double height,weight;
    Patient(String patientName,double height,double weight){
        this.patientName=patientName;
        this.height=height;
        this.weight=weight;
    }
    double computeBMI(){
        return weight/(height*height);
    }
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        double height,weight;
        String name;
        System.out.println("Enter Name of the Patient: ");
        name=scan.nextLine();
        System.out.println("Enter Height of the Patient: ");
        height=scan.nextDouble();
        System.out.println("Enter Weight of the Patient: ");
        weight=scan.nextDouble();
        Patient p=new Patient(name,height,weight);
        double bmi=p.computeBMI();
        System.out.println("BMI of the Patient: "+bmi+" Kg/m^2");
        
    }
}