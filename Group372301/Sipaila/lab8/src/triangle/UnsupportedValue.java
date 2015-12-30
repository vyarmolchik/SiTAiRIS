package triangle;

/**
 * Created by Uladzislau on 29.12.2015.
 */
public class UnsupportedValue extends Exception {
    public UnsupportedValue() {
    }

    public UnsupportedValue(String message) {
        super(message);
    }

    public UnsupportedValue(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedValue(Throwable cause) {
        super(cause);
    }

    public UnsupportedValue(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
