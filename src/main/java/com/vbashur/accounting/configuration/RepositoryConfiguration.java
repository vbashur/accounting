package com.vbashur.accounting.configuration;

import com.vbashur.accounting.domain.EmployeeRepository;
import org.immutables.criteria.backend.Backend;
import org.immutables.criteria.inmemory.InMemoryBackend;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {


    private final Backend backend = new InMemoryBackend();

    @Bean
    EmployeeRepository employeeRepository() {
        return new EmployeeRepository(backend);
    }
}
