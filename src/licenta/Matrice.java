package licenta;

public class Matrice {
 private int [][] matrice;
 
 
 /*
  * ctor cu param 
  */
 public Matrice(int linii,int coloane)
 {
	 int i,j,k=1,pas=0;
	 matrice=new int[linii][coloane];
	 for(i=0;i<linii;i++)
	 {
		 for(j=0;j<coloane;j++)
		 {
			 matrice[i][j]=k;
			 pas=pas+1;
			 if(pas%4==0){
				 k++;
			 }
		 }
	 }
 }
 
 /*
  * afisare matrice 
  */
 public void afisareMatrice(int linii,int coloane)
 {
     int i, j;
    System.out.println("\tD1" + "\t " + "D2" + "\t " + "D3" + "\t" + "D4" + "\t" + "D5");
    System.out.println("-----------------------------------------");
     for (i = 0; i < linii; i++)
     {
    	 System.out.print(i+1 + ":\t");
         for (j = 0; j < coloane; j++)
         {

        	 System.out.print(matrice[i][j] +"\t");

         }
         System.out.println(" ");

     }
 }
 /*
  * calculeaza paritatea in functie de cluster si disc 
  */
 public int paritate(int c, int d)
 {
	 return (int)Math.ceil((5*(c-1)+d)/4.0);
 }
 
 /*
  * calculeaza discul de pe care incepe informatia dintr-un anume grup de paritatea
  */
 public int pozGrupParitate(int gp)
 {
     int dp;
     if (gp % (5) == 0) dp = 1;
     else dp = 4 + 2 -( (gp % 5));
     return dp;


 }
 
}
