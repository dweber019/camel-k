package ch.w3tec;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTest extends CamelTestSupport {
    
    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new CamelRoute();
    }

    @Test
    public void testHello() throws Exception {
        Object reply = template.requestBodyAndHeader("direct:hello", "", "name", "World");
        Assertions.assertEquals("Hello World", reply);
    }
}

