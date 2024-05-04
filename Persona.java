public class Persona extends SerVivo implements Trabajar{
	private int salario;
	public Persona(int salario,char genero, String nombre, int edad){
		super(edad,genero,"Homo Sapiens Sapiens",nombre);
		this.salario=salario;
	}
	public void respirar(){
		System.out.println("ESTOY RESPIRANDO");
	}
	public void caminar(){
		System.out.println("ESTOY CAMINANDO");
	}
	public void caminar(int kilometros){
		System.out.println("Hoy amaneci animado y camine los siguientes kilometros: "+kilometros);
	}
	public void trabajar(){
		System.out.println("Estoy trabajando");
	}
	public int descansar(){
		return 1;
	}
}