select ANIMAL_TYPE , count (*) as count 
from animal_ins 
group by animal_type 
order by animal_type asc;


SELECT ANIMAL_ID, NAME
    FROM (SELECT ai.ANIMAL_ID, ai.NAME
        FROM ANIMAL_INS ai, ANIMAL_OUTS ao
        WHERE ai.ANIMAL_ID = ao.ANIMAL_ID 
        ORDER BY ao.DATETIME - ai.DATETIME DESC)
    WHERE ROWNUM <= 2