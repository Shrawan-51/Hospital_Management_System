package hospital_backend.repository;

import hospital_backend.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository
        extends JpaRepository<Patient, Integer> {
}