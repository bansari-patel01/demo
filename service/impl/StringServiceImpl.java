// StringServiceImpl

package service.impl;
import java.util.Scanner;
import domain.StringData;
import service.StringService;


public class StringServiceImpl{
	
	Scanner sc = new Scanner(System.in);
	
	public void getString(StringData stringData){
		
		System.out.print("Enter Your String :: ");
		String str = sc.nextLine();
		stringData.setData(str);
		
	}
	
	public String printString(StringData stringData){
		
		System.out.println("\nPrinting the given string..");
		return stringData.getData();
		
	}
	
	public int findStringLength(StringData stringData){
		
		System.out.println("\nFinding the length of the string..");
		return stringData.getData().length();
		
	}
	
	public void findCharacterAtGivenIndex(StringData stringData){
		
		System.out.println("\nFinding the character at given Index..");
		String str = stringData.getData();
		System.out.print("Enter index number :: ");
		int iIndex = sc.nextInt();
		
		try{
			
			System.out.println("Character at given index is '" + str.charAt(iIndex) + "'");
			
		}catch(StringIndexOutOfBoundsException e){
			
			System.out.println("Please enter valid index number");
			
		}
		
	}
	
	public void findUnicoadPointAtGivenIndex(StringData stringData){
		
		System.out.println("\nFinding the unicoad point at given index..");
		String str = stringData.getData();
		System.out.print("Enter index number :: ");
		int iIndex = sc.nextInt();
		
		try{
			
			System.out.println("Unicoad coad point at given index is '" + str.codePointAt(iIndex) + "'");
			
		}catch(StringIndexOutOfBoundsException e){
			
			System.out.println("Please enter valid index number");
			
		}
		
	}
	
	public void findUnicoadPointBeforeGivenIndex(StringData stringData){
		
		System.out.println("\nfinding the unicoad point before the given index..");
		String str = stringData.getData();
		System.out.print("Enter index number :: ");
		int iIndex = sc.nextInt();
		
		try{
			
			System.out.println("Unicoad coad point before given index is '" + str.codePointAt(iIndex - 1) + "'");
			
		}catch(StringIndexOutOfBoundsException e){
			
			System.out.println("Please enter valid index number");
			
		}
		
	}
	
	public void countTheNumberOfUnicoadPointInRange(StringData stringData){
		
		System.out.println("\nCounting the number of unicoad point in the specified text range");
		String str = stringData.getData();
		System.out.print("Enter lower limit :: ");
		int iLowerLimit = sc.nextInt();
		System.out.print("Enter upper limit :: ");
		int iUpperLimit = sc.nextInt();
		
		try{
			
			System.out.println("Total count of Unicoad points in the specified text range is '" + str.codePointCount(iLowerLimit,iUpperLimit) + "'");
			
		}catch(Exception e){
			
			System.out.println(e);
			
		}
	}
	
	public int compareTwoStringLexicographically(StringData stringData){
		
		System.out.println("\nComparing two strings lexicographically..");
		String str1 = stringData.getData();
		System.out.print("Enter your second string : ");
		String str2 = sc.nextLine();		
		return (str1.compareTo(str2)); 
		
	}
	
	public int compareTwoStringLexicographicallyIgnoreCase(StringData stringData){
		
		System.out.println("\nComparing two strings lexicographically(Ignoring case differences)..");
		String str1 = stringData.getData();
		System.out.print("Enter your second string : ");
		String str2 = sc.nextLine();		
		return (str1.compareToIgnoreCase(str2)); 
		
	}
	
	public String concatenationOfGivenString(StringData stringData){
		
		System.out.println("\nConcatenation of two strings..");
		String str1 = stringData.getData();
		System.out.print("Enter your second string : ");
		String str2 = sc.nextLine();
		return str1.concat(str2);
		
	}
	
	public boolean containsSpecifiedCharSequence(StringData stringData){
		
		System.out.println("\nTest if a given string contains the specified sequence of character values..");
		String str = stringData.getData();
		CharSequence cs = "ri";
		return (str.contains(cs));		
		
	}
	
	public boolean contentEqualsOfStringBuffer(StringData stringData){
		
		System.out.println("\nCompare a given String to specified string buffer");
		String str = stringData.getData();
		StringBuffer strBuffer = new StringBuffer("Patel");
		return (str.contentEquals(strBuffer));
		
	}
}
