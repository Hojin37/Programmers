-- Oracle
SELECT
    COUNT(*) AS users
FROM
    user_info
WHERE
    age > 19 
    AND age < 30
    AND TO_CHAR(joined, 'YYYY') = '2021'
;

-- MySQL
SELECT
    COUNT(*) AS USERS
FROM
    USER_INFO
WHERE
    AGE BETWEEN 20 AND 29
    AND JOINED LIKE '2021%'
;
