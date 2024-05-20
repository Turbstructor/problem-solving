-- 코드를 입력하세요
select animal_ins.animal_id, animal_ins.name
from animal_ins join animal_outs on animal_ins.animal_id = animal_outs.animal_id
order by datediff(animal_outs.datetime, animal_ins.datetime) desc limit 2;