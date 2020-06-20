package com.techlab.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	public void writeFileData(Object c, String name) throws IOException {
		String filePath = "D:\\Swabhav\\OOAD\\Assignment\\shopping-cart-app\\src\\com\\techlab\\Resources\\";
		String fileName = filePath.concat(name.concat(".txt"));
		FileOutputStream fout = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(c);
		out.flush();
		out.close();
	}
	
	public Object getFileData(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
		String filePath = "D:\\Swabhav\\OOAD\\Assignment\\shopping-cart-app\\src\\com\\techlab\\Resources\\";
		String fileName = filePath.concat(name.concat(".txt"));
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
		Object contactObject =in.readObject();
		in.close();
		return contactObject;
	}
}
