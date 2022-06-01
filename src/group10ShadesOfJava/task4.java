package group10ShadesOfJava;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[][] array = {{2,3,4,5,8}, {4,5,6,7,34,60}};
		
		int evenNum =0;
		
		for(int i = 0; i<array.length; i++) {
			
			for(int y =0;y<array[i].length; y++) {
				
				if (array[i][y] % 2==0) {
					
					evenNum=array[i][y];
					System.out.println(evenNum);
				}
			}
				
	}

}}
