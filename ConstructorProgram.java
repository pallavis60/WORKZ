public class ConstructorProgram{  

	   public ConstructorProgram(){
		System.out.println("New One");
			
		};
		
		public ConstructorProgram(int value){
		System.out.println("Second one");
			
		};

        public ConstructorProgram (String newname){
         System.out.println("Third One");
			 
		 };
		 
        public ConstructorProgram(long nearvalue){
           System.out.println("Fourth one");
			   
		   };

         public ConstructorProgram(float percentage){
           System.out.println("Fifth one");	   
	}
	     public static void main(String[] args){
		
		ConstructorProgram name = new ConstructorProgram();
		
		ConstructorProgram value = new ConstructorProgram(45545); 
		
		ConstructorProgram newname = new ConstructorProgram("X workz");
		
		ConstructorProgram nearvalue = new ConstructorProgram(4556567L);
		
		ConstructorProgram percentage = new ConstructorProgram (56.9F);
		
		
    
        }
	
}	
