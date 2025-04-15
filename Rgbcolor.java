public class Rgbcolor {

    private int red;
    private int green;
    private int blue;

    // Constructor
    public RgbColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

    public boolean equals(RgbColor other) {
        if (other == null) {
            return false;
        }
        return this.red == other.red &&
               this.green == other.green &&
               this.blue == other.blue;
    }

    public String toString() {
        return "rgb(" + this.red + ", " + this.green + ", " + this.blue + ")";
    }

    public String toHex() {
        return String.format("#%02x%02x%02x", this.red, this.green, this.blue);
    }

}