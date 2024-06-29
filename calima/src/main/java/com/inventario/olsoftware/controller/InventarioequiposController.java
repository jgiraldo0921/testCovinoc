package com.inventario.olsoftware.controller;

import java.util.*;

import com.inventario.olsoftware.exception.InvalidInputException;
import com.inventario.olsoftware.model.InventarioequiposModel;
import com.inventario.olsoftware.service.InventarioequiposService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consulting")
public class InventarioequiposController {

    @Autowired
    private InventarioequiposService service;

    @GetMapping("/getInventario")
    public List<InventarioequiposModel> list() {
        return service.listAll();
    }

    @PostMapping("/createInventario")
    public ResponseEntity<InventarioequiposModel>  createInventario(@RequestBody InventarioequiposModel inventarioequiposModel) {
        if (inventarioequiposModel.getNombreEquipo() == null || inventarioequiposModel.getNombreEquipo().isEmpty()) {
            throw new InvalidInputException("Nombre del Equipo es requerido");
        }
        InventarioequiposModel saveIventario = service.createInventario(inventarioequiposModel);
        return ResponseEntity.ok(saveIventario);
    }

}
