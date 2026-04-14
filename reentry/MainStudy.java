package reentry;
interface Study {
 void read();
}
class SchoolStudent implements Study {
 @Override
 public void read() {
     System.out.println("School student is reading textbooks.");
 }
}
class CollegeStudent implements Study {
 @Override
 public void read() {
     System.out.println("College student is reading reference books.");
 }
}
public class MainStudy {
 public static void main(String[] args) {
     Study[] students = {
         new SchoolStudent(),
         new CollegeStudent()
     };
     for (Study s : students) {
         s.read();
     }
 }
}
