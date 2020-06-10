package com.techlab.line.test;
import java.util.*;

import com.techlab.line.LineItem;
public class LineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <LineItem> cart=new ArrayList<LineItem>();
		
		cart.add(new LineItem(101, "Apple", 30, 10)); //300
		cart.add(new LineItem(105, "Banana", 15, 5));//75
		cart.add(new LineItem(199, "ToothPaste" , 85, 2));//170
		Iterator<LineItem> iter = cart.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }

	      System.out.println("Total Value : "+new LineItem().calculateTotal());
	}

}
