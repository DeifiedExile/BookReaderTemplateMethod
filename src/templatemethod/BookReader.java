package templatemethod;

public abstract class BookReader {

    abstract void initialize();

    abstract void startReading();

    abstract void stopReading();

    public final void readBook() {
        initialize();
        startReading();
        stopReading();
    }
}
