package com.inventario.olsoftware.service;

import java.util.List;

import javax.transaction.Transactional;

import com.inventario.olsoftware.model.InventarioequiposModel;
import com.inventario.olsoftware.repository.InventarioequiposRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class InventarioequiposService {

    @Autowired
    private InventarioequiposRepository inventarioequiposRepository;


    public List<InventarioequiposModel> listAll() {
        return inventarioequiposRepository.findAll();
    }

    public InventarioequiposModel createInventario(InventarioequiposModel inventarioequiposModel) {
        return inventarioequiposRepository.save(inventarioequiposModel);
    }

    public InventarioequiposModel get(Integer id) {
        return inventarioequiposRepository.findById(id).get();
    }

    public void delete(Integer id) {
        inventarioequiposRepository.deleteById(id);
    }

}
