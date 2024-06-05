-- 코드를 입력하세요
SELECT rest.rest_id, rest.rest_name, rest.food_type, rest.favorites, rest.address, round(avg(review.review_score), 2) as score
from rest_review review join rest_info rest on rest.rest_id = review.rest_id
where rest.address like "서울%"
group by review.rest_id
order by score desc, favorites desc;