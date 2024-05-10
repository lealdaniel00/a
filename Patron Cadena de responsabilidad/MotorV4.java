public class MotorV4 extends Motor{
	private int nCilindros;
	MotorV4(){
		nCilindros=4;
		setCilindrada(1200);
		setMarca("Hyundai");
		setPotencia(100);
	}
	public void revolucionar(){
		System.out.println("EL MOTOR V4 esta revolucionandose");
	}
	public void frenoDeMotor(){
		System.out.println("EL MOTOR V4 esta frenando con motor");
	}
}