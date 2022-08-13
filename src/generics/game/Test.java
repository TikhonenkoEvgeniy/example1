package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolkid schoolkid1 = new Schoolkid("Ivan", 11);
        Schoolkid schoolkid2 = new Schoolkid("Maria", 12);
        Team schoolTeam = new Team("Schoolkids");
        schoolTeam.addNewParticipant(schoolkid1);
        schoolTeam.addNewParticipant(schoolkid2);

        Student student1 = new Student("Petr", 22);
        Student student2 = new Student("Olya", 21);
        Team studentTeam = new Team("Students");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Employee employee1 = new Employee("Luda", 33);
        Employee employee2 = new Employee("Gennadiy", 39);
        Team employeeTeam = new Team("Employees");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Schoolkid schoolkid3 = new Schoolkid("Ivan", 11);
        Schoolkid schoolkid4 = new Schoolkid("Maria", 12);
        Team schoolTeam2 = new Team("Schoolkids2");
        schoolTeam2.addNewParticipant(schoolkid3);
        schoolTeam2.addNewParticipant(schoolkid4);

        schoolTeam.play(schoolTeam2);
    }
}
