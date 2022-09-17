package intro;

public class Main {

	public static void main(String[] args) {
       System.out.println("Hello world!");
       
       String ortaMetin = "ilginizi çekebilir";
	   String altMetin = "vade süresi";
	  
	   System.out.println(ortaMetin);
	   
	   int vade = 12;
	   
	   double dolarDün = 18.14;
	   double dolarBugün = 18.10;
	   
	   boolean dolarDustuMu = true;
	   
	   String okYonu = "";
	   
	   if(dolarDün>dolarBugün) {
		   okYonu = "Down.svg";
		   System.out.println(okYonu);
	   }
	   else if(dolarDün==dolarBugün) {
		   okYonu="equal.svg";
		   System.out.println(okYonu);
	   }
	   else {
		   okYonu = "Up.svg";
		   System.out.println(okYonu);
		   
	   }
	   //array
	   
	   String[] krediler = {"Hızlı Kredi","maaşını alanlar","mutlu emekli"};//0.- 1. ve 2.
	   
	   
	   
	   
	   for(int i = 0; i<krediler.length;i++) { //krediler.lenght=kaç elemandan oluşuyon
		   System.out.println(krediler[i]);
		   	   
	   }
	   
	   
	   double[] myList = {1.2 , 1.4 , 1.6 , 1.8 , 2.0}; // tek boyutlu
	   
	   double toplam=0;
	   double max = myList[0];
	  
	   //---------------------------------------------
	   { for(int j = 0 ; j < myList.length ; j++) {
		   System.out.println(myList[j]);
		   toplam += myList[j];
		   //bunla alttaki aynı for döngüsü
  }
	   System.out.println(toplam);}
	   
	   //---------------------------------------------
	   
	   for(double numaralar:myList) {		  //numara sıra sıra 0. dan itibaren hepsi oluyo aynı i nin artması gibi
		   
		   if(max<numaralar) {
			   max=numaralar;
		   }
	   }
	   System.out.println("maximum olan" + max);
	   
	   //----------------------------------------------
	   
	   
	   
	   {
	   
	   String[][] sehirler = new String[2][3];//bu My list oluşturmakla aynıdır burda sehirler adında
	                                          //2 boyutlu (2 tane köşeli var)dizi oluşturmaktır
	   
	   sehirler[0][0] = "a";             //koşelinin içindeki sayılar 2 satırdan ve 3 er öğeden oluşsun demek
	   sehirler[0][1] = "b";
	   sehirler[0][2] = "c";
	   sehirler[1][0] = "d";
	   sehirler[1][1] = "e";
	   sehirler[1][2] = "f";
	   
	   
	   for(int i = 0 ; i<2 ; i++) {     //i sutünü j satırı belirler
		   for( int j = 0 ; j<3 ; j++) {
			   System.out.println(sehirler[i][j]);
		   }
	   }
	   
	   
	   
	   
	   
	   
	   }
	   
	}
	

}
