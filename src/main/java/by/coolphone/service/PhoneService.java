package by.coolphone.service;

import by.coolphone.entity.Phone;
import by.coolphone.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }

    public Phone getPhone(String model){
        return phoneRepository.getPhoneByModel(model);
    }

}
