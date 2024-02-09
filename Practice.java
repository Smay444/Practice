import java.util.Arrays;
public class Practice {

    public static int solution(int[] statues) {
        Arrays.sort(statues);

        int counter = 0;
        for (int i=1; i<statues.length; i++){

            int gap = statues[i] - statues[i-1];

            if (gap > 1){
                counter += gap -1; // Subtract 1 to exclude the current statue
            }
        }
        System.out.println("The number required is " + counter);
        return counter;
    }


    //use a nested loop
    //one loops starts at zero / one starts at one

}
