package com.example.tamakanfp.Service;


import com.example.tamakanfp.ApiResponse.ApiException;
import com.example.tamakanfp.DTO.JobSeekerDTO;
import com.example.tamakanfp.Model.JobSeeker;
import com.example.tamakanfp.Model.User;
import com.example.tamakanfp.Repository.JobSeekerRepository;
import com.example.tamakanfp.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobSeekerService {


    private final JobSeekerRepository jobSeekerRepository;
    private final UserRepository userRepository;


    public void regester(JobSeekerDTO jobSeekerDTO) {
        User user = userRepository.findUserById(jobSeekerDTO.getUser_id());

        if (user == null) {
            throw new ApiException("id is null");
        }
        JobSeeker jobSeeker = new JobSeeker(null, jobSeekerDTO.getName(),jobSeekerDTO.getPhoneNumber(),jobSeekerDTO.getGender(),jobSeekerDTO.getCity(),jobSeekerDTO.getAddress(),jobSeekerDTO.getAge(),user);
        jobSeekerRepository.save(jobSeeker);
    }






//    private final CustomerRepository customerRepository;
//    private final UserRepository userRepository;
//
//    public void regester(CustomerDTO customerDTO)
//    {
//
//        String hash = new BCryptPasswordEncoder().encode(customerDTO.getPassword());
//
//
//        User user1 = new User(null,customerDTO.getUsername(), hash, "Customer",null,null);
//        Customer customer =new Customer(null,user1,null,null);
//        user1.setCustomer(customer);
//
//        customerRepository.save(customer);
//        userRepository.save(user1);
//    }





}
