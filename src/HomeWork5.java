import java.io.File;

public class HomeWork5 {

    public static void main(String[] args) {
        String[] testHeader = new String[]{"Field1", "Field2", "Field3"};
        int[][] testData
                = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        AppData data1 = new AppData(testHeader, testData);

        String path =  "./text/";
        String fileName = "1.csv";

        SaveInCsv.save(path, fileName, data1);

        ReadInCsv.read(path, fileName, data1);
    }
}
