package intro;

public class RecapDemo1 {
	
//büyük sayı bulma
	
	public static void main(String[] args) {
		{int sayı1 = 5;
		int sayı2 = 6;
		int sayı3 = 4;
		
		if(sayı1>sayı2 &  sayı1>sayı3) {
			System.out.println("En büyük sayı " + sayı1);
		}
		else if(sayı2>sayı1 &  sayı2>sayı3) {
			System.out.println("En büyük sayı " + sayı2);
		}
		else if(sayı3>sayı2 &  sayı3>sayı1) {
			System.out.println("En büyük sayı " + sayı3);
		}}
		
//sayı asal mı 	
		
		{int sayı=168;
		boolean asalMı=true;
		
		for(int i = 2 ; i<sayı; i++ ) { //i yi 0 a tanımlarsan klasik düzlemdeki gibi hata verir çünkü sayı/0 sıkıntılı
			if(sayı%i==0) {
				asalMı=false;
				System.out.println(asalMı);
				break;
				
			}
			else {
				System.out.println(asalMı);
				break;	
			}}
			
		}
		
	//kalın ses mi ince ses mi 
		
		{char voice = 'i';
		
		switch(voice) {
		
		case 'a':
		case 'ı':	
		case 'o':
		case 'u': System.out.println("kalın ses"); break;
		case 'e':
		case 'i':
		case 'ö':
		case 'ü': System.out.println("ince ses"); break;		
		}}
		
		
		//mükemmel sayı bulma
		
		{int sayı=8;
		int bölenToplamı=0;
		
		for(int i =1; i<sayı ; i++ ) {
			
			if(sayı%i==0) {
				bölenToplamı +=i;
				
			}
			
			}
		if(bölenToplamı==sayı) {
			System.out.println("Mükemmel sayı");
		}
		else
			System.out.println("Mükemmel sayı değil");}
		
		
		//arkadaş sayı bulma
		
		{int sayı1 = 284 ;
		int bölenTop1=0;
		int sayı2 = 219 ;//220
		int bölenTop2=0;
		
		for(int i = 1 ; i<sayı1 ; i++) {
			if (sayı1 % i == 0) {
				bölenTop1 += i;
			}
		
		}
		for(int j = 1 ; j<sayı2 ; j++) {
			if (sayı2 % j == 0) {
				bölenTop2 += j;
			}
		}
		
		if(sayı1 == bölenTop2 & sayı2 == bölenTop1 ) {
			System.out.println("ARKADAŞ SAYILAR");
		}
		
		else
			System.out.println("ARKADAŞ SAYILAR DEĞİL");}
		//Emir Dağdelen
		
		
		
		
		
	}
	
}

  


         
         









