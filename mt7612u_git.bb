SUMMARY = "Example of how to build an external Linux kernel module"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit module

PR = "r0"
PV = "0.1"

SRC_URI = "git://github.com/mikemayne/mt7612u-kernel-module.git;branch=master"
SRC_URI[md5sum] = "7e00550b46e3a474592062ef31a698e6"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

EXTRA_OEMAKE = "'SRC=${S}' 'KSRC=${STAGING_KERNEL_DIR}' HAS_HOSTAPD_SUPPORT=y"

KERNEL_MODULE_AUTOLOAD += "mt7612u"

# add:
# IMAGE_INSTALL += " mt7612u "
# to your image recipe

