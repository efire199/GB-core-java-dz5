import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public  class SaveInCsv {

    public static void save(String path, String FileName, AppData data){
        File file = new File (path + FileName);
        if(file.exists()){
            System.out.println("Exists");
        }else{
            System.out.println("not Exists");
        }

        String[] stringData = data.toStringMass();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + FileName))){
            for (String s : stringData) {
                writer.write(s +'\n');
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
