package primeraClase.Tarea1;

public class PiramidePentagonal {

	private float lado;
	private float altura;
	private float apotemaBase;

	public PiramidePentagonal() {

	}

	public PiramidePentagonal(float lado, float altura, float apotemaBase) {
		this.lado = lado;
		this.altura = altura;
		this.apotemaBase = apotemaBase;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getApotemaBase() {
		return apotemaBase;
	}

	public void setApotemabase(float apotemaBase) {
		this.apotemaBase = apotemaBase;
	}

	public float calcularApotemaPiramide() {
		float apotemaPiramide = (float) Math.sqrt((Math.pow(altura, 2) + (Math.pow(apotemaBase, 2))));
		return apotemaPiramide;
	}

	public float calcularArea() {
		float area = (((5 * lado) / 2) * (apotemaBase + calcularApotemaPiramide()));
		return area;
	}

	public String toString() {
		return "\nLado= " + lado + "\nAltura= " + altura + "\nApotema base= " + apotemaBase;
	}

}
