package licenta;

/*
 * clasa cu scop de tabel de monitorizare
 */
public class MSr {

	public int gp; //grup paritate
	public stareOp stOp;//stare operatie T(terminata) sau NT(neterminata)
	
	public MSr(int gp, stareOp stOp) {
		super();
		this.gp = gp;
		this.stOp = stOp;
	}

	public int getGp() {
		return gp;
	}

	public void setGp(int gp) {
		this.gp = gp;
	}

	public stareOp getStOp() {
		return stOp;
	}

	public void setStOp(stareOp stOp) {
		this.stOp = stOp;
	}
	
	
}
