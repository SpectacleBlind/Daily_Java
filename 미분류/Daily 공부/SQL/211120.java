SELECT * FROM ( 
    SELECT ANIMAL_INS.NAME, ANIMAL_INS.DATETIME 
    FROM ANIMAL_INS 
    LEFT OUTER JOIN ANIMAL_OUTS 
    ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID 
    WHERE ANIMAL_OUTS.ANIMAL_ID IS NULL 
    ORDER BY ANIMAL_INS.DATETIME 
) 
WHERE ROWNUM <= 3;