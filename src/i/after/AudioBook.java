package i.after;

import java.time.LocalDateTime;

public class AudioBook implements LibraryItem, AudioBookItem,ExchangePolicy {
    String author;
    int runTimeInMinutes;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    String title;

    @Override
    public String getAuthor(){return author;}
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

    @Override
    public void checkIn() {
        borrower="";
    }

    @Override
    public void checkOut(String borrower) {
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
    }

    @Override
    public LocalDateTime getDueDate() {
        return null;
    }
}
