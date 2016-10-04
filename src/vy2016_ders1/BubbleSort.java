package vy2016_ders1;

public class BubbleSort extends Array {

	public BubbleSort(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	public void bubbleSort(){
		for(int i=0;i<numberOfElements;i++){
			for(int j=0;j<numberOfElements-i-1;j++){
				if(array[j]>array[j+1]){
					swap(j,j+1);
					 
				}
			}
		}
	}
	
}
