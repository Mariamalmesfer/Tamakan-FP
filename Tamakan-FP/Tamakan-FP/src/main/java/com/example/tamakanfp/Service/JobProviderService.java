package com.example.tamakanfp.Service;


import com.example.tamakanfp.ApiResponse.ApiException;
import com.example.tamakanfp.DTO.JobProviderDTO;
import com.example.tamakanfp.Model.JobProvider;
import com.example.tamakanfp.Model.User;
import com.example.tamakanfp.Repository.JobProviderRepository;
import com.example.tamakanfp.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobProviderService {

    private final JobProviderRepository jobProviderRepository;
    private final UserRepository userRepository;


    public void regester(JobProviderDTO jopProviderDTO) {
        User user = userRepository.findUserById(jopProviderDTO.getUser_id());

        if (user == null) {
            throw new ApiException("id is null");
        }
        JobProvider jopProvider = new JobProvider(null, jopProviderDTO.getName(), jopProviderDTO.getPhoneNumber(), jopProviderDTO.getCity(), jopProviderDTO.getAddress(), jopProviderDTO.getSector(), jopProviderDTO.getLicense(), jopProviderDTO.getStatus(), user,null);
        jobProviderRepository.save(jopProvider);
    }





//    private final AgentRepository agentRepository;
//    private final UserRepository userRepository;
//
//    public void regester(AgentDTO agentDTO)
//    {
//
//        String hash = new BCryptPasswordEncoder().encode(agentDTO.getPassword());
//
//        User user1 = new User(null,agentDTO.getUsername(), hash, "Agent",null,null);
//        Agent agent =new Agent(null,user1,null,null);
//        user1.setAgent(agent);
//
//        agentRepository.save(agent);
//        userRepository.save(user1);
//    }
}
