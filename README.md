# Online Banking Project
Online Banking System in Spring boot, Angular and MySQL.


###Online Banking features:

User Front:

> Registration for normal user online banking account.

> Each normal user will have 2 accounts, Primary and Savings accounts.

> Each account can deposit and withdraw money.

> Customer can transfer money between accounts and to someone else.

> Customer can view all of his transaction records and account balance.

> Customer can view and edit his profile.

> Customer can schedule an appointment to a bank.

Admin Portal:

> Developed Admin Portal using Angular.

> Normal user cannot view any information in Admin Portal

> Admin can view all the users and all the information of each user.

> Admin can enable or disable a certain user.

> Admin can view and confirm appointments



Security:

> Secured by Spring Security, user need to log in to access other routes.

>Passwords are encrypted with BCryptPasswordEncoder and then stored in database.



Database:

>The database contains user, role, user_role, primary_account, primary_account_transaction, savings_account, savings_account_transaction, recipient and appointment.

> There are 2 different roles: ROLE_USER and ROLE_ADMIN. 

> Normal user can only register account with ROLE_USER. 

> Admin user need to manually changed his role in database.


This project is divided into three hierarchical parts: 

> User Front end using Spring and Thymeleaf.

> Admin Portal front end using Angular. 

> Backend and database using Spring and MySQL.

###How to use:

1. Make sure npm, maven, Spring boot cli and Angular are installed.

2. You should change the MySQL connection settings in 
    
    `resource/application.properties`
    
3. In userFront folder run `mvn spring-boot:run` to run the backend and userFront.

4.  **Important**: In the MySQL, now the schema has been created, select table "role", and add 2 lines

        | role_id   |    name       | 
        | ----------|:-------------:| 
        | 0         | ROLE_USER     | 
        | 1         | ROLE_ADMIN    | 

3. Now change to AdminPortal folder, run `npm install` in another terminal to install the packages.

4. Run `ng serve` to run the Admin Portal front end.

5. You can signup normal user account in userFront.

6. To get an admin account, you need to change the "role_id" of a certain user from 0 to 1 in "user_role" table.

7. Now you are all set to test all the features described above.

### Some screenshots

![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/1.PNG) 


![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/2.PNG)

 
![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/3.PNG) 


![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/4.PNG) 


![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/5.PNG)

 
![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/6.PNG)

 
![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/7.PNG) 


![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/8.PNG) 


![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/9.PNG) 


![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/a1.PNG)


![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/a2.PNG)

 
![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/a3.PNG) 


![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/a4.PNG)

 
![Alt text](https://github.com/Guheyhey/Online-Banking/raw/master/images/a5.PNG) 

