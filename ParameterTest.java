public class ParameterTest{
	public static void main(String[] args){
	ParameterTest();
	ParameterTest(567658);
	ParameterTest(76577678,66575677L);
	
	
	
	}
	 
 
	public static void ParameterTest(){
		System.out.println("FirstMethod");
	};
	
	public static void ParameterTest(int value){
		System.out.println("SecondMethod");
	};
	public static void ParameterTest(int value,long number){
		System.out.println("Thirdmethod");
		
	};
	public static void ParameterTest(short no){
		System.out.println("FourthMethod");
		
	};
	public static void ParameterTest(long number,int value){
		System.out.println("FifthMethod");
		
	};
	public static void ParameterTest(float percentage,long no){
		System.out.println("SixthMethod");
	};
 
	
	
	
}