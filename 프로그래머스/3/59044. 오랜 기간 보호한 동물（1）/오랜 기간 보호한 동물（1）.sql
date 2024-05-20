-- 코드를 입력하세요
SELECT name, datetime from animal_ins
where animal_ins.animal_id not in (select b.animal_id from animal_outs b)
order by datetime asc limit 3;