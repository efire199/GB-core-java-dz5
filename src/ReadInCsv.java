import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadInCsv {

    public static void read(String path, String FileName, AppData data){
        try (BufferedReader reader = new BufferedReader(new FileReader(path + FileName))){
            String str;
            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
