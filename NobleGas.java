public class NobleGas{
	  Elements namesOfNobleGas;
	  static  byte noOfNobleGasPresent = 6;
	  static String largestNobleGas = "xenon";
	  static String smallestNobleGas = "Helium";
	  static  byte atomicNoOfHelium = 2;
	  
	  
	  public NobleGas(Elements namesOfNobleGas){
		  this.namesOfNobleGas=namesOfNobleGas;
	  }
	 
	 
	 public static void main(String[] args){
		 
		NobleGas obj = new NobleGas(Elements.Helium);
		System.out.println(obj.namesOfNobleGas);
		
		System.out.println(NobleGas.noOfNobleGasPresent);
		System.out.println(NobleGas.largestNobleGas);
		System.out.println(NobleGas.smallestNobleGas);
		System.out.println(NobleGas.atomicNoOfHelium);
	 
	 
	
	 }
}
enum Elements{
	Helium("He"),Argon("Ar"),Krypton("Kr"),Neon("Ne"),Xenon("Xe"),Radon("Rn"),Organesson("Og");
	
	String chemistry;
	
	
	
	 Elements(String chemistry){
	  this.chemistry = chemistry;
	   }
}
 