package com.springjpaentity.SpringJPAEntityMapping.repository;

import com.springjpaentity.SpringJPAEntityMapping.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Integer> {
}