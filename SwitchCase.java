import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Send/ Reply/ Forward/ Delete/ Archive");
        String str = scanner.nextLine();

        switch(str)
        {
            case "Send" :
                System.out.println("Message Sent");
                break;
            case "Reply" :
                System.out.println("Message replied");
                break;
            case "Forward" :
                System.out.println("Message Forwarded");
                break;
            case "Delete" :
                System.out.println("Message Deleted");
                break;
            case "Archive" :
                System.out.println("Archived");
            default:
                System.out.println("Enter any Option");
        }
    }
}
