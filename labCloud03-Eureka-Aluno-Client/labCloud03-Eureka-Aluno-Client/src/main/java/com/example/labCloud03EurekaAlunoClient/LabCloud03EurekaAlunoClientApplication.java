package com.example.labCloud03EurekaAlunoClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LabCloud03EurekaAlunoClientApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LabCloud03EurekaAlunoClientApplication.class, args);
    }

    @Autowired
    AlunoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Aluno(null, "Leonardo", 111111, "leonardo@email.com"));
        repository.save(new Aluno(null, "Maria", 111111, "maria@email.com"));
        repository.save(new Aluno(null, "João", 111111, "joao@email.com"));
        repository.save(new Aluno(null, "José", 111111, "jose@email.com"));
        repository.save(new Aluno(null, "Rafael", 111111, "rafael@email.com"));
    }
}
