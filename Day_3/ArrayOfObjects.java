class Students{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects{  
    public static void main(String args[]){
        Students s1 = new Students();
        s1.rollno = 1;
        s1.name = "rakhi";
        s1.marks = 50;

        Students s2 = new Students();
        s2.rollno = 2;
        s2.name = "riya";
        s2.marks = 65;

        Students s3 = new Students();
        s3.rollno = 3;
        s3.name = "vidhi";
        s3.marks = 55;

        Students student[] = new Students[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // for(int i=0; i<student.length; i++){
        //     System.out.println(student[i].name + ":" + student[i].rollno + " - " + student[i].marks);
        // }

        for(Students stud : student){
             System.out.println(stud.name + ":" + stud.rollno + " - " + stud.marks);
        }
    }
}