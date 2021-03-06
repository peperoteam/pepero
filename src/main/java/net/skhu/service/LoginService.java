package net.skhu.service;

import lombok.extern.slf4j.Slf4j;
import net.skhu.domain.Member;
import net.skhu.domain.SecurityUser;
import net.skhu.dto.LoginRequest;
import net.skhu.exception.LoginException;
import net.skhu.mapper.MemberMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

/**
 * Created by bomi on 2019-05-03.
 */
@Slf4j
@Service
public class LoginService {
    private final MemberMapper memberMapper;

    private final PasswordEncoder passwordEncoder;

    public LoginService(final MemberMapper memberMapper, final PasswordEncoder passwordEncoder) {
        this.memberMapper = memberMapper;
        this.passwordEncoder = passwordEncoder;
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Member member = memberMapper.findByStuId(Integer.parseInt(username));
//        if (member == null) {
//            throw new UsernameNotFoundException("login fail");
//        }
//        return new SecurityUser(member);
//    }

    public void push(HttpServletResponse response){
        try {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('아이디 혹은 비밀번호를 확인해주세요');</script>");
            out.flush();
        } catch(IOException e) {
            log.error(e.getMessage());
        }
    }

    public Member login(final LoginRequest loginRequest, HttpServletResponse response) throws IOException {
        if(loginRequest == null) throw new LoginException("no");

        //String password = passwordEncoder.encode(loginRequest.getPassword());
        //log.error(loginRequest.getPassword());
        //log.error(passwordEncoder.encode(loginRequest.getPassword()));
//        final Member member = memberMapper.findByIdAndPassword(studentIdx,
//                passwordEncoder.encode(loginRequest.getPassword()));

        try {
            int studentIdx = Integer.parseInt(loginRequest.getId());
            return Optional.ofNullable(memberMapper.findByIdAndPassword(studentIdx,loginRequest.getPassword()))
                    .orElseThrow(() -> new LoginException("아이디 혹은 비밀번호를 확인해주세요"));

        } catch(NumberFormatException e) {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('ID가 올바른 형식이 아닙니다'); history.go(-1);</script>");
            out.flush();
        } catch(LoginException e) {
            response.setContentType("text/html;charset=utf-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('아이디 혹은 비밀번호를 확인해주세요'); history.go(-1);</script>");
            out.flush();
        }

        return null;

    }
}
