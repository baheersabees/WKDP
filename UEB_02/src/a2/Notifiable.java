package a2;

public interface Notifiable {
    default String getNotification() {
        return "Test notification! System operating normal";
    }
}
