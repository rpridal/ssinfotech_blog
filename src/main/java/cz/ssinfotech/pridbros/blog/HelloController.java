package cz.ssinfotech.pridbros.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cz.ssinfotech.pridbros.blog.domain.Article;
import cz.ssinfotech.pridbros.blog.domain.Author;
import cz.ssinfotech.pridbros.blog.repository.ArticleRepository;
import cz.ssinfotech.pridbros.blog.repository.AuthorRepository;

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
	
	@Autowired
	AuthorRepository authorRepository;
	
	@RequestMapping("/autor")
	public String autor(@RequestParam("name") String name) {
		Author author = new Author();
		author.setName(name);
		authorRepository.save(author);
		return "Autor was saved;";
	}
	@RequestMapping("/showaurtor")
	public String showaurtor() {
		String result = "";
		Iterable<Author> findAll = authorRepository.findAll();
		for(Author author:findAll) {
			result += author.toString();
		}
		return result;
	}
}
