package a2;

public class main {
    public static void main(String[] args) {
        AlarmSystem alarmSystem = new AlarmSystem(true);
        System.out.println(alarmSystem.alert());

        AlarmSystem alarmSystem2 = new AlarmSystem(false);
        System.out.println(alarmSystem2.alert());
    }
}
