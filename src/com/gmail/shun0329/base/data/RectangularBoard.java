package com.gmail.shun0329.base.data;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public final class RectangularBoard<T> implements Board<T> {
	private List<Line<T>> board = new ArrayList<>();
	public RectangularBoard(int width, int height) {
		Line<T> line = new Line<>();
		for(int i = 0; i < width; i++)
			line.add(null);

		for(int i = 0; i < height; i++)
			try {
				board.add(line.clone());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
	}
	
	@Override
	public void add(int width, int height, T value) {
		board.get(height).set(width, value);
	}
	
	@Override
	public T get(int width, int height) {
		return board.get(height).get(width);
	}
	
	@Override
	public Iterator<Iterable<T>> iterator() {
	}
}
