package accesair;

public class Encendido extends Estado  {
	@Override
public  void  Encender (Auto auto) {
		throw new YaEncendidoExepcion();
	}
@Override
public  void Apagar (Auto auto) {}
@Override

public  void Acelerar(Auto auto) {}
@Override
public  void Detenerse (Auto auto) {}
@Override
public void Reserva (Auto Reserva) {}
}
