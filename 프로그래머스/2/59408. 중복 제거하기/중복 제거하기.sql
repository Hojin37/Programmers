-- Oracle
select
    count(distinct(name)) as count
from
    animal_ins
-- where
    -- name is not null
;

-- MySQL
SELECT
    COUNT(DISTINCT(NAME)) AS COUNT
FROM
    ANIMAL_INS
;
