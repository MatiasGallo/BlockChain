
public class Contract extends Cuenta {
	
	String Codigo;
	public Contract(int newid, int newbalance, FirmaDigital nuevafirma, String newCodigo) {
		super(newid, newbalance, nuevafirma);
		Codigo = newCodigo;
		// TODO Auto-generated constructor stub
	}

	public void ejecutarContrato()
	{
		//Ejectuar el Codigo
	}
	
	public void generarToken(Token moneda) {
		//Propaga el token a la red
	}
}
