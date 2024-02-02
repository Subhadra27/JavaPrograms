/*There is a robot starting at the position (0, 0), the origin, on a 2D plane. 
  Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes 
 its moves.You are given a string moves that represents the move sequence of the robot 
 where moves[i] represents its ith move. Valid moves are 'R' (right), 'L' (left), 'U' (up),
  and 'D' (down).Return true if the robot returns to the origin after it finishes all of its moves,
   or false otherwise.*/
package arrayList;

import java.util.*;

public class RobotReturnToOrigin {
	public static boolean robotReturnToOrigin(String moves) {
		
		int x = 0 , y = 0;
		
		for(char move: moves.toCharArray()) {
			switch (move) {
			case 'U': {				
				y++;					
				break; 
			}
			case 'D': {				
				y--;					
				break; 
			}
			case 'L': {				
				x++;					
				break; 
			}
			case 'R': {				
				x--;					
				break; 
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + move);
			}
			
		}
		
		return x == 0 && y ==0;
		
		/*
		 * Map<Character,Integer> hmap = new HashMap<Character,Integer>();
		 * if(moves.length() == 0) { return false; } for(char ltr : moves.toCharArray())
		 * { if(hmap.containsKey(ltr)) { hmap.put(ltr, hmap.get(ltr)+1); }else {
		 * hmap.put(ltr, 1); } } System.out.println(hmap);
		 * 
		 * Integer countL = hmap.get('L'); Integer countR = hmap.get('R'); Integer
		 * countU = hmap.get('U'); Integer countD = hmap.get('D'); 
		 * if(countL == countR  && countU == countD) {
		 *  return true; }
		 */

//		ArrayList<String> arrList = new ArrayList<String>();		
//		arrList.add("LR");
//		arrList.add("RL");
//		arrList.add("UD");
//		arrList.add("DU");	
//		
//		if(arrList.size() == 0) {
//			return false;	
//		}			
//		if(arrList.contains(moves)) {
//			return true;	
//		}		
		//return false;
	}

	public static void main(String[] args) {

		boolean result = robotReturnToOrigin("RLUURDDDLLU");
		System.out.println("The Robot reached at Origin ? " + result);
	}
}
