# Opdrachtbeschrijving

## Inleiding
In deze opdracht gaan we leren hoe we inheritance kunnen gebruiken. Je kunt deze opdracht maken door het project te clonen of te downloaden naar jouw eigen computer via deze GitHub repository. De uitwerkingen staan op de branch _uitwerkingen_.

## Voor je begint

Je hebt IntelliJ IDEA en de JDK (Java Development Kit) versie 17 of hoger nodig - deze heb je beiden via de instructies op EdHub geïnstalleerd.

### 🟩 Code runnen (vanuit IntelliJ)
Klik op de groene play-knop voor de inheritance-methode en kies 'Run...'.
### 🟨 Testen uitvoeren (vanuit IntelliJ)
Klik op de groene play-knop voor de MainTest-class in src/test/java en kies 'Run 'MainTest''.
### ⬛ Code runnen (met Maven)
Of, als je bekend bent met de terminal, kun je de applicatie runnen met:
```shell
./mvnw clean compile exec:java
```
of
```shell
mvnw.cmd clean compile exec:java
```

## Opdracht

### Opdracht 1

1. Maak een nieuwe klasse aan genaamd `nl.novi.inheritance.Customer`. Zorg er ook voor dat deze klasse een property `name` heeft van het type String.
2. Maak in de nl.novi.Main klasse een variabele genaamd `customer` aan, van het type `nl.novi.inheritance.Customer` (de klasse die we net gemaakt hebben) met behulp van het `new` keyword.
3. Na het aanmaken van deze nieuwe instantie kan je de `name`-property toewijzen, geef dit je eigen naam.
4. Je kan daarna als het goed is de naam printen door `System.out.println(customer.name);` daaronder te zetten. Als het goed is wordt nu je naam geprint.
5. Onder de `System.out.println(customer.name);` maak een tweede variabele genaamd `customer2` van het type `nl.novi.inheritance.Customer`. Geef deze een andere naam, en print ook deze.
6. Breidt nu de `nl.novi.inheritance.Customer` klasse uit met een `lastName` property van type `String` en een `customerNumber` property van type `int`.
7. Voeg aan `nl.novi.inheritance.Customer` ook een `printName()` methode to. Deze methode heeft geen parameters nodig en mag `void` returnen. In de body van de methode zet je `System.out.println("nl.novi.inheritance.Customer " + name);`
8. Maak twee Constructors. Een met de signature `(String, String)` en een met de signature `(String, String, int)`. _Tip: de ene constructor heeft dus 3 parameters, de andere 2 parameters_.
9. In `nl.novi.Main` zie je nu een foutmelding staan bij `()`-haakjes van `new nl.novi.inheritance.Customer()`. De default Constructor is namelijk komen te vervallen, omdat je 2 custom Constructors hebt gemaakt. Je mag nu voor zowel `customer` als `customer2` een van de nieuwe Constructors gaan gebruiken.
10. Verwijder in `nl.novi.Main` de regels `customer.name = ...` en `customer2.name=...`, dit gebeurt nu namelijk al in de constructor.
11. Vervang in `nl.novi.Main` ook `System.out.println(customer.name);` en `System.out.println(customer2.name);` door de `printName()` methode van die klassen aan te roepen

### Opdracht 2

Een nl.novi.inheritance.Customer moet natuurlijk kunnen betalen! Dit kan heel goed met een creditcard...

1. Maak een klasse `nl.novi.inheritance.CreditCard` en geef deze een private property `int debt`, geef deze getters en setters en een constructor waarin deze property is opgenomen.
2. Voeg nu een private property `creditcard` van type `nl.novi.inheritance.CreditCard` toe aan de `nl.novi.inheritance.Customer` klasse, maak hier ook getters en setters voor en voeg de property toe aan beide constructors.
3. Pas ook de inheritance methode aan om de 2 customers een `nl.novi.inheritance.CreditCard` te geven.

Deze aanroep zou er dan ongeveer zo uit moeten zien:
`nl.novi.inheritance.Customer customer = new nl.novi.inheritance.Customer("Frodo", "Balings", new nl.novi.inheritance.CreditCard(100));`

4. Voeg een methode `void pay(int amount)` toe aan de nl.novi.inheritance.CreditCard klasse. Deze methode moet de `nl.novi.inheritance.CreditCard` een nieuw bedrag geven gelijk aan het oude bedrag + amount (een nl.novi.inheritance.CreditCard verzamelt namelijk schuld). Je kan nu in de inheritance methode een betaling doen door
   `customer.getCreditCard().pay(10)` te doen, en de huidige schuld kun je printen door `System.out.println(customer.getCreditCard().getDebt());` te doen.

### Opdracht 3

Er zijn 2 grote creditcard maatschappijen in de wereld, namelijk nl.novi.inheritance.VisaCard en nl.novi.inheritance.MasterCard. Wanneer we willen implementeren, zullen we hiervoor overerving moeten gebruiken.
1. Maak een nieuwe klasse `nl.novi.inheritance.VisaCard` aan en zorg dat deze van de klasse `nl.novi.inheritance.CreditCard` extends;
2. Je ziet dat de code niet compileert, dit komt doordat de super klasse (nl.novi.inheritance.CreditCard) een constructor heeft, dus moet de subklasse nl.novi.inheritance.VisaCard dit ook hebben.
   Dit is op te lossen door een constructor aan `nl.novi.inheritance.VisaCard` toe te voegen:
```
public nl.novi.inheritance.VisaCard(int debt) {
    super(debt);
}
```
3. We hebben nu een klasse `nl.novi.inheritance.VisaCard`, maak nu ook een klasse `nl.novi.inheritance.MasterCard` aan en laat deze ook `nl.novi.inheritance.CreditCard` extenden.
4. Nu we ervoor hebben gekozen om voor alle creditcards een implementatie te maken heeft het geen zin meer om toe te staan dat er een instantie van de super class `nl.novi.inheritance.CreditCard` gemaakt kan worden. Maak deze klasse `abstract`.
5. We zien nu in nl.novi.Main dat we geen nieuwe instantie meer kunnen maken van nl.novi.inheritance.CreditCard. Geef daarom éen customer een nl.novi.inheritance.VisaCard en de andere een nl.novi.inheritance.MasterCard.

Doordat de methode `pay` op `nl.novi.inheritance.CreditCard` zit, en `nl.novi.inheritance.VisaCard` en `nl.novi.inheritance.MasterCard` beide hiervan overerven, hebben ze ook beide automatisch de methode `pay` tot hun beschikking! Je zult daarom ook zien dat `customer.getCreditCard().pay(10)` nog steeds prima werkt.

### Opdracht 4

Nu we een aparte klasse voor `nl.novi.inheritance.VisaCard` en `nl.novi.inheritance.MasterCard` hebben, kunnen we ook zorgen dat ze ander gedrag gaan vertonen. Stel nl.novi.inheritance.VisaCard wil 10% korting geven op alle aankopen. In dat geval moeten we de `pay`-methode overschrijven in de klasse `nl.novi.inheritance.VisaCard`. Doe dit als volgt:

```
@Override
public void pay(int amount) {
    super.pay(amount);
}
```

1. De aanroep naar `super.pay()` betekend hier dat de methode `pay` van de super klasse (nl.novi.inheritance.CreditCard) wordt aangeroepen. Zorg er hier voor dat het amount 10% lager wordt (door bijvoorbeeld (int)(amount * 0.9) te doen).

Je zult nu zien dat als je in nl.novi.Main zowel `customer` als `customer2` beide een andere creditcard geeft met een amount 0, en op beide `pay` aanroept met het bedrag 100, de schuld op beide kaarten nu anders zal zijn.
