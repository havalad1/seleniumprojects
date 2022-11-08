package Day40_ClassTypeCasting; //written for practice from class

public class MainOfV1V2 {
public static void main(String[] args) {
	Version_1_2  v1=new Version2();
	Version2 v2=(Version2) new Version_1_2();
}
}
