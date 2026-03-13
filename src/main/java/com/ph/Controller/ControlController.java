package com.ph.Controller;

import com.ph.entity.Control;
import com.ph.service.ControlService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static java.awt.SystemColor.control;

@RestController
@RequestMapping("/controls")
public class ControlController {

    private final ControlService service;

    public ControlController(ControlService service){
        this.service = service;
    }

    //Salvar
    @PostMapping

    public Control save(@RequestBody Control control){
        return service.save(control);
    }

    //listar todos
    @GetMapping
    public List<Control> list(){
        return service.listAll();
    }

    //buscar por id
    @GetMapping("/{id}")
    public Optional<Control> findById(@PathVariable Long id){
        return service.findById(id);
    }

    //deletar
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    //lucro total

    @GetMapping("/Profit-total")
    public BigDecimal totalProfit(){
        return service.calculatedTotalProfit();
    }


}
