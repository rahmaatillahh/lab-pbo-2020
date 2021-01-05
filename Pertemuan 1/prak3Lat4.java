/**
* Program berikut untuk mencoba operator bitwise
*/
public class prak3Lat4 {
 
 	public static void main(String args[]) {
 		int a = 60; 	/* 60 = 0011 1100 */
 		int b = 13; 	/* 13 = 0000 1101 */
 		int c = 0;

 		c = a & b;		 /* 12 = 0000 1100 */
 		System.out.println("a & b = " + c );

 		c = a | b; 		/* 61 = 0011 1101 */
 		System.out.println("a | b = " + c );

 		c = a ^ b; 		/* 49 = 0011 0001 */
 		System.out.println("a ^ b = " + c );

 		c = ~a; 		/*-61 = 1100 0011 */
 		System.out.println("~a = " + c );

 		c = a << 2; 	/* 240 = 1111 0000 */
 		System.out.println("a << 2 = " + c );

 		c = a >> 2; 	/* 15 = 1111 */
 		System.out.println("a >> 2 = " + c );

 		c = a >>> 2; 	/* 15 = 0000 1111 */
 		System.out.println("a >>> 2 = " + c );
 	}
}

/* Penjelasan tentang kode diatas
Program diatas menggunakan operator bitwise, yang bekerja 
pada level bit dan melakukan operasi bit per bit.
diketahui int a= 60 maka angka binernya adalah 60 = 0011 1100
diketahui int b =13, maka angka binernya adalah 13 = 0000 1101

maka :
1. c = a & b = 12 
a = 0011 1100	
b = 0000 1101
menggunakan operator And dimana nilai akan benar jika keduanya sama
sama benar, maka hasilnya adalah 
c= 0000 1100, 
 
2. c = a | b = 61
a = 0011 1100	
b = 0000 1101
menggunakan operator ATAU yang dimana nilai akan benar jika salah 
satunya saja yang benar, maka hasilnya adalah 
c = 0011 1101

3. c = a ^ b = 49
a = 0011 1100	
b = 0000 1101
menggunakan operator XOR dimana nilai akan benar jika salah satunya
benar, tapi jika keduanya samasama 0 atau sama sama 1, maka hasilnya tetap salah
sehingga outputnya adalah
c = 0011 0001

4. c = ~a = -61  
a = 0011 1100	
menggunakan operator complement dengan rumus  (-a)-1= (-60)-1= -61)
c = 1100 0011

5. c = a << 2 
a = 0011 1100
mengguanakan operator << yang merupakan penggeseran biner 60 ke kiri sebanyak 2 kali
c = 1111 0000 = 240

6. c = a >> 2 
a = 0011 1100
menggunakan operator >> yang merupakan penggeseran biner 60 ke kanan sebanyak 2 kali
c= 1111 = 15

6. c = a >>> 2 
a= 0011 1100
menggunakan operator >>> yang merupakan penggeseran biner 60 ke kanan sebanyak 2 kali  dan nilai yang digeser diisi dengan 0
c= 0000 1111 = 15
*/