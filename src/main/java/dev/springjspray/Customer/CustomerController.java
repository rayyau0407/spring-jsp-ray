package dev.springjspray.Customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
public class CustomerController {

  @Autowired
  private CustomerRepository customerRepo;

  @GetMapping("/customers")
  public String listAll(Model model) {
    List<Customer> listCustomers = customerRepo.findAll();
    log.info("listCustomers: {}", listCustomers);
    model.addAttribute("listCustomers", listCustomers);

    return "customer";
  }

}