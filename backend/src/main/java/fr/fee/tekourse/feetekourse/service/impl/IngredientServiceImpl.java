package fr.fee.tekourse.feetekourse.service.impl;

import fr.fee.tekourse.feetekourse.recipe.model.Ingredient;
import fr.fee.tekourse.feetekourse.service.IngredientService;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {
    @Override
    public Long addIngredient(Ingredient ingredient) {
        return 1L;
    }
}
