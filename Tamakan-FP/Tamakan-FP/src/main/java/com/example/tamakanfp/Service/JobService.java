package com.example.tamakanfp.Service;

import com.example.tamakanfp.ApiResponse.ApiException;
import com.example.tamakanfp.Model.Job;
import com.example.tamakanfp.Model.JobProvider;
import com.example.tamakanfp.Repository.JobProviderRepository;
import com.example.tamakanfp.Repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;
    private final JobProviderRepository jobProviderRepository;

    public List<Job> getJobs(){
        return jobRepository.findAll();
    }
    public void addJob(Job job,Integer providerId){
       JobProvider provider=jobProviderRepository.findJopProviderById(providerId);
       if(provider==null)
           throw new ApiException("Provider id not found");

        job.setJobProvider(provider);
        jobRepository.save(job);
    }

    public void updateJob(Job job,Integer id){
        Job oldJob=jobRepository.findJobById(id);
        if (oldJob==null)
            throw new ApiException("Job id not found");

        oldJob.setJobName(job.getJobName());
        oldJob.setJobDescription(job.getJobDescription());
        oldJob.setCity(job.getCity());
        oldJob.setAddress(oldJob.getAddress());
        oldJob.setStartDate(job.getStartDate());
        oldJob.setEndDate(job.getEndDate());
        oldJob.setStatus(job.getStatus());
        oldJob.setSector(job.getSector());
        oldJob.setSalary(job.getSalary());
        oldJob.setWorkingDays(job.getWorkingDays());
        oldJob.setWorkingHours(job.getWorkingHours());

        jobRepository.save(oldJob);
    }

    public void deleteJob(Integer id) {
        Job job = jobRepository.findJobById(id);
        if (job==null)
         throw new ApiException("Job id not found");

        jobRepository.delete(job);
    }

}
