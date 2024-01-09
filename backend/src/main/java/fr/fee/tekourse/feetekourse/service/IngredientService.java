package fr.fee.tekourse.feetekourse.service;

import fr.fee.tekourse.feetekourse.recipe.model.Ingredient;

public interface IngredientService {
    /**
     * Permet d'ajouter un ingrédient
     * afin de permettre aux clients de les sélectionner pour créer une recette
     *
     * @param ingredient informations de l'ingrédient
     * @return Id de l'ingrédient nouvellement créé
     */
    Long addIngredient(Ingredient ingredient);
}
