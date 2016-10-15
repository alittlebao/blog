package com.alittlebao.blog.core.dao.Article;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.alittlebao.blog.core.dao.IHibernateDaoSupport;
import com.alittlebao.blog.core.domain.article.Article;

@Repository
public class ArticleDao extends IHibernateDaoSupport {
	
	public List<Article> findAll(){
		List articles = this.getHibernateTemplate().find("from Article");
		return articles;
	}
	
	public void save(Article article){
		this.getHibernateTemplate().save(article);
	}
	
	public void delete(Article article){
		this.getHibernateTemplate().delete(article);
	}
	
	public void update(Article article){
		HibernateTemplate ht = this.getHibernateTemplate();
//		ht.setCheckWriteOperations(false);
		ht.update(article);
	}
	
	public Article findById(int id){
		Article article = this.getHibernateTemplate().get(Article.class, id);
		return article;
	}
}
