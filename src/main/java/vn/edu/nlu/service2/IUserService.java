package vn.edu.nlu.service2;

import org.springframework.stereotype.Service;
import vn.edu.nlu.entity2.Doctor;

import java.util.List;

@Service

public interface IUserService {
    Boolean authLogin(String email, String password);
}
