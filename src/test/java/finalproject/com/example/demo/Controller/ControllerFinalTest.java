package finalproject.com.example.demo.Controller;

import finalproject.com.example.demo.Entity.EntityFinal;
import finalproject.com.example.demo.Service.FinalService;
import org.hibernate.query.criteria.internal.expression.SimpleCaseExpression;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ControllerFinalTest {
   @Autowired
    ControllerFinal controllerFinal;
   @Mock
    FinalService finalService;
    @Test
    void getallperson() {



    }

    @Test
    void processRegister() {
        EntityFinal  entityFinal=new EntityFinal(122,"akino","kayao",14,14);

       // Optional<EntityFinal> getentity=finalService.findbyid(122);

        Integer identity=entityFinal.getFinal_id();

        assertEquals(identity,122);
    }



}
