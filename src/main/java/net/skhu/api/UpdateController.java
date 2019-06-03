package net.skhu.api;


import lombok.AllArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import net.skhu.domain.Member;
import net.skhu.dto.PwsReq;
import net.skhu.dto.SignUpRequest;
import net.skhu.mapper.MemberMapper;

import net.skhu.service.PwsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
@RequestMapping("/")
public class UpdateController {

    private final PwsService pwsService;

    private final MemberMapper userMapper;

    public UpdateController(final PwsService pwsService, final MemberMapper memberMapper) {
        this.pwsService = pwsService;
        this.userMapper = memberMapper;
    }

    @GetMapping("findPws")
    public String findPws(Model model,PwsReq pwsReq){

        model.addAttribute("pwsReq",pwsReq);
        return "users/findPws";
    }

    @PostMapping("find_pws")
    public void updatePws(PwsReq pwsReq, HttpServletResponse response) throws Exception{

        pwsService.find_psw(response,pwsReq);

    }
    
    
    //개인정보 수정 
    @GetMapping("mypage")
    public String mypage(Model model,SignUpRequest mypage){

    	
    	Member member = userMapper.findByStuId(201632009);
        model.addAttribute("member",member);
    	
        return "users/mypage";
    }
    
    @PostMapping("mypage")
    public String mypage(Model model,Member member){

    	
    	userMapper.updateInfo(member);
        model.addAttribute("member",member);
        return "redirect:/mypage";
    }
    


}
