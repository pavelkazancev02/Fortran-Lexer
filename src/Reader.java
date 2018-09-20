import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    /**
     * This class read information from input file
     */
    public class Reader {
        private Scanner scanner;
        private String prLine;

        /**
         * This constructor works with file name
         *
         * @param filename
         */
        public Reader(String filename) {
            File file = new File(filename);
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                scanner = null;
                System.out.println("File not found!");
            }
        }

        /**
         * This method read the string from input file
         *
         * @return string/null
         */
        public String nextLine() {
            if (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.charAt(5) == ' '){
                    prLine = line;
                    return line;
                }
                else{
                    prLine += line.substring(6,line.length());
                    return prLine;
                }
            }
            else
                return null;

        }

        /**
         * this method return true if file has next line
         *
         * @return true/false
         */
        public boolean hasNextLine() {
            if (scanner.hasNextLine()) {
                return true;
            } else return false;
        }
    }
