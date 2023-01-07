
public class Exercicio5_15 {

	public static void main(String[] args) {
		//pattern 1
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		//pattern 2
		for(int i = 10; i >= 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
		//pattern 3 
		for(int i = 10; i >= 0; i--) {
			for(int j = 0; j <10 - i; j++) {
				System.out.print(' ');
			}
			for(int k = 0; k < i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		//pattern 4
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10 - i; j++) {
				System.out.print(' ');
			}
			for(int k = 0; k <= i; k++) {
				System.out.print('*');
			}
			System.out.println();
			
		}
			
	}

}
