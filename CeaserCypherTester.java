package Labs.Lab06;

public class CeaserCypherTester {

    public static void main(String[] args) {
        // Test cases
        String message = "Hello World";
        int key = 13;

        String encryptedMessage = CeaserCypher.encrypt(message, key);
        System.out.println(encryptedMessage);

        String decryptedMessage = CeaserCypher.decrypt(encryptedMessage, key);
        System.out.println(decryptedMessage);

        // More Test Cases
        String message2 = "abc XYZ";
        int key2 = 3;

        String encryptedMessage2 = CeaserCypher.encrypt(message2, key2);
        System.out.println(encryptedMessage2);

        String decryptedMessage2 = CeaserCypher.decrypt(encryptedMessage2, key2);
        System.out.println(decryptedMessage2);
    }
}