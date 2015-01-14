package licenta;

public class CitireCoadaLocala {

	public tipOperatie tipOp;
	public int ni;//nr de ordine
	public int c;//cilindrul implicat in transfer
	
	public CitireCoadaLocala(tipOperatie tipOp, int ni, int c) {
		super();
		this.tipOp = tipOp;
		this.ni = ni;
		this.c = c;
	}

	public tipOperatie getTipOp() {
		return tipOp;
	}

	public void setTipOp(tipOperatie tipOp) {
		this.tipOp = tipOp;
	}

	public int getNi() {
		return ni;
	}

	public void setNi(int ni) {
		this.ni = ni;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	
	
}
