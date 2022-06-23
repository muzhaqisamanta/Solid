package i.after;

import java.time.LocalDateTime;
import java.util.List;

public class DVD implements DvdItem, LibraryItem{
    List<String> actors;
    int runTimeInMinutes;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationIndays;
    String libraryId;
    String title;

    @Override
    public List<String> getActors() {
        return actors;
    }

    @Override
    public int getRuntimeInMinutes() {
        return runTimeInMinutes;
    }

    @Override
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public int getCheckOutDurationInDays() {
        return checkOutDurationIndays;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
