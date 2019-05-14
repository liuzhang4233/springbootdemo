package demo.test.math;

import java.util.HashMap;
import java.util.Map;

public class MathSum {

    public static void main(String[] args) {
        int[] arr = {1,3,6,8,5,7};
        int target = 9;
        //1.空间复杂度O(1)  时间复杂度O(n²)
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if((target - arr[i] == arr[j])){
//                    System.out.println(arr[i]+"--"+arr[j]);
//                }
//            }
//        }

        //哈希表 时间复杂度O(n) 我们把包含有 nn 个元素的列表遍历两次。由于哈希表将查找时间缩短到 O(1)O(1) ，所以时间复杂度为 O(n)O(n)。
        // 空间复杂度O(n) 所需的额外空间取决于哈希表中存储的元素数量，该表中存储了 nn 个元素。
//        Map map = new HashMap();
//        for (int i = 0; i < arr.length; i++) {
//            map.put(arr[i],i);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            int complement = target - arr[i];
//            if(map.containsKey(complement) && (Integer) map.get(complement) != i){
//                System.out.println(arr[i]+"--"+complement);
//            }
//        }

        //一遍哈希表 空间O(n)  时间O(n)
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println(arr[i]);
            }
            map.put(complement, i);
        }
    }
}
