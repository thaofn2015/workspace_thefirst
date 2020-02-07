package fan.stu.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fan.stu.entity.Employee;

@Controller
public class MainController {

    private List<Employee> employeeList = new ArrayList<Employee>();

    @RequestMapping(value = {"/", "/index"})
    public String index(Model model) {

        model.addAttribute("employees", employeeList);

        return "index";
    }

    @RequestMapping(value = "/add-employee", method = RequestMethod.GET)
    public String addEmployee(Model model) {

        List<String> listFavorite = new ArrayList<String>();
        listFavorite.add("Swimming");
        listFavorite.add("Listening music");
        listFavorite.add("Walking");
        listFavorite.add("Watching movie");
        listFavorite.add("Reading comic");
        model.addAttribute("listFavorite", listFavorite);

        List<String> listPosition = new ArrayList<String>();
        listPosition.add("Developer");
        listPosition.add("Designer");
        listPosition.add("Tester");
        listPosition.add("QA");

        model.addAttribute("listFavorite", listFavorite);
        model.addAttribute("listPosition", listPosition);
        model.addAttribute("employee", new Employee());

        return "add-employee";
    }

    @RequestMapping(value = "/add-employee", method = RequestMethod.POST)
    public String addEmployee(Model model, @ModelAttribute("employee") Employee employee) {

        int id = employeeList.size() + 1;
        employee.setId(id);

        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
        System.out.println(employee.getEmail());
        System.out.println(employee.getGender());
        System.out.println(employee.getPosition());
        System.out.println(employee.getFavorite());

        employeeList.add(employee);

        return "redirect:index";
    }
}
