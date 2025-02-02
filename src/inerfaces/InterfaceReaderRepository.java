package inerfaces;

import model.Book;
import model.Reader;
import util.MyList;

public interface InterfaceReaderRepository {

    MyList<Reader> getAllReaders();
    Reader getReaderByEmail(String name);
    void save(Reader reader); //**
    boolean isReaderEmailExist(String name);
    void takeBook(Book book, Reader reader);
    void releaseBook(Book book, Reader reader);
}
