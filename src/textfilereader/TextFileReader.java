/*
 * Ferris D.
 * 16/10/2018
 *
 */

package textfilereader;

import java.io.*;
import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class TextFileReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //
        try{
            String fileName = JOptionPane.showInputDialog("Please enter the filename");
            BufferedReader readFile = new BufferedReader(new FileReader(fileName));
            String line, output;
            output = "";
            while((line = readFile.readLine()) != null){//EOF
                System.out.println(line);
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("The file you specified could not be found"
                    + "\nMake sure to add .txt at the end of the filename");
        }
    }
    
}
