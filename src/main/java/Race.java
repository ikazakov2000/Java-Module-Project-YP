// класс который определяет лидера гонки, машины из класса car считает, сколько они проедут за сутки и определяет победителя
public class Race {
    final int HOURS_IN_DAY = 24;
    private String leaderName;
    int distance = 0;
    public String getLeaderName(Car car) {
        int distance = car.getSpeed() * HOURS_IN_DAY;

        if  (distance > this.distance){
            this.distance = distance;
            leaderName = car.getName();
        } else if (distance == this.distance){
            leaderName = "Нужен фотофиниш";
        }
        return leaderName;
    }
    public String getLeaderName() {
        if (leaderName == null) {
            return "Участников нет";
        } else {
            return leaderName;
        }
    }
}
