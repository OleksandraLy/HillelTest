package com.hillel.lesson6homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CreatingFileWriter {
    static String whereTheFileIs="C:\\Users\\Олександра\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson6homework\\shakespeare.txt";
    public static void main(String[] args) throws IOException {
        writingVerse(whereTheFileIs);
        readingVerse(whereTheFileIs);
        readingWithScanner(whereTheFileIs);
    }
    private static void writingVerse(String whereTheFileIs) throws IOException {
        FileWriter myFileWriter = new FileWriter(whereTheFileIs);
        myFileWriter.write("Твій голос - музика, чому ж тобі\nНесуть печаль ясні музичні звуки?\nЧом любиш те, що зроджене в журбі,\nЧому жадаєш ти нудьги й розпуки?");
        myFileWriter.close();
    }
    public static void readingVerse(String whereTheFileIs) throws IOException {
        char [] verseCharArray=new char [100];
        FileReader verseFileReader= new FileReader(whereTheFileIs);
        verseFileReader.read(verseCharArray);
        System.out.println("Файл було прочитано:\n");
        System.out.println(Arrays.toString(verseCharArray));
        verseFileReader.close();
    }
    private static void readingWithScanner(String whereTheFileIs) throws IOException {
        FileReader verseFileReader2= new FileReader(whereTheFileIs);
        Scanner scannerForVerse = new Scanner(verseFileReader2);
        while (scannerForVerse.hasNextLine()){
            String verseString =scannerForVerse.nextLine();
            System.out.println(verseString);
        }
        scannerForVerse.close();
        verseFileReader2.close();
    }
}
