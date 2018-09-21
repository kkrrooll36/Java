package project1;
import java.util.*;
import java.io.*;
public class TextFileInfoPrinter
{
    public static void main(String[]args) throws FileNotFoundException
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Укажите путь к файлу: ");
        String inputFile = console.next();
        File file = new File(inputFile);
        Scanner in = new Scanner(file);
        int lines = 0;
        int chars = 0;
        while(in.hasNextLine())  {
            lines++;
            String line = in.nextLine();
            for(int i=0;i<line.length();i++)
            {
                if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
                    chars ++;
            }
        }
        while(in.hasNextLine())
        {
            in.nextLine();
            lines++;
        }
        while(in.hasNextByte())
        {
            in.nextByte();
            chars++;
        }
        System.out.println("Кол-во строк: " + lines);
        System.out.println("Кол-во символов: " + chars);
    }
}