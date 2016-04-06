/*
 * [C]60
 * [TA's Advise]
 * 1.作業盡量寫不要放棄
 * 2.寫得很好啊!
 * */
class RectangleTest {
	String name;
	double x, y, Height, Width;

	RectangleTest() {

	}

	RectangleTest(String name, double x, double y, double Height, double Width) {
		this.x = x;
		this.y = y;
		this.Height = Height;
		this.Width = Width;
	}

	double getx() {
		return this.x;
	}

	double gety() {
		return this.y;
	}

	double getHeight() {
		return this.Height;
	}

	double getWidth() {
		return this.Width;
	}

	public String toString() {
		return "[x=" + this.x + ",y=" + this.y + ",Width=" + this.Width + ",Height=" + this.Height + "]";
	}
}

public class rectangle {

	public static void main(String[] args) {
		RectangleTest rec1 = new RectangleTest("rec1", 15, 25, 57, 18);
		System.out.print("java.Rectangle");
		System.out.println(rec1.toString());
		System.out.print("Area=");
		System.out.println(rec1.getHeight() * rec1.getWidth());
		System.out.print("perimeter=");
		System.out.println((rec1.getHeight() + rec1.getWidth()) * 2);

		RectangleTest rec2 = new RectangleTest("rec2", 0, 12, 60, 47);
		System.out.print("java.Rectangle");
		System.out.println(rec2.toString());
		System.out.print("Area=");
		System.out.println(rec2.getHeight() * rec2.getWidth());
		System.out.print("perimeter=");
		System.out.println((rec2.getHeight() + rec2.getWidth()) * 2);
		System.out.print("End of Output!");

	}
}
