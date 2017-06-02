require ../../recipes-image/image/base-image.bb

SUMMARY = "mjmech  image for local builds with swupd disabled."
DESCRIPTION = "mjmechimage with everything"

# TODO(jpieper): Things we might want to re-enable someday
#
# opencl
# realsense
# realsense-dev

# REF OS IOT image features
REF_OS_IMAGE_PKG_FEATURES += " \
     x11-base \
     xfce-ui \
     dev-packages \
     opencv \
     multimedia \
     iotivity \
     python-runtime \
     nodejs-runtime \
     alsa \
     pulseaudio \
     pulseaudio-bluetooth \
     sensors \
     text-utils \
     intel-xdk-support \
     tools-debug \
     tools-develop \
     mraa-dev-support \
     python3-extra \
     linux-firmware \
     wifi-hotspot \
"

IMAGE_FEATURES += " \
    ${REF_OS_IMAGE_PKG_FEATURES} \
"

IMAGE_INSTALL_append = "\
    ${MACHINE_EXTRA_RRECOMMENDS} \
"

LICENSE = "MIT"

REF_OS_ROOTFS_SIZE = "3700"

inherit refosiot-image
