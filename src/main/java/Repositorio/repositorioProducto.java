package Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import Modelo.*;

@Repository
public interface repositorioProducto extends MongoRepository<Producto, String>  {

}
