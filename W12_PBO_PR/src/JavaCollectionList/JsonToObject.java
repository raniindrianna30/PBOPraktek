package JavaCollectionList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class JsonToObject {
    public static void main(String[]args) {
        Gson gson = new Gson();
        try {
            ArrayList<Barang> data = gson.fromJson(
                    new FileReader("D:\\TUGAS PBO\\W12_PBO_PR\\src\\JavaCollectionFramework\\barang.json"),
                    new TypeToken<ArrayList<Barang>>() {}.getType()
            );
            for(int x = 0; x<data.size(); x++) {
                System.out.println("Barang ke-" +(x+1) + " = " + data.get(x).toString());
            }
        } catch(JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}



