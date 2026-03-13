package com.ph.service;

import com.ph.entity.Control;
import com.ph.repository.ControlRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ControlService {

    //Chamando o service
    private final ControlRepository repository;

    public ControlService(ControlRepository repository){
        this.repository = repository;
    }
    //Salva jogo
    public Control save(Control control){
        return repository.save(control);
    }

    //Listar todos
    public List<Control> listAll(){
        return repository.findAll();
    }

    //buscar por id
    public Optional<Control> findById(Long id){
        return repository.findById(id);
    }

    //deletar
    public void delete(Long id){
        repository.deleteById(id);

    }

    //Calculo total

    public BigDecimal calculatedTotalProfit(){
        List<Control> controls = repository.findAll();
        BigDecimal total = BigDecimal.ZERO;

        for(Control c : controls){
            if(c.getProfitOrLoss() !=null){
                total = total.add(c.getProfitOrLoss());
            }
        }
        return total;

    }
}
