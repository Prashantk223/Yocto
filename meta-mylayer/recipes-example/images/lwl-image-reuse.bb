SUMMARY = "My custom boot image"
LICENSE = "MIT"
require recipes-core/images/core-image-minimal.bb
IMAGE_INSTALL:append += " usbutils"