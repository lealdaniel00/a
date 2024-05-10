public class Cliente{
	public static void main(String [] args){
		Banco bancolombia = new Banco();
		bancolombia.solPrestamo(100);
		bancolombia.solPrestamo(1000000);
		bancolombia.solPrestamo(10000000);
		bancolombia.solPrestamo(100000000);
		bancolombia.solPrestamo(1000000000);
	}
}