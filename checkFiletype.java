import java.util.*;
class checkFiletype{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Website name = ");
        String name = sc.nextLine();
        String protocol = name.substring(0, name.indexOf(':'));
        String ent = name.substring(name.lastIndexOf(".")+1);

        if (protocol.equals("https"))
            System.out.println("Its a hypertext transfer protocol");

        else if (protocol.equals("ftp"))
            System.out.println("Its a file transfer protocol");

         if (ent.equals("com"))
            System.out.println("Commercial");

        else if (ent.equals("www"))
            System.out.println("world wide web");

        else
            System.out.println("Not found");
    }
}