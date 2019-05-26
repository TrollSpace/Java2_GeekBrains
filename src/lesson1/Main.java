package lesson1;

public class Main {
    public static void main(String[] args) {
        ObstacleCourse[] oc = {new Wall(3), new RunningTrack(7), new Wall(1)};
        Course c = new Course(oc); // Создаем полосу препятствий
        Team team = new Team("Winner"); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResultOfTeam(); // Показываем результаты

//        lesson1.Android xyz = new lesson1.Android("Misha", 100, 12);
//        lesson1.RunningTrack road = new lesson1.RunningTrack(100);
//        road.doIt(xyz);
//        xyz.result();
    }


}
