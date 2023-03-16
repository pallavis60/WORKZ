public class IfElse{
	public static void main(String[]args){
		byte[] number = {56,67,98,67,45,83,20,75};
       for(int i=0; i<number.length; i++){
		   System.out.println(number[i]);
	   
	   }


   if(number[1]==67){
	System.out.println("Statment is true");
}
else{
	System.out.println("Statment is false");
}

  if(number[2]==56){
	  System.out.println("Statment is true");
  }
  else{
	  System.out.println("Statment is false");
  }
  if(number[3]!=89){
	  System.out.println("Statment is true");
  }
  else{
	  System.out.println("Statment is false");
  }
  if(number[4]==45){
	  System.out.println("Statment is True");
  }
  else{
	  System.out.println("Statment is false");
  }
  if(number[5]!=45){
	  System.out.println("Statment is true");
  }
  else{
	  System.out.println("Statment is false");
  }
	   
	
	
}
}