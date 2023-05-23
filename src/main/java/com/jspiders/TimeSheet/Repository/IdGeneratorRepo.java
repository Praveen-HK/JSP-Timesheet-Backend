package com.jspiders.TimeSheet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspiders.TimeSheet.Entity.IdGenerator;

public interface IdGeneratorRepo extends  JpaRepository<IdGenerator, Integer>{

}
