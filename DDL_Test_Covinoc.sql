-- DROP SCHEMA emmsoft;

CREATE SCHEMA emmsoft AUTHORIZATION postgres;
-- emmsoft.estado definition

-- Drop table

-- DROP TABLE emmsoft.estado;

CREATE TABLE emmsoft.estado (
	valor varchar(100) NOT NULL,
	descripcion varchar(100) NULL DEFAULT NULL::character varying,
	CONSTRAINT estado_pkey PRIMARY KEY (valor)
);
-- emmsoft.inventarioequipos definition

-- Drop table

-- DROP TABLE emmsoft.inventarioequipos;

CREATE TABLE emmsoft.inventarioequipos (
	numero_inventario serial4 NOT NULL,
	nombre_equipo varchar NULL,
	modelo_dispositivo varchar NULL,
	numero_serie varchar NULL,
	tipo_dispositivo varchar NULL,
	usuario_asignado varchar NULL,
	estado_dispositivo varchar NULL,
	comentarios varchar NULL,
	CONSTRAINT inventarioequipos_pk PRIMARY KEY (numero_inventario)
);
-- emmsoft.users definition

-- Drop table

-- DROP TABLE emmsoft.users;

CREATE TABLE emmsoft.users (
	id serial4 NOT NULL,
	username varchar NULL,
	tipo_identi varchar NULL,
	num_identi varchar NOT NULL,
	"password" varchar NULL,
	CONSTRAINT users_pk PRIMARY KEY (id)
);

INSERT INTO emmsoft.inventarioequipos
(numero_inventario, nombre_equipo, modelo_dispositivo, numero_serie, tipo_dispositivo, usuario_asignado, estado_dispositivo, comentarios)
VALUES(1, 'EJEMPLO1', 'MAC', 'EMS100', 'PORTATIL', 'Jorge Giraldo', 'PDN', NULL);
