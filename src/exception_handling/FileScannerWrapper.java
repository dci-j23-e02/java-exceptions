package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerWrapper {

  //Attributes
  private Scanner scanner;

  /***
   * Constructs a new FileScannerWrapper and initialises the Scanner with the given file name
   * @param fileName The name of the file to be read.
   * @throws  java.io.FileNotFoundException if the file with the specified name does not exist
   */
  public FileScannerWrapper(String fileName) throws FileNotFoundException {
    File file  = new File(fileName);
    this.scanner = new Scanner(file);
    // We handle the Exception by passing it up using throws keyword while we are defining the method
    //  We handle the Exception using try catch block while invoking ( calling ) the method
  }

  /**
   * Reads the nest line from the file
   *
   * @return  The next line from the file
   * */
  public String readLine(){return scanner.nextLine();}

  /**
   * Closes the scanner.
   * */
  public  void close() {scanner.close();}

  // Main method for demonstration purposes
  public static void main(String[] args) {
    //  We handle the Exception using try catch block while invoking ( calling ) the method
    try {
      FileScannerWrapper fileScanner = new FileScannerWrapper("example.txt");
      while (fileScanner.scanner.hasNextLine()){
        System.out.println(fileScanner.readLine());
      }
      fileScanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("The specified fila path was not found: "+ e.getMessage());
    //  e.printStackTrace();
    }
  }


}
