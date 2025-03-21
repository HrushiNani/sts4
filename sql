mysql> show tables;
+------------------------+
| Tables_in_2211cs010251 |
+------------------------+
| students               |
+------------------------+
1 row in set (0.01 sec)

mysql> insert into Students values '1','Ramu','abc@gmail.com','12345','abc';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near ''1','Ramu','abc@gmail.com','12345','abc'' at line 1
mysql> insert into Students values 1,'Ramu','abc@gmail.com',12345,'abc';
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '1,'Ramu','abc@gmail.com',12345,'abc'' at line 1
mysql> insert into Students values (1,'Ramu','abc@gmail.com',12345,'abc');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Students values (2,'Hari','def@gmail.com',67890,'def');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Students values (3,'Deepthi','ghi@gmail.com',23789,'ghi');
Query OK, 1 row affected (0.01 sec)

mysql> insert into Students values (4,'Laxmi','jkl@gmail.com',16788,'jkl');
Query OK, 1 row affected (0.00 sec)

mysql> insert into Students values (5,'Krishna','mno@gmail.com',56782,'mno');
Query OK, 1 row affected (0.01 sec)

mysql> select * from students;
+--------+---------+---------------+---------+--------+
| rollno | name    | email         | PhoneNO | Branch |
+--------+---------+---------------+---------+--------+
|      1 | Ramu    | abc@gmail.com |   12345 | abc    |
|      2 | Hari    | def@gmail.com |   67890 | def    |
|      3 | Deepthi | ghi@gmail.com |   23789 | ghi    |
|      4 | Laxmi   | jkl@gmail.com |   16788 | jkl    |
|      5 | Krishna | mno@gmail.com |   56782 | mno    |
+--------+---------+---------------+---------+--------+
5 rows in set (0.00 sec)

mysql>
