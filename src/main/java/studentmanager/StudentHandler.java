package studentmanager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentHandler {

    TimeUtil dateConvertor = new TimeUtil();

    MessagePrinter printer = new MessagePrinter();

    TimeUtil util = new TimeUtil();

    private List<Student> list = new ArrayList<>();

    private List<Student> retrievedByAgeList = new ArrayList<>();

    public String addStudent(Student student) {
        if (student.getFirstName().equals("")) {
            throw new IllegalArgumentException("Please check the input First Name. It can't be empty.");
        } else if (student.getLastName().equals("")) {
            throw new IllegalArgumentException("Please check the input Last Name. It can't be empty.");
        } else if (student.getID() == null || student.getID().equals("")) {
            throw new IllegalArgumentException("Please check the input ID. It can't be empty nor null.");
        } else if (util.checkDate(student.getBirthDate())) list.add(student);
        return student.getLastName();
    }

    public Student deleteStudent(String ID) {
        Student student = null;
        String temp = "";

        if (ID == null || ID.length() != 13) {
            throw new IllegalArgumentException("Student does not exist. Please verify the input ID.");
        }

        for(Student s : list) {
            if (s.getID().equals(ID)) {
                temp = s.getID();
                student = s;
                list.remove(s);
            }
        }
        if (temp.equals(""))  printer.printNoSuchStudent();
        return student;
    }

    public List<Student> retrieveAllStudentsByAge(String age) {
        Integer intAge = 0;
        try {
            intAge = Integer.parseInt(age);
        } catch (NumberFormatException nfe) {
            printer.printRetrieveByAgeException();
        }

        for(Student s : list) {
            if (intAge == dateConvertor.calculateAge(s.getBirthDate())) {
                retrievedByAgeList.add(s);
            }
        }
        return retrievedByAgeList;
    }

    public List<Student> sortByLastName() {
        if (list.isEmpty()) throw new IllegalArgumentException("The input is empty. Please add new students to the list.");
        list.sort(Comparator.comparing(Student::getLastName));
        return list;
    }

    public List<Student> sortByBirthDate() {
        if (list.isEmpty()) throw new IllegalArgumentException("The input is empty. Please add new students to the list.");
        list.sort(Comparator.comparing(Student::getParsedBirthDate));
        return list;
    }

    public List<Student> getList() {
        return list;
    }

    public List<Student> getRetrievedByAgeList() {
        return retrievedByAgeList;
    }


}
