package hari.training.Recipe.project.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private unitofmeasure unitofmeasure;

    @ManyToOne
    private Recipe recipe;

    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, hari.training.Recipe.project.model.unitofmeasure unitofmeasure, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.unitofmeasure = unitofmeasure;
        this.recipe = recipe;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public hari.training.Recipe.project.model.unitofmeasure getUnitofmeasure() {
        return unitofmeasure;
    }

    public void setUnitofmeasure(hari.training.Recipe.project.model.unitofmeasure unitofmeasure) {
        this.unitofmeasure = unitofmeasure;
    }
}
