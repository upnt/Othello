/**
 * 
 */
package com.gmail.shun0329.base.data;

/**
 * @author shun
 *
 */
public interface Board<E> extends Iterable<Line<E>>{
	public void add(int index1, int index2, E e);
	public E get(int index1, int index2);
}
