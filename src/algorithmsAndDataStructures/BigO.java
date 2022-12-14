package algorithmsAndDataStructures;

public class BigO {

    // Big o = O(n)
    // explanation: O(n) is because in this case we run the same number of operations as we pass in, in this case 10
    public static void printItems(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // Big o = O(n) because we drop constants in Big o, the actual value of this code is n + n operations, or O(2n), we drop the 2 to get O(n)
        for(int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }

    // Big o = O(n^2)
    // explanation: every nested loop runs n times n, or n * n, in our case this runs n * n * n, or this would be O(n3), we simplify this to O(n^2)
    public static void printMoreItems(int n) {
        // Big o = O(n^2)
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        // Drop non dominants
        // Big o = O(n)
        for(int k = 0; k < n; k++) {
            System.out.println(k);
        }
        // the Big o notation for this function is still O(n^2), if we did not drop the non-dominant the notation would be O(n^2 + n), so we drop the non-dominant n to simplify to O(n^2)
    }

    // Big o = O(1)
    // explanation: there is only one operation in this method, when there is only one operation the big o value is O(1), also known as linear time
    public static int addStuff(int n) {
        return n + n;
    }

    // for O(log n) we will imagine we have an array of[1, 2, 3, 4, 5, 6, 7, 8], how many times would we cut the array in half to find the item 1 in this array? we would cut the array in half, then cut it in half again, and again, until we find the item we are looking for in the array. in this case it would be 3 times(or steps), so the logarithm would be log sub2 8 = 3, in big o this is O(log n)

    // different terms for different inputs
    public static void printStuff(int a, int b) {
        for(int i = 0; i < a; i++) {
            System.out.println(i); // O(n) reassigning this value to O(a)
        }

        for(int j = 0; j < b; j++) {
            System.out.println(j); // O(n) reassigning this value to O(b)
        }

        // so the total Big o value of this method is O(a + b)
        // if these two loops were nested inside one another, the Big o value is O(a * b)
    }
}
