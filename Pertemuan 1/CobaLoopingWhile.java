/**
* Program berikut untuk mencoba looping while
*/
public class CobaLoopingWhile
{
	public static void main(String arg[])
	{
		int i=0;
		
		while (i<10)
		{
				int j=0;
				while (j<i+1)
				{
						System.out.print('*');
						j++;
				}
				
				System.out.println();
				i++;
		}
	}
} 
/* 
Penjelasan Program diatas
Perulangan while dipakai pada saat kita melakukan perulangan dengan 
jumlah yang belum diketahui pasti. Pernyataan pada while akan 
dikerjakan setelah pengecekan kondisi pada while bernilai true. 
ada while (i<10) dimana perulangan untuk i kurang dari 10
sedangkan untuk int j akan dilakukan perulangan sebanyak while (j<i+1) ,
pada kondisi j < i maka akan bertambah 1 * kesampingnya
Program ini sama dengan program looping for dimana outputnya
menghasilkan * dengan bentuk segitiga sikusiku.

*/