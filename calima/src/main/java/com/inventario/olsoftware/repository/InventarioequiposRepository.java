package com.inventario.olsoftware.repository;

import com.inventario.olsoftware.model.InventarioequiposModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioequiposRepository extends JpaRepository<InventarioequiposModel, Integer> {

    @Override
    List<InventarioequiposModel> findAll();


}