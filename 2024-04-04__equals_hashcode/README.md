## Übung zu equals() und hashCode()

Implementieren Sie ein Klasse "Nummer".

```
- private int nummer (nur über Konstruktor zu setzen)
+ get nummer()
```

`Nummer n = new Nummer(7)`

Eine Nummern-Instanz gilt als gleich einer anderen (equals()),
wenn die privaten int nummer gleich sind.

In der Main Klasse erzeugen sie ein Array mit 20 Instanzen,
und einem Zufallswert von 1 bis 5 (inklusive)

In einer Schleife werden diese Instanzen einem HashSet hinzugefügt.

Geben Sie das HashSet am Ende in einer Schleife aus.

