package tasks.calculator.controller;

import org.springframework.web.bind.annotation.*;
import tasks.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String add(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return calculatorService.divide(num1, num2);
    }

//    @ExceptionHandler(IllegalArgumentException.class)
//    public String handleIllegalArgumentException(IllegalArgumentException exception) {
//        return exception.getMessage();
//    }
}
