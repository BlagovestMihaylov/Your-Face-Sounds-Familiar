# Your-Face-Sounds-Familiar
### Курсов проект по дисциплината Бази от данни - Практикум

## *Описание*
#### Обслужващ сайт за предаването "Като две капки вода". Сайтът е построен върху
#### фреймуърците Spring и Angular. Сайтът има за цел да създава, ъпдейва, изтрива 
#### и показва информацията, предоставена от предаването. Сайтът съдържа информация
#### за участниците, ролите, водещите, журито, епизодите и сезоните.

## *Backend*
#### За създаване на базата от данни е използвана Java Spring ORM библиотека. Базата 
#### от данни е MariaDB. Целият SQL код е скит във библиотеката hibernate, което прави
#### базата устойчива на атаки. Всяка една таблица от базата данни е представена като 
#### собствен отделен файл. Всеки клас използва CRUD  (Create, Read, Update, Delete)
#### репозитория, което позволява да се прави връзката обект-таблица. Service класовете
#### отговарят за правилното изпълняване на заявките, а Controller класовете отговарят
#### за правилното им изпращане към фронтенда. CorsConfiguration класа отговаря за поз-
#### воляването на фронтенда да достъпва данните и операциите.

## *Frontend*
#### Фронтендът е изграден с помощта на Angular, като основен език за програмиране се
#### използва TypeScript, с за оформяне (ще) се използа HTML и CSS.


## *TO-DO*
#### Пооправяне на UI, работещи бутони (add, show, remove, update), филтри за данните 
и може би най-важното - хубав дизайн на сайта 

## Инсталиране и тестване
### Необходими инструменти
###### [MariaDB](https://www.mariadbtutorial.com/getting-started/install-mariadb/)
###### [JDK >= 8](https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html)
###### Java IDE - [Intellij](https://www.jetbrains.com/idea/download/#section=windows), [Eclipse](https://www.eclipse.org/downloads/)
###### [Node.js](https://nodejs.org/en/download/)
###### [Angular cli](https://angular.io/cli)
###### Frontend code editor - [VS Code](https://code.visualstudio.com/download)
###### [Postman](https://www.postman.com/downloads/) (за показване на заявки, тъй като бутоните все още не работят).
### Начин на инсталация

#### `1.`отваряте термината на MariaDB, пишете си паролата и рънвате следния скрип:
```
create database <name>;
use <name>;
``` 
#### `<name>` е името на базата от данни, която искате да създадете

#### `2.` изтегляте кода и чакате да се билднат всички файлове

#### `3.` отваряте файла [application.properties](https://github.com/BlagovestMihaylov/Your-Face-Sounds-Familiar/blob/master/backend/src/main/resources/application.properties)
#### и го променяте на 
```
spring.datasource.url=jdbc:mariadb://localhost::3306/<name>
spring.datasource.username=<username>
spring.datasource.password=<password>
```
#### `<name>` е името на вашата база от данни
#### `<username>` и `<password>` са името и паролата на вашата база от данни
###### избират се от вас при изтегляне на MariaDB

#### `4.` стартирате `main` метода в [YourFaceSoundsFamiliarApplication.java](https://github.com/BlagovestMihaylov/Your-Face-Sounds-Familiar/blob/master/backend/src/main/java/com/example/YourFaceSoundsFamiliar/YourFaceSoundsFamiliarApplication.java)
#### `5.` статирате CMD или Windows Powershell и се навигирате до папката [frontend](https://github.com/BlagovestMihaylov/Your-Face-Sounds-Familiar/tree/master/frontend)
#### `6.` рънвате командата 
```
ng serve
```
###### възможно е да се иска администаторски привилегии
#### която ще стартира фронтенд приложението
#### `7.` отваряте браузър на следния линк [localhost:4200](localhost:4200)

#### След като приложението вече работи може използвате Postman да симулирате заявки до базата данни
###### Postman се използва, тъй като клиентската част не е завършена (бутоните не работят)

#### Образец за въвеждане на данни 
![alt text](https://raw.githubusercontent.com/BlagovestMihaylov/Your-Face-Sounds-Familiar/master/images/rachkovPostRequest.png)
###### въвеждане на водещ
![alt text](https://raw.githubusercontent.com/BlagovestMihaylov/Your-Face-Sounds-Familiar/master/images/bateMilkoPostRequest.png)
###### въвеждане на роля

#### Примерни изходни данни
![alt text](https://raw.githubusercontent.com/BlagovestMihaylov/Your-Face-Sounds-Familiar/master/images/hostListExample.png)
![alt text](https://raw.githubusercontent.com/BlagovestMihaylov/Your-Face-Sounds-Familiar/master/images/roleListExample.png)

# Проектът не е завършен, има още много неща за дооправяне по него!
