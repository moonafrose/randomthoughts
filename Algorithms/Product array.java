/*
You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
eg. [1,2,8]=>[16,8,1]
  *. Using two for loops is very inefficient as it calculates same multiplication over and over again for different indexes.

*/

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = new int[] { 1, 2, 8 };
		
		
		int[] productBeforeIndex = new int[arr.length];
            int product = 1;
            for (int i = 0; i < arr.length; i++)
            {
                productBeforeIndex[i] = product;
                product = product * arr[i];
            }
			
            //region Method 1
            int[] productAfterIndex = new int[arr.length];
            product = 1;
            for (int i = arr.length - 1; i >= 0; i--)
            {
                productAfterIndex[i] = product;
                product = product * arr[i];
            }

            int[] finalProduct = new int[arr.length];
            for (int i = 0; i < arr.length; i++)
            {
                finalProduct[i] = productBeforeIndex[i] * productAfterIndex[i];
            }
            
            for(Integer x :finalProduct )
              System.out.print(x+ " ");
		  
		  //end region Method 1
		  
		  //region Method 2
		  /*
		  int[] productExceptIndex = new int[arr.length];
            productSoFar = 1;
           for (int i = 0; i < arr.length; i++)
            {
                productExceptIndex[i] = productSoFar;                 //Same as productBeforeIndex
                productSoFar = productSoFar * arr[i];
            }
			productSoFar = 1;
			 for (int i = arr.length - 1; i >= 0; i--)
            {
				productExceptIndex[i]=productExceptIndex[i]*productSoFar;
				productSoFar=productSoFar*arr[i];
			}
			 for(Integer x :productExceptIndex )
              System.out.print(x+ " ");
		  
		  */
		  //end region Method 2
	}
}