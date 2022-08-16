// StringService

package service;
import domain.StringData;

public interface StringService{
	public void setData(StringData stringData);
	public String printData(StringData stringData);
	public int findStringLength(StringData stringData);
	public void findCharacterAtGivenIndex(StringData stringData);
	public void findUnicoadPointAtGivenIndex(StringData stringData);
	public void findUnicoadPointBeforeGivenIndex(StringData stringData);
	public void countTheNumberOfUnicoadPointInRange(StringData stringData);
	public int compareStringLexicographically(StringData stringData);
	public int compareTwoStringLexicographicallyIgnoreCase(StringData stringData);
	public String concatenationOfGivenString(StringData stringData);
	public boolean containsSpecifiedCharSequence(StringData stringData);
	public boolean contentEqualsOfStringBuffer(StringData stringData);
}