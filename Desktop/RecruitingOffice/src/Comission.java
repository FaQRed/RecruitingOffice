public class Comission implements Testing {
    private Optometrist optometrist;
    private Surgeon surgeon;
    private Psychiatrist psychiatrist;
    private Dentist dentist;
    private Therapist therapist;

    public Comission(Optometrist optometrist, Surgeon surgeon, Psychiatrist psychiatrist, Dentist dentist, Therapist therapist) {
        this.optometrist = optometrist;
        this.surgeon = surgeon;
        this.psychiatrist = psychiatrist;
        this.dentist = dentist;
        this.therapist = therapist;
    }

    @Override
    public void test(Recruit recruit) {
        optometrist.test(recruit);
        surgeon.test(recruit);
        psychiatrist.test(recruit);
        dentist.test(recruit);
        therapist.test(recruit);
    }


}
