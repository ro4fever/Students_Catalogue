package studentmanager;

public class Main {

    public static void main(String[] args) {

        StudentHandler manager = new StudentHandler();

        MessagePrinter printer = new MessagePrinter();

        Student Mady = new Student ("Madalina", "Gheorghe", "10-12-1988", 'F', "2564891397442");
        Student Ion = new Student ("Ion", "Strut", "12-09-1991", 'M', "1564891333862");
        Student Vasea = new Student ("Vasile", "Turcu", "01-01-1990", 'M', "1234567890123");
        Student Ene = new Student ("Ciprian", "Enescu", "17-08-1991", 'M', "1232413454544");

        manager.addStudent(Mady);
        manager.addStudent(Ion);
        manager.addStudent(Vasea);
        manager.addStudent(Ene);

        printer.printInitialList(manager);

        manager.deleteStudent("1234567890123");

        printer.printAfterDeletionList(manager);

        manager.retrieveAllStudentsByAge("31");
        printer.printListByAge(manager);

        manager.sortByLastName();
        printer.printSortedByLastNameList(manager);

        manager.sortByBirthDate();
        printer.printSortedByBirthDateList(manager);

    }
}
