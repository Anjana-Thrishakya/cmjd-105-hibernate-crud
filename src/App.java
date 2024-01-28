import java.util.ArrayList;
import java.util.List;

import entity.StudentEntity;
import entity.embeded.StudentName;
import repository.StudentRepository;

public class App {
    public static void main(String[] args) throws Exception {

        StudentRepository studentRepository = new StudentRepository();

        // StudentName studentName = new StudentName("Student 1 First", "Student 1 Last");

        // List<String> mobiles = new ArrayList<>();
        // mobiles.add("0778988876");
        // mobiles.add("0778983876");

        // StudentEntity entity = new StudentEntity();
        // entity.setMobile(mobiles);
        // entity.setNic("978876543V");
        // entity.setStudentName(studentName);
        // Integer id = studentRepository.saveStudent(entity);
        // System.out.println("Id : " + id);

        StudentEntity studentEntity = studentRepository.getStudent(1);
        System.out.println(studentEntity.toString());

    }
}
