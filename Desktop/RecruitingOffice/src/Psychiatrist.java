import java.util.Random;

public class Psychiatrist implements Testing {

    @Override
    public void test(Recruit recruit) {
        boolean checkPsycho = new Random().nextBoolean();
        if (checkPsycho) {
            recruit.setValid(false);
            recruit.getDiagnosisInBuilder().append(" психически не здоров,");
        }
    }
}
