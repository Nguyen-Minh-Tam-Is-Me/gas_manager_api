package backend.api.gasmanager.repository;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.model.dto.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CustomerRepository extends JpaRepository<CustomerModel, UUID> {
    @Query(value = "SELECT new backend.api.gasmanager.model.dto.CustomerDTO(cm.id, cm.name, cm.phone, cm.address, cm.isMen, cm.avatar) from CustomerModel  cm")
    List<CustomerDTO> getAll();
}
