SUMMARY = "A small image just capable of allowing a device to boot."

IMAGE_INSTALL = "${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"

