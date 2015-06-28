package pascalRectangle;

public class View {

	public static void showTriangle(TriangleModel rect) {

		for (int i = 0; i < rect.getRow(); i++) {
			int number = 1;
			System.out.format("%" + (rect.getRow() - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.format("%5d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}

