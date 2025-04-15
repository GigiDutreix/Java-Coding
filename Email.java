public class Email {

    // --- Member Variables ---
    private String subject;
    private String to;      
    private String from;
    private String body;

    // --- Constructors ---

    public Email(String subject, String to, String from, String body) {
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.body = body;
    }
    // Constructor 2: Initializes subject, to, from; sets body to empty string

    public Email(String subject, String to, String from) {
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.body = ""; 
    } 

    // --- Methods ---

    // Sets the email's body to the given String
    public void setBody(String body) {
        this.body = body;
    }

    // Appends the text String to the end of this email's body String
    public void addToBody(String text) {
        this.body += text; // Append using +=
    }

    // Returns true if the email has the same subject, to, from, and body Strings
    public boolean equals(Email other) {
        if (other == null) {
            return false; 
        }
        // Check if all corresponding String fields are equal
        return this.subject.equals(other.subject) &&
               this.to.equals(other.to) &&
               this.from.equals(other.from) &&
               this.body.equals(other.body);
    }

    // Returns this email's subject
    public String getSubject() {
        return this.subject;
    }

    // Returns this email's to address
    public String getTo() {
        return this.to;
    }

    // Returns this email's from address
    public String getFrom() {
        return this.from; // Corrected: Should return 'from' field
    }

    // Returns this email's body
    public String getBody() {
        return this.body;
    }

    // Returns this email as a String separated by semicolons
    // Example: “From: Me; To: Joe; Subject: Hw; Body: Hello”
    public String toString() {
        return "From: " + this.from + "; To: " + this.to + "; Subject: " + this.subject + "; Body: " + this.body;
    }

} 