#!/bin/sh

#for i in 1; do	# 2 3 4 5 6 7 8 9 10 ;do
#  curl -H "Content-Type: application/json" -X POST -d '{"name":"name_$i","id":$i}' http://127.0.0.1:11111/categories/addAndGet
#done

curl -H "Content-Type: application/json" -X POST -d '{"name":"name_1","id":"1"}' http://127.0.0.1:8090/categories/addAndGet
