package examplee7;

import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int [] array1 = new int[3];
		int [] array2 = new int[3];
		
		randomAssignArray(array1);
		disPlayArray(array1);
		assignArray(array2);
		disPlayArray(array2);
		addAssignArray(array1, array2);
		subtractAssignArray(array1, array2);
		getMax(array2);
		getMin(array2);
		getAvg(array2);
	}
	
	public static void randomAssignArray (int [] array) {
		
		Random r = new Random();
		
		for(int i =0 ; i<array.length ; i++) {
			array[i] = r.nextInt(10);
		}
		
	}
	
	public static void assignArray(int[] array) { //kullanıcıdan array elemanlarının alınması 
		
		Scanner scanner = new Scanner(System.in);

		for(int i = 0 ; i<array.length ; i++) {
		
			System.out.print(i+1+".Sayiyi giriniz :");
			array[i] = scanner.nextInt();
		}
		scanner.close();
		
	}
	public static void disPlayArray(int[] array) { //arrayin listelenmesi
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		System.out.println();
	}
	public static void addAssignArray(int [] array1, int[] array2) { //2 arrayin toplanması 
		
		int[] newArray1 = new int[array1.length];
		
		for(int i = 0 ; i<array1.length; i++) {
			
			newArray1[i] = array1[i]+array2[i];
			
		}
		
		System.out.println("Toplam :");
		disPlayArray(newArray1);
	}
	public static void subtractAssignArray(int [] array1, int[] array2) { //2 arrayin farkı
		
		int[] newArray1 = new int[array1.length];
		
		for(int i = 0 ; i<array1.length; i++) {
			
			newArray1[i] = array1[i]-array2[i];
			
		}
		
		System.out.println("Fark :");
		disPlayArray(newArray1);
	}	
	public static void getMax(int[] array1) { //array içinde ki en büyük eleman 
		
		int max =array1[0];
		
		for (int i = 0; i < array1.length; i++) {
			if(max < array1[i]) {
				max = array1[i];
			}
		}
		System.out.println("Max :" + max);
	}
	public static void getMin(int[] array1) { //array içinde ki en küçük eleman 
		int min = array1[0];
		
		for (int i = 0; i < array1.length; i++) {
			if(min > array1[i])
				min = array1[i];
		}
		System.out.println("Min :" + min);
	}
	public static void getAvg(int[] array1) { //array ortalaması 
		double sum = 0;
		
		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println("Array ortalama :" + sum/array1.length);
	}

}

/*Soru 2
3 elemanlı iki ayrı dizi oluşturunuz. İlk diziyi, 0 ila 5 arasında (0 ila 5 dahil)
 rastgele sayılar ile doldurunuz. 2 ayrı diziyi toplayarak yeni 3 elemanlı bir dizi 
 oluşturun.İki arrayin toplamını ve arraylerin ortalaması, max ve min elemanlarının bulunması.
 * */
