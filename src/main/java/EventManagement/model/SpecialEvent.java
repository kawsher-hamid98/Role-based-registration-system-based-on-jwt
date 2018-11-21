package EventManagement.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "specialEvent")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SpecialEvent {

    private String id;
    private String eventName;
    private String eventAddress;
    private String eventCreationDate;
    private String eventDescription;
    private String eventDate;
    private String buyEvent;
}
