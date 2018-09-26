import java.io.*;
public class Parse {

    Parse(String text) {
        try(FileReader reader = new FileReader(text))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }
}