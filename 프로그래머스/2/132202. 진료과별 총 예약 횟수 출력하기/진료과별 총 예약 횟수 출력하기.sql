-- Oracle
select
    mcdp_cd as "진료과 코드",
    count(mcdp_cd) as "5월예약건수"
from
    appointment
where
    to_char(cast(apnt_ymd as date), 'YYYY-MM') like '2022-05%'
group by
    mcdp_cd
order by
    count(mcdp_cd) asc,
    mcdp_cd asc
;

-- MySQL
SELECT 
    MCDP_CD AS "진료과코드", 
    COUNT(MCDP_CD) AS "5월예약건수"
FROM 
    APPOINTMENT
WHERE 
    APNT_YMD LIKE "2022-05%"
GROUP BY 
    MCDP_CD
ORDER BY 
    COUNT(MCDP_CD) ASC, 
    MCDP_CD ASC
;
