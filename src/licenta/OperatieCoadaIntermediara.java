package licenta;

public class OperatieCoadaIntermediara {

	public int d;//discul tratat
	public int c;//clusterul tratat
	public int ni;//nr de inregistrare
	public MSI mon;//structura de monitorizare a operatiilor implicate
	
	public OperatieCoadaIntermediara(int disc,int cluster, int nrInreg)
	{
		d=disc;
		c=cluster;
		ni=nrInreg;
		mon=new MSI();
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

	
	
	
	
}
