public class MotorV8 extends Motor{
	private int nCilindros;
	MotorV8(){
		nCilindros=8;
		setCilindrada(1600);
		setMarca("Ford");
		setPotencia(500);
	}
	public void revolucionar(){
		System.out.println("EL MOTOR V8 esta revolucionandose");
	}
	public void frenoDeMotor(){
		System.out.println("EL MOTOR V8 esta frenando con motor");
	}
}