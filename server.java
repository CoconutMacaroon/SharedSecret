public class server {
    private static final int private_number = 6;
    public static void main() {
       // Prints "Hello, World" in the terminal window.
       publicdata.server_public_private = publicdata.public_number * private_number;
       client.printsharedsecret();
    }
    public static void printsharedsecret() {
        System.out.println(publicdata.client_public_private * private_number);
    }
 }