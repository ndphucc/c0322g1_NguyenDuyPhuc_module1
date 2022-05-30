package ss17_binary_file.bai_tap.copy_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\ss17_binary_file\\bai_tap\\copy_file\\file1.csv";
        String targetPath = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\ss17_binary_file\\bai_tap\\copy_file\\file2.csv";
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        try {
            copyFileUsingJava7Files(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
