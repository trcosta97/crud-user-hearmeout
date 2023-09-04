package br.com.hearMeOut.userCrud.service;

import br.com.hearMeOut.userCrud.domain.user.User;
import br.com.hearMeOut.userCrud.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public User save(User user){
        return userRepository.save(user);
    }

    public User get(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()){
            User user = optionalUser.get();
            return user;
        }
        return null;
    }

    public List<User> getAll(){
        return userRepository.findAllByStatusTrue();
    }

    public User update(Long id, User user){
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()){
            User oldUser = optionalUser.get();
            if(user.getPassword() != null){
                oldUser.setPassword(user.getPassword());
            }
            if(user.getEmail() != null){
                oldUser.setEmail(user.getEmail());
            }
            User savedUser = userRepository.save(oldUser);
            userRepository.save(savedUser);
        }
        return null;
    }

    public User delete(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isPresent()){
            User user = optionalUser.get();
            user.setStatus(false);
            User deactivatedUser = userRepository.save(user);
            return deactivatedUser;
        }
        return null;
    }
}
