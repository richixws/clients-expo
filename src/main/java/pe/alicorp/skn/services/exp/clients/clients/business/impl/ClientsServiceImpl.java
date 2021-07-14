package pe.alicorp.skn.services.exp.clients.clients.business.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import pe.alicorp.skn.services.exp.clients.clients.business.ClientsService;
import pe.alicorp.skn.services.exp.clients.clients.model.api.Clients;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class ClientsServiceImpl implements ClientsService {

    public Flux<Clients> getClients(String id, String ruc, String name, String type) throws IOException {

        if(type.equalsIgnoreCase("front"))
        {
            List<Clients> listDetail = new ObjectMapper().readValue(new ClassPathResource("json/clients.json")
                   .getInputStream(), ArrayList.class);
            return Flux.fromIterable(listDetail);
        }else
        {
            return Flux.empty();
        }
    }

/*    public Mono<Clients> getOrderDetail2(Long id){
        return Mono.error(new UnsupportedOperationException("must be implemented"));
    }*/

}