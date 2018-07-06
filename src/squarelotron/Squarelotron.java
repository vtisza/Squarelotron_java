/**
 * 
 */
package squarelotron;

/**
 * @author V
 *
 */
public class Squarelotron{

	/**
	 * @param args
	 */
	int[][] squarelotron;
	int size;
	
	public Squarelotron(int n) {
		squarelotron= new int[n][n];
		size= n*n;
		for(int i=0; i<n; i++){
			 for(int j=0; j<n; j++){
				 squarelotron[i][j]=i*n+j+1;
	         }
        }
	}
	
    public static void ArrayPrinter(int[][] printArray)
    {
        int arraySize=printArray[0].length;
        int numSpace;

        for (int i = 0; i < arraySize; i++)
        {
            for (int j = 0; j < arraySize; j++)
            {
                //numSpace = 5-(int)(printArray[i, j]/10);
                numSpace = 5-(int)(Math.log10(printArray[i][j]));
                System.out.print(printArray[i][j]);
                for (int k=0; k<numSpace;k++)
                {
                	System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squarelotron myobj= new Squarelotron(11);
		ArrayPrinter(myobj.squarelotron);
	}

}
