package com.docencia.rest.mappers;

import com.docencia.rest.domain.Producto;
import com.docencia.rest.modelo.DetalleProductoDocument;
import com.docencia.rest.modelo.ProductoEntity;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-01T15:20:50+0000",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Autowired
    private DetalleProductoMapper detalleProductoMapper;

    @Override
    public ProductoEntity toProducto(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoEntity productoEntity = new ProductoEntity();

        productoEntity.setId( producto.getId() );
        productoEntity.setNombre( producto.getNombre() );
        productoEntity.setPrecio( producto.getPrecio() );
        productoEntity.setStock( producto.getStock() );

        return productoEntity;
    }

    @Override
    public Producto toProducto(ProductoEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Producto producto = new Producto();

        producto.setId( entity.getId() );
        producto.setNombre( entity.getNombre() );
        producto.setPrecio( entity.getPrecio() );
        producto.setStock( entity.getStock() );

        return producto;
    }

    @Override
    public Producto toDomain(ProductoEntity entity, DetalleProductoDocument detalle) {
        if ( entity == null && detalle == null ) {
            return null;
        }

        Producto producto = new Producto();

        if ( entity != null ) {
            producto.setId( entity.getId() );
            producto.setNombre( entity.getNombre() );
            producto.setPrecio( entity.getPrecio() );
            producto.setStock( entity.getStock() );
        }
        producto.setDetalleProducto( detalleProductoMapper.toDocument( detalle ) );

        return producto;
    }
}
