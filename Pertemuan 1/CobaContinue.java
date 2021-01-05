/** 
  * Program berikut untuk mencoba statemen break
*/ 
public class CobaContinue
{  
    public static void main(String arg[])
    {
      for (int i=0; i<10; i++)
      {
        for (int j=0; j<i+1; j++)
        {
          if(j==5)
            continue;
          System.out.print('*');
        }    
 
        System.out.println(); 
      }
    } 
}
/*
  Penjelasan program di atas 
  Program diatas hampir sama program CobaBreak, perbedannya terletak pada break 
  dan continue, ketika int i melakukan perulangan dan kemudian ke perulangan j
  maka ketika j=5 ,program akan dilanjutkan ketahapan selanjutnya pada perulangan
  bukan dihentikan seperti pada program break.
  
*/