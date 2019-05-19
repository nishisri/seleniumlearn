public class LoopLearn {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i = i + 1;
        }

        for (int j = 0; j < 10; j = j + 1) {
            if (j % 2 != 0) {
                System.out.println(j);


            }
        }


    }
}
