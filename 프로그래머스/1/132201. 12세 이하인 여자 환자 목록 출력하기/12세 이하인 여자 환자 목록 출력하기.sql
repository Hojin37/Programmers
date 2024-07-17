-- Oracle
SELECT
    pt_name,
    pt_no,
    gend_cd,
    age,
    NVL(tlno, 'NONE') AS tlno
FROM
    patient
WHERE
    gend_cd = 'W'
    AND age < 13
ORDER BY
    age DESC,
    pt_name ASC
;

-- MySQL
SELECT
    PT_NAME,
    PT_NO,
    GEND_CD,
    AGE,
    IFNULL(TLNO, 'NONE') AS TLNO
FROM
    PATIENT
WHERE
    GEND_CD LIKE 'W'
HAVING
    AGE < 13
ORDER BY
    AGE DESC,
    PT_NAME ASC
;
