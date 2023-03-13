public class Constructing{
	
	short number = 1000;
	
	
    public Constructing(){
		
		
		System.out.println("First Method");
	}
	
	public Constructing(String name){
		this('A');
		System.out.println("Second Method");
		
	}
	
	   public Constructing(char value){  
	    this((short)400);
		System.out.println("Third Method");
		
	}
	
	public Constructing(int num){
		this(56.7F);
		System.out.println("Fourth Method");
	}
	
	public Constructing(float number){
	this();
	
		System.out.println("Fifth Method");
	}
	
	public static void main(String[]args){
		Constructing name = new Constructing("name");
	}
}