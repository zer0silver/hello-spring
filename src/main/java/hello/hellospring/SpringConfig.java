package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean // 스프링 빈에 등록하라는 뜻
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    // memberRepository() 매개변수가 필요함
   @Bean
    public MemberRepository memberRepository(){ // 인터페이스 -> 인터페이스는 new 안돼
        return new MemoryMemberRepository(); // 구현체
    }
}
