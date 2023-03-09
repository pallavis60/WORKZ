public class ReturnType{
	public static void main(String[] args){
		byte totalStudents = students();
		System.out.println(totalStudents);
		
		short noOfPages = book();
		System.out.println(noOfPages);
		
		int cars = car();
		System.out.println(cars);
		
		long populationOfIndia = population();
		System.out.println(populationOfIndia);
		
		float percent = percentage();
		System.out.println(percent);
		
		double value = eluerNo();
		System.out.println(value);;
		
		boolean called = call();
		System.out.println(called);
		
		char carrot = vitamin();
		System.out.println(carrot);
	}
	public static  byte students(){
		byte noOfStudents = 121;
        return noOfStudents;
	};
	public static short book(){
		short pagesInABook = 300;
		return pagesInABook;
	};
	public static int car(){
		int carsInBTM = 40000;
		return carsInBTM;
	};
	public static long population(){
		long populationInIndia = 146789005786786L;
		return populationInIndia;
	};
	public static float percentage(){
		float percentageOfStudent = 80.5F;
		return percentageOfStudent;
	};
	public static double eluerNo(){
		double eluerNoValue = 2.71828128459045D;
		return eluerNoValue;
	};
	public static boolean call(){
		boolean isSheCalled = false;
		return isSheCalled;
	};
	public static char vitamin(){
		char VitaminInCarrot = 'A';
		return VitaminInCarrot;
	} 
	
}






