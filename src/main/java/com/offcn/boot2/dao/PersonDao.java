package com.offcn.boot2.dao;

import com.offcn.boot2.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@RepositoryRestResource(path = "001"/*,exported = false*/)
@CrossOrigin
public interface PersonDao extends JpaRepository<Person, Long> {

    @RestResource(path = "01")
    public List<Person> findByNameContaining(@Param("name") String name);


}
