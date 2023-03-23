package com.example.API.Spring.Repositories2.repository;

import com.example.API.Spring.Repositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Questa è la descrizione"))
public interface ProgramLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
