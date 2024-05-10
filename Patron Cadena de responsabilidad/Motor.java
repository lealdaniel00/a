public abstract class Motor{
	private int cilindrada;
	private String marca;
	private int potencia;
	public abstract void revolucionar();
	public abstract void frenoDeMotor();
	public void setCilindrada(int cilindrada){
		this.cilindrada=cilindrada;
	}
	public void setMarca(String marca){
		this.marca=marca;
	}
	public void setPotencia(int potencia){
		this.potencia=potencia;
	}
}