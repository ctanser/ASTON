public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "в"}};

        try {
            int sum = sumArray(array);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
