public class Parameter{
	public static void main(String[]args){
		number(10);
		rollNo(200 , "Nikitha");
		students(300,"XWorkz", 80.9F);
		review("Shivamogga", 565678676767687L,56557876,30.5656D);
		
	}
	public static int number(int value){
		System.out.println(value);
		return 10;
	};
	public static short rollNo(int num, String name){
		System.out.println(name);
		System.out.println(num);
		return 300;
	};
	public static long students(int num ,String name , float percentage){
		System.out.println(num);
		System.out.println(name);
		System.out.println(percentage);
		return 12168768768L;
	};
     public static String review(String name, long population, int mens, double percentage){
		 System.out.println(name);
		 System.out.println(population);
		 System.out.println(mens);
		 System.out.println(percentage);
		 return name;
		 
	 }
	 
	 }
