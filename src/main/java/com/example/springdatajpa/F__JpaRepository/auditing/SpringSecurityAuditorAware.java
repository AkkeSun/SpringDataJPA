package com.example.springdatajpa.F__JpaRepository.auditing;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

// CreatedBy, modifiedBy 등록하려면 시큐리티 설정을 해줘야함(skip)
// bean 등록하면 기본적으로 bean 이름은 첫 글자가 소문자로 바뀜 (springSecurityAuditorAware)
@Component
public class SpringSecurityAuditorAware implements AuditorAware<AuditingEntity1> {

    @Override
    public Optional<AuditingEntity1> getCurrentAuditor() {
        System.err.println("Test!!!");
        return Optional.empty();
    }
}
