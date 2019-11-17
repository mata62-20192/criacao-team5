#!/bin/bash

# Baixe o pattern4.jar a partir do seguinte site:
#   https://users.encs.concordia.ca/~nikolaos/pattern_detection.html
# Link direto para download:
#  https://users.encs.concordia.ca/~nikolaos/files/pattern_detection/pattern4.jar
#
# Se a saída for 1 1, seu programa contém ambos os padrões solicitados
#

java -jar /opt/pattern4.jar -target bin -output out.xml

temFactoryMethod=0
temAbstractFactory=0

egrep '"FactoryMethod.*element=' out.xml > /dev/null
if [[ $? == 0 ]]; then
	temFactoryMethod=1
fi
egrep '"State".*element=' out.xml > /dev/null
if [[ $? == 0 ]]; then
	temAbstractFactory=1
fi

echo $temFactoryMethod $temAbstractFactory

