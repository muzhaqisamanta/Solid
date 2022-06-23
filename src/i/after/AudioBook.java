package i.after;

import java.time.LocalDateTime;

public class AudioBook implements LibraryItem, AudioBookItem {

    int runTimeInMinutes;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    String title;

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
        return checkOutDurationInDays;
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
