#!/bin/sh

# [arg1] -> ARGUMENTO 1 - ARQUIVO .FITS DE ENTRADA
# [arg2] -> ARGUMENTO 2 - ARQUIVO DE SAIDA .PNG

echo $0 $*
#sleep 30

#mViewer -ct 1 -gray m17_uncorrected.fits -1s max gaussian-log -out m17_uncorrected.png
mViewer -ct 1 -gray $1 -1s max gaussian-log -out $2
