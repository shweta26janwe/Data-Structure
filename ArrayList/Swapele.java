import java.util.ArrayList;

public class Swapele{
  public void swap(ArrayList<> list, int id1, int id2){
    int temp = list.get(id1);
    list.set(id1, list.get(id2));
    list.set(id2, temp);
  }
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();

    list.add(3);
    list.add(6);
    list.add(3);
    list.add(8);

    System.out.println(list);
    int id1 =1, id2=3;

    swap(list , id)
  }
}