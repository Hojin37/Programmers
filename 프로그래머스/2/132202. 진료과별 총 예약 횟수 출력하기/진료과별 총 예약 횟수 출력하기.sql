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