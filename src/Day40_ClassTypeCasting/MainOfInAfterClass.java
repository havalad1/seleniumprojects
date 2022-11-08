package Day40_ClassTypeCasting;

public class MainOfInAfterClass {
public static void main(String[] args) {
	StudentInClass s1=new StudentAfterClass();
	//StudentAfterClass s2=(StudentAfterClass)new StudentInClass();
	s1.coding();
	//its present but hidden s1.attitude();
}
}
