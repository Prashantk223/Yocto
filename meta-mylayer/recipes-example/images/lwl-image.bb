SUMMARY = "My custom boot image"
LICENSE = "MIT"
inherit core-image
IMAGE_INSTALL += "usbutils"

#dropbear ssh server
IMAGE_FEATURES = " ssh-server-dropbear debug-tweaks read-only-rootfs splash tools-debug"
#package-name
IMAGE_INSTALL:append = " myhello myhello-doc"
