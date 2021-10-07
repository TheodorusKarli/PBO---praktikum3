public class Latihan9 {
	public static void main(String[] args) {
		
		int batas = 0;
		do {
			System.out.print(batas);
			batas++; 		
			
		} while (batas<10);
	}
}

//jika batas++ diganti menjadi batas-- maka outputnya adalah infinite loop karena nilai patokannya tidak akan mencapai kondisi terminasi yaitu batas<10, melainkan malah mengalami decrement ke arah minus yaitu mulai dari angka 0 hingga minus tak terhingga.