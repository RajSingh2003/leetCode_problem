Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.
Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105

class Solution {
    public int getSecondLargest(int[] arr) {
      Arrays.sort(arr);
      int n= arr.length;
      for(int i=n-1;i>0;i--){
          if(arr[i-1]<arr[i]){
              return arr[i-1];
          }
      }
      return -1;
    }
}



🧮 Example:
int arr[] = {15, 8, 22, 10, 5};

🔹 Step 1: Sort the array
Arrays.sort(arr);


After sorting:

arr = [5, 8, 10, 15, 22]

🔹 Step 2: Set variables
int n = arr.length;  // n = 5
int l = arr[n - 1];  // l = arr[4] = 22 (largest)

🔹 Step 3: Loop from the end
i	arr[i]	arr[i-1]	Condition (arr[i-1] < arr[i])	Action
4	22	15	✅ 15 < 22	return 15

✅ Condition true → the loop immediately returns 15.

🎯 Output:
Second largest element = 15

🧠 Explanation (simple):

Sorted array → [5, 8, 10, 15, 22]

Largest number = 22

Next smaller = 15

So the second largest = 15


