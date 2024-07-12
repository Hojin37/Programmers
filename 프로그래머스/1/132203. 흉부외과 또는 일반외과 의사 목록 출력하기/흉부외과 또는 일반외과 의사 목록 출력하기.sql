-- Oracle
SELECT
    dr_name,
    dr_id,
    mcdp_cd,
    TO_CHAR(hire_ymd, 'YYYY-MM-DD') AS hire_ymd
FROM
    doctor
WHERE
    mcdp_cd LIKE 'CS'
    OR
    mcdp_cd LIKE 'GS'
ORDER BY
    hire_ymd DESC,
    dr_name ASC
;

-- MySQL
SELECT 
    DR_NAME, 
    DR_ID, 
    MCDP_CD, 
    DATE_FORMAT(HIRE_YMD, "%Y-%m-%d")
FROM 
    DOCTOR
WHERE 
    MCDP_CD LIKE "CS" 
    OR 
    MCDP_CD LIKE "GS"
ORDER BY 
    HIRE_YMD DESC, 
    DR_NAME ASC
;
