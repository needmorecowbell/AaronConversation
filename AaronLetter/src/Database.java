
public class Database {
	private int [] charValues;
	
	public Database(){
		this.fillArray();
	}
	private void fillArray(){
		this.charValues = new int[91];
		for(int x=0;x<91;x++){
			charValues[x]= x+32;
		}
	}
	public char getLetter(int arrayIndex){
		int val= charValues[arrayIndex];
		return(char)val;
	}
}
