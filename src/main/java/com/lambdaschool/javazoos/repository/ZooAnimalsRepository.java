package com.lambdaschool.javazoos.repository;

import com.lambdaschool.javazoos.models.ZooAnimals;
import com.lambdaschool.javazoos.models.ZooAnimalsId;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalsRepository extends CrudRepository<ZooAnimals, ZooAnimalsId>
{
}
