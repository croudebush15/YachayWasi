package com.pe.proyectotechnologico.Service;

import com.pe.proyectotechnologico.Model.User;
import com.pe.proyectotechnologico.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService implements CrudService<User,Integer> {

    final UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(User user) {
        repository.save(user);
    }

    @Override
    public void update(User user) {
        repository.save(user);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public User findById(Integer id) {
        return repository.findById(id)
                .orElse(null);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    public Boolean userExists(User userLogin){
        User user = repository.findByUsername(userLogin.getUsername());
        if (user == null) return false;
        else if (Objects.equals(user.getPassword(), userLogin.getPassword()))
            return true;
        else return false;
    }
}
