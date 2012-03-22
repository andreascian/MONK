DESCRIPTION = "HidaV boot info blocks user space tooling"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " file://COPYING;md5=9ac2e7cff1ddaf48b6eab6028f23ef88 "

PR = "r1"
PV = "1.0"

RDEPENDS = "mtd-utils"
SRC_URI="file://${PN}-sources-${PV}"
S = "${WORKDIR}/${PN}-sources-${PV}"

inherit autotools 
