
public class FirmaDigital {
	private int privatekey;
	private int publickey;
	
	public FirmaDigital(int prik,int pubk) {
		privatekey = prik;
		publickey = pubk;
	}
	
	public long Firmar(int from,int to, int value) {
		return from*to*value*privatekey; ///Suponemos multiplicar para crear hash
	}
}
