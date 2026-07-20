import java.util.*;

public class ConnectNRopes{

    public static void main(String args[]){
        int ropes[] = { 2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size() > 1 ){
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            //Note that here not add cost because it is a total we want add previous sum
            pq.add(min + min2);

        }
        System.out.println("minimunm cost of connected ropes is "+cost);
    }
}