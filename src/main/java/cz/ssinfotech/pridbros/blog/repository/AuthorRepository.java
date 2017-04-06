package cz.ssinfotech.pridbros.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cz.ssinfotech.pridbros.blog.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer>{

}
