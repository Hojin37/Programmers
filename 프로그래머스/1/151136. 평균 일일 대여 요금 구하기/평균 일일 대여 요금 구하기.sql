-- Oracle
SELECT
    ROUND(AVG(daily_fee)) AS average_fee
FROM
    car_rental_company_car
WHERE
    car_type = 'SUV'
;

-- MySQL
SELECT 
    ROUND(AVG(DAILY_FEE)) AS AVERAGE_FEE
FROM 
    CAR_RENTAL_COMPANY_CAR
WHERE 
    CAR_TYPE LIKE 'SUV'
;
