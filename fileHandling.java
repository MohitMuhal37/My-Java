import java.io.File;
public class fileHandling {
    public static void main(String[] args) {
      File f = new File("c:/Users/HP/OneDrive/Desktop/Demo");
      System.out.println(f.canExecute());
      String str[] = f.list();
      File str1[] = f.listFiles();

      for(File x : str1){
        System.out.print(x.getName());
        System.out.println(x.getPath());
      }
    }
}
