
package kata4;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Kata4 {

    public static void main(String[] args) throws IOException {
        String fileName = "e1.txt";
        ArrayList<String> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = mailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    private static void print(File[] files,String indent){
        if(files==null)return;
        for (File file : files) {
            System.out.println(indent + (file.isDirectory() ? "+" : "-")+ file.getName());
            if(!file.isDirectory() || file.isHidden())continue;
            print(file.listFiles(), indent +" ");
        }
    }
}


