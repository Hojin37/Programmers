-- Oracle
SELECT
    H.flavor
FROM
    first_half H,
    icecream_info I
WHERE  
    H.flavor = I.flavor
    AND 
    H.total_order > 3000
    AND 
    I.ingredient_type LIKE 'fruit%'
ORDER BY
    H.total_order DESC
;

-- MySQL
SELECT 
    F.FLAVOR
FROM 
    ICECREAM_INFO I
JOIN 
    FIRST_HALF F 
    ON I.FLAVOR = F.FLAVOR
WHERE 
    I.INGREDIENT_TYPE LIKE 'fruit_based'
    AND 
    F.TOTAL_ORDER > 3000
ORDER BY 
    F.TOTAL_ORDER DESC
;
