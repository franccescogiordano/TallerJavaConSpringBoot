package co.com.sofka.bibliotecapublicaSprinnBootApiyMongoDB.repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import co.com.sofka.bibliotecapublicaSprinnBootApiyMongoDB.model.Recurso;
import reactor.core.publisher.Flux;
public interface RecursoRepository extends  ReactiveMongoRepository<Recurso, String> {
    public Flux<Recurso> findByTipo(String tipo);
}
