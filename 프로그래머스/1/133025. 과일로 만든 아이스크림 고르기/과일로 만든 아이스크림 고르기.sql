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