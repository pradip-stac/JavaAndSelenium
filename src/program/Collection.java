package program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Vector;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Collection {
	public static void main(String[] args) {
		
	/*	ArrayList li = new ArrayList ();//we can provide it generic for store the one type of data
		
		//with out generic we can add any type of data in it
		//it will store the value in index format
		
		li.add("pradip");
		li.add('a');
		li.add(123);
		li.add(21.20);
		li.add(true);
		System.out.println(li.get(0));
		System.out.println(li.get(1));
		System.out.println(li.get(2));
		System.out.println(li.get(3));
		System.out.println(li.get(4)); */
		
	/*
	 	LinkedList <String>ar = new LinkedList<String>();//we can provide it generic for store the one type of data
		ar.add("pradip");//with out generic we can add any type of data in it
		ar.add("dhakne");
		
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));*/
		
		
     	Vector v = new Vector ();
		//we can provide it generic for store the one type of data
		
				//with out generic we can add any type of data in it
				//it will store the value in index format
	/*	v.add('v');
		v.add("pradip");
		v.add(true);
		v.add(12.12);
		v.add(123);
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(4));
		System.out.println(v.get(3)); */
		
		/*PriorityQueue<String> pr = new PriorityQueue <String>();
		
		pr.add("pradip");
	    pr.add("pradip");//it accept duplicate value
		
		//pr.add(null);//it can not accept null value
		
		
		Iterator i = pr.iterator();//it does not maintain insertion order

		while(i.hasNext()) {

			System.out.println(i.next());
		}*/
     	/*HashSet h = new HashSet();
      	h.add(true);
     	h.add("pradip");
     	//h.add("pradip");//it does not allow duplicate value
     	h.add(1234);
     	h.add(12.32);
     	
     	Iterator i = h.iterator();//it does not maintain insertion order

		while(i.hasNext()) {

			System.out.println(i.next());
         }*/
	
	
    /* 	LinkedHashSet lk = new LinkedHashSet  ();
	
	
    	lk.add('v');
		lk.add("pradip");
		lk.add(true);
		lk.add(12.12);
		lk.add(123);
	
		Iterator i = lk.iterator();//it does not maintain insertion order

		while(i.hasNext()) {

			System.out.println(i.next());
         }*/
	
	
     /*	HashMap hm = new HashMap ();
     	hm.put(1,null);
     	hm.put(2,null);
     	hm.put(null, null);
     	//hm.put(null, 22);

     	hm.put("pradip", "dhakne");
     	
     	
     	System.out.println(hm.get(null));
     	System.out.println(hm.get("pradip"));
     	System.out.println(hm.get(1));
     	System.out.println(hm.get(2)); */
     	
     	Hashtable tb = new Hashtable ();
     	//tb.put(null, "jk");//it cant accept null key
     	//tb.put(1, null); //we cant store null value
     	tb.put(1, "pradip");
     	//tb.put(1, "pradip"); can not give duplicate key it garbage 1st value
     	tb.put(2, 1234);
     	tb.put("pradip", "dhakne");
     	System.out.println(tb.get(1));
     	System.out.println(tb.get(2));
     	System.out.println(tb.get("pradip"));

	}
}
