import java.util.Random;

public class RecruitGenerator {
    private Random rand = new Random();
    private final String[] FIRST_NAMES = new String[]{"Александр", "Алексей", "Андрей", "Артем", "Артур", "Антон", "Богдан",
            "Борис", "Вадим", "Кирилл", "Валерий", "Виктор", "Владислав", "Генадий", "Вячеслав", "Дмитрий", "Егор", "Захар",
            "Евгений", "Даниил"};
    private final String[] MIDDLE_NAMES = new String[]{"Смирнов", "Пуминов", "Степанов", "Санковский", "Соколов", "Лебедев",
            "Козлов", "Новиков", "Морозов", "Петров", "Волков", "Соловьев", "Васильев", "Зайцев", "Павлов", "Семенов",
            "Голубев", "Виноградов", "Богданов", "Воробьев"};
    private final String[] LAST_NAMES = new String[]{"Александрович", "Алекссевич", "Андреевич", "Артемович", "Артурович",
            "Антонович", "Боганович", "Борисович", "Вадимович", "Кириллович", "Валерьевич", "Викторович", "Владиславович",
            "Генадьевич", "Вячеславович", "Дмитриевич", "Егорович", "Захарович", "Евегеньевич", "Данилович"};



    public Recruit next() {
         String firstName = FIRST_NAMES[rand.nextInt(FIRST_NAMES.length)];
         String middleName = MIDDLE_NAMES[rand.nextInt(MIDDLE_NAMES.length)];
         String lastName = LAST_NAMES[rand.nextInt(LAST_NAMES.length)];
         double visionCoffHelp = 5 + Math.random() * (12 - 5);
         double visionCoff = visionCoffHelp / 10;
         int implantCount = rand.nextInt(3);
        return new Recruit(firstName, middleName, lastName, visionCoff, implantCount);
    }
}
