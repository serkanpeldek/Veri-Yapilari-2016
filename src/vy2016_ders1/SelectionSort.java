package vy2016_ders1;

public class SelectionSort extends Array {
	
	public SelectionSort(int size){
		super(size);
	}
	
	public void selectionSort(){
		int minIndeks;
		for(int i=0;i<numberOfElements-1;i++){
			minIndeks=i;
			for(int j=i+1;j<numberOfElements;j++){
				if(array[minIndeks]>array[j]){
					minIndeks=j;
				}
				
			}
			swap(minIndeks,i);
		}
	}

}
