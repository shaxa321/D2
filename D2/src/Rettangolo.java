
public class Rettangolo {

	private float altezza;
	private float lunghezza;
	private float area;
	private float perimetro;
	
	
	public Rettangolo(float altezza,float lunghezza){
		this.altezza=altezza;
		this.lunghezza=lunghezza;
		calcolaArea();
		calcolaPerimetro();
		
	}
	
	public float calcolaArea() {
		area=altezza*lunghezza;
		return area;
	}
	
	public float calcolaPerimetro() {
	perimetro=(altezza+lunghezza)*2;
	return perimetro;
	}
	
	public void stampaRettangolo() {
		System.out.println("area "+area+"\n"+"perimetro "+perimetro);
	}
	
	

}
