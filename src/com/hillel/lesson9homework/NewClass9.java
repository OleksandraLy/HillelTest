package com.hillel.lesson9homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewClass9 {
    static String pathToFile2= "C:\\Users\\Олександра\\IdeaProjects\\HillelJavaCourse\\src\\com\\hillel\\lesson9homework\\user2.txt";
    public static void main(String[] args) throws IOException {
        writeText();
        readText();

    }
    public static void readText() throws IOException {
        System.out.println("Start reading from file:");

        FileReader informationReader= new FileReader(pathToFile2);
        Scanner enterInformationHere = new Scanner (informationReader);
        //enterInformationHere.useDelimiter("\n");
        //int i=1;

        while (enterInformationHere.hasNextLine()){
            //System.out.println("Read one string from file:");
            System.out.println(/*i + " : " + */enterInformationHere.nextLine());
            //i++;
        }

        enterInformationHere.close();
        informationReader.close();
    }
    public static void writeText() throws IOException {
        //System.out.println("Please, enter your information here:");



        FileWriter userFileWriter= new FileWriter(pathToFile2);
        boolean isContinue=true;
        while (isContinue) {
            System.out.println("Enter text to write in file:");
            Scanner enterYourInformation= new Scanner(System.in);
            String moreEnteredInformation = enterYourInformation.nextLine();
            userFileWriter.write(moreEnteredInformation);
            System.out.println("Print end to finish:");
            String signalToStopWriting= new String("end");
            boolean toFinishIfEnd=signalToStopWriting.equalsIgnoreCase(moreEnteredInformation);
            if (toFinishIfEnd =true) {
                isContinue=false;
                enterYourInformation.close();
            }
        }
        //userFileWriter.write("Твій голос - музика, чому ж тобі \nНесуть печаль ясні музичні звуки?\nЧом любиш те");

        userFileWriter.close();

    }
}
