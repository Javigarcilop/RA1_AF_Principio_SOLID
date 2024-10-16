package principioInversionDependencias;

public class BombillaDipIncorrecto {
	// Clase que representa una bombilla
	public class Bombilla {
		public void encender() {
			System.out.println("La bombilla está encendida");
		}

		public void apagar() {
			System.out.println("La bombilla está apagada");
		}
	}

	// Clase Interruptor que depende de Bombilla (violación del DIP)
	public class Interruptor {
		private Bombilla bombilla;
		

		public Interruptor(Bombilla bombilla) {
			this.bombilla = bombilla;
		}

		public void operar() {
			bombilla.encender();
			// Más tarde: bombilla.apagar();
		}
	}
}
