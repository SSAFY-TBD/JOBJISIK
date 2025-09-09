package com.tbd.jobjisik.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserAuditorAware implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("system"); // 임시로 system 으로 설정 -> Spring Security 적용 이후 수정 필요
    }
}
