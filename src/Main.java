public class Main {
    public static void main(String[] args) {
// Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

//Задача 2
String fullName1 = "Ivanov Ivan Ivanovich";
System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1.toUpperCase());

//Задача 3
String fullName2 = "Иванов Семён Семёнович";
        String s = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + s);


    }
}