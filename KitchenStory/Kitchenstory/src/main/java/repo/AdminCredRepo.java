package repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminCredRepo extends MongoRepository<AdminCred, String> {
	public AdminCred findByUsername(String username);
}