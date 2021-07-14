package pe.alicorp.skn.services.exp.clients.clients.config;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.alicorp.skn.services.exp.clients.clients.business.ClientsService;
import pe.alicorp.skn.services.exp.clients.clients.business.impl.ClientsServiceImpl;

@RefreshScope
@Configuration
public class ClientsConfig {

    @Bean
    public ClientsService clientsService() {
        return new ClientsServiceImpl();
    }

}