package Day41;
class LapTop
{
	boolean internet=true;
	void browser()
	{
		System.out.println("open the browser");
	}
}
class NoteBook
{
	void pages()
	{
		System.out.println("pages to write");
	}
}
class Pen
{
	void provideink()
	{
		System.out.println("provide ink to write");
	}
}
class Student
{
	void onlineclass(LapTop ref)
	{
		System.out.println(ref.internet);
		ref.browser();
	}
	void takenotes(NoteBook n1,Pen p1)
	{
		n1.pages();
		p1.provideink();
	}
}
public class Program8 {
	public static void main(String[] args) {
		Student ref=new Student();
		ref.onlineclass(new LapTop());
		ref.takenotes(new NoteBook(),new Pen());
	}
}
