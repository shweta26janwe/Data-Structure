import java.util.*;

public class Union{
    
    // public static void main(String args[]){
    //     int num1[] = {4,3,2,5,6,7,3,4,2,1};
    //     int num2[] = {4};
    //     HashSet<Integer> set = new HashSet<>();
    //     for(int i=0;i<num1.length;i++){
    //         set.add(num1[i]);
    //     }

    //     for(int i=0;i<num2.length;i++){
    //         set.add(num2[i]);
        

    //     System.out.println("ans : " + set.size());

    // }


    //Intersection
    public static void main(String args[]){
        int num1[] = {4,3,2,5,6,7,3,4,2,1};
        int num2[] = {4};
        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;
        for(int i=0;i<num1.length;i++){
            set.add(num1[i]);
        }

        
        for(int i=0;i<num2.length;i++){
            if(set.contains(num2[i])){ //in HashMap containsKey but in HashSet only contains
                cnt++;
                set.remove(num2[i]);
            }

        }



        System.out.println("ans : " + cnt);

    
}
}