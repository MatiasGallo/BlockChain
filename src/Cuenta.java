
public abstract class Cuenta {
	int id;
	int balance;
	FirmaDigital firma;

	public Cuenta(int newid,int newbalance, FirmaDigital nuevafirma) {
		id = newid;
		balance = newbalance;
		firma = nuevafirma;
	}

	public void generarTransaccion(Cuenta Objetivo,int amount,String nota)
	{
		Transaction Nueva = new Transaction(this.id,Objetivo.getid(),amount,nota,firma);
	}
	
	public int getid(){
		return id;
	}
}
