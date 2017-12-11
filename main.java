import java.lang.reflect.*;
import java.util.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class main{
  public static void main(String[] args)throws Exception{
    String dirPath = "/Users/gushuqin/Desktop/cisc3410/homework10/plugin";
    File dir = new File(dirPath);
    File[] files = dir.listFiles();
    System.out.println("Choose Plugin Name");
    for (File file : files){
      System.out.println(file.getName());
  }



  Scanner scanner = new Scanner(System.in);
  System.out.println("Do you want to run PluginOne or PluginTwo, Enter your choice ");
  String PluginName = scanner.next();
  System.out.println("you chosed " + PluginName);


    Class<?> className = Class.forName("plugin." + PluginName);
    Object obj = className.newInstance();
    Method m1 = className.getMethod("whoSaysHello");
    Method m2 = className.getMethod("whoSaysBye");
    m1.invoke(obj);
    m2.invoke(obj);





}
}
