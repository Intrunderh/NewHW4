public class Zadanie1 {
    //   *
    //  ***
    //  ****
    //  *****
    // *******

    // Нашел в интернете. Вроде понял решение, но объяснить все равно нужно будет
    public static void main(String[] args) {
        int rows = 10;
        for (int i = rows - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k <= rows - 1; k++) {
                System.out.print("*" + " ");
            }

            System.out.println("");

        }


    }


}
