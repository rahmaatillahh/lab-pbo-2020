/** 
* Program berikut untuk mencoba statemen break
*/
public class CobaBreak
{
	public static void main(String arg[])
	{
		for (int i=0; i<10; i++)
		{
			for (int j=0; j<i+1; j++)
			{
				if(j==5)
					break;
				System.out.print('*');
			}
			System.out.println();
		}
	}
} 

/*
	Penjelasan tentang kode diatas.
	Break menyebabkan suatu kondisi untuk keluar dari perulangan.
	Program ini dimulai dari int i dan selanjutnya masuk ke int j
	
	pada baris for (int i=0; i<10; i++) perulangan akan dilakukan sebanyak 10 kali(0-9)
	jika kondisinya masih memenuhi makan akan dicetak * pada baris pertama, selanjutkan 
	dilakukan perulangan ke int j sebanyak j<i+1, maksudnya adalah pada setiap baris j 
	akan mencetak 1 * lagi kesampingnya sehingga lebih banyak tercetak * daripada baris sebelumnya, 
	selanjutnya ada kondisi if dan break pada baris if(j==5), maksudnya 
	jika j = 5 maka perulangan akan dihentikan dan dilanjutkan lagi ke i, kemudian 
	looping ke j hingga nanti looping i sudah memenuhi semua kondisi dan program
	diatas akan berhenti , sehingga output yang tercetak adalah sebagai berikut :

	*
	**
	***
	****
	*****
	*****
	*****
	*****
	*****
	*****


*/