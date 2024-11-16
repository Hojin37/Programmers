-- MySQL
SELECT 
    D.ID,
    D.EMAIL,
    D.FIRST_NAME,
    D.LAST_NAME
FROM
    DEVELOPERS D
WHERE
    EXISTS (
        SELECT 1
        FROM SKILLCODES S
        WHERE 
            S.CATEGORY = 'Front End'
            AND SUBSTR(BIN(D.SKILL_CODE), -LENGTH(BIN(S.CODE)), 1) = '1'
        )
ORDER BY
    D.ID ASC
;