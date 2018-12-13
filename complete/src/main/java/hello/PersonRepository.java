package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface PersonRepository extends PagingAndSortingRepository<Customer, Long> {

	List<Customer> findByLastName(@Param("name") String name);

}
