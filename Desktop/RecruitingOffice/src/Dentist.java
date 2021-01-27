public class Dentist implements Testing {
    @Override
    public void test(Recruit recruit) {

        if (recruit.getImplantCount() > 1) {
            recruit.setValid(false);
            recruit.getDiagnosisInBuilder().append(" 2 и больше зубных протеза(-ов),");
        }
    }
}
