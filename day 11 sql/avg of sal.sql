mysql> select *
    -> from employee
    -> where salary >(select avg(salary)
    -> from employee);
+-------+-------+----------+---------+------------+
| empid | ename | dep      | salary  | joindate   |
+-------+-------+----------+---------+------------+
|     1 | soma  | creative | 1000000 | 2026-02-05 |
+-------+-------+----------+---------+------------+
1 row in set (0.03 sec)