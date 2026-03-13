package com.ph.entity;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.jspecify.annotations.Nullable;

import java.math.BigDecimal;

@Entity
@Table( name = "Control")
public class Control {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String homeTeam;
    private String awayTeam;
    private String method;

    @NotNull
    @Column(nullable = false)
    private BigDecimal profitOrLoss;

    public Control(String homeTeam, String awayTeam,
                   String method, BigDecimal profitOrLoss){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.method = method;
        this.profitOrLoss = profitOrLoss;
    }

    public Control(){
    }

    public Long getId(){
        return id;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public BigDecimal getProfitOrLoss() {
        return profitOrLoss;
    }

    public void setProfitOrLoss(BigDecimal profitOrLoss) {
        this.profitOrLoss = profitOrLoss;
    }
}
