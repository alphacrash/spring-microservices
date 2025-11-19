package com.alphacrash.patientservice.service;

import com.alphacrash.patientservice.dto.PatientRequestDTO;
import com.alphacrash.patientservice.dto.PatientResponseDTO;
import com.alphacrash.patientservice.mapper.PatientMapper;
import com.alphacrash.patientservice.model.Patient;
import com.alphacrash.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream().map(PatientMapper::toDTO).toList();
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
        Patient newPatient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDTO(newPatient);
    }
}
