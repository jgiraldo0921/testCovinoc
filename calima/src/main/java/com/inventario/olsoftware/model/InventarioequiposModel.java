package com.inventario.olsoftware.model;


import javax.persistence.*;

@Entity
@Table(name="inventarioequipos")

public class InventarioequiposModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_inventario")
    private Integer numeroInventario;
    @Column(name = "nombre_equipo")
    private String nombreEquipo;
    @Column(name = "modelo_dispositivo")
    private String modeloDispositivo;
    @Column(name = "numero_serie")
    private String numeroSerie;
    @Column(name = "tipo_dispositivo")
    private String tipoDispositivo;
    @Column(name = "usuario_asignado")
    private String usuarioAsignado;
    @Column(name = "estado_dispositivo")
    private String estadoDispositivo;

    @Column(name = "comentarios")
    private String comentarios;

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }


    public String getEstadoDispositivo() {
        return estadoDispositivo;
    }

    public void setEstadoDispositivo(String estadoDispositivo) {
        this.estadoDispositivo = estadoDispositivo;
    }



    public Integer getNumeroInventario() {
        return numeroInventario;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getModeloDispositivo() {
        return modeloDispositivo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public String getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void setNumeroInventario(Integer numeroInventario) {
        this.numeroInventario = numeroInventario;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setModeloDispositivo(String modeloDispositivo) {
        this.modeloDispositivo = modeloDispositivo;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public void setUsuarioAsignado(String usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
    }

}
