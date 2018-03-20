#!/bin/sh

# [arg1] -> ARGUMENTO 1 - DIRETORIO DE ARQUIVOS .FITS A SEREM ANALISADOS
# [arg2] -> ARGUMENTO 2 - ARQUIVO .TBL DE ENTRADA
# [arg3] -> ARGUMENTO 3 - ARQUIVO .HDR DE SAIDA 
# [arg4] -> ARGUMENTO 4 - DIRETORIO DOS ARQUIVOS DE SAIDA


echo $0 $*
#sleep 30


mDiffExec -p $1 $2 $3 $4
#mDiffExec -p Kprojdir/ diffs.tbl Ktemplate.hdr diffdir