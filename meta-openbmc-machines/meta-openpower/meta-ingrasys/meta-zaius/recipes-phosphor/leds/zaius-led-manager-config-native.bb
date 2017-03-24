UMMARY = "Phosphor LED Group Management for Zaius"
PR = "r1"

inherit native
inherit obmc-phosphor-utils
inherit obmc-phosphor-license

PROVIDES += "virtual/phosphor-led-manager-config-native"

SRC_URI += "file://led.yaml"
S = "${WORKDIR}"

# Copies example led layout yaml file
do_install() {
	SRC=${S}
	DEST=${D}${datadir}/phosphor-led-manager
	install -D ${SRC}/led.yaml ${DEST}/led.yaml
}
