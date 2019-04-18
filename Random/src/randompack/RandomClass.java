package randompack;

import java.util.ArrayList;
import java.util.Random;

public class RandomClass {


    public static void main(String[] args) {
        Random random = new Random();
        int z = random.nextInt(999);
        ArrayList<Integer> arraylist = new ArrayList<>();

        arraylist.add(z);

        for (int i=0; i<arraylist.size();i++){
            System.out.println(arraylist);
        }

    }
}
