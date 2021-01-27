import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        RecruitGenerator recruitGenerator = new RecruitGenerator();
        RecruitsComparator recruitsMiddleNameComparator = new RecruitsComparator();


        Dentist dentist = new Dentist();
        Optometrist optometrist = new Optometrist();
        Psychiatrist psychiatrist = new Psychiatrist();
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();

        Comission comission = new Comission(optometrist,surgeon,psychiatrist,dentist,therapist);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите количество генерируемых новобранцев: ");
                int genNubmer = scanner.nextInt();


        Recruit[] recruits = new Recruit[genNubmer];

        ArrayRecruites arrayRecruitesAll = new ArrayRecruites();
        ArrayRecruites arrayRecruitesValid = new ArrayRecruites();
        ArrayRecruites arrayRecruitesInvalid = new ArrayRecruites();

        for (int i = 0; i < recruits.length; i++) {

            recruits[i] = recruitGenerator.next();
            comission.test(recruits[i]);
            arrayRecruitesAll.add(recruits[i]);

            if (recruits[i].isValid()){
                arrayRecruitesValid.add(recruits[i]);
            } else {
                arrayRecruitesInvalid.add(recruits[i]);
            }
        }


        System.out.println("Количество годных новобранцев = " + arrayRecruitesValid.size());
        arrayRecruitesValid.sort(recruitsMiddleNameComparator);

        for (int i = 0; i < arrayRecruitesValid.size(); i++) {
            System.out.println(arrayRecruitesValid.get(i));
        }


        System.out.println("--------------------------------------------------------------------------");


        System.out.println("Количество получивших отсрочку = " + arrayRecruitesInvalid.size());
        arrayRecruitesInvalid.sort(recruitsMiddleNameComparator);

        for (int i = 0; i < arrayRecruitesInvalid.size(); i++) {
            System.out.println(arrayRecruitesInvalid.get(i));
        }




        
    }
}





/*
 Думал так (не хотел создавать массив а сразу генерировать рекрутов в arrayRecruites),
 но все же первый вариант для меня проще :3

          for (int i = 0; i < arrayRecruitesAll.size(); i++) {

            arrayRecruitesAll.add(recruitGenerator.next());
            comission.test(arrayRecruitesAll.get(i));
            arrayRecruitesAll.set(i, arrayRecruitesAll.get(i));

            if (arrayRecruitesAll.get(i).isValid()){
                arrayRecruitesValid.add(arrayRecruitesAll.get(i));
            } else {
                arrayRecruitesInvalid.add(arrayRecruitesAll.get(i));
            }
        }

        for (int i = 0; i < arrayRecruitesValid.size(); i++) {
            System.out.println(arrayRecruitesValid.get(i));
        }
        */
