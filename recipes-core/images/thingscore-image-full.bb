DESCRIPTION = "ThingsCore application image for EMMC"
LICENSE = "MIT"

# Include default core-minimal recipe
require recipes-core/images/core-image-minimal.bb

# Install packages
IMAGE_INSTALL:append = "\
    python3 \
    python3-pip \
    htop \
    nano \
    i2c-tools \
    wireguard-tools \
    iw wpa-supplicant \
    iproute2 \
    curl wget \
    gzip tar \ 
    util-linux-lsblk util-linux-blkid \
    parted util-linux-fdisk \
    e2fsprogs \
    openssh \
"

# Append file overlay for WF200
IMAGE_INSTALL:append = " thingscore-main-overlay"
