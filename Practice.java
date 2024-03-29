import java.util.*;

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

    public static int century (int number){
        double century = Math.ceil(number / 100.0);
        System.out.println("The year of " + number + " is in century " + century);
        return (int)century;
    }

    public static boolean solutions(int[] sequence){

        int numRemoved = 0;

        for (int i=0; i<sequence.length-2; i++){
            if(sequence[i] >= sequence[i+1]){
                numRemoved++;
                if(sequence[i+1] <= sequence[i-1]){
                    numRemoved++;
                    System.out.println("The numRemoved is " + numRemoved);
                    return false;
                }
            }
        }
        if(numRemoved > 1){
            System.out.println("The numRemoved is " + numRemoved);
            return false;
        } else {
            System.out.println("The numRemoved is " + numRemoved);
            return true;
        }
    }

    public static String reversedString(String myStr){
        String reversedStr = "";
        for (int i=0; i<myStr.length(); i++){
            reversedStr = myStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed String is: " + reversedStr);
        return "";
    }

    public static int count(String newStr){
        int countWords = newStr.split(" ").length;
        System.out.println("The number of words in this String is: " + countWords);
        return countWords;
    }

    public static boolean validatePin(String pin){

        //find any non digit characters
        String noDigitChar = "\\D";
        int digits = pin.length();
        if (pin.matches(".*" + noDigitChar + "-*")){
            return false;
        } else if(digits == 4 || digits ==6){
            return true;
        }

        return false;
    }

    public static boolean palindrome(String myStr){

        //find the first letter location
        //find the last letter location

        //loop through the string
            //if the first character does not matches the last character
            //return false
            //increase counter first / decrease count second
        //else return true

        int first = 0;
        int last = myStr.length()-1;

        while(first<last){
            if (myStr.charAt(first) != myStr.charAt(last)){
                System.out.println("This string is not a palindrome");
                return false;
            }
            first++;
            last--;
        }
        System.out.println("The string IS a palindrome");
        return true;
    }

    public static int findFirstDuplicate(int[] arr){
        Set<Integer> seen = new HashSet<>();
        for(int i : arr){
            if(seen.contains(i)){
                System.out.println("The first duplicate # is: " + i);
                return i;
            }
            seen.add(i);
        }

        return -1;
    }

    public static char doesNotContain(String s){

        Map<Character, Integer> m = new HashMap<>();
        char[] newS = s.toCharArray();

        for (int i=0; i<newS.length; i++){
            if(m.containsKey(newS[i])){
                m.put(newS[i], m.get(newS[i]) + 1);
            } else {
                m.put(newS[i], 1);
            }
        }

        for (int i=0; i < newS.length; i++){
            if(m.get(newS[i]) == 1) return newS[i];
        }

        return '_';
    }
    int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
     };

    public static int[][] rotate90(int[][] a){

        int n = a.length;

        for(int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }


        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - 1 - j];
                a[i][n - 1 - j] = temp;
            }
        }
        System.out.println("The rotated array is: " + Arrays.deepToString(a));
        return a;


    }

    public static boolean sequence(int[] sequence){

        int count = 0;

        for (int i=1; i<sequence.length; i++){
            if(sequence[i] <= sequence[i-1]){
                count++;
                if(count>2){
                    System.out.println("There is more than 1 number removed");
                    return false;
                }
                if(i>1 && i<sequence.length-1 && sequence[i] <= sequence[i-2] && sequence[i=1] <= sequence[i-1]){
                    System.out.println("This array can not be consecutive");
                    return false;
                }
            }

        }
        System.out.println("This array can have only one value removed and still be consecutive");
        return true;
    }

    public static boolean feast (String beast, String dish){

        char beastChar = beast.charAt(0);
        char dishChar = dish.charAt(0);
        char beastLast = beast.charAt(beast.length()-1);
        char dishLast = dish.charAt(dish.length()-1);

        if ((beastChar == dishChar) && (beastLast == dishLast)){
            System.out.println("the two characters match" );
            return true;
        }
        System.out.println("The two characters do not match");
        return false;
    }

    public static long crap(int[] ar){

        int counter = 0;

        for (int i : ar){
            String myString = String.valueOf(i);
            for(char myChar : myString.toCharArray()){
                System.out.print(myChar);
            }
            System.out.println();
        }

        return 0;
        }

        public static String str(String myString) {

            String s = myString;
            String t = "825";

            if (s.contains(t)) {
                System.out.println("you was right");
            } else {
                System.out.println("I was Right");
            }
            return s;
        }

        public static int sum(int[] numbers){
            int sum = 0;
            Arrays.sort(numbers);
            System.out.println("The sorted array is: " + Arrays.toString(numbers));

            for (int i=1; i<numbers.length-1; i++){
                sum += numbers[i];
            }
            System.out.println("The sum of the array is: " + sum);
            return sum;
        }

    }



