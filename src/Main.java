public class Main {
    public static void main(String[] args) {
        ObstacleCourse[] oc = {new Wall(3), new RunningTrack(7), new Wall(1)};
        Course c = new Course(oc); // Создаем полосу препятствий
        Team team = new Team("Winner"); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResultOfTeam(); // Показываем результаты

//        Android xyz = new Android("Misha", 100, 12);
//        RunningTrack road = new RunningTrack(100);
//        road.doIt(xyz);
//        xyz.result();
    }


}
