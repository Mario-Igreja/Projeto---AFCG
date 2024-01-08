package pt.iade.fitme.controllers;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/exercise")
public class ExerciseController {

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getExerciseName() {
        return "Exercise name: Corrida";
    }

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getExercises() {
        return "Exercises: Corrida, Natação, Futebol";
    }
}
