package cz.ssinfotech.pridbros.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cz.ssinfotech.pridbros.blog.domain.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer>{

}
