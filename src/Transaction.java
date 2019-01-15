
public class Transaction {
	public User buyer;
	public User seller;
	public Product product;
	public State[] allS;
	public Transaction() {
	
	}
	public boolean isValid() {
		if(!(allS[0] instanceof Order)) return false;
		for (int i = 0; i < allS.length-1; i++) {
			if(!allS[i].happensBefore(allS[i+1])) return false;
		}
		return true;
	}
	
}
