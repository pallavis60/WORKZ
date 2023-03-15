public class LoopArray{
	public static void main(String[]args){
		String[] animals = {"Lion","Cat","Dog","Cow","Rabbit"};
		byte marks[] = {76,89,67,34,87,90};
		//float[] percentage = {67.8F,89.9F,45.7F,34.8F,67.9F};
		
		
		for(int i=0; i<=4; i++){
			System.out.println(animals[i]);
		}
		
		for (int i=0; i<=5; i++){
			System.out.println(marks[i]);
		}
		
		
		
		Program2.grade='A';
		Program2.value=566;
		
		if(Program2.institute == "Pallavi"){
			System.out.println("Its Ture");
		}
		else{
			System.out.println("Its False");
		}
		
		if(Program2.number!=767468746){
			System.out.println("Its true");
		}
	    else{
		  System.out.println("Its False");
			}
			
		if(Program2.percentage==67.99D){
			System.out.println("Its True");
		}	
		else{
			System.out.println("Its False");
		}
		
		if(Program2.grade!='A'){
			System.out.println("Its True");
		}
		else{
			System.out.println("Its False");
		}
		if(Program2.value==676){
			System.out.println("Its True");
		}
		else{
			System.out.println("Its False");
		}
				}
public static class Program2{
	static String institute = "Xworkz";
	static int number = 775874874;
	static double percentage = 67.99D;
	static char grade;
	static short value;
	 
	
}
				
				
}
