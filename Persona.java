public class Persona{
	private int edad;
	private String nombre;
	private char genero;
	private int estatura;
	public Persona(){
		edad=8;
		nombre="LUIS";
		genero='M';
		estatura=176;
	}
	public void caminar(){
		System.out.println("ESTOY CAMINANDO");
	}
	public void setEdad(int recibe){
		edad=recibe;
	}
	public int getEdad(){
		return edad;
	}
}