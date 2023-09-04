package br.com.hearMeOut.userCrud.service;

import br.com.hearMeOut.userCrud.domain.address.Address;
import br.com.hearMeOut.userCrud.domain.address.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address save(Address address){
        return addressRepository.save(address);
    }
}
