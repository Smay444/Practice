public class Main {
    public static void main(String[] args) {

        Practice practice = new Practice();
        int[] statues = {0,3, 6, 8};
        Practice.solution(statues);

        int[] left = {5,10,15,20};
        int[] right = {1,3,5,7,9};
        Practice.merge(left,right);

        int p0 = 1500;
        double percentage = 5;
        int aug = 100;
        int p = 5000;
        Practice.nbYear(p0, percentage, aug, p);

        int number = 1705;
        Practice.century(number);

        int[] sequence = {1, 2, 3, 4, 5, 3, 5, 6};
        Practice.solutions(sequence);

        String myStr = "Java can be cool and difficult";
        Practice.reversedString(myStr);
        String newStr = "My name is Staci May";
        Practice.count(newStr);

        String myStr2 = "banana";
        Practice.palindrome(myStr2);

        int[] arr = {1,2,3,5,3,3};
        Practice.findFirstDuplicate(arr);

        String s = "abacabad";
        Practice.doesNotContain(s);

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Practice.rotate90(a);

        int[] sequence1 = {1,2,1,2};
        Practice.sequence(sequence1);

        String beast = "great blue heron";
        String dish = "garlic nann";
        Practice.feast(beast,dish);

        char[][] grid = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                        {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                        {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                        {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                        {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                        {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                        {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};



        int[] ar = {25, 35, 872, 228, 53, 278, 872};
        //grab the five see if any other #'s start with a five last char of first #.
        //% 10 remainder would give you a five ar[0] % 10
        Practice.crap(ar);

        String myString = "528";
        Practice.str(myString);

        int[] numbers = { 6, 2, 1, 8, 10};
        Practice.sum(numbers);
    }
}
