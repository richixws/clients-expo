package pe.alicorp.skn.services.exp.clients.clients.business.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ClientsServiceImplTest {

    private ClientsServiceImpl service;

    @Before
    public void setUp() throws IOException {
        this.service = new ClientsServiceImpl();
        String id = "123";
        String ruc = "2020202020";
        String name = "Test";
        String type = "front";
        service.getClients(id,ruc,name,type);
    }

    @Test
    public void test(){
        Assert.assertNotNull(service);
    }

    @Test
    public void test2() throws IOException {
        String id = "123";
        String ruc = "2020202020";
        String name = "Test";
        String type = "test";
        service.getClients(id,ruc,name,type);
        Assert.assertNotNull(service);
    }
}
