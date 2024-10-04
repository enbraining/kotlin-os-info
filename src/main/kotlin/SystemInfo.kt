package org.example

import oshi.SystemInfo
import oshi.hardware.GlobalMemory

class SystemInfo (
	private val systemInfo: SystemInfo = SystemInfo()
) {
	fun getTotalMemoryGigabyte(): Double = byteToGigabyte(getMemory().total)

	fun getAvailableMemoryGigabyte(): Double = byteToGigabyte(getMemory().available)

	fun getProcessorInfo() = systemInfo.hardware.processor

	private fun getMemory(): GlobalMemory = systemInfo.hardware.memory

	private fun byteToGigabyte(byteNumber: Long): Double =
		byteNumber.toDouble() / 1024 / 1024 / 1024
}