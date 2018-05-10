
public class Transaction {
	private int from;
	private int to;
	private int value;
	private String nota;
	private FirmaDigital signature;
	
	public Transaction(int f,int t,int v,String n,FirmaDigital s) {
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
	public FirmaDigital getSignature(){
		return signature;
	}
}
