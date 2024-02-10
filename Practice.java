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


    //Example of a Merge Sort
    int[] left = {5,10,15,20};
    int[] right = {1,3,6,7,9};
    public static int[] merge(int[] left, int[] right){

        int totalLength = left.length + right.length;
        int[] sortedArray = new int[totalLength];
        int i = 0, j=0, k=0; //keeps track of left, right and sortedArrays

        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                sortedArray[k] = left[i];
                i++;
            } else {
                sortedArray[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            sortedArray[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            sortedArray[k] = right[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(sortedArray));


        return sortedArray;
    }

    public static int nbYear (int p0, double percentage, int aug, int p){

        int numOfYears = 0;
        double currentPopulation = p0;
        double percent = percentage / 100;

        for (int i=0; i<p; i++) {
            if (currentPopulation < p){
                currentPopulation += currentPopulation * percent + aug;
                numOfYears++;
            } else {
                System.out.println("The numbers of years required would be: " + numOfYears);
                return numOfYears;
            }


        }
        return numOfYears;
    }

}
