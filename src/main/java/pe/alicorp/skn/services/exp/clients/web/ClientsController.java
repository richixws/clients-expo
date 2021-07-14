package pe.alicorp.skn.services.exp.clients.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.alicorp.skn.services.exp.clients.clients.business.ClientsService;
import pe.alicorp.skn.services.exp.clients.clients.model.api.Clients;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import pe.com.alicorp.skynet.core.model.HttpHeadersRequest;
import reactor.core.publisher.Flux;
import pe.com.alicorp.skynet.annotations.HttpHeadersMapping;
import reactor.core.publisher.Mono;
import java.io.IOException;

@RefreshScope
@RestController
@AllArgsConstructor
@Api(tags = "clients", description = "clients")
@Slf4j
public class ClientsController {

    private ClientsService service;


    @GetMapping(value = "/seller/{id}/clients", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value = "Consulta orderdetail", response = Clients.class, httpMethod = "GET", notes = "classpath:swagger/notes/Clients..md")
    @ApiResponses({ @ApiResponse(code = 200, message = "Se ejecut� satisfactoriamente."),
                    @ApiResponse(code = 400, message = "El cliente envi� datos incorrectos."),
                    @ApiResponse(code = 500, message = "Error inesperado.")}


    public Flux<Clients> getOrderDetail(@PathVariable String id,
                                        @RequestParam(name = "type",required = false,defaultValue = "") String type,
                                        @RequestParam(name = "ruc", required = false,defaultValue = "") String ruc,
                                        @RequestParam(name = "name", required = false,defaultValue = "") String name,
                                        @HttpHeadersMapping HttpHeadersRequest headers) throws IOException {
        return service.getClients(id,ruc,name,type);
    }

/*    @GetMapping(value = "{id}", produces = {MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value = "Consulta orderdetail", response = Clients.class, httpMethod = "GET", notes = "classpath:swagger/notes/Orderdetail..md")
    @ApiResponses({ @ApiResponse(code = 200, message = "Se ejecut� satisfactoriamente."),
    @ApiResponse(code = 400, message = "El cliente envi� datos incorrectos."),
    @ApiResponse(code = 500, message = "Error inesperado.")})
    public Mono<Clients> getorderDetail2(@HttpHeadersMapping @Validated HttpHeadersRequest header, @PathVariable("id") Long value) {
        return service.getOrderDetail2(value);
    }*/


}