public abstract class SerVivo{
	private int edad;
	private char genero;
	private String especie;
	private String nombre;
	SerVivo(int edad, char genero, String especie, String nombre){
		this.edad=edad;
		this.genero=genero;
		this.especie=especie;
		this.nombre=nombre;	
	}
	public abstract void respirar();
	public int getEdad(){
		return edad;
	}
	public char getGenero(){
		return genero;
	}
	public String getEspecie(){
		return especie;
	}
	public String getNombre(){
		return nombre;
	}
}