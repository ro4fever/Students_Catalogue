package studentmanager;

public class MessagePrinter {

    public void printRetrieveByAgeException() {
        System.out.println("The input age is wrong. Please verify if it isn't negative or if it isn't a number.");
    }

    public void printNoSuchStudent() {
        System.out.println("There is no student in the list with such an ID\n");
    }

    public void printInitialList(StudentHandler manage) {
        System.out.println("Initial list of students:");
        for (Student s : manage.getList()) System.out.println(s);
        System.out.println();
    }

    public void printAfterDeletionList(StudentHandler manage) {
        System.out.println("List of students after deletion:");
        for (Student s : manage.getList()) System.out.println(s);
        System.out.println();
    }

    public void printSortedByLastNameList(StudentHandler manage) {
        System.out.println("List of students sorted by last name:");
        for (Student s : manage.getList()) System.out.println(s);
        System.out.println();
    }

    public void printSortedByBirthDateList(StudentHandler manage) {
        System.out.println("List of students sorted by birth date:");
        for (Student s : manage.getList()) System.out.println(s);
        System.out.println();
    }

    public void printListByAge(StudentHandler manage) {
        System.out.println("List of students for input age:");
        for (Student s : manage.getRetrievedByAgeList()) System.out.println(s);
        System.out.println();
    }


}
