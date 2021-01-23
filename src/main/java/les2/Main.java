package les2;

public class Main {

    public static void main(String[] args) {
        String [][] a = new String[][]{
                {"a","2","3","4"},
                {"5","6","7","8"},
                {"9","10","7","12"},
                {"13","14","15","16"}
        };

        System.out.println(a.length+"  "+a[0].length);


        arrSize(a);
    }

      private static void arrSize(String arr[][] ){
          int sum = 0;
        if(arr.length!=4) {

         throw new MyArraySizeException();
        }
          if(arr[0].length!=4) {

              throw new MyArraySizeException();
          }

          int sumResult = 0;

          for (int rowIndex = 0; rowIndex < arr.length; rowIndex++) {
              String[] row = arr[rowIndex];
              for (int colIndex = 0; colIndex < row.length; colIndex++) {
                  String value = row[colIndex];
                  try {

                      sumResult = sumResult + Integer.parseInt(value);
                  } catch (NumberFormatException e) {
                      throw new MyArrayDataException(value, rowIndex, colIndex);
                  }
              }
          }
          System.out.println(" ");
          System.out.println("summa = "+sum);
    }
}
