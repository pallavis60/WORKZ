public class ConstructorTest{
	
	
    public ConstructorTest(){
		System.out.println("First");
	}
	
	public ConstructorTest(String name){
		this(566787D);
		System.out.println("Second ");
		
	}
	
	   public ConstructorTest(double value){  
	    this(true);
		System.out.println("Third");
		
	}
	
	public ConstructorTest(boolean isThisName){
		this(56.7F);
		System.out.println("Fourth ");
	}
	
	public ConstructorTest(float number){
	this();
	
		System.out.println("Fifth ");
	}
	
	public static void main(String[]args){
		ConstructorTest name = new ConstructorTest("XWorkz");
	}
}