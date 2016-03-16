# TP1

### Question 1.

**Description des données :** Quels sont les attributs ?
Quel est l’attribut cible (classe) ?
Pour quel but allons-nous construire un arbre de décision ?

>- Ciel
- Temperature
- Humidite
- Vent
- Jouer

> L'attribut cible est jouer.

> L'arbre de décision va nous permettre de savoir si l'on peut jouer ou pas.

### Question 2.
Complétez la commande suivante pour créer l’arbre de décision :
```
ad.tennis <- rpart (<Classe>~<Attribut1> + <...> + <AttributN>
  , <Données>, control = <paramètres>)
```

> ```
ad.tennis <- rpart (Jouer~Ciel + Temperature + Humidite + Vent
, tennis, control = ad.tennis.cnt)
```

### Question 3.
Expliquez la sortie de cette commande (predict(ad.tennis, tennis))

> Predict donne les cas où l'on peut jouer ou non. Si l'on ne peut pas jouer non est à 1 et oui à 0 sinon c'est l'inverse

### Question 4.1
Mettre ces données dans un fichier dont le format est similaire à
tennis_data.txt
puis chargez le.

> cf question4_data.txt

### Question 4.2
Créer directement un data.frame
```
(commande data.frame(<Vecteur1>, <...>,<VecteurN>))
```
> ```
ciel <- c("Ensoleille", "Couvert", "Pluie")
> temperature <- c(30, 25, 15)
> humidite <- c(90, 70, 86)
> vent <- c("Failble", "Fort", "Fort")
> data.frame(ciel, temperature, humidite, vent)
```

### Question 4.3
Pour chaque ligne, prédire si le match aura lieu. Est-ce conforme au modèle construit?

> Les données sont conforme au modèle mais pas à la réalité (faute au modèle)

### Question 5.
Construisez un arbre de décision à partir de ce jeu de données pour prédire la variable Type à partir des autres variables. Vous utiliserez les mêmes paramètres que pour le tennis (minsplit=1). Que pensez-vous de l’arbre obtenu? Comment pourrait-on l’améliorer?

> ```
ad.car <- rpart (Type ~ Price + Country + Reliability  + Mileage
 + Type + Weight + Disp. + HP , car.test.frame ,
 control = ad.car.cnt)
```
> L'abre est peu lisible au vu du grand nombre de donnèes
