public class Dna {

    private char[] sequence;

    // Constructor
    public Dna(char[] sequence) {
        this.sequence = sequence;
    }

    public char[] getSequence() {
        return this.sequence;
    }

    public Dna swap(Dna other, int swapPoint) {
        int len = this.sequence.length;
        char[] newSequence = new char[len];

        for (int i = 0; i < swapPoint; i++) {
            if (i < len) {
                 newSequence[i] = this.sequence[i];
            }
        }

        for (int i = swapPoint; i < len; i++) {
            if (i < other.sequence.length) {
                newSequence[i] = other.sequence[i];
            }
        }

        return new Dna(newSequence);
    }

    public boolean equals(Dna other) {
        if (other == null) {
            return false;
        }
        if (this.sequence == null || other.sequence == null) {
             return this.sequence == other.sequence;
        }
        if (this.sequence.length != other.sequence.length) {
            return false;
        }

        for (int i = 0; i < this.sequence.length; i++) {
            if (this.sequence[i] != other.sequence[i]) {
                return false;
            }
        }

        return true;
    }

    public String toString() {
        if (this.sequence == null) {
             return "";
        }
        return new String(this.sequence);
    }

}