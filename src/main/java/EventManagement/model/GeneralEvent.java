package EventManagement.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "generalEvent")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneralEvent {

    private String id;
    private String eventName;
    private String eventAddress;
   // private Date eventCreationDate;
    private String eventDescription;
    private String url;

    //private String eventDate;
}
