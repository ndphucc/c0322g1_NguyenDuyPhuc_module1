package ss4_class_object.bai_tap.stop_watch;

public class StopWatch {
    private long startTime,stopTime;


    public StopWatch() {

    }
    public StopWatch (long startTime,long stopTime) {
        this.startTime=startTime;
        this.stopTime=stopTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }
    public void start() {
        setStartTime(System.currentTimeMillis());
    }
    public void stop() {
        setStopTime(System.currentTimeMillis());
    }
    public long getElapsedTime() {
        return getStopTime()-getStartTime();
    }

}


