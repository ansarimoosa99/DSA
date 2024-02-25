public class SecondLargestArrElement {

    public static int findSecondLargest(int n, int[] arr) {
        // Write your code here.
        int secLargest = -1000000000;
        int larg = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > larg) {
                secLargest = larg;
                larg = arr[i];
            } else if (arr[i] > secLargest) {
                secLargest = arr[i];
            }

        }

        return secLargest;

        }

        public static void main(String[] args) {
            int[] arr ={2, 3, 4, 5, 6};

          int a =  findSecondLargest(5,arr);
          System.out.println(a);
        }

}
