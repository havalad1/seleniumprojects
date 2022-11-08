package Day47;

class Student
{
	String name;
	String course;
	long contactnumber;
	int ratings;
	public Student(String name, String course, long contactnumber, int ratings) 
	{
		this.name = name;
		this.course = course;
		this.contactnumber = contactnumber;
		this.ratings = ratings;
	}
	public String toString()
	{
		return name+" "+course+" "+contactnumber+" "+ratings;
	}
	
}
public class Program1 {
public static void main(String[] args) 
{
	Student [] ar=new Student[4];
	
	Student s1=new Student("sam", "java", 1236547980, 11);
	ar[0]=s1;
	ar[1]=new Student("bill","selenium",3216549870l,22);
	ar[2]=new Student("maxx","java",9874563210l,11);
	ar[3]=new Student("matt","selenium",6541230987l,11);
	
	for (int i = 0; i < ar.length; i++) 
	{
		System.out.println(ar[i]);
	}
}
}
