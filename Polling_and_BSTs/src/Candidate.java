/**
 * The Candidate class represents information about a candidate, including their last name,
 * full name, and a percentage value.
 */
public class Candidate implements Comparable<Candidate> {
    private String lastName;
    private String fullName;
    private double pct;

    /**
     * Constructs a new Candidate object with the specified last name, full name, and percentage value.
     * @param lastName The last name of the candidate.
     * @param fullName The full name of the candidate.
     * @param pct      The percentage value associated with the candidate.
     */
    public Candidate(String lastName, String fullName, double pct) {
        this.lastName = lastName;
        this.fullName = fullName;
        this.pct = pct;
    }

    /**
     * Gets the last name of the candidate.
     * @return The last name of the candidate.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the full name of the candidate.
     * @return The full name of the candidate.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Gets the percentage value associated with the candidate.
     * @return The percentage value of the candidate.
     */
    public double getPct() {
        return pct;
    }

    /**
     * Sets the percentage value associated with the candidate.
     * @param pct The new percentage value of the candidate.
     */
    public void setPct(double pct) {
        this.pct = pct;
    }

    /**
     * Compares this candidate to another candidate based on their last names.
     * @param other The candidate to compare to.
     * @return A negative integer if this candidate's last name is lexicographically less than
     *         the other candidate's last name, zero if they are equal, and a positive integer
     *         if this candidate's last name is lexicographically greater.
     */
    @Override
    public int compareTo(Candidate other) {
        return this.lastName.compareTo(other.lastName);
    }

    /**
     * Returns a string representation of the candidate in the format "full name:percentage".
     * @return A string representing the candidate.
     */
    @Override
    public String toString() {
        return fullName + ":" + pct;
    }
}
