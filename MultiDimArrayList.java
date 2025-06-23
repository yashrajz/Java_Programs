import java.util.*;

public class MultiDimArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creation of multi-dimentioanl ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initilisation
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());  // it will create 3 new ArrayList at index 0, 1, 2;
        }

        //Adding element- taking input by user;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt()); //getting the [0,1,2]th ArrayList and adding element to it;
            }
        }

        System.out.println(list);



    }
}
