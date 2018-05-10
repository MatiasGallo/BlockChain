
public class UnidadProcesamiento {
	private int CS;
	private int CR;
	private int CM;
	private int CD;
	
	public UnidadProcesamiento(int CostoSuma,int CostoResta,int CostoMult,int CostoDiv)
	{
		CS = CostoSuma;
		CR = CostoResta;
		CM = CostoMult;
		CD = CostoDiv;
	}

	public int EjectuarCodigo(int gas,String Codigo) {
		while (gas>0) {
			//Ejecutar Codigo usando los valores de costo por operacion
			gas--;
		}	
		return gas;
	}
}
