package com.techlab.account.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Account a[]=new Account[5];
		a[0]=new Account(1,"Number1",1000);
		a[0].deposit(100);
		a[0].withdraw(15);
		a[0].deposit(44);
		
		
		a[1]=new Account(2,"Number2",1001);
		a[1].deposit(55);
		a[1].withdraw(552);
		a[1].deposit(999);
		
		
		a[2]=new Account(3,"Number3",1002);
		a[2].deposit(45);
		a[2].withdraw(466);
		
		a[3]=new Account(4,"Number4",1003);
		a[3].withdraw(446);
		a[3].deposit(88);
		
		a[4]=new Account(5,"Number5",1004);
		a[4].withdraw(51);
		a[4].deposit(200);
		a[4].deposit(987);
		
		a[4]=new Account(6,"Number6",1005);
		writeFileData(a);
		readFileData(a.length);
	}

	static void writeFileData(Account a[]) throws IOException {
		FileOutputStream fout = new FileOutputStream("Account.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		for(Account temp:a) {
			out.writeObject(temp);
		}
		out.flush();
		out.close();
	}
	
	static void readFileData(int length) throws FileNotFoundException, IOException, ClassNotFoundException {
		Account temp[]=new Account[length];
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Account.txt"));

		for(int i=0;i<temp.length;i++) {
			temp[i]=(Account)in.readObject();
			System.out.println("--------------------------------------");
			System.out.println(temp[i]);
			System.out.println("--------------------------------------");
		}
		in.close();
	}
}
