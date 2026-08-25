public class Array_1672 {
    //BRUTTE APPROACH;
    public int maximumWealth(int[][] accounts){
    
//     int[] sum = new int[accounts.length];
//     int summ = 0;
//      {
//         for(int i = 0 ; i < accounts.length; i++)
//         {
//             for(int j = 0; j < accounts[i].length; j++)
//             {
//               summ += accounts[i][j];
//               sum[i] = summ;
              
//             }
//             summ = 0;
           
//         }
//         int temp = sum[0];
//         for(int i = 1 ; i < accounts.length ; i++)
//         {
            
//             if(sum[i] > temp)
//             {
//                 temp = sum[i];
//             }
//         }
//         return temp;
        
//     }
// }
//OPTIMMIZED
 int max = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {

                sum += accounts[i][j];

            }

            if (sum > max) {

                max = sum;

            }

        }

        return max;
}
}