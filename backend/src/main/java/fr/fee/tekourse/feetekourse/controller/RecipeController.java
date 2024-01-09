package fr.fee.tekourse.feetekourse.controller;

import fr.fee.tekourse.feetekourse.recipe.api.RecipeApi;
import fr.fee.tekourse.feetekourse.recipe.model.Ingredient;
import fr.fee.tekourse.feetekourse.service.IngredientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class RecipeController implements RecipeApi {
    private final IngredientService ingredientService;

    public RecipeController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @Override
    public ResponseEntity<Long> addIngredient(Ingredient ingredient) {

        return new ResponseEntity<>(
                this.ingredientService.addIngredient(ingredient),
                HttpStatus.CREATED
        );
    }
}
