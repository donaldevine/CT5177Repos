package question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class FileSerilizationDeserialization<E> implements SerializationHandler<E> {
	public FileSerilizationDeserialization() {
		
	}

	@Override
	public void serialise(List<E> list) {
		
		try{
				
			FileOutputStream fileStream = new FileOutputStream("file.dat");
			ObjectOutputStream outputStream = new ObjectOutputStream(fileStream);
			outputStream.writeObject(list);
			outputStream.close();
			
		} catch(Exception e) {
			e.printStackTrace();			
		}
		
	}

	@Override
	public List<E> deserialise() {		 
		List<E> list = null; 
		
		try {
			FileInputStream fileStream = new FileInputStream("file.dat");			
			ObjectInputStream inputStream = new ObjectInputStream(fileStream);			
			list = (List<E>)inputStream.readObject();					
			inputStream.close();				
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}	
	
}
