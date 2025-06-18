mysql> select ename
    -> from employee
    -> where salary > (select salary
    -> from employee
    -> where ename ='henry');
+----------+
| ename    |
+----------+
| soma     |
| chandran |
| kathir   |
| levy     |
+----------+
4 rows in set (0.00 sec)