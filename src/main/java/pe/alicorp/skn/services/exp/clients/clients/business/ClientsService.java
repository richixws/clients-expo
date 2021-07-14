package pe.alicorp.skn.services.exp.clients.clients.business;

import pe.alicorp.skn.services.exp.clients.clients.model.api.Clients;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.io.IOException;

public interface ClientsService {

    Flux<Clients> getClients(String id,String ruc, String name, String type) throws IOException;

    //Mono<Clients> getOrderDetail2(Long id);
}