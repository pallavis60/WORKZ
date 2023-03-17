public class Variables{
	         String animal;
		     byte number;
		     int population;
		     long value;
		     float percentage;
		     double intrest;
			 short marks;
			 byte number2;
			 long value2;
			 float per;
	
	
 	public static void main(String[] args){
		
		
		 Variables every = new Variables("Cow");
	     System.out.println(every.animal);
		 
		 Variables every2 =new Variables("Dog",(byte)56);
		 System.out.println(every2.animal);
		 System.out.println(every2.number);
		 
		  Variables every3 =new Variables("Cat",(byte)56, 67766);
		  System.out.println(every3.animal);
		  System.out.println(every3.number);
		  System.out.println(every3.population);
		  
		  Variables every4 =new Variables("Dog",(byte)96, 67766,66636363L);
		  System.out.println(every4.animal);
		  System.out.println(every4.number);
		  System.out.println(every4.population);
		  System.out.println(every4.value);
		  
		  Variables every5 = new Variables("Cow",(byte)76, 67766,66636363L,56.8F);
		  System.out.println(every5.animal);
		  System.out.println(every5.number);
		  System.out.println(every5.population);
		  System.out.println(every5.value);
		  System.out.println(every5.percentage);
		  
		  Variables every6 = new Variables("Cow", (byte)56, 67766,66636363L,56.8F,65.999D);
		  Variables every7 =new Variables("Cow", (byte)56, 67766,66636363L,56.8F,65.99D,(short)300);
		  Variables every8 =new Variables("Cow", (byte)56, 67766,66636363L,56.8F,65.99D,(short)300,(byte)67);
          Variables every9 =new Variables("Cow", (byte)56, 67766,66636363L,56.8F,65.99D(short)300,(byte)65,87778709L);
		 Variables every10 =new Variables("Cow", (byte)56, 67766,66636363L,56.8F,65.99D,(short)300,(byte)67,8878777L,89.9F);
			
}
	
	
	  public Variables(String animal){
		this.animal=animal;
	}
	public Variables(String animal,byte number){
		this.animal=animal;
		this.number=number;
	}
	public Variables(String animal,byte number,int population){
		this.animal=animal;
		this.number=number;
		this.population=population;
	}
	public Variables(String animal,byte number,int population,long value){
		this.animal=animal;
		this.number=number;
		this.population=population;
		this.value=value;
	}
	public Variables(String animal,byte number,int population,long value,float percentage){
		this.animal=animal;
		this.number=number;
		this.population=population;
	    this.value=value;
		this.percentage=percentage;
}

  public Variables(String animal,byte number,int population,long value,float percentage,double intrest){
		this.animal=animal;
		this.number=number;
		this.population=population;
		this.value=value;
		this.percentage=percentage;
		this.intrest=intrest;
}

    public Variables(String animal,byte number,int population,long value,float percentage,double intrest,short marks){
		this.animal=animal;
		this.number=number;
		this.population=population;
		this.value=value;
		this.percentage=percentage;
		this.intrest=intrest;
		this.marks=marks;
}
        public Variables(String animal,byte number,int population,long value,float percentage,double intrest,short marks, byte number2){
		this.animal=animal;
		this.number=number;
		this.population=population;
		this.value=value;
		this.percentage=percentage;
		this.intrest=intrest;
		this.marks=marks;
		this.number2=number2;
}
       public Variables(String animal,byte number,int population,long value,float percentage,double intrest,short marks, byte number2,long value2){
		this.animal=animal;
		this.number=number;
		this.population=population;
		this.value=value;
		this.percentage=percentage;
		this.intrest=intrest;
		this.marks=marks;
		this.number2=number2;
		this.value2=value2;
}
      
      

}