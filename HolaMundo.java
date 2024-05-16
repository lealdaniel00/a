public class HolaMundo{
	public static void main(String [] args){
		Persona luis = new Persona(2000000000,'m',"Luis",30);
		Pez nemo = new Pez();
		nemo.respirar();
		nemo.reproduccion();
		luis.caminar();
		luis.caminar(5);
		luis.respirar();
		luis.reproduccion();
		System.out.println(luis.getEdad());
		System.out.println(luis.getEspecie());		
	}
}
