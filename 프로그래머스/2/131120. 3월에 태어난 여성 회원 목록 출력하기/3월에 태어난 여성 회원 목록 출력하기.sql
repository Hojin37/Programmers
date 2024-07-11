-- Oracle
SELECT
    MEMBER_ID,
    MEMBER_NAME,
    GENDER,
    TO_CHAR(date_of_birth, 'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM
    member_profile
WHERE
    tlno IS NOT NULL
    AND
    TO_CHAR(date_of_birth, 'MM') = '03'
    AND 
    gender = 'W'
ORDER BY
    member_id ASC
;

-- MySQL
SELECT 
    MEMBER_ID, 
    MEMBER_NAME, 
    GENDER, 
    DATE_FORMAT(DATE_OF_BIRTH, "%Y-%m-%d") AS DATE_OF_BIRTH
FROM 
    MEMBER_PROFILE
WHERE 
    GENDER LIKE 'W'
    AND 
    DATE_OF_BIRTH LIKE "%-03-%"
    AND 
    TLNO IS NOT NULL
ORDER BY 
    MEMBER_ID ASC;
