package com.alittlebao.blog.core.service.Article.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alittlebao.blog.core.dao.Article.ArticleDao;
import com.alittlebao.blog.core.service.Article.ArticleService;

@Service(value="articleService")
public class ArticleServiceImpl implements ArticleService {
	
	private ArticleDao articleDao;

	@Override
	public List findAll() {
		return articleDao.findAll();
	}

}
