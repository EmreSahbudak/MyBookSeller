package com.emre.repository;

import com.emre.repository.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ITypeRepository extends JpaRepository<Type,Long> {

    Optional<Type> findOptionalByTypeNameIgnoreCase(String name);

}
