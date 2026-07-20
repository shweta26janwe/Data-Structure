
import java.util.ArrayList;

public class Classroom{
    public static void main(String[] args){
    //ClassName objectname = new ClassName();
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();
      list.add(9);
      list.add(6);
      list.add(4);
      System.out.println(list);    
      
      list.remove(2);
      System.out.println(list);
      int element = list.get(1);
      System.out.println("remove element is " + element);
      
  }
}