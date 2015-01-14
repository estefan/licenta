package licenta;

public class CoadaPrimara {
	public CitireCoadaLocala citire;
	public ScriereCoadaLocala scriere;
	
		
	public CoadaPrimara(CitireCoadaLocala citire, ScriereCoadaLocala scriere) {
		super();
		this.citire = citire;
		this.scriere = scriere;
	}
	public CitireCoadaLocala getCitire() {
		return citire;
	}
	public void setCitire(CitireCoadaLocala citire) {
		this.citire = citire;
	}
	public ScriereCoadaLocala getScriere() {
		return scriere;
	}
	public void setScriere(ScriereCoadaLocala scriere) {
		this.scriere = scriere;
	}
	
	
}
