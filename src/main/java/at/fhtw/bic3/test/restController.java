package at.fhtw.bic3.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

    @SpringBootApplication
    @RestController
    public class restController {

        public static void main(String[] args) {
            SpringApplication.run(restController.class, args);
        }

        @GetMapping("/{percentage}")
        public String getGrade(@PathVariable double percentage) {
            if (percentage >= 88) return "A - Bravo"; else if (percentage >= 75) return "B - auch guttt"; else if (percentage >= 63) return "C ist dein Buchstabe, wos e net schlecht ist"; else if (percentage >= 50) return "D ist dein Buchstabe, also joa es geht"; else return "Leider eine 5 - FAIL, weil Du unter 60 Prozent host";
        }
    }