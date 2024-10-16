package principioInversionDependencias;

public class BombillaDipCorrecto {
	// Interfaz que define el comportamiento de cualquier dispositivo que se pueda
	// encender o apagar
	public interface Encendible {
		void encender();

		void apagar();
	}

	// Implementación de la interfaz Encendible para una bombilla
	public class Bombilla implements Encendible {
		@Override

		public void encender() {
			System.out.println("La bombilla está encendida");
		}

		@Override
		public void apagar() {
			System.out.println("La bombilla está apagada");
		}
	}

	// Clase Interruptor que ahora depende de la abstracción (cumple con el DIP)
	public class Interruptor {
		private Encendible dispositivo;

		public Interruptor(Encendible dispositivo) {
			this.dispositivo = dispositivo;
		}

		public void operar() {
			dispositivo.encender();
			// Más tarde: dispositivo.apagar();
		}
	}
}
