package com.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jeeny.api.ArticleWork;
import com.jeeny.article.domain.Article;
import com.springbblog.api.HelloWork;
import com.springbblog.domain.ArticleEn;

public class HelloApps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ArticleWork work = (ArticleWork) contex.getBean("helloSerivce");
		String query = "select from " + Article.class.getName();
		query += " order by date desc ";
		List<Article> as = work.list(1);
		for (Article item : as) {
			System.out.println(item.getSubject());
			//System.out.println(item.getContent());
		}
        ArticleEn en=new ArticleEn();
		HelloWork works = (HelloWork) contex.getBean("aSerivce");
		
		en.setTitle(as.get(0).getSubject());
		works.save(en);
		List<ArticleEn> ens = works.list(null);
		for (ArticleEn item : ens) {
           System.out.println(item.getTitle());
		}
	}

}
