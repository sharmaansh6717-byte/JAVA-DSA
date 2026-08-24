//Brutte 
// // public class Array_1480 {
//     public int[] runningSum(int[] nums) {
//         int[] runningSum = new int[nums.length];
//         for(int i = 0; i < nums.length ; i++)
//         {
//            for(int j = 0 ; j <= i ; j++)
//            {
//             runningSum[i] += nums[j];
//            }
//         }
//         return runningSum;
//     }
    
// }


//Optimized
public class Array_1480 {
    public int[] runningSum(int[] nums) {   
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i = 1; i < nums.length ; i++)
        {
            runningSum[i] = runningSum[ i-1 ] + nums[ i ];
        }
        return runningSum;
    }
}
