public class client {
    private static final int private_number = 4;
    public static void main(String[] args) {
        publicdata.client_public_private = private_number * publicdata.public_number;
        server.main(); // start the code on the server
    }
    public static void printsharedsecret() {
        System.out.println(publicdata.server_public_private * private_number);
        server.printsharedsecret();
    }
}