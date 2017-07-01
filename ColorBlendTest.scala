/*  / sfujimoto: 2017/07/01 22:06 */
import com.atomicscala.AtomicTest._
import paintcolors.Color._
import colorblend.blend

blend(`red`, `yellow`) is orange
blend(red, red) is red
blend(yellow, blue) is green


