import java.sql.Time;
import java.util.Vector;


public class Nodo {
	private Vector<Bloque> cadenaBloque;
	private Vector<Transaction> poolOfTs;
	private int n;
	
	
	public Nodo(Vector<Bloque> vc,Vector<Transaction> vt,int n1) {
		cadenaBloque = vc;
		poolOfTs = vt;
		n = n1;
	}
	
	public Vector<Transaction> getPool(){
		return poolOfTs;
	}
	
	public int CalcularHash(int PW,Vector<Transaction> poolOfT) {
		return PW*poolOfT.size(); //Representacion de calculo del hash
	}
	
	private Bloque GenBloque() {
		long hash = 0;
		int proofW = 0;
		Bloque b = null;
		while ((hash / 2 ) != 0){
			proofW++;
			b = new Bloque(cadenaBloque.lastElement().getIndice()+1,System.nanoTime(),poolOfTs,proofW,cadenaBloque.lastElement().calculateHash());
			hash = b.calculateHash();
		}
		return b;
		
	}
	
	public void iniciar() {
		while(true) {
			if (poolOfTs.size() == n)
				GenBloque();
		}
	}
}
