package licenta;

import java.util.LinkedList;
import java.util.Queue;



public class CoadaIntermediara {


	public Queue<OperatieCoadaIntermediara> coadaParitate;
	public int n;

	public CoadaIntermediara(OperatieCoadaIntermediara oci,int n) {
		// TODO Auto-generated constructor stub
		coadaParitate=new LinkedList<OperatieCoadaIntermediara>();
		coadaParitate.add(oci);
		this.n=n;
	};
	
	public Queue<OperatieCoadaIntermediara> getCoadaParitate() {
		return coadaParitate;
	}

	public void setCoadaParitate(Queue<OperatieCoadaIntermediara> coadaParitate) {
		this.coadaParitate = coadaParitate;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
}


