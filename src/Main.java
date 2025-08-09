import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("enter choice for adding notes or reading notes\n0 for adding\n1 for reading\n2 for appending\n3 for deleting\n4 for exit:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 0:
                    System.out.println("enter file name to create file(should contain(.txt)):");
                    sc.nextLine();
                    String str= sc.nextLine();
                    try{
                        File file = new File(str);
                        file.createNewFile();
                        FileWriter writer = new FileWriter(str);
                        System.out.println("enter the content to write in the file");
                        String text = sc.nextLine();
                        writer.write(text);
                        System.out.println("succesfully created the file named "+str+" and added text");
                        writer.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 1:
                    System.out.println("enter the file name what U want to read(should contain (.txt)): ");
                    sc.nextLine();
                    String strread= sc.nextLine();
                    try{
                        File readfile = new File(strread);
                        Scanner read = new Scanner(readfile);
                        while(read.hasNextLine())
                        {
                            String line = read.nextLine();
                            System.out.println(line);
                        }
                        read.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("enter file name to append file(should contain(.txt)):");
                    sc.nextLine();
                    String strappend= sc.nextLine();
                    try{
                        File file = new File(strappend);
                        FileWriter writer = new FileWriter(strappend,true);
                        System.out.println("enter the content to append content in the file");
                        String text = sc.nextLine();
                        writer.write("\n"+text);
                        System.out.println("succesfully appended the file "+strappend+" and added text");
                        writer.close();
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("enter the name of file for deleting should contain .txt :");
                    sc.nextLine();
                    String strdelete= sc.nextLine();
                    try{
                        File file = new File(strdelete);
                        file.delete();
                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }
                case 4:
                    System.out.println("EXCITING!!");
                    System.exit(0);
                default:
                    System.out.println("enter the right choice!!");
            }
        }

    }
}