package net.engineeringdigest.journalApp.repository;

import com.sun.corba.se.spi.ior.ObjectId;
import net.engineeringdigest.journalApp.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName( String userName);
}
