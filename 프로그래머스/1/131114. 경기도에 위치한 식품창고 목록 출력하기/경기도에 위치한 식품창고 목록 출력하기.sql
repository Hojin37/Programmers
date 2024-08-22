-- Oracle
SELECT
    warehouse_id,
    warehouse_name,
    address,
    CASE 
        WHEN freezer_yn IS NULL THEN 'N'
        ELSE freezer_yn END AS freezer_yn
FROM
    food_warehouse
WHERE
    address LIKE '경기도%'
ORDER BY
    warehouse_id ASC
;

-- MySQL
SELECT 
    WAREHOUSE_ID, 
    WAREHOUSE_NAME, 
    ADDRESS, 
    IFNULL(FREEZER_YN, 'N') AS FREEZER_YN
FROM 
    FOOD_WAREHOUSE 
WHERE 
    ADDRESS LIKE "%경기도%"
ORDER BY 
    WAREHOUSE_ID ASC
;
