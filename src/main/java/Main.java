public class Main {
    public static void main(String[] args) {
        String mas[][] = new String[3][4];
        try {
            someMethod(mas);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        String mas1[][] = {{"1", "abc", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            someMethod(mas1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        String mas3[][] = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            int sum = someMethod(mas3);
            System.out.println(sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int someMethod(String mas[][]) throws MyArraySizeException, MyArrayDataException {
        if (mas.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                try {
                    sum += Integer.parseInt(mas[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования в число по индексам" + i + j);
                }

            }
        }
        return sum;
    }

    public static class MyArraySizeException extends Throwable {
    }

    public static class MyArrayDataException extends Throwable {
        public MyArrayDataException(String mes) {
            super(mes);
        }
    }
}
