public class ALoop{
	public static void main(String[]args){
	    int[] population = {52000, 30000, 20000, 50000,39000, 322000};
		long trees[]  = {4665767L, 56768L, 6876879L, 68787L, 697980L};
		char[] vitamin = {'A', 'B', 'C', 'D' };
		float[] percentage = {45.5F, 67.9F, 67.9F, 45.8F, 78.9F};
		double[] intrest = {34.77D, 67.22D, 23.22D, 4.55D};
		boolean[] isThisHoliday = {true, false};
		
		
		
		for(int i=0; i<=5; i++){
			System.out.println(population[i]);
		};
		
		for(int i=0; i<=4; i++){
			System.out.println(trees[i]);
		};
		
		for(int i=0; i<=3; i++){
		System.out.println(vitamin[i]);
		};
		
		for(int i=0; i<=4; i++){
			System.out.println(percentage[i]);
		};
		
		for(int i=0; i<=3; i++){
			System.out.println(intrest[i]);
		};
		
		for(int i=0; i<=1; i++){
			System.out.println(isThisHoliday[i]);
		} 
		
}
}