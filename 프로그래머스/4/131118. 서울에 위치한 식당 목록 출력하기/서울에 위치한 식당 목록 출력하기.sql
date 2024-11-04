-- Oracle
select
    i.rest_id,
    i.rest_name,
    i.food_type,
    i.favorites,
    i.address,
    round(avg(r.review_score), 2) as score
from
    rest_info i,
    rest_review r
where
    i.rest_id = r.rest_id
    and i.address like '서울%'
group by
    i.rest_id,
    i.rest_name,
    i.food_type,
    i.favorites,
    i.address
order by
    score desc,
    i.favorites desc
;

-- MySQL
SELECT
    I.REST_ID,
    I.REST_NAME,
    I.FOOD_TYPE,
    I.FAVORITES,
    I.ADDRESS,
    ROUND(AVG(R.REVIEW_SCORE), 2) AS SCORE
FROM 
    REST_INFO I
    JOIN
        REST_REVIEW R
        ON I.REST_ID = R.REST_ID
WHERE
    I.ADDRESS LIKE "서울%"
GROUP BY
    I.REST_ID,
    I.REST_NAME,
    I.FOOD_TYPE,
    I.FAVORITES,
    I.ADDRESS
ORDER BY
    SCORE DESC,
    I.FAVORITES DESC
;
