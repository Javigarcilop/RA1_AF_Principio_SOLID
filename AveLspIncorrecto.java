package principioSustitucionLiskov;

public class AveLspIncorrecto {

	public class Ave {

		public void volar() {
			System.out.println("El ave está volando");
		}
	}

	public class Avestruz extends Ave {
		@Override
		public void volar() {
		  throw new UnsupportedOperationException("Las avestruces no pueden volar");
		}
	}
}