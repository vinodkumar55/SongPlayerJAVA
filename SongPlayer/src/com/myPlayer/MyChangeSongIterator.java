package com.myPlayer;

import java.util.ListIterator;
/**
 * 
 * @author vinod
 *my own iterator
 * @param <T>
 */

public class MyChangeSongIterator<T> {
	private final ListIterator<T> listIterator;
	private boolean nextCalled = false;
	private boolean previousCalled = false ;
	
	/**
	 * constructor
	 * @param listIterator
	 */
	public MyChangeSongIterator(ListIterator<T> listIterator){
		this.listIterator = listIterator;
	}
	/**
	 * previous method to get the previous element from list
	 * @return
	 */
	
	public T previous(){
		if(nextCalled){
			listIterator.previous();
			previousCalled = false;
		}
		previousCalled = true;
		return listIterator.previous();
	}
	
	/**
	 * next method to get the next element
	 * @return
	 */
	
	public T next(){
		nextCalled = true;
		if(previousCalled){
			previousCalled = false;
			listIterator.next();
		}
		return listIterator.next();
	}
	
	public boolean hasNext(){
		return listIterator.next() != null;
	}

}
