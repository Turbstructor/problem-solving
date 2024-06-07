-- 코드를 입력하세요
SELECT concat("/home/grep/src/", files.board_id, "/", file_id, file_name, file_ext) as file_path
from used_goods_file files
join (select board_id from used_goods_board order by views desc limit 1) as top_board on files.board_id = top_board.board_id
order by file_id desc;