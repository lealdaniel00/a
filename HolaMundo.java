public class HolaMundo{
	public static void main(String [] args){
		Persona luis = new Persona(200000000,'m',"Luis",30);
		luis.caminar();
		luis.caminar(5);
		luis.respirar();
		System.out.println(luis.getEdad());
		System.out.println(luis.getEspecie());		
	}
}
