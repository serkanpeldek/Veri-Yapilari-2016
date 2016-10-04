package vy2016_ders1;

public class InsertionSort extends Array{
	public InsertionSort(int size){
		super(size);
	}
	
	public void insertionSort(){
		
		int indeks,i;
		long tut;
		for( i=1;i<numberOfElements;i++){
			tut=array[i];
			indeks=i;
			
			while(indeks>0 && array[indeks-1]>=tut){
				array[indeks]=array[indeks-1];
				--indeks;
			}
			array[indeks]=tut;
		}
	}

}
