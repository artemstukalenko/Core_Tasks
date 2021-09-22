package p1;

import java.io.*;

public class FileMerger {

    private static File sourceFile1 = new File("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task33\\src\\main\\resources\\src1.txt");
    private static File sourceFile2 = new File("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task33\\src\\main\\resources\\src2.txt");

    public static void main(String[] args) {
        try {
            mergeTwoFilesIntoOne(sourceFile1, sourceFile2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static File mergeTwoFilesIntoOne(File file1, File file2) throws IOException {
        File mergedFile = new File("C:\\Users\\Professional\\IdeaProjects\\Core_Tasks\\Task33\\src\\main\\resources\\merged.txt");
        FileReader reader = null;
        FileWriter writer = null;

        try {

            reader = new FileReader(file1);
            writer = new FileWriter(mergedFile);
            int c;

            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            reader = new FileReader(file2);

            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
            writer.close();
        }

        return mergedFile;
    }
}
