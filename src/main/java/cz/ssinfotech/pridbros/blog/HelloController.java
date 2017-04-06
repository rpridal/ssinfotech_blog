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
	@Autowired
	AuthorRepository authorRepository;

	@RequestMapping("/createarticle")
	public String create0(@RequestParam("caption") String caption) {
		Article article = new Article();
		article.setCaption(caption);
		articleRepository.save(article);
		return "Article was saved;";
	}

	@RequestMapping("/createauthor")
	public String create(@RequestParam("name") String name) {
		Author author = new Author();
		author.setName(name);
		authorRepository.save(author);
		return "Author was saved;";
	}

	
	@RequestMapping("/showauthor")
	public String show() {
		String result = "";
		Iterable<Author> findAll = authorRepository.findAll();
		for (Author author : findAll) {
			result += author.toString();
		}
		return result;
	}

	@RequestMapping("/showarticle")
	public String show0() {
		String result = "";
		Iterable<Article> findAll = articleRepository.findAll();
		for (Article article : findAll) {
			result += article.toString();
		}
		return result;
	}

}
