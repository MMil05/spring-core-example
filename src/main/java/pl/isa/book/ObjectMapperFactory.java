package pl.isa.book;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperFactory {

    @Bean
    public ObjectMapper createObjectMapper(){
        ObjectMapper instance = new ObjectMapper();
        instance.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        instance.enable(JsonParser.Feature.ALLOW_SINGLE_QUOTES);
        return instance;
    }
}
