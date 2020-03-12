package com.htp.jd.task3;

public class ServiceStudent {


    BeanStudent[] findALevelStudents(BeanStudent[] students) {
        BeanStudent[] rezult = new BeanStudent[students.length];

        int i = 0;
        for(BeanStudent st : students) {
            if(isALevelStudent(st)) {
                rezult[i] = st;
                i++;
            }
        }

        BeanStudent[] finalRezult = new BeanStudent[i];
        for(int j = 0; j<finalRezult.length; j++) {
            finalRezult[j] = rezult[j];
        }

        return finalRezult;
    }

    public boolean isALevelStudent(BeanStudent student) {
        int[] marks;

        marks = student.getMarks();

        for(int mark : marks) {
            if(mark < 8) {
                return false;
            }
        }

        return true;

    }

    public void printNameSurname(BeanStudent[] students) {

        for(BeanStudent st : students) {
            System.out.println(st.getName() + ", " + st.getGroupNumber());
        }

    }
}
