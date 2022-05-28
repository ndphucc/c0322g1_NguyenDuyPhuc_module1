package ss16_IO_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeFile(String path, String data) {
        try {
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String[]> readFile(String path) {
        List<String[]> strings = new ArrayList<>();
        String line = null;
        try (FileReader fileReader = new FileReader(path)) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split("");
                strings.add(arr);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public static void main(String[] args) {
        String sourceFilePath = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\ss16_IO_text_file\\bai_tap\\copy_file_text\\source_file";
        String targetFilePath = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\ss16_IO_text_file\\bai_tap\\copy_file_text\\target_file";
        try {
            List<String[]> characters = new ArrayList<>();
            FileReader fileReader = new FileReader(sourceFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] characters1 = line.split("");
                characters.add(characters1);
            }
            bufferedReader.close();
            FileWriter fileWriter = new FileWriter(targetFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String[] item : characters) {
                for (int i = 0; i < item.length; i++) {
                    bufferedWriter.write(item[i]);
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
