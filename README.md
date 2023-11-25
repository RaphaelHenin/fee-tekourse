# Fée Tékourse

La fée Tékourse est là pour préparer tes courses !
En effet, en enregistrant tes recettes favorites, en renseignant ses ingrédients, tu auras la possibilité de les sélectionner, et, d'un coup de baguette magique, ta liste de course sera générer avec tous les ingrédients et quantité nécessaires.

## Cas d'utilisation
### Mettre a disposition un choix exhausitf d'ingrédient
En tant qu'administrateur, je souhaite avoir le possibilité d'ajouter, de modifier et de supprimer des ingrédients afin que les clients puisses confectionner des recettes.

Critères d'acceptances :
- Seul les comptes administrateur peuvent avoir accès à cette fonctionnalité
- Je dois pouvoir renseigner des ingrédients avec une unité de mesure différente (pièce, Kg, L, mL, g, ...)

### Enregistrer ses recettes
En tant qu'utilisateur, je souhaite pouvoir créer, modifier ou supprimer mes recettes afin de les visualiser sur mon espace client.

Critères d'acceptances :
- Uniquement les personnes authentifier peuvent accéder à cette fonctionnalité
- Les recettes doivent être visible uniquement par son créateur
- Le nombre de personne et les quantités pour les ingrédients doivent être saisies

### Générer sa liste de course
En tant qu'utilisateur, je souhaite pouvoir sélectionner un ensemble de recette afin de pouvoir générer une liste de course

Critères d'acceptances :
- Uniquement les personnes authentifier peuvent accéder à cette fonctionnalité
- Les recettes sélectionnables son uniquement celles créées par l'utilisateur
- Le nombre de recette sélectionnable n'est pas limité (au moins une)
- La liste de course ne doit pas comporter d'ing
