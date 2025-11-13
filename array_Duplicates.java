Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

Note: You can return the elements in any order but the driver code will print them in sorted order.

Examples:

Input: arr[] = [2, 3, 1, 2, 3]
Output: [2, 3] 
Explanation: 2 and 3 occur more than once in the given array.
Input: arr[] = [3, 1, 2] 
Output: []
Explanation: There is no repeating element in the array, so the output is empty.
Constraints:
1 ≤ n ≤ 106
1 ≤ arr[i] ≤ n





  class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            int n= Math.abs(arr[i])-1;
            if(arr[n]<0){
                a.add(Math.abs(arr[i]));
            }
            else{
                arr[n]=-arr[n];
            }
        }
        return a;
    }
}





For arr = [2, 3, 1, 2, 3]

Step	i	arr[i]	index	arr[index] before	Action	arr after step	ans
1	0	2	1	3	Make arr[1] = -3	[2, -3, 1, 2, 3]	[]
2	1	-3	2	1	Make arr[2] = -1	[2, -3, -1, 2, 3]	[]
3	2	-1	0	2	Make arr[0] = -2	[-2, -3, -1, 2, 3]	[]
4	3	2	1	-3	arr[1] < 0 → duplicate	[-2, -3, -1, 2, 3]	[2]
5	4	3	2	-1	arr[2] < 0 → duplicate	[-2, -3, -1, 2, 3]	[2, 3]

✅ Final Answer: [2, 3]

⏱️ Complexities

Time: O(n) → one loop only

Space: O(1) → no extra data structure (ignoring output list)
