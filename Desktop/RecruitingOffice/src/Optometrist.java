public class Optometrist implements Testing {
    @Override
    public void test(Recruit recruit) {

        if (recruit.getVisionCoeff() < 0.8 || recruit.getVisionCoeff() > 1.2) {
            recruit.setValid(false);
            recruit.getDiagnosisInBuilder().append(" плохое зрение,");
        }
    }
}


