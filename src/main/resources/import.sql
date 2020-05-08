--insert into persona
INSERT INTO persona(ci, direccion_calle, direccion_ciudad,direccion_nro_puerta, apellido1, apellido2, create_at, foto, nombre, telefono)VALUES('123','Calle A','La Paz','001','Apaza','Apaza','2020-05-08','','Alan',77777777);
INSERT INTO persona(ci, direccion_calle, direccion_ciudad,direccion_nro_puerta, apellido1, apellido2, create_at, foto, nombre, telefono)VALUES('456','Calle B','La Paz','002','Butron','Butron','2020-05-08','','Beto',76666666);
INSERT INTO persona(ci, direccion_calle, direccion_ciudad,direccion_nro_puerta, apellido1, apellido2, create_at, foto, nombre, telefono)VALUES('789','Calle C','La Paz','003','Callisaya','Callisaya','2020-05-08','','Carlos',75555555);
INSERT INTO persona(ci, direccion_calle, direccion_ciudad,direccion_nro_puerta, apellido1, apellido2, create_at, foto, nombre, telefono)VALUES('321','Calle D','La Paz','004','Diaz','Diaz','2020-05-08','','Dana',74444444);
INSERT INTO persona(ci, direccion_calle, direccion_ciudad,direccion_nro_puerta, apellido1, apellido2, create_at, foto, nombre, telefono)VALUES('654','Calle E','La Paz','005','Espinoza','Espinoza','2020-05-08','','Estevan',73333333);
INSERT INTO persona(ci, direccion_calle, direccion_ciudad,direccion_nro_puerta, apellido1, apellido2, create_at, foto, nombre, telefono)VALUES('987','Calle F','La Paz','006','Flores','Flores','2020-05-08','','Franco',72222222);
INSERT INTO persona(ci, direccion_calle, direccion_ciudad,direccion_nro_puerta, apellido1, apellido2, create_at, foto, nombre, telefono)VALUES('1234','Calle G','La Paz','007','Gutierrez','Gutierrez','2020-05-08','','Gladis',71111111);
INSERT INTO persona(ci, direccion_calle, direccion_ciudad,direccion_nro_puerta, apellido1, apellido2, create_at, foto, nombre, telefono)VALUES('5678','Calle H','La Paz','008','Huanca','Huanca','2020-05-08','','Herland',78888888);
-- insert into carrito
INSERT INTO carrito(id_carrito, create_at, descripcion, estado)VALUES(1,'2020-05-08','carrito 1','t');
INSERT INTO carrito(id_carrito, create_at, descripcion, estado)VALUES(2,'2020-05-08','carrito 2','t');
INSERT INTO carrito(id_carrito, create_at, descripcion, estado)VALUES(3,'2020-05-08','carrito 3','t');
INSERT INTO carrito(id_carrito, create_at, descripcion, estado)VALUES(4,'2020-05-08','carrito 4','t');
--insert into cliente
INSERT INTO cliente(nit,ci)VALUES(1122,'123');
INSERT INTO cliente(nit,ci)VALUES(1133,'456');
INSERT INTO cliente(nit,ci)VALUES(1144,'789');
INSERT INTO cliente(nit,ci)VALUES(1155,'321');
--insert into correo
INSERT INTO correo(id_correo, correo, persona_ci)VALUES(1,'123aaa@gmail.com','123');
INSERT INTO correo(id_correo, correo, persona_ci)VALUES(2,'123bbb@gmail.com','456');
INSERT INTO correo(id_correo, correo, persona_ci)VALUES(3,'123ddd@gmail.com','321');
INSERT INTO correo(id_correo, correo, persona_ci)VALUES(4,'123eee@gmail.com','654');
INSERT INTO correo(id_correo, correo, persona_ci)VALUES(5,'123004ddd@gmail.com','321');
--insert into empleado
INSERT INTO empleado(descripcion, fecha_ingreso,ci)VALUES('llega puntual','2020-05-08','654');
INSERT INTO empleado(descripcion, fecha_ingreso,ci)VALUES('llega tarde','2020-05-08','987');
INSERT INTO empleado(descripcion, fecha_ingreso,ci)VALUES('se duerme','2020-02-08','1234');
INSERT INTO empleado(descripcion, fecha_ingreso,ci)VALUES('compra tucus','2020-02-08','5678');
--insert into factura
INSERT INTO factura(id_factura, create_at, fecha, hora) VALUES ('F001', '2020-05-01','2020-05-01','21:36:00'); 
INSERT INTO factura(id_factura, create_at, fecha, hora) VALUES ('F002', '2020-05-01','2020-05-01','21:36:00'); 
INSERT INTO factura(id_factura, create_at, fecha, hora) VALUES ('F003', '2020-05-01','2020-05-01','21:36:00'); 
INSERT INTO factura(id_factura, create_at, fecha, hora) VALUES ('F004', '2020-05-07','2020-05-07','21:36:00'); 
INSERT INTO factura(id_factura, create_at, fecha, hora) VALUES ('F005', '2020-05-07','2020-05-07','21:36:00'); 
--insert into producto
INSERT INTO producto(id_producto,create_at,descripcion, nombre, precio, stock) VALUES ('P001','2020-05-07','nacional','CokaQuina',7.5,100);
INSERT INTO producto(id_producto,create_at,descripcion, nombre, precio, stock) VALUES ('P002','2020-05-07','nacional','Guarana',7,80);
INSERT INTO producto(id_producto,create_at,descripcion, nombre, precio, stock) VALUES ('P003','2020-05-07','nacional','Agua Viscachani',5,200);
INSERT INTO producto(id_producto,create_at,descripcion, nombre, precio, stock) VALUES ('P004','2020-05-07','importado','heineken',15.4,50);
INSERT INTO producto(id_producto,create_at,descripcion, nombre, precio, stock) VALUES ('P005','2020-05-07','importado','Inca Cola',8.5,100);
INSERT INTO producto(id_producto,create_at,descripcion, nombre, precio, stock) VALUES ('P006','2020-05-07','importado','Welchs',12.3,20);

--insert into promocion
INSERT INTO promocion(id_promocion,create_at,descuento, fecha_fin, fecha_inicio)VALUES(1,'2020-05-08',4,'2020-05-14','2020-05-08');
INSERT INTO promocion(id_promocion,create_at,descuento, fecha_fin, fecha_inicio)VALUES(2,'2020-05-08',7,'2020-05-14','2020-05-08');
--insert promocion producto
INSERT INTO promocion_producto(id,create_at, stock_promocion, id_producto, id_promocion)VALUES(1,'2020-05-08',5,'P001',1);
INSERT INTO promocion_producto(id,create_at, stock_promocion, id_producto, id_promocion)VALUES(2,'2020-05-08',10,'P002',2);
INSERT INTO promocion_producto(id,create_at, stock_promocion, id_producto, id_promocion)VALUES(3,'2020-05-08',5,'P003',1);