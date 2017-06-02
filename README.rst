mjmech OS
#########

Setup Ubuntu 16.04 host for build
=================================

| $ sudo apt update
| $ sudo apt-get install gawk wget git-core git diffstat unzip texinfo gcc-multilib build-essential chrpath socat libsdl1.2-dev xterm subversion xsltproc

Cloning
=======

| git clone https://github.com/mjbots/ref-os-iot
| cd ref-os-iot
| git checkout mjmech
| git submodule update --recursive --init
| source mjmech-init-build-env

Building
========

| bitbake mjmech-image

Deploying
=========

| sudo -E bmaptool copy build/tmp-glibc/deploy/images/intel-5xx-64/full-image-intel-5xx-64.wic /dev/sdFOO


Updating ref-os-iot
===================

| $ git pull --rebase
| $ git submodule update --recursive
