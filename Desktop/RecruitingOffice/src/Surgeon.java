import java.util.Random;

public class Surgeon implements Testing {
    @Override
    public void test(Recruit recruit) {
        recruit.setFlatFeet(new Random().nextBoolean());
        recruit.setFracture(new Random().nextBoolean());
        if (recruit.isFlatFeet()) {
            recruit.setValid(false);
            recruit.getDiagnosisInBuilder().append(" плоскостопие,");
        }
    }
}
