package demo.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import demo.audit.entity.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer>{

}
