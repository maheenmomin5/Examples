package exercises;

public class ArrayRotation {
	
	public static void rotateArray() {
		
		String[] items = {
				"tree",
				"house",
				"boat",
				"cup",
				"water"
		};
		
		String[] rotatedItems = new String[items.length];
	
		int rotateBy = 6;
		
		for (int i = 0; i < items.length; i++) {
			String item = items[i];
			int newIndex = i + rotateBy;
			newIndex = newIndex % items.length;
//			if (newIndex > items.length -1) {
//				newIndex = newIndex - items.length;
//			}
			rotatedItems[newIndex] = item;	
		}
		
		System.out.println("original array " + rotateBy);
		for (String original : items) {
			System.out.println(original);
		}
		System.out.println("==========");

		System.out.println("rotated by " + rotateBy);
		for (String rotated : rotatedItems) {
			System.out.println(rotated);
		}
	}

}
