/**
 * 
 */
package com.gmail.shun0329.base.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shun
 *
 */
public final class Line<E> implements Iterable<E>, Cloneable {
	private List<E> line = new ArrayList<>();
	
	public void add(E e) {
		line.add(e);
	}
	
	public E get(int index) {
		return line.get(index);
	}
	
	public void set(int index, E e) {
		line.set(index, e);
	}
	
	@Override
	public Iterator<E> iterator(){
		return line.iterator();
	}
	
	@Override
	public Line<E> clone() throws CloneNotSupportedException {
		Line<E> clone = (Line<E>)super.clone();
		clone.line = new ArrayList<E>(this.line);
		return clone;
	}
}
