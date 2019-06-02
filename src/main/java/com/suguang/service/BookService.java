package com.suguang.service;

import com.suguang.dao.BookDao;
import com.suguang.dao.UserDao;
import com.suguang.domin.YmBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookDao bookDao;

    public Page<YmBook> getBook(int pageNumber, int pageSize){
        PageRequest request = new PageRequest(pageNumber - 1, pageSize);
        Page<YmBook> sourceCodes = this.bookDao.findAll(request);
        return sourceCodes;
    }
}
