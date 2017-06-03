# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING.txt
#
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=c80d1a3b623f72bb85a4c75b556551df"

SRC_URI = "https://github.com/gflags/gflags/archive/v${PV}.tar.gz"
SRC_URI[md5sum] = "ac432de923f9de1e9780b5254884599f"
SRC_URI[sha256sum] = "d8331bd0f7367c8afd5fcb5f5e85e96868a00fd24b7276fa5fcee1e5575c2662"

FILES_${PN} = " \
/usr/lib/cmake \
/usr/lib/cmake/gflags \
/usr/lib/cmake/gflags/gflags-config.cmake \
/usr/lib/cmake/gflags/gflags-export.cmake \
/usr/lib/cmake/gflags/gflags-export-noconfig.cmake \
/usr/lib/cmake/gflags/gflags-config-version.cmake \
/usr/bin \
/usr/bin/gflags_completions.sh \
"

inherit cmake pythonnative

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
