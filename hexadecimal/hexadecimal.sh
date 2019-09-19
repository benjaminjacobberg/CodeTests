#!/bin/bash
STRING=$(echo "$1" | xxd -r -p)
echo "${STRING}" | base64
