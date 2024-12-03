import java.time.LocalTime;

abstract class Weekday implements Alarm {
    protected LocalTime alarmTime;

    @Override
    public void setAlarm(String time) {
        this.alarmTime = LocalTime.parse(time);
    }
}
