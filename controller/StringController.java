// StringController

package controller;
import domain.StringData;
import service.StringService;
import service.impl.StringServiceImpl;

public class StringController{
	
	public void callController(){
	
		StringData stringData = new StringData();
		StringServiceImpl stringServiceImpl = new StringServiceImpl();
		
		stringServiceImpl.getString(stringData);
		System.out.println("Your String is '" + stringServiceImpl.printString(stringData) + "'");
		System.out.println("String Length :: " + stringServiceImpl.findStringLength(stringData)); //1
		stringServiceImpl.findCharacterAtGivenIndex(stringData); //2 
		stringServiceImpl.findUnicoadPointAtGivenIndex(stringData); //3
		stringServiceImpl.findUnicoadPointBeforeGivenIndex(stringData);//4
		stringServiceImpl.countTheNumberOfUnicoadPointInRange(stringData); //5
		System.out.println(" Output :: " + stringServiceImpl.compareTwoStringLexicographically(stringData)); //6
		System.out.println("Output :: " + stringServiceImpl.compareTwoStringLexicographicallyIgnoreCase(stringData)); //7
		System.out.println("Output :: " + stringServiceImpl.concatenationOfGivenString(stringData)); //8
		System.out.println("Output :: " + stringServiceImpl.containsSpecifiedCharSequence(stringData)); //9
		System.out.println("Output :: " + stringServiceImpl.contentEqualsOfStringBuffer(stringData)); //11
		
	}
}