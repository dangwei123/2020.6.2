牛妹收到了一个项链，这个项链一共有n个珠子，每个珠子都有一个颜色a_ia 
i
​	
 。这n个珠子构成了一个环。

不知为何，牛妹想从项链上截下一段连续的珠子，但是牛妹不喜欢同一个颜色出现两次，所以截下来的这一段珠子中没有相同的颜色。现在牛妹想知道她可以截下的最长的一段珠子为多长？

第{i}i个珠子与第{i+1}i+1个珠子和第{i-1}i−1个珠子相邻。(i>1且i<n)
特别的，与第1个珠子相邻的珠子为第2个，第n个珠子。
与第n个珠子相邻的珠子为第n-1个，第1个珠子。
import java.util.*;


public class Solution {
    /**
     * 牛妹的项链
     * @param n int整型 
     * @param a int整型一维数组 
     * @return int整型
     */
    public int solve (int n, int[] a) {
        // write code here
        int i=0;
        int j=0;
        int max=0;
        Set<Integer> set=new HashSet<>();
        while(i<n){
            if(!set.contains(a[j])){
                set.add(a[j]);
                j=(j+1)%n;
                if(j>i) max=Math.max(max,j-i);
                else max=Math.max(max,n-i+j);
            }else{
                set.remove(a[i]);
                i++;
            }
        }
        return max;
    }
}



