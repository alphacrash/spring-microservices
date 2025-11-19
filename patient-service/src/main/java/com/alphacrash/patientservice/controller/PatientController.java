package com.alphacrash.patientservice.controller;

import com.alphacrash.patientservice.dto.PatientRequestDTO;
import com.alphacrash.patientservice.dto.PatientResponseDTO;
import com.alphacrash.patientservice.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getPatients() {
        return ResponseEntity.ok(patientService.getPatients());
    }

    @PostMapping
    public ResponseEntity<PatientResponseDTO> createPatient(@Valid @RequestBody PatientRequestDTO patientRequestDTO) {
        return ResponseEntity.ok(patientService.createPatient(patientRequestDTO));
    }
}
