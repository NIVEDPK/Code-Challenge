package winkey.daily.challenge;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Day5 {
	
	/***
	 * 
	 * 
	 * 
		Good morning! Here's your coding interview problem for today.
		
		This problem was asked by Jane Street.
		
		cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. 
		For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
		
		Given this implementation of cons:
		
		def cons(a, b):
		    def pair(f):
		        return f(a, b)
		    return pair
		Implement car and cdr.
		
		def cons(a, b):
		    def pair(f):
		        return f(a, b)
		    return pair
		
		def car(f,l):
		    return f
		    
		def cdr(f,l):
		    return l
		
		print(cons(10,100)(car))
		
		print(cons(10,100)(cdr))
		
		
	 * 
	 * 
	 * 
	 * ***/
	
	public static void main(String[] args) {
		// JS implementation
		/*
		 * function car(a, b){
				return a;
			}
			
			function cdr(a, b){
				return b;
			}
			
			function cons(a,b){
				return function pair(f){
					return f(a,b);
				}
			}
			
			cons(10,100)(car)
			10
			cons(10,100)(cdr)
			100
		 * 
		 * 
		 * */
		
		// Java implementation
		cons(10,100);
		
	}
	
	public static void cons(int a , int b) {
		System.out.println(carCdr(pair->pair.a, pairing((x,y)->new Pair(x, y), a, b)));
		
		System.out.println(carCdr(pair->pair.b, pairing((x,y)->new Pair(x, y), a, b)));
		
	}
	public static Pair pairing(BiFunction<Integer, Integer, Pair> f, int a, int b) {
		return f.apply(a, b);
	}
	
	public static int carCdr(Function<Pair, Integer > f, Pair pair) {
		return f.apply(pair);
	}
	
	
}
