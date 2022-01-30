package com.executer.api.springbootmultithreadingexample.service;


import com.executer.api.springbootmultithreadingexample.entity.User;
import com.executer.api.springbootmultithreadingexample.repository.UserRepository;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    Logger logger = LoggerFactory.logger(UserService.class);

    @Async
    public CompletableFuture<List<User>> saveUsers(MultipartFile file) throws Exception{
        long startTime = System.currentTimeMillis();
        List<User> users = parseCSVFile(file);
       
        logger.info("Saveing list of user size " +users.size()+Thread.currentThread().getName());
        List<User> users1 = repository.saveAll(users);
        long endTime = System.currentTimeMillis();
        logger.info("Total time "+(endTime-startTime));
        return CompletableFuture.completedFuture(users1);
    }

    public CompletableFuture<List<User>> findAllUser(){
        long startTime = System.currentTimeMillis();
        logger.info("Current thread "+Thread.currentThread().getName());
        List<User> all = repository.findAll();
        long endTime = System.currentTimeMillis();
        logger.info("Total time "+(endTime-startTime));
        return CompletableFuture.completedFuture(all);

    }

    private List<User> parseCSVFile(final MultipartFile file) throws Exception {
        final List<User> users = new ArrayList<>();
        try {
            try (final BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    final String[] data = line.split(",");
                    final User user = new User();
                    user.setName(data[0]);
                    user.setEmail(data[1]);
                    user.setGender(data[0]);
                    users.add(user);
                }
                return users;
            }
        }catch (final Exception ex){
            logger.error("Failed to parse CSV file {}", ex);
            throw new Exception("Failed to parse CSV file{}", ex);
        }

    }

}
