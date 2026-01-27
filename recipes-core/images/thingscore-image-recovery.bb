DESCRIPTION = "ThingsCore recovery NAND image"
LICENSE = "MIT"

# Include default core-minimal recipe
require recipes-core/images/core-image-minimal.bb

# Remove systemd init from nand recovery image
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
DISTRO_FEATURES_REMOVE = "systemd"
VIRTUAL-RUNTIME_init = "busybox"

# Compressed rootfs for init ramfs
IMAGE_FSTYPES = "cpio.gz"

# Install packages
IMAGE_INSTALL:append = "\
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
