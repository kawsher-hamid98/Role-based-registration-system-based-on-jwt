package EventManagement.repository;

import EventManagement.model.GeneralEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GeneralEventRepository extends MongoRepository<GeneralEvent, String> {

}
