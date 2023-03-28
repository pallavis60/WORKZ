public class Earth{
	  Layer surface ;
      static float age = 67.8F;
      static int size = 687687;
	  
	  
	  public Earth(Layer surface){
		  this.surface = surface;
		  
	  }
	 
	 public static void main(String[] args){
		 
	 Earth earthdetail = new Earth(Layer.Dense);
      System.out.println(earthdetail.surface);
	  System.out.println(Earth.age);
     System.out.println(Earth.size);
	 
	 
	 }
 		
 enum Layer{ 
		Dense, HotInnerCore, MoltenOuterCore,mantleCore,ThinCrust;
	
	 }  
}