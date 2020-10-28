package com.raychenon.kotlin.ext

/**
 * User: raychenon
 * Date: 28/10/2020
 * Time: 8:43 PM
 */
fun Array<IntArray>.copyDeep(): Array<IntArray> {
    val rows = this.size
    val cols = this[0].size
    val arr = Array(rows) { IntArray(cols) }
    for (r in 0 until rows) {
        for (c in 0 until cols) {
            arr[r][c] = this[r][c]
        }
    }
    return arr
}