class Person {
    protected String mName;
    protected String mDateOfBirth;
    
    public Person(String name, String dateOfBirth) {
        this.mName = name;
        this.mDateOfBirth = dateOfBirth;
    }
    
    public String getName() {
        return mName;
    }
    
    public String getDateOfBirth() {
        return mDateOfBirth;
    }
    
    public void setName(String name) {
        this.mName = name;
    }
    
    public void setDateofBirth(String dateOfBirth) {
        this.mDateOfBirth = dateOfBirth;
    }
    
    public String toString() {
        return mName + " " + mDateOfBirth;
    }
}

class Teacher extends Person {
    private int mSalary;
    private String mSubject;
    
    public Teacher(String name, String dateOfBirth, int salary, String subject) {
        super(name,dateOfBirth);
        this.mSalary = salary;
        this.mSubject = subject;
    }
    
    public int getSalary() {
		return mSalary;
	}

	public void setSalary(int mSalary) {
		this.mSalary = mSalary;
	}

	public String getSubject() {
		return mSubject;
	}

	public void setSubject(String mSubject) {
		this.mSubject = mSubject;
	}

	public String toString() {
        return super.toString() + " " + mSalary + " " + mSubject;
    }
}

class Student extends Person {
    protected int mStudentId;
    
    public Student(String name, String dateOfBirth, int studentId) {
        super(name,dateOfBirth);
        this.mStudentId = studentId;
    }
    
    public int getStudentId() {
		return mStudentId;
	}

	public void setStudentId(int mStudentId) {
		this.mStudentId = mStudentId;
	}

	public String toString() {
        return super.toString() + " " + mStudentId;
    }
}

class CollegeStudent extends Student {
    private String mCollegeName;
    private String mYear;
    
    public CollegeStudent(String name, String dateOfBirth, int studentId, String collegeName, String year) {
        super(name, dateOfBirth, studentId);
        this.mCollegeName = collegeName;
        this.mYear = year;
    }
    
    public String toString() {
        return super.toString() + " " + mCollegeName + " " + mYear;
    }
    
    public String getCollegeName() {
		return mCollegeName;
	}

	public void setCollegeName(String mCollegeName) {
		this.mCollegeName = mCollegeName;
	}

	public String getYear() {
		return mYear;
	}

	public void setYear(String mYear) {
		this.mYear = mYear;
	}
}

public class Main
{
	public static void main(String[] args) {
		Person p1 = new Person("ABC","23/03/1997");
		System.out.println("Person1 = " + p1.toString());
		
		Teacher t1 = new Teacher("Mr PQR","03/03/1990",20000,"Maths");
		System.out.println("Teacher1 = " + t1.toString());
		
		Student s1 = new Student("XYZ","23/03/1997",123);
		System.out.println("Student1 = " + s1.toString());
		
		CollegeStudent cs1 = new CollegeStudent("CDE","12/12/1996",235,"Happy University","Fourth");
		System.out.println("CollegeStudent1 = " + cs1.toString());
	}
}