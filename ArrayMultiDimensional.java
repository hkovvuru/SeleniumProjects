
public class ArrayMultiDimensional {
	
	public static void main(String[] args){
		int arr[][]= new int[2][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6; 
	//print the values
		//int arr[][]={{1,2,3},{2,4,5},{4,4,5}}; 
		
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
