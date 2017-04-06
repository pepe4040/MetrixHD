SUMMARY = "Metrix Hd"
MAINTAINER = "pepe4040"
SECTION = "base"
PRIORITY = "required"
LICENSE = "pepe4040"
PACKAGE_ARCH = "all"
require conf/license/openpli-gplv2.inc



inherit gitpkgv allarch

PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"
PR = "r1"
SRCREV = "${AUTOREV}"


SRC_URI = "https://github.com/pepe4040/MetrixHD.git"


S = "${WORKDIR}/git"

FILES_${PN} = "/usr/share/eidma2"


do_install() {
    cp -rp ${S}/usr ${D}/
}
