package licenta;

public class ScriereCoadaPrimara {

	public int b;//dimensiunea blocului de date
	public int d;//discul afectat 
	public int c;//primul cluster din blocul de date
	public int ni;//nr de inregistrare
	public double MS;//momentul sosirii
	
	public ScriereCoadaPrimara(int b, int d, int c, int ni, double mS) {
		super();
		this.b = b;
		this.d = d;
		this.c = c;
		this.ni = ni;
		MS = mS;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNi() {
		return ni;
	}
	public void setNi(int ni) {
		this.ni = ni;
	}
	public double getMS() {
		return MS;
	}
	public void setMS(double mS) {
		MS = mS;
	}
	
}
