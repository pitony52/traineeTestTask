select sum(promocodes.promocode_id)* 100/count(orders.order_id) -- доля промокодов
from promocodes
inner join orders on orders.order_id = promocodes.promocode_id
