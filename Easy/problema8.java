import java.util.*;


public class problema8 {
	public static void main (String[] args){
		int i =1;
		int j =1 ;
		try (Scanner scanner = new Scanner (System.in)) {
			for ( i=1; i <= 5; i++){
				
					if(scanner.nextInt() ==1) break;
					if(i == 5){
						j++;
						i=0;
					}

			}

			scanner.close();
		}
		System.out.println(Math.abs(i-3)+Math.abs(j-3));
		
	}	

}