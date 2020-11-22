import java.util.List;

class Sort {
	public static void sortShapes(Shape[] array,
	                              List<Shape> shapes,
	                              List<Polygon> polygons,
	                              List<Square> squares,
	                              List<Circle> circles) {
		// write your code here
		for (Shape shape : array) {
			if (shape.getClass() == Shape.class) {
				shapes.add(shape);
			}
			if (shape instanceof Polygon) {
				polygons.add((Polygon) shape);
			}
			if (shape instanceof Square) {
				squares.add((Square) shape);
			}
			if (shape instanceof Circle) {
				circles.add((Circle) shape);
			}
		}
	}
}

//Don't change classes below
class Shape {
}

class Polygon extends Shape {
}

class Square extends Polygon {
}

class Circle extends Shape {
}