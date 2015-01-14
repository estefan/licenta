package licenta;

public class CitireCoadaPrimara {

	public int b;//dimensiunea blocului de date 
	public int i;//nr de inregistrare
	public double Ms;//momentul sosirii 
	public int d;//discul din care face blocul de date 
	public int pc;//primul cluster din blocul de date
	public int MC[];//tabel de monitorizare a citirii pt cele b locatii
	
	
	public CitireCoadaPrimara(int b, int i, double ms, int d, int pc, int[] mC) {
		super();
		this.b = b;
		this.i = i;
		Ms = ms;
		this.d = d;
		this.pc = pc;
		MC = mC;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public double getMs() {
		return Ms;
	}
	public void setMs(double ms) {
		Ms = ms;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int[] getMC() {
		return MC;
	}
	public void setMC(int[] mC) {
		MC = mC;
	}
	
	
}
