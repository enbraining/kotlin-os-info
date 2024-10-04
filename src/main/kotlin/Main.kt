package org.example

fun main() {
	val systemInfo = SystemInfo()
	println("전체 메모리: ${systemInfo.getTotalMemoryGigabyte()}GB")
	println("사용 가능한 메모리: ${systemInfo.getAvailableMemoryGigabyte()}GB")
	println(systemInfo.getProcessorInfo())
}