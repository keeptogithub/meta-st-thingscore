# SPDX-License-Identifier: (GPL-2.0-only OR BSD-3-Clause)

dtb-$(CONFIG_STM32MP13X) += \
	stm32mp133d-thingscore-1-mx.dtb

#include $(srctree)/scripts/Makefile.dts

targets += $(dtb-y)

# Add any required device tree compiler flags here
DTC_FLAGS += -a 0x8

PHONY += dtbs
dtbs: $(addprefix $(obj)/, $(dtb-y))
	@:
dtb-$(CONFIG_STM32MP13X) += \
    stm32mp133d-thingscore-1-mx.dtb

clean-files := *.dtb *.dtbo *_HS
