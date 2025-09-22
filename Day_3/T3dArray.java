package Day_3;

public class T3dArray {
    public static void main(String args[]){
        int arr[][][] = new int[3][3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                for(int k=0; k<arr[0][0].length; k++){
                    arr[i][j][k] = (int)(Math.random() * 100);
                }
            }
        } 

        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                for(int k=0; k<arr[0][0].length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
          System.out.println();  
        } 
    }    
}
