/**
 * 
 */
package com.gmail.shun0329.base.game;

import com.gmail.shun0329.base.data.Board;
import com.gmail.shun0329.base.data.RectangularBoard;

/**
 * @author shun
 *
 */
public final class Othello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Board<Integer> board = new RectangularBoard<>(4, 4);
		board.add(1, 2, 12);
		
		for(Iterable<Integer> line : board) {
			for(Integer i : line) {
				if(i == null)
					System.out.print("  ");
				else
					System.out.print(i);
				System.out.print(", ");
			}
			System.out.println();
		}
	}

}
