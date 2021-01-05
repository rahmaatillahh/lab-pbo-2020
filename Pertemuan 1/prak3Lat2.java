/**
* Program berikut untuk mencoba operator assignment
*/
public class prak3Lat2 {

 	public static void main(String args[]) {
 		int a = 10;
 		int b = 20;
 		int c = 0;

 		c = a + b;
 		System.out.println("c = a + b = " + c );

 		c += a ;
 		System.out.println("c += a = " + c );

 		c -= a ;
 		System.out.println("c -= a = " + c );

 		c *= a ;
 		System.out.println("c *= a = " + c );

 		a = 10;
 		c = 15;
 		c /= a ;
 		System.out.println("c /= a = " + c );

 		a = 10;
 		c = 15;
 		c %= a ;
 		System.out.println("c %= a = " + c );

 		c <<= 2 ;
 		System.out.println("c <<= 2 = " + c );

 		c >>= 2 ;
 		System.out.println("c >>= 2 = " + c );

 		c >>= 2 ;
 		System.out.println("c >>= 2 = " + c );

 		c &= a ;
 		System.out.println("c &= a = " + c );

 		c ^= a ;
 		System.out.println("c ^= a = " + c );

 		c |= a ;
 		System.out.println("c |= a = " + c );
 	}
}

/* Penjelasan tentang kode diatas
diketahui variabel a =10
variabell b = 20 dan c=0
1. c = a+b = 10+20 = 30 , variabel a ditambah variabel b dan outputnya disimpan pada nilai c.
2. c += a ---> c = c+a = 30+10=40 , nilai c yang tersimpan awalnya adalah 30 sehingga nilai 30 ditambahkan dengan vaiabel a dan nilai c yg tersimpan skrg adalah 40
3. c -= a ---> c = c-a = 40-10=30, karena nilai c yang tersimpan tadi adalah 40, maka 40 dikurang dengan nilai variabel a yaitu 10 sehingga output yg dihasilkan adalah 30 dan tersimpan ke variabel c
4. c *= a ---> c = c*a = 30*10=300, , karena nilai c yang tersimpan adalah 30 maka 30 dikalikan dengan varibel a yaitu 10 , outputnya adallah 300 dan nilainya tersimpan kevariavel c
5. c /= a ---> c= c/a = 15/10 = 1, pada baris ini diketahui c = 15, dan a= 10, hasil baginya didapat 1 karena tipe data int makanya tidak dibuat berkoma
6. c %= a ---> c= c%a = 15%10 = 5, masi seperti yang nomer 5 soal yg diketahui sama, outputnya adalah 5 dan disimpan divariabel c
7. c <<= 2 ---> c= c<<2 =5<<2 = 20 atau 00000101 => 00010100=20, ini merupakan pengerseran nilai biner dari 5 kesamping kiri sebanyak 2 kali, dan output yg yang keluar adalah 20
8. c >>= 2 ---> c= c>>2 =20>>2 =5 atau 00010100 => 00000101=5, ini merupakan pengerseran nilai biner dari 20 kesamping kanan sebanyak 2 kali, dan outputnya adalah 5
9. c >>= 2 ---> c= c>>2 =5>>2 = 1 atau 00000101 => 00000001=1, ini merupakan pengerseran nilai biner dari 5 kesamping kanan sebanyak 2 kali, dan outputnya adalah 1
10. c &= a ---> c =c&a =1&10 = 0 atau 00000001  => 00001010 ==>> 00000000=0, 
11. c ^= a >>> c = c ^ a = 0 ^ 10 = 10 atau 00000000 => 00001010=10 ini menggunakan operasi  XOR pada angka biner)
12. c |= a >>> c = c | a = 10 | 10 = 10 menggunakan operasi OR pada angka biner
*/