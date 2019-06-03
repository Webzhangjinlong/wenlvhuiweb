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

import javax.persistence.Id;
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
                               @RequestParam(value = "size", required = false) Integer size) {
        pageNum = page == null ? 1 : page;
        sizeNum = size == null ? 10 : size;
        Page<YmBook> sourceCode = bookService.getBook(pageNum, sizeNum);
        model.addAttribute("bookList", sourceCode);
        return "bookList";
    }

    //删除书籍
    @RequestMapping("/delete")
    public String deleteBook(HttpServletRequest request) {
        String id = request.getParameter("id");
        bookDao.deleteById(Integer.parseInt(id));
        return "redirect:/book/list?page=" + pageNum + "&size=" + sizeNum;
    }

    //获取书的信息，并且回显到添加页面
    @RequestMapping("/update")
    public String update(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        YmBook ymBook = bookDao.getById(Integer.parseInt(id));
        model.addAttribute("ymBook",ymBook);
        List<YmUser> all = userDao.findAll();
        model.addAttribute("user",all);
        return "bookAdd";
    }

    //添加图书
    @RequestMapping("/add")
    public String add(Model model) {
        List<YmUser> all = userDao.findAll();
        model.addAttribute("user",all);
        return "bookAdd";
    }

    //修改数据，且保存在数据库
    @RequestMapping("/addUpdate")
    public String addUpdate(HttpServletRequest request, Model model) {
        String id = request.getParameter("id");
        String bookName = request.getParameter("bookName");
        String bookAuther = request.getParameter("bookAuther");
        String publishDate = request.getParameter("publishDate");
        //推荐人
        String recommendUser = request.getParameter("recommendUser");
        System.out.println(recommendUser);
        String bookPrice = request.getParameter("bookPrice");
        String recommendedNumber = request.getParameter("recommendedNumber");
        String sex = request.getParameter("sex");
        String bookTag = request.getParameter("bookTag");
        String indexShow = request.getParameter("indexShow");
        String recommendClass = request.getParameter("recommendClass");
        //文章类型没写
        String libraryAddress = request.getParameter("libraryAddress");
        //上传图书封面图没写
        //图书详情没写

        YmBook ymBook = new YmBook();
        //推荐人
        YmUser ymUser = new YmUser();
        if (id != null && id != "") {
            ymBook.setId(Integer.parseInt(id));
        }
        ymBook.setBookName(bookName);
        ymBook.setBookAuther(bookAuther);
        ymBook.setPublishDate(publishDate);

        ymUser.setUsername(recommendUser);


        ymBook.setRecommendUser(Integer.parseInt(recommendUser));
        //ymBook.setBookPrice(bookPrice);注意此处的类型
        ymBook.setRecommendedNumber(Integer.parseInt(recommendedNumber));
        ymBook.setSex(Integer.parseInt(sex));
        ymBook.setBookTag(Integer.parseInt(bookTag));
        ymBook.setIndexShow(Integer.parseInt(indexShow));
        ymBook.setRecommendClass(Integer.parseInt(recommendClass));
        ymBook.setLibraryAddress(libraryAddress);

        YmUser user = userDao.save(ymUser);
        YmBook save = bookDao.save(ymBook);
        model.addAttribute("user",user);
        model.addAttribute("addUpdate", save);
        if (pageNum == null) {
            pageNum = 1;
        }
        if (sizeNum == null) {
            sizeNum = 10;
        }
        return "redirect:/book/list?page=" + pageNum + "&size=" + sizeNum;

    }


}
