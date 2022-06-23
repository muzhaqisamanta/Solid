package i.after;

import java.time.LocalDateTime;

public class ReferenceBook implements ReferenceBookItem, LibraryItem {
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationIndays;
    String libraryId;
    String title;
    String author;
    int pages;

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

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPages() {
        return pages;
    }
}
