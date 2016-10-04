package vy2016_ders1;
import java.util.Random;
 

public class Array {
	protected long[] array;
	protected int numberOfElements;
	
	public Array(int size){
		numberOfElements=0;
		array=new long[size];
		
			}
	
	public int size(){
		return numberOfElements;
	}
	
	public void insert(long deger){
		array[numberOfElements]=deger;
		numberOfElements++;
	}
	public void swap(int i, int iArti){
		long tut=array[i];
		array[i]=array[iArti];
		array[iArti]=tut;
	}
	public void yazdir(){
		for(int i=0;i<numberOfElements;i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
	}
}
