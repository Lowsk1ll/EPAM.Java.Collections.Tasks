package OptionalTask;



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try (Scanner fromFile = new Scanner(new FileReader("src/main/resources/1"))) {
            while (fromFile.hasNext()){
                list.add(fromFile.nextLine());
            }
            Collections.reverse(list);
            FileWriter writer = new FileWriter("src/main/resources/1",true);
            writer.write("\nReverse\n");
            for(int i=0;i< list.size();i++){
                writer.write(list.get(i)+"\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
