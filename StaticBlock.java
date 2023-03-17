public class StaticBlock{
	public static void main(String[]args){
		
		StaticMethod.call();
		StaticMethod.work();
		
		StaticMethod review = new StaticMethod();
		System.out.println(review.company);
		System.out.println(review.employs);
		System.out.println(review.salary);
		
		System.out.println(StaticMethod.institute);
		System.out.println(StaticMethod.fee);
		System.out.println(StaticMethod.students);
		System.out.println(StaticMethod.members);
		System.out.println(StaticMethod.percentage);
		
	}
	
	
	
	
	
	public  static class StaticMethod{
		static String institute;
		static short fee;
		static byte students ;
		static short members ;
		static float percentage ;
		String company = "Infosys";
		short employs = 10000;
        int salary = 50000;
		
		static{
			institute="xworkz";
			fee=30000;
			students= 10;
			members = 200;
			percentage=80.33F;
		}
		public StaticMethod(){
			System.out.println("Using Constructor");
		}
		
		
		public static void call(){
			System.out.println("Do Call");
		}
		public static void work(){
			System.out.println("Do Work");
		}
		
		
	}
}