
public class ArrayAddition {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{3,2,1},{4,5,6}};
		int[][] arr1= {{7,8,9},{6,5,4},{3,2,1}};
		//create the another matrix to store the addition of these two matrixes
		int[][] arr2= new int[3][3];
				
		//addition of the two matrix elements
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr2[i][j]=arr[i][j]+arr1[i][j];
				System.out.print(arr2[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		
	}

}
