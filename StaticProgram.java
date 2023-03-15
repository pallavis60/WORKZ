public class StaticProgram{
	public static void main(String[] args){
		
		Program object = new Program();
		System.out.println(object.value);
		System.out.println(object.number);
		System.out.println(object.name);
		System.out.println(object.totalNo);
		System.out.println(object.percentage);
		
		
		System.out.println(Program.institute);
		System.out.println(Program.amount);
		System.out.println(Program.no);
		System.out.println(Program.digit);
		System.out.println(Program.intrest);
		
		
	}


public static class Program{
	public Program(){
		System.out.println("Every Time");
	}
	String name = "Pallavi";
	int value = 76767;
	short number = 676;
	long totalNo = 55667778L;
	float percentage = 78.9F;
	static String institute  ="Xworkz" ;
	static int amount = 637773;
	static short no = 789;
	static long digit = 67838800L;
	static double intrest = 98.55D;
	
}
}