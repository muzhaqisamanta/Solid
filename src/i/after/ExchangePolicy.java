package i.after;

import java.time.LocalDateTime;

public interface ExchangePolicy {
    public void checkIn();

    public void checkOut(String borrower);

    public LocalDateTime getDueDate();
}
