package com.freefinder.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.freefinder.api.modelo.Freelancer;

public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {

}
