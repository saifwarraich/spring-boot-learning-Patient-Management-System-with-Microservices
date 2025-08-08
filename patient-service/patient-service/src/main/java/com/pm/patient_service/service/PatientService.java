package com.pm.patient_service.service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.pm.patient_service.dto.PatientRequestDTO;
import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.exception.EmailAlreadyExistsException;
import com.pm.patient_service.exception.UserDoesNotExistException;
import com.pm.patient_service.mapper.PatientMapper;
import com.pm.patient_service.model.Patient;
import com.pm.patient_service.repository.PatientRepository;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(PatientMapper::toDto)
                .toList();
    }
    
    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {

        if (patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsException(patientRequestDTO.getEmail());
        }

        Patient patient = PatientMapper.toEntity(patientRequestDTO);
        Patient savedPatient = patientRepository.save(patient);

        return PatientMapper.toDto(savedPatient);
    }
     
    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new UserDoesNotExistException(id));

        if (!patient.getEmail().equals(patientRequestDTO.getEmail()) &&
                patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
            throw new EmailAlreadyExistsException(patientRequestDTO.getEmail());
        }

        patient.setName(patientRequestDTO.getName());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAdress(patientRequestDTO.getAddress());
        patient.setGender(patientRequestDTO.getGender());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        Patient updatedPatient = patientRepository.save(patient);

        return PatientMapper.toDto(updatedPatient);

    }
    
    public void deletePatient(UUID id) {
        if (!patientRepository.existsById(id)) {
            throw new UserDoesNotExistException(id);
        }
        patientRepository.deleteById(id);
    }
}



