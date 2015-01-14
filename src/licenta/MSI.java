package licenta;

/*
 * clasa cu rol de monitorizare a scrierii datelor 
 * toti membrii pot lua valoarea NT,I sau T
 * MSI=monitorizare intermediara
 */
public class MSI {

	public stareOp Cd;//stare citire date
	public stareOp Sd;//stare scriere date
	public stareOp Cpv;//stare citire paritate noua
	public stareOp Spn;//stare scriere paritate noua
	
	public MSI(){
		Cd=stareOp.NT;
		Sd=stareOp.NT;
		Cpv=stareOp.NT;
		Spn=stareOp.NT;
	}
	public stareOp getCd()
	{
		return Cd;
	}
	public stareOp getSd()
	{
		return Cd;
	}
	public stareOp getCpv()
	{
		return Cd;
	}
	public stareOp getSpn()
	{
		return Cd;
	}
	public void setCd(stareOp sop)
	{
		Cd=sop;
	}
	public void setSd(stareOp sop)
	{
		Sd=sop;
	}	
	public void setCpv(stareOp sop)
	{
		Cpv=sop;
	}	
	public void setSpn(stareOp sop)
	{
		Spn=sop;
	}	
	
}
