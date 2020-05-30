package com.techlab.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.serialize.Serialize;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Serialize s1 = new Serialize(1, "Kaushik");
		Serialize s2 = new Serialize(2,"Ksn");
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.writeObject(s2);
		out.flush();
		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		Serialize s = (Serialize) in.readObject();
		Serialize ss = (Serialize) in.readObject();
		System.out.println(s.id + " " + s.name);
		System.out.println(ss.id + " " + ss.name);
		in.close();
	}

}
