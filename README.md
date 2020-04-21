# Počet čísla v čísle

Implementujte metódu `zrataj()` v rozhraní [CisloVCisle.java](src/CisloVCisle.java), ktorá zistí počet výskytov jedného čísla v druhom čísle.

Program dostane na vstupe nezáporné čísla. Jedno predstavuje hľadané **jednomiestne** číslo a druhé je číslo, v ktorom sa hľadá.
Program zráta koľko krát sa hľadané číslo nachádza v čísle.

Na spustenie a otestovania programu použite JUnit test [TestCisloVCisle.java](test/TestCisloVCisle.java). Inštanciu Vašej triedy vytvorte v metóde `setup()`:exclamation:


```java
	public int zrataj(int hladaneCislo, int cislo);
```

**Príklad**
+ zrataj(7, 717) → 2
+ zrataj(7, 7) → 1
+ zrataj(7, 123) → 0
+ zrataj(1, 717) → 1

## Predpoklad:
Hľadané číslo je **jednomiestne**. Číslo, v ktorom sa hľadá nemá obmedzenie.

> Hint:
> Môžete využíť porovnávanie znakov namiesto čísel a skonvertovať čísla na text: 
> ```Integer.toString(cislo).toCharArray();```
> Alebo môžete použiť modulo 10 ```%``` a postupne odzadu zisťovať jednotlivé cifry čísla 
