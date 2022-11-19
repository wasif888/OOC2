package assignment2;

public class Content_coupling {
    public class Student
    {
        int id;
        String name;
        String grade;
        public Student(int id,String name )
        {
            this.name=name;
            this.grade=grade;
        }
    }
    public class teacher
    {
        int teacher_id;
        String result="A";
        public String giveGrade(Student student)
        {
            student.grade=result;
            return student.grade;
        }

    }
}
//here the teacher class is modifying the student class