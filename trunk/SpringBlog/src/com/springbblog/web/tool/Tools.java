package com.springbblog.web.tool;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeeny.api.ArticleWork;
import com.jeeny.article.domain.Article;

@Controller
public class Tools {

	@Autowired
	private ArticleWork work;
	@RequestMapping("/tools/rss")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("rss");
		mav.addObject("message", "Hello World!");
		mav.addObject("title", "Hello World!");
		mav.addObject("urlid", "Hello World!");
		mav.addObject("subtitle", "Hello World!");
		mav.addObject("now", new Date());
		
		List<Article> list = work.list(50);
		mav.addObject("datas", list);
		for (Article item : list) {
			System.out.println(item.getSubject());
		}
		return mav;
	}
	@RequestMapping("/rss")
	public ModelAndView helloWorlds() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("tools/rss");
		mav.addObject("message", "Hello World!");
		mav.addObject("title", "Hello World!");
		mav.addObject("urlid", "Hello World!");
		mav.addObject("subtitle", "Hello World!");
		mav.addObject("now", new Date());
		mav.addObject("author", "ada.young");
		
		List<Article> list = work.list(20);
		mav.addObject("datas", list);
		for (Article item : list) {
			System.out.println(item.getSubject());
		}
		return mav;
	}
}
