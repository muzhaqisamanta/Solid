package i.after;

import java.time.LocalDateTime;

public class Book implements BookItem, LibraryItem {
    int pages;
    String author;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationIndays;
    String libraryId;
    String title;

    @Override
    public int getPages() {
        return pages;
    }

    @Override
    public String getAuthor() {
        return author;
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
