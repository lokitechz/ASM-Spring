package com.example.asm.Repository;

import com.example.asm.Entity.Dish;
import org.hibernate.Criteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, String> {
    List<Dish> findAllByFlgstatus(int flgStatus);
}
