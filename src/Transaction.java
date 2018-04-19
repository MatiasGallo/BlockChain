
public class Transaction {
	private int from;
	private int to;
	private int value;
	private String nota;
	private long signature;
	
	public Transaction(int f,int t,int v,String n,long s) {
		from = f;
		to = t;
		value = v;
		nota = n;
		signature = s;
	}
	public int getFrom(){
		return from;
	}
	public int getTp(){
		return to;
	}
	public int getValue(){
		return value;
	}
	public String getNota() {
		return nota;
	}
	public long getSignature(){
		return signature;
	}
}
