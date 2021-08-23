package AssignmentSec;

public class Studentsss {
	String Name;
	int Age;
	char Section;
	char Gender;
	int subj1,subj2,subj3,totalM;
	float percentage ;
	public Studentsss (String name,int age,char section,char gender,int subject1,int subject2,int subject3)
	{
		Name =name;
		Age =age ;
		Gender =gender;
		Section = section;
		subj1=subject1;
		subj2=subject2;
		subj3=subject3;
		
		
	}
	public Studentsss(String N,int A, char G,char S,int subject2,int subject3)
	{
		Name = N ;
		Age= A;
		Gender =G;
		Section = S;
		subj2=subject2;
		subj3=subject3;
	}
	public void cal() {
		int total = subj1+subj2+subj3;
		percentage =(total *100)/300;
		System.out.println("The Name of student is  "+ Name + "  Age is : "+ Age + "  Gender : "+ Gender+ "  Section : " +Section);
		System.out.println("Total marks of students : "+ total);
		System.out.println("percentage : "+percentage);
	}
	public static void main(String[]args)
	{
		int subj1,subj2,subj3;
		Studentsss students1 = new Studentsss("SCAP",20, 'M' ,'A', 75,85,89);
		Studentsss students2 = new Studentsss("HULK",20, 'M' ,'A', 70,75);
		Studentsss students3 = new Studentsss("GDTH",20, 'M' ,'A', 68,72);
		Studentsss students4 = new Studentsss("BLWD",20, 'M' ,'A', 67,70);
		students1.cal();
		students2.cal();
		students3.cal();
		students4.cal();
		
	}
}
