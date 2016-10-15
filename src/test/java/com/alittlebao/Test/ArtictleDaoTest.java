package com.alittlebao.Test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alittlebao.blog.core.dao.Article.ArticleDao;
import com.alittlebao.blog.core.domain.article.Article;

public class ArtictleDaoTest {

	private ArticleDao articleDao;

	@Before
	public void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		articleDao = (ArticleDao) context.getBean("articleDao");
	}
	
	@Test
	public void testquery(){
		List<Article> as = articleDao.findAll();
		for (Article a : as) {
			System.out.println("==>"+a);
		}
	}
	@Test
	public void testAdd(){
		Article article = new Article();
		article.setTitle("忽如一夜春风来");
		article.setContent("千树万树梨花开");
		articleDao.save(article);
	}
}
