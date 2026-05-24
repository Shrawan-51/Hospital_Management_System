package hospital_backend.controller;

import hospital_backend.entity.Patient;
import hospital_backend.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@CrossOrigin("*")
public class PatientController {

    private final PatientService service;

    public PatientController(PatientService service) {
        this.service = service;
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return service.addPatient(patient);
    }

    @GetMapping
    public List<Patient> getPatients() {
        return service.getAllPatients();
    }
}