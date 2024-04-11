## SÜ 11.4.2024

### Aufgabe 1 HashSet erstellen

Ermitteln Sie, wieviele tierarten in der Datei "tierarten.csv" drinnen sind, und
geben Sie die gefundenen Tierarten alphabetisch sortiert auf die Konsole aus.

Arbeiten Sie mit Hilfe der HashSet Klasse, und verwenden Sie die `String`
Klasse, welche bereits `equals()` und `hashCode()` implementiert.

### Aufgabe 2 mit eigener Klasse, eigene Implementierung von `equals()` und `hashCode()`

Verwendet wird für diese Übung die Datei "paare.csv". Dokumentation:
<https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Objects.html#hash(java.lang.Object...)>

In der Datei ist pro Zeile eine Kombination zweier Tierarten gegeben. Schreiben
Sie eine Klasse `Paar`, die genau dann gleich mit einem anderen `Paar` ist, wenn
die beiden Tierarten die gleichen sind. Beachten Sie, dass die Reihenfolge
vertauscht sein kann!

```java
new Paar("lion", "bear").equals(new Paar("lion", "bear")) == true  // weil gleiches Paar
new Paar("lion", "bear").equals(new Paar("bear", "lion")) == true  // weil gleiches Paar, nur andere Reihenfolge
new Paar("lion", "bear").equals(new Paar("insect", "lion")) == true  // weil gleiches Paar, nur andere Reihenfolge
```

Geben Sie a) alle eindeutigen Paare aus, mit Hilfe der toString() Methode im
`Paar`. Zuletzt geben Sie die Anzahl der eindeutigen Kombinationen aus!

### Aufgabe 3 HashMap erstellen

In der Datei "tiere.csv" sind Tiere gegeben jeweils mit "Name", "Unterart" und
"Art".

Erstellen Sie eine Klasse "Tier" und legen Sie für jede CSV Zeile eine
Tier-Instanz an.

Die HashMap hat:

-   key: die Tier-Art (z.B. "cat")
-   value: ein Array von Tieren

Nach dem Einlesen und Einordnen aller Zeilen sortieren Sie alle Arrays nach dem
Namen des Tieres, verwenden Sie dafür wahlweise den naturual sort order
(implements comparable) oder einen Komparator.

Geben Sie nun zum Abschluss alle gefundenen Tierarten sortiert auf die console
aus!

toString() eines Tieres, Beispiel: \
"Junius is a bear, a Polar bear"
