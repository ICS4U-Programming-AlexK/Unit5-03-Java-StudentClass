public class Student {
    /**
     * The first name of the student.
     */
    private String firstName;
    /**
     * The middle initial of the student.
     */
    private String midInit;
    /**
     * The last name of the student.
     */
    private String lastName;
    /**
     * The last name of the student.
     */
    private String grade;
    /**
     * The last name of the student.
     */
    private String iep;
    /**
     * Constructor for the Student class.
     * @param firstNameP
     * The first name of the student.
     * @param midInitP
     * The middle initial of the student.
     * @param lastNameP
     * The last name of the student.
     * @param gradeP
     * The grade of the student.
     * @param iepP
     * The IEP status of the student.
     */
    // Constructor
    public Student(final String firstNameP, final String midInitP,
            final String lastNameP, final String gradeP, final String iepP) {
        this.firstName = firstNameP;
        this.midInit = midInitP;
        this.lastName = lastNameP;
        this.grade = gradeP;
        this.iep = iepP;
    }
    /**
     * Returns a string representation of the student.
     *
     * @return A string representation of the student.
     */
    public String toString() {
        return "Name: " + firstName + " " + midInit + " " + lastName
                + "\nGrade: " + grade + "\nIEP: " + iep;
    }
    /**
     * Returns the first name of the student.
     *
     * @return The first name of the student.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Returns the middle initial of the student.
     *
     * @return The middle initial of the student.
     */
    public String getMidInit() {
        return midInit;
    }
    /**
     * Returns the last name of the student.
     *
     * @return The last name of the student.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Returns the grade of the student.
     *
     * @return The grade of the student.
     */
    public String getGrade() {
        return grade;
    }
    /**
     * Returns the IEP status of the student.
     *
     * @return The IEP status of the student.
     */
    public String getIep() {
        return iep;
    }
}
