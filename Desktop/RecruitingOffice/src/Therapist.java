public class Therapist implements Testing {
    @Override
    public void test(Recruit recruit) {
        int bpm = (int) (40 + Math.random() * 81);
        if (bpm >= 60 && bpm <= 90) {
            recruit.setCardiogram(" норма (" + bpm + " удара(-ов) в минуту),");
        }
        if (bpm > 90) {
            recruit.setCardiogram(" бахикардия (" + bpm + " удара(-ов) в минуту),");
        }
        if (bpm < 60) {
            recruit.setCardiogram(" брадикардия (" + bpm + " удара(-ов) в минуту),");
        }

        if (bpm > 90 || bpm <60){
            recruit.setValid(false);
            recruit.getDiagnosisInBuilder().append(recruit.getCardiogram());
        }
    }
}
