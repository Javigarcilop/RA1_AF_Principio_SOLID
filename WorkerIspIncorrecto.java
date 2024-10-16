package principioSegregracionInterfaces;

public class WorkerIspIncorrecto {
	public interface Worker {
		void work();
		void eat();
	}

	public class HumanWorker implements Worker {
		@Override
		public void work() {
			System.out.println("Working...");
		}

		@Override
		public void eat() {
			System.out.println("Eating...");
		}
	}

	public class RobotWorker implements Worker {
		@Override
		public void work() {
			System.out.println("Working...");
		}

		@Override
		public void eat() {
			throw new UnsupportedOperationException("Robots don't eat");
		}
	}
}
