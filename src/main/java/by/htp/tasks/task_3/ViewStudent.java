package com.htp.jd.task3;

public class ViewStudent {

    public static void main(String[] args) {
        BeanStudent[] mas = new BeanStudent[10];

        ServiceStudent servStudent = new ServiceStudent();
        ViewStudent view = new ViewStudent();

        BeanStudent[] aLevelStudents;

        mas[0] = new BeanStudent("Ivan", "Ivanov", 123456, new int[] { 5, 5, 4, 4, 4 });
        mas[1] = new BeanStudent("Yanush", "Khotyan", 123456, new int[] { 2, 1, 3, 2, 2 });
        mas[2] = new BeanStudent("Alena", "Ivanova", 123456, new int[] { 5, 5, 5, 5, 5 });
        mas[3] = new BeanStudent("Tatsiana", "Makarevich", 123456, new int[] { 2, 4, 1, 3, 4 });
        mas[4] = new BeanStudent("Aleh", "Nikalaichanka", 123456, new int[] { 6, 6, 6, 6, 6 });
        mas[5] = new BeanStudent("Petr", "Petrov", 123456, new int[] { 2, 5, 7, 3, 5 });
        mas[6] = new BeanStudent("Nikita", "Ivanov", 123456, new int[] {6,5,7,2,4});
        mas[7] = new BeanStudent("Vlad", "Mikhnenok", 12345, new int[] {1, 2, 3, 4, 5});
        mas[8] = new BeanStudent("Tatsiana", "Kuzmina", 123456, new int[] {5,4,5,3,5});
        mas[9] = new BeanStudent("Sidor", "Sidorov", 123456, new int[] { 5, 3, 2, 3, 4 });

        aLevelStudents = servStudent.findALevelStudents(mas);
        view.printNameSurname(aLevelStudents);
    }
    public void printNameSurname(BeanStudent[] students) {

        for(BeanStudent st : students) {
            System.out.println(st.getName() + ", " + st.getGroupNumber());
        }
    }
}
