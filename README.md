# Fée Tékourse

La fée Tékourse est là pour préparer tes courses !

En effet, elle a la possibilité de générer, d'un coup de baguette magique, une liste de course à partir de recette que tu auras au préalablement créer et sélectionner !

Pour cela, rien de plus compliqué :
- Connecte toi avec ton compte.
- Créé ta recette en renseignant le nombre de portions, les ingrédients et leurs quantités
- Sélectionne les recettes que tu voudrais préparer.
- Clique sur "Fée moi les courses !"

TADAM, une liste de course est générée !

## Cas d'utilisation

### Mettre a disposition un choix exhaustif d'ingrédient
En tant qu'administrateur, je souhaite avoir la possibilité d'ajouter, de modifier et de supprimer des ingrédients afin que les clients puissent confectionner des recettes.

Critères de validation :
- Seuls les comptes administrateur peuvent avoir accès à cette fonctionnalité.
- Je dois pouvoir renseigner des ingrédients avec une unité de mesure différente. (pièce, Kg, L, mL, g, ...)

### Enregistrer ses recettes
En tant qu'utilisateur, je souhaite pouvoir créer, modifier ou supprimer mes recettes afin de les visualiser sur mon espace client.

Critères de validation :
- Uniquement les personnes authentifiées peuvent accéder à cette fonctionnalité.
- Les recettes doivent être visibles uniquement par son créateur.
- Le nombre de personnes et les quantités pour les ingrédients doivent être saisis.

### Générer sa liste de course
En tant qu'utilisateur, je souhaite pouvoir sélectionner un ensemble de recettes afin de pouvoir générer une liste de course.

Critères de validation :
- Uniquement les personnes authentifier peuvent accéder à cette fonctionnalité
- Les recettes sélectionnables sont uniquement celles créées par l'utilisateur.
- Le nombre de recettes sélectionnable n'est pas limité (au moins une)
- La liste de course générée ne doit pas comporter d'ingrédient en doublon
