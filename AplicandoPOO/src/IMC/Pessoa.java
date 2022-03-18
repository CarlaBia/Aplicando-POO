package IMC;

public class Pessoa {

	private double peso;
	private double altura;
	
	Pessoa (double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public double calcularIMC () {
		double imc = peso / (altura*altura);
		return imc;
	}
	
	public double getPeso () {
		return peso;
	}
	
	public void setPeso (double peso) {
		this.peso = peso;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public void setAltura ( double altura) {
		this.altura = altura;	
	}
}
