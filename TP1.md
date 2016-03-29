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

### Question 6.
Essayez plusieurs valeurs de ce paramètre et observez son effet sur l’arbre élagué

> Plus on augmente la complexité plus la taille de noeud restant diminue

### Question 7.
Affichez cette table pour l’arbre de décision sur les voitures grâce à la syntaxe :
```
  ad.car$cptable
```

### Question 8.
À quel arbre correspond alors la valeur de cp = 0,2?

> cp = 0.2 correspond à :

> 3 0.13333333      2 0.51111111 0.7111111 0.08587483

### Question 9.
Combien d’exemples sont mal classés à la racine (aidez-vous de la sortie standard d’un arbre)?

> root 60 45 Compact (0.25 0.05 0.22 0.22 0.15 0.12)
> le 45 signifie le nombre d'exemples à la racine mal classés

### Question 10.
Avec les fonctions plot() puis lines() , tracez d’abord la courbe de rel error en fonction du nombre de nœuds (nombre de nœuds = nsplit + 1).

>```
> plot(ad.car$cptable[,2], ad.car$cptable[,3])
> lines(ad.car$cptable[,2], ad.car$cptable[,3])
>```

### Question 11.
Faites de même (sur le même graphique) avec la courbe du xerror toujours en fonction du nombre de noeuds.

>```
> plot(ad.car$cptable[,2], ad.car$cptable[,3])
> lines(ad.car$cptable[,2], ad.car$cptable[,3])
> lines(ad.car$cptable[,2], ad.car$cptable[,4])
> points(ad.car$cptable[,2], ad.car$cptable[,4])
>```

### Question 12.
En utilisant cette technique (efficace!), déterminez la valeur de cp optimale. Créer l’arbre correspondant dans une nouvelle variable grâce à la fonction prune vue précédemment : ad.car.optimal <- prune (ad.car, cp=...)

>```
> ad.car.optimal <- prune (ad.car, 0.4)
>```

>```
> car.copy.frame$Reliability[car.copy.frame$Reliability==1] <- 'un'
> car.copy.frame$Reliability[car.copy.frame$Reliability==2] <- 'deux'
> car.copy.frame$Reliability[car.copy.frame$Reliability==3] <- 'trois'
> car.copy.frame$Reliability[car.copy.frame$Reliability==4] <- 'quatre'
> car.copy.frame$Reliability[car.copy.frame$Reliability==5] <- 'cinq'
>```

### Question 13.
Construisez des arbres de décision pour ces deux attributs comme on l’a fait précédemment pour Type. Lequel de ces trois attributs est le mieux prédit?

>```
> ad.car.copy <- rpart (Reliability ~ Price + Country + Reliability  + Mileage + Type + Weight + Disp. + HP, car.copy.frame, control = ad.car.cnt)
> plot(ad.car.copy)
> text(ad.car.copy)
> ad.car <- rpart (Country ~ Price + Country + Reliability  + Mileage + Type + Weight + Disp. + HP, car.copy.frame, control = ad.car.cnt)
>```
>On compare les deux arbres avec le moins d'erreur :
> - country : 2 0.05882353      1 0.6470588 0.7058824 0.1116098
> - Reliability : 4 0.031250      6   0.28125 0.6875 0.1088041
> on compare la somme des deux dernières colonnes le chiffres le plus petit correspond à l'abre prédisant le mieux. Dans notre cas il s'agit de reliability
