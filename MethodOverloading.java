rdepublic class MethodOverloading{
	
	public static void main(String [] args){
		
		institute();
		byte value = 35;
		institute("XWorkz",67687,value);
		
		//call(57657657L);
		
		//work(34565,"XWorkz");
	}
	
	public static String institute(){
		System.out.println("My Institute");
		return "Workz";
	};
	
	public static String institute(String name){
	System.out.println("My Institute");
	return name;
   };
   
    public static String institute(String name,int num){
	System.out.println("My Institute Is");
	return name;
   };
   
   public static String institute(String name, int value, byte num ){
	   System.out.println("My Institute Is XWorkz");
	   return name;
   };
   
   public static String institute(String name, int value, byte num,float percentage){
	   System.out.println("My Institute is xworkz");
	   return name;
   };
   
   public static void call(long num){
	   System.out.println("Can I Call");
   };
   
   public static void call(String name){
   System.out.println("Can I Call Now");
   };
   
   public static void call(int num){
	   System.out.println("Can I Call You Now");
   };
   
   public static void call(float percentage){
	   System.out.println("Can I Call You Now");
   };
   
   public static void call(double percentage){
	   System.out.println("Can I Do Call");
   };
   
   public static void work(int num,String name){
	   System.out.println("Do Work");
   };
   
   public static void work(String name, int num){
   System.out.println("Doing Work");
   };
   public static void work(String name,int num,float percentage){
	   System.out.println("Do Some Work");
   };
   
   public static void work(int num,String name,float percentage){
	   System.out.println("Doing Some Work");
   };
   public static void work (float percentage,int num, String name){
	   System.out.println("Do Works");
   
   
}