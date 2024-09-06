-- Oracle
select
	count(*) as fish_count
from
	fish_info
where
	length is null
;

-- MySQL
SELECT 
	COUNT(*) AS FISH_COUNT
FROM 
	FISH_INFO
WHERE 
	LENGTH IS NULL
;