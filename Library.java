public class Library{
	final String name = "Central library";
	final byte numberOfReadngRooms = 15;
	final String location = "Banglore Karnataka";
	final int started = 1914;
	final String donatedBy = "Dewan Sir M Visveswaraya";
	final String anotherName = "Sir Sheshadri Lyer Library";
	static int totalBooks = 3140000;
	static byte  numberOfEmployees = 50;
	static int newspapers = 200;
	static int periodicals = 300;
	static String timingOfLibrary = "8Am to 9Pm";
	short numberOfReaders = 2388;
	byte noOfLibraryCardsTaken = 50;
	int salaryOfEmployees = 90000;
	boolean isIBorrowBooks = false;
   static int noOfliteratureBooks = 160000;
    Branch   branches;
	 HolyBooks books;
	 Every sections;
    Language availablelanguageBook;
	Book availableOscarAwardBooks;
	
	public Library(HolyBooks books,Branch branches,Every section, Language availablelanguageBook,Book availableOscarAwardBooks){
		this.books = books;
		this.branches = branches;
		this.section = section;
		this.availablelanguageBook=availablelanguageBook;
		this.availableOscarAwardBooks=availableOscarAwardBooks
	}
	public static void main(String[] args){
		starttsWithM1("Central library");
		lastIndexOfM2("EveryMethod");
		containsM3("ContainsDate");
		joinM4("StringValues");
		isEmptyM5("This method");
		toLowerCaseM6("nameOfLibrary");
		codePointCountM7("EveryProgram");
		lengthM8("EveyCode");
		offsetByCodePointsM9("Banglore");
		equalsM10();
		
		
		Library obj = new Library(HolyBooks.Gita);
		System.out.println(obj.books);
	
	}
	//StringMethods
	public static boolean starttsWithM1(String name){
		boolean result = name.startsWith("Central");
		System.out.println(result);
		return false;
	}
	 public static int lastIndexOfM2(String anotherName){
		 int value = anotherName.lastIndexOf('S');
		 System.out.println(value);
		 return 1; 
	}
	
	public static boolean containsM3(String location){
		boolean ans = location.contains("Karnataka");
		System.out.println(ans);
		return true;
	}
	public static String joinM4(String donatedBy){
		String sequence = donatedBy.join("-","Visveswaraya","Year");
		System.out.println(sequence);
		return "StringValue";
	}
	public static boolean isEmptyM5(String donatedBy){
		boolean result = donatedBy.isEmpty();
		System.out.println(result);
		return true;
	  }
	   public static String toLowerCaseM6(String name){
		System.out.println(name.toLowerCase());
		return "Chage";
	   }
    	public static int codePointCountM7(String name){
		int thisValue = name.codePointCount(1,7);
		System.out.println(thisValue);
		return 76;
	  }
	    public static byte[] lengthM8(String name){
		byte[] section = {56,54,89};
		for(int i=0; i<section.length;i++){
			System.out.println(section[i]);
		}
		byte[] sectionOf = name.getBytes();
		System.out.println(sectionOf);
		return section;
	   }
       public static int offsetByCodePointsM9(String location){
	   int dataValue = location.offsetByCodePoints(1,4);
	   System.out.println(dataValue);
	    return 767;
	   }
	  
    public static void equalsM10(){
	  String a1= new String("Banglore");
	  String a2 = new String("Shivamogga");
	  System.out.println(a1.equals(a2)) ;
	    }
		//EnumVariables;
		
		enum HolyBooks{
			Gita, Bible, GuruGranth, Quran, Tripitaka;
		}
		enum Branch{
			SouthEndCircle, OppositeRangamandir, StudyCenter, KatriguppeBranch;
		}
		enum Evey{
			SectionA, SectionB, SectionC
			}
	   enum Language{
		   Kannada, English,Hindi , Telgu , Tamil;
				}
		enum Book{
			SlumdogMillionaire, SchindlersList, ABeautifulMind,GoneWithTheWind;
		}
}