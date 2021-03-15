/**
 * 
 */
package com.gmail.shun0329.base.data;

import java.util.Collection;

/**
 * @author shun
 *
 */
public interface Board<E> extends Iterable<Collection<E>>{
	public void add(int index1, int index2, E e);
	public E get(int index1, int index2);
}
