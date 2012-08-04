package za.co.trf.recurly.sample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import za.co.trf.recurly.api.RecurlyAccountService;
import za.co.trf.recurly.api.entity.Account;

import java.util.List;

@RequestMapping("/recurly/accounts/**")
@Controller
public class AccountController {

    @Autowired
    private RecurlyAccountService recurlyAccountService;

    @RequestMapping
    public String index(Model model) {
        List<Account> accounts = recurlyAccountService.getAllAccounts();
        model.addAttribute("accounts", accounts);
        return "recurly/accounts/index";
    }

}
