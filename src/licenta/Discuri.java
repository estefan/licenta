package licenta;

import java.util.ArrayList;


public class Discuri {

	public int nrDisc;
	public ArrayList<Qp> coziParitate;
	public ArrayList<Qd> coziDate;
	
	public Discuri(int discuri) {

		this.nrDisc=0;
		coziParitate=new ArrayList<Qp>(discuri);
		coziDate=new ArrayList<Qd>(discuri);
	}
	
	
	
	
}
