package InterviewSpecific;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvFileRederExample {
    public static void main(String[] args) {

        String path = "C:\\Users\\gour6\\Downloads\\SampleCSVFile_2kb.csv";
        String line = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine())!= null){
                String[] values = line.split(",");
                System.out.println(values[0]);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
