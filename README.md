# Challenge
## Afficher une liste d'éléments

1. Crée un projet nommé *TodoList*, avec ```MainActivity``` basé sur le modèle *Empty Activity*
2. Ajoute une ```ListView``` *listTodo* dans le layout lié à ```MainActivity```
3. Crée un modèle de données *Todo* qui contient des attributs ```description``` (String) et ```date``` (String), ainsi qu'un constructeur permettant d'initialiser ces attributs et des *getters* et *setters*
4. Crée un *layout* ```item_todo.xml``` présentant les données du modèle de la façon suivante : la description à gauche et date à droite
5. Crée un adapter ```TodoAdapter``` et ajoute le code nécessaire à son bon fonctionnement
6. Dans ```MainActivity```, crée une collection de *Todo* et fait le *binding* entre la ```ListView``` et ```TodoAdapter```
7. La liste des éléments s'affiche bien au lancement de l'application et doit ressembler à ça :
![image_ui6](http://images.innoveduc.fr/android/android_listview_06.png)
8. Poste ton projet sur ton compte GitHub et partage le lien en solution

>Bonus : tu peux utiliser le type *java.util.Date* plutôt que *String* pour l'attribut *date*.

#
## Critères de validation

- Le projet affiche bien une liste de choses à faire, avec pour chaque élément : une description et une date.
- Le code du projet contient bien un modèle ```Todo```, un *adapter* ```TodoAdapter``` et un layout ```item_todo.xml```.