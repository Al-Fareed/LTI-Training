/*
 * One day, Mahirl is interested in finding how to sort a sequence of integers a1, a2, ... an in non-decreasing order.
Being a young kid, the only operation she can perform is a unit shift. That is, she can move the last element of the sequence to its beginning:
a1, a2, ..., an → an, a1, a2, ..., an - 1.
Help Mahirl to calculate: What is the minimum number of operations that she needs to sort the sequence?
Input and Output Format:
The first line contains an integer, n (2 ≤ n ≤ 105).
The second line contains n integer numbers a1, a2, ..., an (1 ≤ ai ≤ 105).
If it's impossible to sort the sequence output -1. Otherwise output the minimum number of operations Mahirl needs to sort it.
Sample Input 1
2
2 1
Sample Output 1
1
Sample Input 2
3
1 3 2
Sample Output 2
-1
Sample Input 3
2
1 2
Sample Output 3
0
 */
import java.util.*;
public class SortByShift {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number of elements in the array");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int idx=0,check=0;
    for(int i=0;i<n-1;i++){
      if(arr[i]>arr[i+1]){
        idx=i;
        check++;
      }
    }
    if(arr[0]<arr[n-1]){
      check++;
      idx=n-1;
    }
    if(check==0){
      System.out.println("0");
    }
    else if(check>1){
      System.out.println("-1");
    }
    else{
      System.out.println(n-idx-1);
    }
    sc.close();
  }
}