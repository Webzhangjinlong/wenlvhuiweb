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

    private Integer pageNum;
    private Integer sizeNum;


    //按照分页查询所有书
    @RequestMapping("/list")
    public String getAllByPage(HttpServletRequest request, Model model, @RequestParam(value = "page", required = false) Integer page,
                               @RequestParam(value = "size", required = false) Integer size){
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;
        Page<YmBook> sourceCode = bookService.getBook(pageNum, sizeNum);
        model.addAttribute("bookList", sourceCode);
        return "bookList";
    }

    //删除书籍
    @RequestMapping("/delete")
    public String deleteBook(HttpServletRequest request){
        String id = request.getParameter("id");
        bookDao.deleteById(Integer.parseInt(id));
        return "redirect:/book/list?page=" + pageNum + "&size=" + sizeNum;
    }

    //获取书的信息，并且回显到添加页面
    @RequestMapping("/update")
    public String update(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        YmBook ymBook = bookDao.getById(Integer.parseInt(id));
        model.addAttribute("ymBook",ymBook);
        return "bookAdd";
    }
}
