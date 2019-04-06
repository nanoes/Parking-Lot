package accesair;

public class Auto {
	private int velocidad;
	private Estado estado; 
	private TanquedeCombustible tanque;
	public void encender () {
		this.estado.Encender(this);
	}
}




