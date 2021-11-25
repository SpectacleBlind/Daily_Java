
1. 테이블 작성 쿼리
CREATE TABLE customers
(
cno      NUMBER(5)    not null,
cname    VARCHAR2(20),
adress   VARCHAR2(10),
email    VARCHAR2(30),
CONSTRAINT customers_pk PRIMARY KEY(cno)
);

2. 자료 Insert 쿼리
INSERT ALL
INTO customers VALUES (100, 홍길동, 서울, ABC@naver.com)
INTO customers VALUES (101, 김길동, 제주, T1234@daum.net)
INTO customers VALUES (102, 이영희, 인천, yhlee@gmail.com)
SELECT *
  FROM DUAL;


3. customers 테이블 Update 쿼리
UPDATE customers
SET
adress = '부산'
WHERE
cno = 102

4. 삭제 쿼리
DELETE 
FROM customers
WHERE cname = '김길동'

5. 데이터 타입 확장 쿼리
ALTER TABLE customers MODIFY adress VARCHAR2(20);

6. 테이블 컬럼 추가 쿼리
ALTER TABLE customers ADD phone VARCHAR2(20);

7. 테이블 컬럼 제거 쿼리
ALTER TABLE customers DROP COLUMN email;
