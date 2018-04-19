
import java.util.Vector;

public class Bloque {
	int indice;
	long tiempo;
	Vector<Transaction> transacciones;
	long proofOfWork;
	long hashAnterior;
	
	public Bloque(int i,long t,Vector<Transaction> tr,long pf,long hA) {
		indice = i;
		tiempo = t;
		transacciones = tr;
		proofOfWork = pf;
		hashAnterior = hA;
	}
	
	public long calculateHash() {
		return (long)indice*hashAnterior*proofOfWork;
	}
	public int getIndice(){
		return indice;
	}
	public long getTiempo(){
		return tiempo;
	}
	public Vector<Transaction> getTransacciones(){
		return transacciones;
	}
	public long getProofOfWork(){
		return proofOfWork;
	}
	public long getHashAnterior(){
		return hashAnterior;
	}
	}