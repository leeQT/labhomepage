package cn.edu.tsinghua.labhomepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZIQIANG CHEN
 * @since 2018/8/15
 */
@Controller
public class HomePageController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping({"/people"})
    public String people() {
        return "people.html";
    }

    @RequestMapping({"/publications"})
    public String publications() {
        return "publications.html";
    }
//    @Autowired
//    public AccountController(AccountRepository repository, MemberRepository memberRepository, HotelRepository hotelRepository) {
//        this.repository = repository;
//        this.memberRepository = memberRepository;
//
//        this.hotelRepository = hotelRepository;
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(HttpSession session, @RequestParam("username") String mail,@RequestParam("password") String password) {
//
//        AccountEntity result = repository.findByMail(mail);
//
//        if (result != null) {
//
//            session.setAttribute(SystemDefault.USER_ID, result.getId());
//            switch (result.getType()) {
//                case 0:
//                    return "member/index";
//                case 1:
//                    return "hotel/index";
//                case 2:
//                    return "manager/index";
//                default:
//                    return "account/index";
//            }
//        }
//
////        model.addAttribute("error", "mail or password error");
//        return "account/index";
//
//    }
//
//    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String register(Model model, String mail, String password, String type) {
//
//        AccountEntity entity = repository.findByMail(mail);
//
//        if (entity != null) {
//            model.addAttribute("error", "Mail Existed");
//            return "account/register";
//        } else {
//            int accountType = 0;
//            switch (type) {
//                case "user":
//                    break;
//                case "hotel":
//                    accountType = 1;
//                    break;
//                default:
//                    return "account/register";
//            }
//
//
//            entity = new AccountEntity(mail, password, accountType);
//
//            entity = repository.save(entity);
//
//            if (accountType == 0 ) {
//                MemberEntity memberEntity = new MemberEntity();
//
//                BeanUtils.copyProperties(entity, memberEntity);
//                memberRepository.save(memberEntity);
//            } else if (accountType == 1) {
//                HotelEntity hotelEntity = new HotelEntity();
//
//                BeanUtils.copyProperties(entity, hotelEntity);
//                hotelRepository.save(hotelEntity);
//            }
//
//
//            return "redirect:/index";
//        }
//
//
//    }
//
//    @RequestMapping({"/", "/login" , "/index"})
//    public String login() {
//        return "account/index";
//    }
//
//    @RequestMapping("/register")
//    public String register(SessionStatus sessionStatus) {
//        sessionStatus.setComplete();
//        return "account/register";
//    }
//
//    @RequestMapping(value = "/logout", method = RequestMethod.GET)
//    public String logout(SessionStatus sessionStatus) {
//        SecurityContextHolder.clearContext();
//        sessionStatus.setComplete();
//        return "account/index";
//    }
}
