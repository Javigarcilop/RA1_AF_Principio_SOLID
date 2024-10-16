package principioAperturaYcierre;

public class ShapeOcpCorrecto {
	// Interfaz para el dibujo de formas
	public interface Drawable {
	void draw();
	}
	// Implementación de un círculo
	public class Circle implements Drawable {
	@Override
	public void draw() {
	System.out.println("Drawing a circle");
	}
	}
	// Implementación de un cuadrado
	public class Square implements Drawable {
	@Override
	public void draw() {
	System.out.println("Drawing a square");
	}
	}
	// Clase de cliente que usa Drawable
	public class ShapeDrawer {
	private Drawable shape;
	public ShapeDrawer(Drawable shape) {
	this.shape = shape;
	}
	public void drawShape() {
	shape.draw();
	}
	}
}
