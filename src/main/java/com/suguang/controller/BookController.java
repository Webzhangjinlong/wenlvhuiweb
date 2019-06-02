package com.suguang.controller;

import com.suguang.dao.BookDao;
import com.suguang.dao.UserDao;
import com.suguang.domin.YmBook;
import com.suguang.domin.YmUser;
import com.suguang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookDao bookDao;

    @Autowired
    UserDao userDao;

    @Autowired
    BookService bookService;

    private int pageNum;
    private int sizeNum;

    @RequestMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page,
                               @RequestParam(value = "size", required = false) Integer size){
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;
        Page<YmBook> sourceCode = bookService.getBook(pageNum, sizeNum);
        model.addAttribute("book", sourceCode);
        return "bookList";
    }

    @RequestMapping("/add")
    public String bookAdd(){
        return "bookAdd";
    }
}
