package a2;

public class AlarmSystem implements Notifiable{
    boolean emergencyMode;

    public AlarmSystem(boolean emergencyMode) {
        this.emergencyMode = emergencyMode;
    }

    @Override
    public String getNotification() {
        return "Alarm! Please check your home!";
    }

    public String alert() {
        if (emergencyMode) {
            return this.getNotification();
        } else {
            return Notifiable.super.getNotification();
        }
    }
}
