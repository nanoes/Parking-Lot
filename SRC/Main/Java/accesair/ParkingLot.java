package accesair;

public class ParkingLot {
	private int autosEstacionados;
	
	public void estacionarAuto() {
		if(this.autosEstacionados < 100) {
			this.autosEstacionados = this.autosEstacionados + 1;	
		} else {
			throw new NoQuedanMasEspaciosException();
		}
	}
}
