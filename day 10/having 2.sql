mysql> select count(*)empid
    -> from Employee
    -> where dep='creative'
    -> group by empid
    -> having count(*)>=1;
+-------+
| empid |
+-------+
|     1 |
+-------+
1 row in set, 1 warning (0.00 sec)
