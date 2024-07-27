-- Oracle
SELECT
    *
FROM
    (SELECT *
     FROM food_product
     ORDER BY price DESC)
WHERE
    ROWNUM = 1
;

-- MySQL
SELECT
    *
FROM
    FOOD_PRODUCT
ORDER BY
    PRICE DESC
LIMIT 1
;
