public class Main {

    public static void main(String[] args) {

        int val = 0;
        System.out.print("squares: ");
        while (val < 10) {
            val++;
            int square = val * val;
            System.out.printf("%d ", square);
        }
        System.out.println();


        val = 0;
        System.out.print("cubes: ");
        while (val < 10) {
            val++;
            int cube = val * val * val;
            System.out.printf("%d ", cube);
        }
        System.out.println();



        System.out.print("Fibonacci sequence: ");
        int a = 0;
        int b = 0;
        int fib = 1;
        do {
            a = b;
            b = fib;
            fib = a + b;
            System.out.printf("%d ", fib);
        } while (fib <= 55);
        System.out.println();




        System.out.print("Prime numbers: ");
        val = 1;
        while (val < 30) {
            val++;
            boolean p = false;
            int num = 1;
            while (num < val / 3) {
                ++num;
                if (val % num == 0) {
                    p = true;
                    break;
                }
            }
            if (!p)
                System.out.printf("%d ", val);
        }
        System.out.println();


        System.out.print("Triangles: ");
        int value=1;
        int number=1;
        while(value<11){
            int triangle= value+number;
            number= triangle;
            value++;
            System.out.print(triangle-1 + " ");
        }
        System.out.println();
    }
}


