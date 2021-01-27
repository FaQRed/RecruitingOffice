public class Recruit {
    private static long idCounter = 0L;
    private final long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean valid = true;
    private String diagnosis;
    private double visionCoeff;
    private boolean flatFeet;
    private boolean fracture;
    private int implantCount;
    private String cardiogram;
    private StringBuilder diagnosisInBuilder = new StringBuilder();

    public Recruit(String firstName, String middleName, String lastName,
                   double visionCoeff, int implantCount) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.visionCoeff = visionCoeff;
        this.implantCount = implantCount;
        idCounter++;
        id = idCounter;
    }


    public StringBuilder getDiagnosisInBuilder() {
        return diagnosisInBuilder;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public double getVisionCoeff() {
        return visionCoeff;
    }

    public void setVisionCoeff(double visionCoeff) {
        this.visionCoeff = visionCoeff;
    }

    public boolean isFlatFeet() {
        return flatFeet;
    }

    public void setFlatFeet(boolean flatFeet) {
        this.flatFeet = flatFeet;
    }

    public boolean isFracture() {
        return fracture;
    }

    public void setFracture(boolean fracture) {
        this.fracture = fracture;
    }

    public int getImplantCount() {
        return implantCount;
    }

    public void setImplantCount(int implantCount) {
        this.implantCount = implantCount;
    }

    public String getCardiogram() {
        return cardiogram;
    }

    public void setCardiogram(String cardiogram) {
        this.cardiogram = cardiogram;
    }


    @Override
    public String toString() {

        if (valid) {
            return String.format("%s %s %s - годен", middleName, firstName, lastName);
        } else {
            if (diagnosisInBuilder.charAt(0) == ' ' && diagnosisInBuilder != null && diagnosisInBuilder.length() >=2) {
                diagnosisInBuilder.deleteCharAt(diagnosisInBuilder.length() - 1);
                diagnosisInBuilder.deleteCharAt(0);
                diagnosis = diagnosisInBuilder.toString();
            }
            return String.format("%s %s %s - не годен (%s)", middleName, firstName, lastName, diagnosis);
        }
    }

}
