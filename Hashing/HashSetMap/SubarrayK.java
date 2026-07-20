import java.util.*;

public class SubarrayK{
    public static void main(String args[]){
        int arr[] = {10,2,-2,-20,10};
        int k= -10;

        HashMap<Integer,Integer> map = new HashMap<>();
        //HashMap<val,count> mao = new HashMap<>();

        map.put(0,1); // make sure it is already present in map for thisa problem

        int sum=0;
        int ans=0; //count

        for(int j=0;j<arr.length;j++){
            sum +=arr[j];
            if(map.containsKey(sum-k)){
                //means k subarray exist
                ans += map.get(sum-k); //get funt give the second(count) value

            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        System.out.println(ans);
    }
}