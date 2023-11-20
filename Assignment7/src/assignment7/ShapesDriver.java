package assignment7;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * ShapesDriver class
 */
public class ShapesDriver {
	
	public static void main(String[]args) {
	
		// creates an ArrayList of type Shapes 
		ArrayList<Shapes> shapes = new ArrayList<Shapes>();
	
		shapes.add(new Rectangle(20, 17));
		shapes.add(new Circle(10));
		shapes.add(new Rectangle(35, 18));
		shapes.add(new Circle(9));
		shapes.add(new Rectangle(12, 15));
		shapes.add(new Circle(12));

		
		//Find the largest Shape
		Shapes theLargestShape = largestShape(shapes);
		
		System.out.println("The Largest shape is: " + theLargestShape);
		
		System.out.println("");
			
		
		String fileName = "Shapes.dat";
		
		// Serialize the Shapes, if that is successful
		// then de-serialize the Shapes and output them
		
		if(SerializeShapesList(shapes, fileName)) {
			List<Shapes> deSerializedShapesList = 
					DeSerializeShapesList(fileName);
			
			System.out.println("Deserialized Shapes: ");
			System.out.println("==================== ");
			
			for(Shapes s : deSerializedShapesList) {
				System.out.println(s.toString());
			}
			
		}				
		
	} // end of main method
	
	
		
	/**
	 * Method to find the largest Shape
	 * @param list of Shapes
	 * @return largest shape
	 */
	public static Shapes largestShape(List<Shapes> list) {
		
		Shapes largestShape = null;
		
		for(Shapes s: list) {
			if(largestShape == null) largestShape = s;
			
			s.calculateArea();
			
			if(s.compareShapes(largestShape) > 0) largestShape = s;
		}
		
		return largestShape;
		
	} //end of largestShape method 
	
	/**
	 * Method to serialize a List of Shapes
	 * @param list of shapes
	 * @param fileName as string
	 * @return Boolean indicating success of serialization operation
	 */
	public static Boolean SerializeShapesList(List<Shapes> list, 
			String fileName) {
		
		try {
			
			FileOutputStream fileStream = new FileOutputStream(fileName);
			
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			
			os.writeObject(list);
			
			os.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}		
		
		return true;
	} // end of SerializeShapesList method
	
	
	/**
	 * Method to de-serialize a Shapes List from a given filename
	 * @param fileName as String
	 * @return List of Shapes
	 */
	@SuppressWarnings("unchecked")
	public static List<Shapes> DeSerializeShapesList(String fileName) {
		
		List<Shapes> list = null;
		
		try {
			
			FileInputStream fileStream = new FileInputStream(fileName);
			
			ObjectInputStream os = new ObjectInputStream(fileStream);
			
			list = (List<Shapes>)os.readObject();
									
			os.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();			
		}		
		
		return list;
	} // end of DeSerializeShapesList method

} // end of ShapesDriver class
