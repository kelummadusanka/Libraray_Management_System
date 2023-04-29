package Models.ModelIml;

import java.util.Date;
import Models.Interfaces.BorrowedBookInterface;


public class BorrowedBook implements BorrowedBookInterface {

    private int RecordId;
    private int BookId;
    private int MemberId;
    private Date BorrowDate;
    private Date ReturnDate;
    private Date DueDate;
    private  boolean isReturn;


    public BorrowedBook(int recordId, int bookId, int MemberID, Date BorrowedDate, Date dueDate){
        this.RecordId = recordId;
        this.BookId = bookId;
        this.MemberId = MemberID;
        this.BorrowDate = BorrowedDate;
        this.ReturnDate = dueDate;
        this.DueDate = dueDate;
        this.isReturn = false;

    }


    @Override
    public int getRecordId() {
        return RecordId;
    }

    @Override
    public void setRecordId(int recordId) {
        RecordId =recordId;
    }

    @Override
    public Date getBorrowDate() {
        return BorrowDate;
    }

    @Override
    public void setBorrowDate(Date borrowDate) {
        BorrowDate = borrowDate;
    }

    @Override
    public Date getReturnDate() {
        return ReturnDate;
    }

    @Override
    public void setReturnDate(Date returnDate) {
        ReturnDate = returnDate;
    }

    @Override
    public int getBookId() {
        return BookId;
    }

    @Override
    public void setBookId(int bookId) {
        BookId = bookId;
    }

    @Override
    public int getMemberId() {
        return MemberId;
    }

    @Override
    public void setMemberId(int memberId) {
        MemberId = memberId;
    }

    @Override
    public Date getDueDate() {
        return DueDate;
    }

    @Override
    public void setDueDate(Date dueDate) {
        DueDate = dueDate;
    }

    @Override
    public boolean getReturnedState() {
        return isReturn;
    }

    @Override
    public void setReturnedState(boolean returnedState) {
        isReturn = returnedState;

    }
}
