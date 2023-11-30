package fr.fee.tekourse.feetekourse.controller;

import fr.fee.tekourse.feetekourse.recipe.api.ExampleApi;
import fr.fee.tekourse.feetekourse.recipe.model.Recipe;
import fr.fee.tekourse.feetekourse.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController implements ExampleApi {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @Override
    public ResponseEntity<Recipe> getRecipe(String id) {
        return new ResponseEntity<>(recipeService.getRecipeServiceExample(Integer.parseInt(id)));
    }
}
