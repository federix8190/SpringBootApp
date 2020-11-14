package demo.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import demo.audit.entity.Post;

@Repository
public interface PostRepository extends RevisionRepository<Post, Integer, Integer>, JpaRepository<Post, Integer>{

}
