package com.lambdaschool.javazoos.services;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ZooAuditing implements AuditorAware<String>
{
    @Override
    public Optional<String> getCurrentAuditor() {
        String uname;
        uname = "turtle";
        return Optional.of(uname);
    }
}
