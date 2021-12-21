package univ;

public class Main {

    public static void main(String[] args) {
	    University university = new University("ВГУ");
        Faculty faculty = new Faculty("ФКН");
        Institute institute = new Institute("ПиИТ", "РФ, г. Воронеж, Университетская площадь, 1");
        Employee dean = new Dean(
                1, "Крыловецкий Александр Абрамович", "aakryl@sc.vsu.ru"
        );
        Employee researchAssociate = new ResearchAssociate(
                2, "Иванов Иван Иванович", "ivanov@sc.vsu.ru"
        );
        Employee personal = new AdministrativePersonal(
                3, "Петров Пётр Петрович", "petrov@sc.vsu.ru"
        );

        university.addFaculty(faculty);
        faculty.addInstitute(institute);
        university.addEmployee(dean);
        university.addEmployee(researchAssociate);
        university.addEmployee(personal);

        System.out.println(university);
        System.out.println(faculty);
        System.out.println(institute);
        System.out.println(dean);
        System.out.println(researchAssociate);
        System.out.println(personal);
    }
}
