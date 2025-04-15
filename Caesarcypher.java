package Labs.Lab06;

public class Caesarcypher {

    public static String encrypt(String message, int key) {
        char[] chars = message.toCharArray();
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : chars) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char encryptedChar = (char) (((c - base + key) % 26) + base);
                encryptedMessage.append(encryptedChar);
            } else {
                encryptedMessage.append(c); // Non-letter characters remain unchanged
            }
        }

        return encryptedMessage.toString();
    }

    public static String decrypt(String message, int key) {
        
        return encrypt(message, 26 - (key % 26));  // Correctly handles negative keys and ensures positive shifts.
    }
}