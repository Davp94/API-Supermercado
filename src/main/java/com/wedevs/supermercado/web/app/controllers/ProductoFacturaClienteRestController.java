package com.wedevs.supermercado.web.app.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;
import com.wedevs.supermercado.web.app.services.IProductoFacturaClienteService;

@RestController
@RequestMapping("/supermercado")
public class ProductoFacturaClienteRestController {
	
	@Autowired
	public IProductoFacturaClienteService productoFacturaClienteService;
	
	//8. listar las facturas con mas productos del ultimo mes 
	
	@GetMapping("/productos/masVendidos/{fecha}")
	public List<Factura> facturaConMasProductos(@PathVariable String fecha) {

		SimpleDateFormat formato= new SimpleDateFormat("yyyy-MM-dd");
		Date fechaNueva=null;
		try {
			fechaNueva = formato.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (List<Factura>)productoFacturaClienteService.facturaConMasProductos(fechaNueva);
	}

	//9. Obtener los productos mas vendidos de la semana
	@GetMapping("/productos/masVendidosSemana/{fecha}")
	public List<Producto> productosMasVendidos(@PathVariable Date fecha) {
		

		return (List<Producto>)productoFacturaClienteService.productosMasVendidos(fecha);
	}

	
	//11. listar las facturas del cliente x que tengan mas productos en el rango de fecha (a,b)
	@GetMapping("/productos/facturasCliente/{fechaA}/{fechaB}/{ci}")
	public List<Factura> facturasConMasProductos(@PathVariable Date fechaA, @PathVariable Date fechaB,@PathVariable String ci) {
		return (List<Factura>)productoFacturaClienteService.facturasConMasProductos(fechaA, fechaB, ci);
	}

}
