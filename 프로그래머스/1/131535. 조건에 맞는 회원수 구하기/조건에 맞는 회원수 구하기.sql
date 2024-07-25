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