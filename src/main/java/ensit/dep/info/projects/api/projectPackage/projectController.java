package ensit.dep.info.projects.api.projectPackage;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@RestController
 @RequestMapping(path="projectApi")
public class projectController {

 final private ProjectRepository repository;

 public projectController(ProjectRepository repository) {
  this.repository = repository;
 }

 @GetMapping("/")
 public String HelloWorld() {
  return "Hello World from my new spring boot server";
 }

 @GetMapping("/getProjects")
 public List<Project> GetProjects() {

  return repository.findAll();
 }
}