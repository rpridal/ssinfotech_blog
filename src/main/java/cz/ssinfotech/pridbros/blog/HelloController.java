package cz.ssinfotech.pridbros.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cz.ssinfotech.pridbros.blog.domain.Article;
import cz.ssinfotech.pridbros.blog.repository.ArticleRepository;

@RestController
public class HelloController {

	@Autowired
	ArticleRepository articleRepository;
	
	@RequestMapping("/create")
	public String create(@RequestParam("caption") String caption) {
		Article article = new Article();
		article.setCaption(caption);
		articleRepository.save(article);
		return "Article was saved;";
	}
	
	@RequestMapping("/show")
	public String show() {
		String result = "";
		Iterable<Article> findAll = articleRepository.findAll();
		for(Article article:findAll) {
			result += article.toString();
		}
		return result;
	}

}
