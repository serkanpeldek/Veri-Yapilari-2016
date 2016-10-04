package vy2016_ders1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class OOPApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount(104.3);
		BankAccount ba1=new BankAccount(0);
		ba.display();
		ba1.display();
		ba1=ba;
		ba1.display();
		ba1.deposite(20);
		ba.deposite(23.4);
		ba.display();
		ba.withdraw(30.0);
		ba.display();
		
		System.out.println("Equality and Identity");
		int value1=10;
		int value2=10;
		if(value1==value2)
			System.out.println("Ýki deðer eþit");
		
		if(ba==ba1)
			System.out.println("Ýki nesne özdeþ");
		
		System.out.println("INPUT AND OUTPUT");
		/*
		System.out.println("Metin =");
		String metin=getString();
		System.out.println("Girdiðiniz metin: \""+metin+"\"");
		System.out.println("Karakter=");
		char charByUser=getChar();
		System.out.println("Girdiðiniz karakter: \""+charByUser+"\"");
		System.out.println("Tam sayý=");
		int tamSayi=getInt();
		System.out.println("Girdiðiniz tam sayý+10: \""+(tamSayi+10)+"\"");
		*/
		System.out.println("DÝZÝLERDE ARAMA-BULMA-SÝLME ÝÞLEMLERÝ");
		int[] dizi={1,2,32,123,34,43,2,13,2,23,Integer.MAX_VALUE};
		int diziUzunlugu=dizi.length;
		diziYazdir(dizi);
		dizideBul(dizi,23);
		
		System.out.println("\n\nORDERED ARRAY CLASS");
		OrderedArray oa=new OrderedArray(10);
		oa.insert(20);
		oa.insert(10);
		oa.insert(74);
		oa.insert(1);
		oa.insert(74);
		oa.insert(3);
		oa.insert(74);
		oa.insert(1);
		oa.insert(74);
		oa.insert(3);
		oa.yazdir();
		oa.find(2);
		oa.delete(74);
		oa.delete(74);
		oa.delete(1);
		oa.insert(51);
		oa.insert(54);
		oa.insert(24);
		oa.yazdir();
		
		System.out.println("\n\nSORTING ALGORITHMS");
		
		System.out.println("\n BUBBLE SORT");
		BubbleSort bs=new BubbleSort(10);
		Random random=new Random();
		for(int i=0;i<10;i++){
			bs.insert(random.nextInt(100));
		}
		System.out.println("Bubble sorttan önce");
		bs.yazdir();
		bs.bubbleSort();
		System.out.println("Bubble sorttan sonra");
		bs.yazdir();
		
		System.out.println("\n SELECTION SORT");
		SelectionSort ss=new SelectionSort(10);
		ss.insert(2);
		ss.insert(46);
		ss.insert(23);
		ss.insert(8);
		ss.insert(45);
		ss.insert(9);
		ss.insert(6);
		ss.insert(1);
		System.out.println("Selection sorttan önce");
		ss.yazdir();
		ss.selectionSort();
		System.out.println("Selection sorttan sonra");
		ss.yazdir();
		
		System.out.println("\n INSERTION SORT");
		InsertionSort is=new InsertionSort(10);
		is.insert(2);
		is.insert(46);
		is.insert(23);
		is.insert(8);
		is.insert(45);
		is.insert(9);
		is.insert(6);
		is.insert(1);
		System.out.println("Insertion sorttan önce");
		is.yazdir();
		is.insertionSort();
		System.out.println("Insertion sorttan sonra");
		is.yazdir();

	}

	public static void dizideBul(int[] dizi, int deger){
		boolean bayrak=false;
		for(int value:dizi){
			if(value==deger)
				bayrak=true;
			if(bayrak)break;
		}
		if(bayrak)
			System.out.println("Dizide aranan deðer bulundu");
		else
			System.out.println("Dizide aranan deðer bulunamadý");
	}
	public static void diziYazdir(int[] dizi){
		for(int value: dizi)
			System.out.print(value+" ");
		
		System.out.println();
			
	}
		public static String getString() throws IOException{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String str=br.readLine();
			return str;
		}
		public static char getChar() throws IOException{
			String str=getString();
			return str.charAt(0);
		}
		public static int getInt()throws IOException{
			String str=getString();
			return Integer.parseInt(str);
		}
	 
}
