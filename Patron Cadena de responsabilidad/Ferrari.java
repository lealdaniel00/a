public class Ferrari extends Carro{
	Ferrari(Motor motor){
		super(motor);
		System.out.println("El carro Ferrari se ensamblo correctamente con el motor");
	}
	public void acelerar(){
		System.out.println("el auto Ferrari se esta acelerando");
		getMotor().revolucionar();
	}
}