Test case for HHH-14830

Execute `mvn test` which executes `CityStandaloneTestCase.java`. The test will pass, as there is no assert, check the generated log for the generates SQL queries.
This query should show up, with the extra cross-join:
```sql
select
        city0_.id as col_0_0_,
        city0_.name as col_1_0_,
        city_compu1_.name || '-' || city_compu1_.ZIP as col_2_0_ 
    from
        city city0_ cross 
    join
        city city_compu1_ 
    where
        city0_.id=city_compu1_.id
```
