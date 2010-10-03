package com.springbblog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jeeny.api.ArticleWork;
import com.jeeny.article.domain.Article;

@Controller
public class Hello {

	@RequestMapping("/helloWorld")
	public ModelAndView helloWorld() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("helloWorld");
		mav.addObject("message", "Hello World!");
		List<Article> list = work.list(50);
		mav.addObject("articles", list);
		for (Article item : list) {
			System.out.println(item.getSubject());
		}
		return mav;
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("message", "Hello World!");
		List<Article> list = work.list(20);
		mav.addObject("articles", list);
		for (Article item : list) {
			System.out.println(item.getSubject());
		}
		return mav;
	}
	public ArticleWork getWork() {
		return work;
	}

	@Autowired
	public void setWork(ArticleWork work) {
		this.work = work;
	}

	private ArticleWork work;
}
