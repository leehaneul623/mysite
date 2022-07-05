package com.mysite.sbb.Controller;


import com.mysite.sbb.Dao.ArticleDao;
import com.mysite.sbb.Domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/usr/article/list")
public class ArticleController {

        @Autowired
        private ArticleDao articleDao;

        @RequestMapping("")
        @ResponseBody
        public List<Article> articleDomains() {
            return articleDao.findAll();
        }

//        @RequestMapping("1")
//        @ResponseBody
//        public Article aritcle() {
//            Article aritcle = new Article();
//            return aritcle;
//        }
    }
