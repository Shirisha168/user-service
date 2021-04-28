package com.example.userservice.userservice.service;
import com.example.userservice.userservice.ResponseWIthDepartmetn.Department;
import com.example.userservice.userservice.ResponseWIthDepartmetn.ResponseTemplate;
import com.example.userservice.userservice.entity.User;
import com.example.userservice.userservice.repository.UserRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
public class UserService {



    @Autowired
    RestTemplate restTemplate;

    private UserRespository userRespository;

    @Autowired
    public UserService(RestTemplate template, UserRespository userRespository) {
        this.restTemplate = template;
        this.userRespository = userRespository;
    }

    public User saveUser(User user) {
        return userRespository.save(user);
    }


    public ResponseTemplate getUserWithDeapartmetn(Long userId){
        log.info("getting into userwithdepatmetn method");
        System.out.println(userId);
        ResponseTemplate rs = new ResponseTemplate();
        User user = userRespository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://localhost:8081/departments/" + user.getDepartmentId(), Department.class);
        rs.setUser(user);
        rs.setDepartment(department);
        return rs;
    }
}
