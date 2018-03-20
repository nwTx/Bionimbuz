#!/bin/sh

# [arg1] -> ARGUMENTO 1 - DIRETORIO QUE CONTEM AS IMAGENS .FITS
# [arg2] -> ARGUMENTO 2 - ARQUIVO .TBL A SER GERADO

echo $0 $*
#sleep 30

#arg1="/home/pedro/Bionimbuz/data/input"
#arg2="/home/pedro/Bionimbuz/data/output/saida.tbl" 


#/usr/bin/mImgtbl
mImgtbl $1 $2
