package ej1;

import java.util.ArrayList;
import java.util.Iterator;

public class Stack {
	private java.util.ArrayList items;
	private StackIterator stackIterator;
	
	private class StackIterator{
		public Iterator iterator(ArrayList array){
			return array.iterator();
		}
	}
	
	public Stack() {
		items = new ArrayList();
		stackIterator = new StackIterator();
	}
	
	public void push(Object item) {
		items.add(item);
	}
	
	public Object pop(){
		if (size()==0)
			throw new IllegalStateException("Stack esta vacia");
		return items.remove(size() - 1);
	}
	
	private int size() {
		return items.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	public void finalize() {}

	public Iterator iterator() {
		return stackIterator.iterator(items);
	}
}
