package InheritanceAssignment2;

public class Person {
        private String name;
        Person(String name){
                this.name=name;
        }
        public void SetName(String n){
                name=n;
        }
        public String GetName(){
                return name;
        }
}