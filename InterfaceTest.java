interface Message
{
    void send_message();
    void receive_message();
}
class User implements Message
{
    public void send_message()
    {
        System.out.println("Message sent by the user...");
    }
    public void receive_message()
    {
        System.out.println("Message received by the user...");
    }
}
class Server implements Message
{
    public void send_message()
    {
        System.out.println("Message sent by the server...");
    }
    public void receive_message()
    {
        System.out.println("Message received by the server...");
    }
}
    public class InterfaceTest {
    public static void main(String[] args)
    {
//        User user= new User();
//        Server server= new Server();
        Message message= new User();
        message.send_message();
        message.receive_message();
        message= new Server();
        message.send_message();
        message.receive_message();
    }
}
