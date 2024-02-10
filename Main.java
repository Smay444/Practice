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

    }
}
