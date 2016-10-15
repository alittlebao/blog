package com.alittlebao.blog.core.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.alittlebao.blog.core.service.Article.ArticleService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class ArticleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Resource
	private ArticleService articleService;

	@Override
	public String execute() throws Exception {
		List as = articleService.findAll();
		for (Object o : as) {
			System.out.println(o);
		}
		return "index.jsp";
	}
	
	
}
