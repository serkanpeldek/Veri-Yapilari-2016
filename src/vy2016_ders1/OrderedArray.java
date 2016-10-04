package vy2016_ders1;

public class OrderedArray {
	private long[] orderedArray;
	private int numberOfElements;
	
	public OrderedArray(int size){
		numberOfElements=0;
		orderedArray=new long[size];
			}
	
	public int size(){
		return numberOfElements;
	}
	
	public int find(long arananDeger){
		int baslangicIndeksi=0;
		int bitisIndeksi=numberOfElements-1;
		int ortaIndeks;
		
		while(true){
			ortaIndeks=(baslangicIndeksi+bitisIndeksi)/2;
			if(baslangicIndeksi>bitisIndeksi||bitisIndeksi<baslangicIndeksi){
				System.out.println("Baþlangýç Indeksi: "+baslangicIndeksi+" \n Bitiþ Ýndeksi: "+bitisIndeksi);
				System.out.println(arananDeger+" dizi içerisinde bulunamadý");
				return -1;	
			}
				
			if(orderedArray[ortaIndeks]==arananDeger){
				System.out.println(arananDeger+" deðerinin bulunduðu indeks "+ortaIndeks);
				return ortaIndeks;
			}else if(orderedArray[ortaIndeks]<arananDeger){
				baslangicIndeksi=ortaIndeks+1;
			}else{
				bitisIndeksi=ortaIndeks-1;
			}
				
		}
	}
	
	public void delete(int silinecekDeger){
		int silinecekDegerinIndeksi=find(silinecekDeger);
		if(silinecekDegerinIndeksi==-1){
			System.out.println("Silmek istenen deðer dizi içerisinde bulunamadý");
		}
		for(int i=silinecekDegerinIndeksi;i<numberOfElements-1;i++)
			orderedArray[i]=orderedArray[i+1];
		numberOfElements--;
		yazdir();
	}
	
	public void insert(int eklenecekDeger){
		int i;
		for(i=0;i<numberOfElements;i++){
			if(eklenecekDeger<orderedArray[i])
				break;
		}
		
		for(int j=numberOfElements;j>i;j--)
			orderedArray[j]=orderedArray[j-1];
		orderedArray[i]=eklenecekDeger;
		
		numberOfElements++;
	}

	public void yazdir(){
		for(int i=0;i<numberOfElements;i++)
			System.out.print(orderedArray[i]+" ");
		
		System.out.println();
	}
}
