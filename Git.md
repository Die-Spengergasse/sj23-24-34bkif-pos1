# Software Versionskontrolle mit GIT

## Geschichte von GIT

Git wurde ab Sommer 2005 von Linus Thorwalds (ebenso Urheber des Linux Kernels)
zu entwickeln begonnen. Dabei wurde versucht, Schwachstellen bekannter,
vorhandener Versionskontrollwerkzeuge zu vermeiden.

In einer Umfrage von Stack Overflow aus 2022 ging hervor, daß git für etwa 94%
aller befragten Entwickler die am Liebsten verwendete Versionsverwaltung
darstellt.

Es gibt zahllose Anbieter online:
<https://en.wikipedia.org/wiki/Comparison_of_source-code-hosting_facilities>.
Einer von diesen ist `github.com`, hier werden die Unterrichts-Repos gehostet.

## Was ist ein Repository

Ein GIT `Repository` (kurz: Repo) ist ein Speicherort für ein Software-Projekt.
Es enthält alle Dateien und den Verlauf aller Änderungen, die an diesen Dateien
vorgenommen wurden. Git-Repositories ermöglichen es, zu früheren Versionen des
Projekts zurückzukehren, Änderungen zu verfolgen und zu überprüfen, wer welche
Änderungen vorgenommen hat. Sie sind ein wesentliches Werkzeug für die
Zusammenarbeit und Versionskontrolle in der Softwareentwicklung.

## Gebrauch von GIT

### Offizielles Manual

<https://git-scm.com/docs/user-manual.html> Unter dem Dropdown `Topics` findet
man die offizielle Dokumentation zu den einzelnen Kommandos.

### Kurzanleitung (Cheat-Sheet von github)

<https://education.github.com/git-cheat-sheet-education.pdf>

## FAQ

### Wie bekomme ich Hilfe zu den einzelnen Git Subkommdos?

`$ git help <command>` Bsp: `git help branch`. Die gleichen Inhalte sind auch
(s.o.) unter `Topics` der offiziellen Dokumentation zu finden.

### Wie mache ich alle lokalen Änderungen rückgängig

Der Befehl hierzu lautet `git reset`. Folgende Abfolge entfernt alle lokalen
Änderungen:

```
$ git reset --hard
$ git clean -df
```

Alternativ kann man natürlich auch den ganzen geklonten Ordner löschen und
danach neu klonen.

## Dokumentversion

Aktuelle Version wird
[hier](https://github.com/cha-spg/pos-wmc-fachgruppe-inf-erw/blob/main/git-git-intro.md)
gepflegt.
