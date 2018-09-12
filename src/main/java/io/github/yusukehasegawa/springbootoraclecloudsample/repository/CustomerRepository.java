package io.github.yusukehasegawa.springbootoraclecloudsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.yusukehasegawa.springbootoraclecloudsample.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
