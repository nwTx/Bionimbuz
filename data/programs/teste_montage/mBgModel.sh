#!/bin/sh

# [arg1] -> ARGUMENTO 1 - ARQUIVO .TBL DE ENTRADA 
# [arg2] -> ARGUMENTO 2 - ARQUIVO .TBL DE ENTRADA
# [arg3] -> ARGUMENTO 3 - ARQUIVO .TBL DE SAIDA


echo $0 $*
#sleep 30


mBgModel $1 $2 $3 
#mBgModel images.tbl fits.tbl corrections.tbl