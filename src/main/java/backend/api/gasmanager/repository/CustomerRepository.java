package backend.api.gasmanager.repository;

import backend.api.gasmanager.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<CustomerModel, UUID> {
}
