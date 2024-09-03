-- Oracle
select
    animal_id,
    name
from
    animal_ins
where
    animal_type = 'Dog'
    and upper(name) like '%EL%' -- Oracle에서는 대소문자를 구분하기 때문에 대문자로 바꾼 후 검색
order by
    name asc
;

-- MySQL
SELECT
    ANIMAL_ID,
    NAME
FROM
    ANIMAL_INS
WHERE
    ANIMAL_TYPE LIKE 'DOG'
    AND NAME LIKE "%el%" -- MySQL의 Like는 대소문자를 구분하지 않음
ORDER BY
    NAME ASC
;
