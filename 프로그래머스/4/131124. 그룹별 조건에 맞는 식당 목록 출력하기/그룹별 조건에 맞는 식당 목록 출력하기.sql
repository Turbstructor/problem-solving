-- 코드를 입력하세요
SELECT m.member_name, r.review_text, date_format(r.review_date, "%Y-%m-%d") as review_date
from member_profile m join rest_review r on m.member_id = r.member_id
inner join (
    select member_id from rest_review
    group by member_id
    order by count(member_id) desc limit 1
) as top_member on top_member.member_id = r.member_id
order by review_date asc, review_text asc;