package com.jeeny.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jeeny.domain.Article;


@Controller
public class Articlecontroller {
	 /**
     * The public index page, used for unauthenticated users.
     */
	private String name;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@RequestMapping(value="/article/index.htm", method={RequestMethod.GET})
    public ModelAndView displayPublicIndex() {
       System.out.println(name);
        return new ModelAndView("article/index", "name",name);
    }
	@RequestMapping(value="/article/work.htm", method={RequestMethod.POST})
    public ModelAndView work(String name, Article article) {
       System.out.println(name);
       System.out.println(article.getSubject());
       System.out.println(article.getContent());
       ModelAndView modelAndView=new ModelAndView("article/index", "name",name);
       modelAndView.addObject("article", article);
        return modelAndView;
    }
    @RequestMapping(value="/article/list.htm", method=RequestMethod.GET)
    public ModelAndView list() {
       
        return new ModelAndView("article/list", "contact", "ddd");
    }
    @RequestMapping(value="/article/querylist.htm", method=RequestMethod.GET)
    public ModelAndView queryList() {
       
        return new ModelAndView("article/list", "contact", "ddd");
    }

}
