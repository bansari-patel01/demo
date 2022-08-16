
// StringData

package domain;

public class StringData{
	
	String str;
	
	public StringData(){}
	
	public void setData(String str){
		this.str = str;
	}
	
	public String getData(){
		return str;
	}
	
	public String toString(){
	return "[Your String is '" + str + "']";
	}
	
}