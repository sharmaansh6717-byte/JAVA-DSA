class Array_01 {
     public int findNumbers(int[] nums) {
         int evencounter = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int num = nums[i];
            int digit = countDigits(num); //function calling 
            if(digit % 2 == 0)
            {
                evencounter++;
            }
            else
            {
                continue;
            }
           
        }
         return evencounter;
     }
        
   

   
    int countDigits(int num)
    {
       int counter = 0 ;
       int digit = num ;
        while(digit!=0)
        {
            digit /= 10;
            counter++;
            
        }
        return counter;
     
        
        
    }
   
}