package com.myPlayer;

import java.util.LinkedList;
import java.util.Random;

public class RandomSongList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 100;
		int min =1;
		final LinkedList<Integer> list = new LinkedList<Integer>();
		Random rand = new Random();
		do{
			int next = min + rand.nextInt(max);
			if(!list.contains(next)){
				list.add(next);
			}
		}while(list.size() < max);
		
		final MyChangeSongIterator<Integer> myIterator = new MyChangeSongIterator<>(list.listIterator());
		System.out.println(myIterator.next());
		System.out.println(myIterator.next());
		System.out.println(myIterator.next());

	}

}
