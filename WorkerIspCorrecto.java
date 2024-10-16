package principioSegregracionInterfaces;

public class WorkerIspCorrecto {
	public interface Workable {
		void work();
	}

	public interface Eatable {
		void eat();
	}

	public class HumanWorker implements Workable, Eatable {
		@Override
		public void work() {
			System.out.println("Working...");
		}

		@Override
		public void eat() {
			System.out.println("Eating...");
		}
	}

	public class RobotWorker implements Workable {
		@Override
		public void work() {
			System.out.println("Working...");
		}
	}
}
