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