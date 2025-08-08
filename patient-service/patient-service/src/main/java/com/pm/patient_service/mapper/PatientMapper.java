package com.pm.patient_service.mapper;

import java.time.LocalDate;
import java.util.List;

import com.pm.patient_service.dto.PatientRequestDTO;
import com.pm.patient_service.dto.PatientResponseDTO;
import com.pm.patient_service.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDto(Patient patient) {
        if (patient == null) {
            List<PatientResponseDTO> emptyList = List.of();
            return emptyList.get(0);
        }

        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(patient.getId().toString());
        dto.setName(patient.getName());
        dto.setEmail(patient.getEmail());
        dto.setAddress(patient.getAdress());
        dto.setGender(patient.getGender());
        dto.setDateOfBirth(patient.getDateOfBirth().toString());

        return dto;
    }
    
    public static Patient toEntity(PatientRequestDTO patientRequestDTO) {
        if (patientRequestDTO == null) {
            return null;
        }

        Patient patient = new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAdress(patientRequestDTO.getAddress());
        patient.setGender(patientRequestDTO.getGender());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setDateOfRegistration(LocalDate.parse(patientRequestDTO.getDateOfRegistration()));

        return patient;
    }
    
}
